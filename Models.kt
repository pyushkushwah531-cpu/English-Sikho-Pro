package com.englishseekho.pro.data

enum class StudentLevel(val titleHi: String, val titleEn: String, val descriptionHi: String) {
    ZERO("शुरुआती (Zero / Basic)", "Beginner", "बिल्कुल बेसिक शब्दों, रोज़ के वाक्यों और आसान टेंस से शुरुआत"),
    INTERMEDIATE("मध्यम (Intermediate)", "Intermediate", "सही ग्रामर, Hinglish से English बदलाव और बोलने का अभ्यास"),
    PRO("इंटरव्यू तैयार (Job-Ready)", "Pro / Job-Ready", "ऑफिस ईमेल, फ्लुएंट स्पीकिंग और प्रोफेशनल वोकैबुलरी")
}

data class LevelTestQuestion(
    val id: Int,
    val promptHi: String,
    val sentenceEn: String,
    val options: List<String>,
    val correctIndex: Int,
    val explanationHi: String
)

data class DailyTask(
    val id: String,
    val titleHi: String,
    val subtitleHi: String,
    val xpReward: Int,
    val targetTab: Int
)

data class DayCourseLesson(
    val dayNumber: Int,
    val weekLabelHi: String,
    val titleHi: String,
    val goalHi: String,
    val sentences: List<Pair<String, String>>,
    val goldenTipHi: String
)

data class DailyUseSentence(
    val categoryHi: String,
    val english: String,
    val pronunciationHi: String,
    val hindi: String
)

data class RoleplayTurn(
    val speaker: String,
    val englishText: String,
    val hindiMeaning: String,
    val hintHi: String,
    val suggestedReplies: List<String>
)

data class RoleplayScenario(
    val id: String,
    val titleHi: String,
    val contextHi: String,
    val starterLineEn: String,
    val starterLineHi: String,
    val hintHi: String,
    val turns: List<RoleplayTurn>
)

data class PronunciationDrill(
    val id: String,
    val focusTitleHi: String,
    val sentenceEn: String,
    val phoneticHi: String,
    val hindiMeaning: String,
    val commonMistakeHi: String
)

data class BridgeTrap(
    val id: String,
    val hindiThought: String,
    val wrongLiteral: String,
    val naturalEnglish: String,
    val reasonHi: String
)

data class HinglishConversion(
    val hinglishInput: String,
    val simpleEn: String,
    val formalEn: String,
    val smartEn: String,
    val grammarTipHi: String
)

data class GrammarConcept(
    val id: String,
    val category: String,
    val titleHi: String,
    val formulaEn: String,
    val timelineLabelHi: String,
    val exampleEn: String,
    val exampleHi: String,
    val trickHi: String
)

data class FlashcardItem(
    val id: String,
    val wordEn: String,
    val pronunciationHi: String,
    val meaningHi: String,
    val exampleEn: String,
    val exampleHi: String,
    val category: String
)

data class ConfusingWordQuiz(
    val id: String,
    val wordA: String,
    val meaningAHi: String,
    val wordB: String,
    val meaningBHi: String,
    val questionSentence: String,
    val correctWord: String,
    val explanationHi: String
)

data class GlossaryWord(
    val word: String,
    val pronunciationHi: String,
    val meaningHi: String,
    val grammarRole: String,
    val usageExample: String
)

data class StoryItem(
    val id: String,
    val titleEn: String,
    val titleHi: String,
    val levelLabel: String,
    val paragraphsEn: List<String>,
    val summaryHi: String,
    val glossary: Map<String, GlossaryWord>
)

data class WritingTemplate(
    val id: String,
    val titleHi: String,
    val category: String,
    val draftText: String
)

data class WritingCorrection(
    val original: String,
    val corrected: String,
    val reasonHi: String
)
