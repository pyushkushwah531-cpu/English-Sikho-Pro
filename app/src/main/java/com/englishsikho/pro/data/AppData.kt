// Part 1 - Data Layer Ready for Part 2/3/4
package com.englishsikho.pro.data
import androidx.room.*
@Entity data class Word(@PrimaryKey val id:Int, val english:String, val hindi:String, val pronunciation:String, val story:String, val isWeak:Boolean=false)
@Entity data class UserProgress(@PrimaryKey val id:Int=1, val level:String="Beginner", val goal:String="Exam", val streak:Int=0, val coins:Int=0, val xp:Int=0)
@Dao interface WordDao { @Query("SELECT * FROM Word") suspend fun getAll(): List<Word> }
@Database(entities=[Word::class, UserProgress::class], version=1) abstract class AppDatabase: RoomDatabase(){ abstract fun wordDao(): WordDao }
