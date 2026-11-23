package com.englishseekho.pro.ui.screens

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ExperimentalLayoutApi
import androidx.compose.foundation.layout.FlowRow
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.VolumeUp
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FilterChip
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.unit.dp
import com.englishseekho.pro.data.CurriculumRepository
import com.englishseekho.pro.data.GlossaryWord
import com.englishseekho.pro.data.UserProgress
import com.englishseekho.pro.services.SpeechCoach
import com.englishseekho.pro.ui.theme.CardSurface
import com.englishseekho.pro.ui.theme.EmeraldLight
import com.englishseekho.pro.ui.theme.EmeraldPrimary
import com.englishseekho.pro.ui.theme.HairlineBorder
import com.englishseekho.pro.ui.theme.SlateMuted
import com.englishseekho.pro.ui.theme.SuccessGreen

@OptIn(ExperimentalMaterial3Api::class, ExperimentalLayoutApi::class)
@Composable
fun VocabAndStoriesScreen(
    progress: UserProgress,
    speechCoach: SpeechCoach,
    onMarkWord: (wordId: String, mastered: Boolean) -> Unit,
    onAddXp: (Int) -> Unit
) {
    var tab by remember { mutableIntStateOf(0) } // 0 = Flashcards, 1 = Daily Sentences, 2 = Confusing Words, 3 = Tap Stories
    var cardIndex by remember { mutableIntStateOf(0) }
    var isFlipped by remember { mutableStateOf(false) }

    var sentenceCat by remember { mutableStateOf("सभी") }

    var quizIndex by remember { mutableIntStateOf(0) }
    var quizChoice by remember { mutableStateOf("") }

    var storyIndex by remember { mutableIntStateOf(0) }
    var selectedGlossary by remember { mutableStateOf<GlossaryWord?>(null) }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState())
            .padding(16.dp),
        verticalArrangement = Arrangement.spacedBy(14.dp)
    ) {
        Text(
            text = "शब्दावली, रोज़ के वाक्य और कहानियाँ",
            style = MaterialTheme.typography.titleLarge,
            fontWeight = FontWeight.Bold
        )

        FlowRow(horizontalArrangement = Arrangement.spacedBy(8.dp)) {
            FilterChip(selected = tab == 0, onClick = { tab = 0 }, label = { Text("30 Flashcards") })
            FilterChip(selected = tab == 1, onClick = { tab = 1 }, label = { Text("रोज़ के वाक्य") })
            FilterChip(selected = tab == 2, onClick = { tab = 2 }, label = { Text("Confusing Words") })
            FilterChip(selected = tab == 3, onClick = { tab = 3 }, label = { Text("6 कहानियाँ") })
        }

        when (tab) {
            0 -> {
                val card = CurriculumRepository.flashcards[cardIndex]
                val mastered = progress.masteredWordIds.contains(card.id)
                Text(
                    text = "कार्ड ${cardIndex + 1}/${CurriculumRepository.flashcards.size} · याद हुए शब्द: ${progress.masteredWordIds.size}",
                    style = MaterialTheme.typography.bodySmall,
                    color = SlateMuted
                )
                Card(
                    colors = CardDefaults.cardColors(containerColor = CardSurface),
                    border = BorderStroke(1.5.dp, if (mastered) SuccessGreen else EmeraldPrimary),
                    shape = RoundedCornerShape(20.dp),
                    modifier = Modifier
                        .fillMaxWidth()
                        .clickable { isFlipped = !isFlipped }
                ) {
                    Column(modifier = Modifier.padding(22.dp), verticalArrangement = Arrangement.spacedBy(10.dp)) {
                        Text(card.category, style = MaterialTheme.typography.labelMedium, color = SlateMuted)
                        Text(card.wordEn, style = MaterialTheme.typography.headlineMedium, fontWeight = FontWeight.Bold, color = EmeraldPrimary)
                        Text("उच्चारण: ${card.pronunciationHi}", style = MaterialTheme.typography.bodyMedium)

                        if (isFlipped) {
                            Text("हिंदी अर्थ: ${card.meaningHi}", style = MaterialTheme.typography.titleMedium, fontWeight = FontWeight.Bold)
                            Text("वाक्य: ${card.exampleEn}", fontWeight = FontWeight.Medium)
                            Text("अनुवाद: ${card.exampleHi}", style = MaterialTheme.typography.bodySmall, color = SlateMuted)
                        } else {
                            Text("हिंदी अर्थ देखने के लिए कार्ड पर टैप करें", style = MaterialTheme.typography.bodySmall, color = SlateMuted)
                        }

                        OutlinedButton(onClick = { speechCoach.speak("${card.wordEn}. ${card.exampleEn}") }) {
                            Icon(Icons.Rounded.VolumeUp, contentDescription = null)
                            Spacer(Modifier.width(6.dp))
                            Text("उच्चारण और वाक्य सुनें")
                        }
                    }
                }

                Row(horizontalArrangement = Arrangement.spacedBy(10.dp), modifier = Modifier.fillMaxWidth()) {
                    OutlinedButton(
                        onClick = {
                            onMarkWord(card.id, false)
                            isFlipped = false
                            cardIndex = (cardIndex + 1) % CurriculumRepository.flashcards.size
                        },
                        modifier = Modifier.weight(1f)
                    ) { Text("दोबारा दोहराएं (Hard)") }

                    Button(
                        onClick = {
                            onMarkWord(card.id, true)
                            onAddXp(10)
                            isFlipped = false
                            cardIndex = (cardIndex + 1) % CurriculumRepository.flashcards.size
                        },
                        modifier = Modifier.weight(1f)
                    ) { Text("याद हो गया (+10 XP)") }
                }
            }

            1 -> {
                FlowRow(horizontalArrangement = Arrangement.spacedBy(8.dp)) {
                    listOf("सभी", "घर और परिवार", "पढ़ाई और ऑफिस", "बाज़ार और यात्रा", "विनम्रता और मदद").forEach { cat ->
                        FilterChip(
                            selected = sentenceCat == cat,
                            onClick = { sentenceCat = cat },
                            label = { Text(cat) }
                        )
                    }
                }

                CurriculumRepository.dailyUseSentences
                    .filter { sentenceCat == "सभी" || it.categoryHi == sentenceCat }
                    .forEach { s ->
                        Card(
                            colors = CardDefaults.cardColors(containerColor = CardSurface),
                            border = BorderStroke(1.dp, HairlineBorder),
                            shape = RoundedCornerShape(14.dp),
                            modifier = Modifier.fillMaxWidth()
                        ) {
                            Column(modifier = Modifier.padding(14.dp), verticalArrangement = Arrangement.spacedBy(6.dp)) {
                                Text(s.categoryHi, style = MaterialTheme.typography.labelSmall, color = SlateMuted)
                                Text(s.english, fontWeight = FontWeight.Bold, color = EmeraldPrimary)
                                Text("उच्चारण: ${s.pronunciationHi}", style = MaterialTheme.typography.bodySmall)
                                Text("हिंदी: ${s.hindi}", style = MaterialTheme.typography.bodySmall, color = SlateMuted)
                                Row(horizontalArrangement = Arrangement.spacedBy(8.dp)) {
                                    OutlinedButton(onClick = { speechCoach.speak(s.english, 0.75f) }) { Text("0.75x धीमा") }
                                    OutlinedButton(onClick = { speechCoach.speak(s.english, 1.0f) }) { Text("1.0x सुनें") }
                                }
                            }
                        }
                    }
            }

            2 -> {
                val q = CurriculumRepository.confusingQuizzes[quizIndex]
                Card(
                    colors = CardDefaults.cardColors(containerColor = CardSurface),
                    border = BorderStroke(1.dp, HairlineBorder),
                    shape = RoundedCornerShape(16.dp),
                    modifier = Modifier.fillMaxWidth()
                ) {
                    Column(modifier = Modifier.padding(16.dp), verticalArrangement = Arrangement.spacedBy(10.dp)) {
                        Text("Confusing Pair ${quizIndex + 1}/${CurriculumRepository.confusingQuizzes.size}", style = MaterialTheme.typography.labelMedium, color = EmeraldPrimary)
                        Text("${q.wordA} (${q.meaningAHi})  vs  ${q.wordB} (${q.meaningBHi})", fontWeight = FontWeight.Bold)
                        Text(q.questionSentence, style = MaterialTheme.typography.titleMedium)

                        Row(horizontalArrangement = Arrangement.spacedBy(10.dp), modifier = Modifier.fillMaxWidth()) {
                            listOf(q.wordA, q.wordB).forEach { opt ->
                                OutlinedButton(
                                    onClick = {
                                        if (quizChoice.isBlank()) {
                                            quizChoice = opt
                                            if (opt == q.correctWord) onAddXp(15)
                                        }
                                    },
                                    modifier = Modifier.weight(1f)
                                ) { Text(opt) }
                            }
                        }

                        if (quizChoice.isNotBlank()) {
                            val ok = quizChoice == q.correctWord
                            Text(
                                text = if (ok) "बिल्कुल सही! (+15 XP) ${q.explanationHi}" else "सही शब्द '${q.correctWord}' है। ${q.explanationHi}",
                                color = if (ok) SuccessGreen else MaterialTheme.colorScheme.secondary,
                                fontWeight = FontWeight.Medium
                            )
                            Button(
                                onClick = {
                                    quizChoice = ""
                                    quizIndex = (quizIndex + 1) % CurriculumRepository.confusingQuizzes.size
                                },
                                modifier = Modifier.fillMaxWidth()
                            ) { Text("अगला प्रश्न") }
                        }
                    }
                }
            }

            else -> {
                val story = CurriculumRepository.stories[storyIndex]
                FlowRow(horizontalArrangement = Arrangement.spacedBy(8.dp)) {
                    CurriculumRepository.stories.forEachIndexed { idx, _ ->
                        FilterChip(
                            selected = storyIndex == idx,
                            onClick = { storyIndex = idx },
                            label = { Text("कहानी ${idx + 1}") }
                        )
                    }
                }

                Card(
                    colors = CardDefaults.cardColors(containerColor = CardSurface),
                    border = BorderStroke(1.dp, HairlineBorder),
                    shape = RoundedCornerShape(16.dp),
                    modifier = Modifier.fillMaxWidth()
                ) {
                    Column(modifier = Modifier.padding(16.dp), verticalArrangement = Arrangement.spacedBy(12.dp)) {
                        Text(story.levelLabel, style = MaterialTheme.typography.labelMedium, color = SlateMuted)
                        Text(story.titleEn, style = MaterialTheme.typography.titleLarge, fontWeight = FontWeight.Bold)
                        Text(story.titleHi, style = MaterialTheme.typography.bodyMedium, color = EmeraldPrimary)

                        Row(horizontalArrangement = Arrangement.spacedBy(8.dp)) {
                            OutlinedButton(onClick = { speechCoach.speak(story.paragraphsEn.joinToString(" "), 0.75f) }) { Text("0.75x सुनें") }
                            OutlinedButton(onClick = { speechCoach.speak(story.paragraphsEn.joinToString(" "), 1.0f) }) { Text("1.0x सुनें") }
                        }

                        Text("अंडरलाइन किए शब्दों पर टैप करके तुरंत हिंदी अर्थ देखें:", style = MaterialTheme.typography.labelMedium, color = SlateMuted)

                        story.paragraphsEn.forEach { para ->
                            FlowRow(horizontalArrangement = Arrangement.spacedBy(5.dp), verticalArrangement = Arrangement.spacedBy(4.dp)) {
                                para.split(" ").forEach { rawWord ->
                                    val cleanKey = rawWord.lowercase().replace(Regex("[^a-z]"), "")
                                    val glossaryItem = story.glossary[cleanKey]
                                    if (glossaryItem != null) {
                                        Text(
                                            text = rawWord,
                                            color = EmeraldPrimary,
                                            fontWeight = FontWeight.Bold,
                                            textDecoration = TextDecoration.Underline,
                                            modifier = Modifier.clickable { selectedGlossary = glossaryItem }
                                        )
                                    } else {
                                        Text(text = rawWord)
                                    }
                                }
                            }
                        }

                        Card(colors = CardDefaults.cardColors(containerColor = EmeraldLight), modifier = Modifier.fillMaxWidth()) {
                            Text("कहानी का सार: ${story.summaryHi}", modifier = Modifier.padding(12.dp), style = MaterialTheme.typography.bodySmall)
                        }
                    }
                }
            }
        }
    }

    selectedGlossary?.let { word ->
        AlertDialog(
            onDismissRequest = { selectedGlossary = null },
            title = { Text("${word.word} (${word.pronunciationHi})") },
            text = {
                Column(verticalArrangement = Arrangement.spacedBy(6.dp)) {
                    Text("हिंदी अर्थ: ${word.meaningHi}", fontWeight = FontWeight.Bold)
                    Text("Grammar Role: ${word.grammarRole}", style = MaterialTheme.typography.bodySmall, color = SlateMuted)
                    Text("उदाहरण: ${word.usageExample}")
                }
            },
            confirmButton = {
                TextButton(onClick = { speechCoach.speak(word.word) }) { Text("सुनें") }
            },
            dismissButton = {
                TextButton(onClick = { selectedGlossary = null }) { Text("बंद करें") }
            }
        )
    }
}
