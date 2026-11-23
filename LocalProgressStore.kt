package com.englishseekho.pro.data

import android.content.Context
import org.json.JSONArray

data class UserProgress(
    val studentName: String = "विद्यार्थी",
    val xp: Int = 40,
    val streakDays: Int = 1,
    val level: StudentLevel = StudentLevel.ZERO,
    val onboardingDone: Boolean = false,
    val completedTaskIds: Set<String> = emptySet(),
    val completedDayNumbers: Set<Int> = emptySet(),
    val masteredWordIds: Set<String> = emptySet(),
    val reviewWordIds: Set<String> = emptySet(),
    val geminiApiKey: String = ""
)

class LocalProgressStore(context: Context) {
    private val prefs = context.getSharedPreferences("english_seekho_pro_prefs", Context.MODE_PRIVATE)

    fun load(): UserProgress {
        val levelName = prefs.getString("level", StudentLevel.ZERO.name) ?: StudentLevel.ZERO.name
        val level = runCatching { StudentLevel.valueOf(levelName) }.getOrDefault(StudentLevel.ZERO)
        return UserProgress(
            studentName = prefs.getString("student_name", "विद्यार्थी") ?: "विद्यार्थी",
            xp = prefs.getInt("xp", 40),
            streakDays = prefs.getInt("streak_days", 1),
            level = level,
            onboardingDone = prefs.getBoolean("onboarding_done", false),
            completedTaskIds = readSet("completed_tasks"),
            completedDayNumbers = readIntSet("completed_days"),
            masteredWordIds = readSet("mastered_words"),
            reviewWordIds = readSet("review_words"),
            geminiApiKey = prefs.getString("gemini_api_key", "") ?: ""
        )
    }

    fun save(progress: UserProgress) {
        prefs.edit()
            .putString("student_name", progress.studentName)
            .putInt("xp", progress.xp)
            .putInt("streak_days", progress.streakDays)
            .putString("level", progress.level.name)
            .putBoolean("onboarding_done", progress.onboardingDone)
            .putString("completed_tasks", JSONArray(progress.completedTaskIds.toList()).toString())
            .putString("completed_days", JSONArray(progress.completedDayNumbers.toList()).toString())
            .putString("mastered_words", JSONArray(progress.masteredWordIds.toList()).toString())
            .putString("review_words", JSONArray(progress.reviewWordIds.toList()).toString())
            .putString("gemini_api_key", progress.geminiApiKey)
            .apply()
    }

    private fun readSet(key: String): Set<String> {
        val raw = prefs.getString(key, "[]") ?: "[]"
        val result = mutableSetOf<String>()
        runCatching {
            val array = JSONArray(raw)
            for (i in 0 until array.length()) {
                result.add(array.getString(i))
            }
        }
        return result
    }

    private fun readIntSet(key: String): Set<Int> {
        val raw = prefs.getString(key, "[]") ?: "[]"
        val result = mutableSetOf<Int>()
        runCatching {
            val array = JSONArray(raw)
            for (i in 0 until array.length()) {
                result.add(array.getInt(i))
            }
        }
        return result
    }
}
