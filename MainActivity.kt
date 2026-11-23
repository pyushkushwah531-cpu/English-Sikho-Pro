package com.englishseekho.pro

import android.Manifest
import android.content.pm.PackageManager
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.rememberLauncherForActivityResult
import androidx.activity.compose.setContent
import androidx.activity.result.contract.ActivityResultContracts
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.EditNote
import androidx.compose.material.icons.rounded.Home
import androidx.compose.material.icons.rounded.MenuBook
import androidx.compose.material.icons.rounded.Mic
import androidx.compose.material.icons.rounded.Translate
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.DisposableEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.core.content.ContextCompat
import com.englishseekho.pro.data.LocalProgressStore
import com.englishseekho.pro.services.SpeechCoach
import com.englishseekho.pro.ui.screens.HindiBridgeAndGrammarScreen
import com.englishseekho.pro.ui.screens.HomeDashboardScreen
import com.englishseekho.pro.ui.screens.LevelTestScreen
import com.englishseekho.pro.ui.screens.SpeakingStudioScreen
import com.englishseekho.pro.ui.screens.VocabAndStoriesScreen
import com.englishseekho.pro.ui.screens.WritingCertificateSettingsScreen
import com.englishseekho.pro.ui.theme.EmeraldLight
import com.englishseekho.pro.ui.theme.EmeraldPrimary
import com.englishseekho.pro.ui.theme.EnglishSeekhoTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            EnglishSeekhoTheme {
                EnglishSeekhoRootApp()
            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun EnglishSeekhoRootApp() {
    val context = LocalContext.current
    val store = remember { LocalProgressStore(context) }
    val speechCoach = remember { SpeechCoach(context) }
    var progress by remember { mutableStateOf(store.load()) }
    var selectedTab by remember { mutableIntStateOf(0) }
    var showLevelTest by remember { mutableStateOf(!progress.onboardingDone) }

    var hasMicPermission by remember {
        mutableStateOf(
            ContextCompat.checkSelfPermission(context, Manifest.permission.RECORD_AUDIO) ==
                PackageManager.PERMISSION_GRANTED
        )
    }

    val micLauncher = rememberLauncherForActivityResult(
        contract = ActivityResultContracts.RequestPermission()
    ) { granted ->
        hasMicPermission = granted
    }

    DisposableEffect(Unit) {
        onDispose {
            speechCoach.release()
        }
    }

    fun updateProgress(transform: (com.englishseekho.pro.data.UserProgress) -> com.englishseekho.pro.data.UserProgress) {
        val updated = transform(progress)
        progress = updated
        store.save(updated)
    }

    if (showLevelTest) {
        Scaffold(
            topBar = {
                TopAppBar(
                    title = { Text("English सीखो Pro", fontWeight = FontWeight.Bold) },
                    colors = TopAppBarDefaults.topAppBarColors(
                        containerColor = EmeraldPrimary,
                        titleContentColor = EmeraldLight
                    )
                )
            }
        ) { innerPadding ->
            androidx.compose.foundation.layout.Box(modifier = Modifier.padding(innerPadding)) {
                LevelTestScreen(
                    initialName = progress.studentName,
                    onComplete = { name, level, bonusXp ->
                        updateProgress {
                            it.copy(
                                studentName = name,
                                level = level,
                                xp = it.xp + bonusXp,
                                onboardingDone = true
                            )
                        }
                        showLevelTest = false
                    }
                )
            }
        }
        return
    }

    val navItems = listOf(
        "होम" to Icons.Rounded.Home,
        "बोलें" to Icons.Rounded.Mic,
        "ब्रिज" to Icons.Rounded.Translate,
        "शब्द" to Icons.Rounded.MenuBook,
        "लिखें" to Icons.Rounded.EditNote
    )

    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text("English सीखो Pro", fontWeight = FontWeight.Bold) },
                colors = TopAppBarDefaults.topAppBarColors(
                    containerColor = EmeraldPrimary,
                    titleContentColor = EmeraldLight
                )
            )
        },
        bottomBar = {
            NavigationBar {
                navItems.forEachIndexed { index, (label, icon) ->
                    NavigationBarItem(
                        selected = selectedTab == index,
                        onClick = { selectedTab = index },
                        icon = { Icon(icon, contentDescription = label) },
                        label = { Text(label) }
                    )
                }
            }
        }
    ) { innerPadding ->
        androidx.compose.foundation.layout.Box(modifier = Modifier.padding(innerPadding)) {
            when (selectedTab) {
                0 -> HomeDashboardScreen(
                    progress = progress,
                    speechCoach = speechCoach,
                    onToggleTask = { taskId, reward ->
                        updateProgress { p ->
                            val already = p.completedTaskIds.contains(taskId)
                            val newSet = if (already) p.completedTaskIds - taskId else p.completedTaskIds + taskId
                            val newXp = if (already) (p.xp - reward).coerceAtLeast(0) else p.xp + reward
                            p.copy(completedTaskIds = newSet, xp = newXp)
                        }
                    },
                    onToggleCourseDay = { dayNumber ->
                        updateProgress { p ->
                            val already = p.completedDayNumbers.contains(dayNumber)
                            val newDays = if (already) p.completedDayNumbers - dayNumber else p.completedDayNumbers + dayNumber
                            val newXp = if (already) (p.xp - 20).coerceAtLeast(0) else p.xp + 20
                            p.copy(completedDayNumbers = newDays, xp = newXp)
                        }
                    },
                    onNavigateTab = { selectedTab = it },
                    onRetakeLevelTest = { showLevelTest = true }
                )

                1 -> SpeakingStudioScreen(
                    speechCoach = speechCoach,
                    geminiApiKey = progress.geminiApiKey,
                    hasMicPermission = hasMicPermission,
                    onRequestMicPermission = { micLauncher.launch(Manifest.permission.RECORD_AUDIO) },
                    onAddXp = { bonus -> updateProgress { it.copy(xp = it.xp + bonus) } }
                )

                2 -> HindiBridgeAndGrammarScreen(
                    speechCoach = speechCoach,
                    onAddXp = { bonus -> updateProgress { it.copy(xp = it.xp + bonus) } }
                )

                3 -> VocabAndStoriesScreen(
                    progress = progress,
                    speechCoach = speechCoach,
                    onMarkWord = { wordId, mastered ->
                        updateProgress { p ->
                            if (mastered) {
                                p.copy(
                                    masteredWordIds = p.masteredWordIds + wordId,
                                    reviewWordIds = p.reviewWordIds - wordId
                                )
                            } else {
                                p.copy(
                                    reviewWordIds = p.reviewWordIds + wordId,
                                    masteredWordIds = p.masteredWordIds - wordId
                                )
                            }
                        }
                    },
                    onAddXp = { bonus -> updateProgress { it.copy(xp = it.xp + bonus) } }
                )

                else -> WritingCertificateSettingsScreen(
                    progress = progress,
                    speechCoach = speechCoach,
                    onSaveSettings = { name, key ->
                        updateProgress { it.copy(studentName = name, geminiApiKey = key) }
                    },
                    onAddXp = { bonus -> updateProgress { it.copy(xp = it.xp + bonus) } }
                )
            }
        }
    }
}
