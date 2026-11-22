package com.englishsikho.pro
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.*
import androidx.compose.runtime.*
import com.englishsikho.pro.ui.*
import com.englishsikho.pro.data.*
@Composable fun EnglishSikhoApp(){
  var screen by remember { mutableStateOf("splash") }
  var userLevel by remember { mutableStateOf("Beginner") }
  var userGoal by remember { mutableStateOf("Exam") }
  when(screen){
    "splash" -> SplashScreen(onDone={ screen="onboarding" })
    "onboarding" -> OnboardingScreen(onDone={ lvl,goal -> userLevel=lvl; userGoal=goal; screen="leveltest" })
    "leveltest" -> LevelTestScreen(onDone={ lvl -> userLevel=lvl; screen="home" })
    "home" -> HomeScreen(level=userLevel, goal=userGoal)
  }
}
class MainActivity: ComponentActivity(){
  override fun onCreate(savedInstanceState: Bundle?){
    super.onCreate(savedInstanceState)
    setContent{ MaterialTheme{ EnglishSikhoApp() } }
  }
}
