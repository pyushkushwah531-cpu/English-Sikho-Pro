package com.englishsikho.pro.ui
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
@Composable fun HomeScreen(level:String, goal:String){
  var tab by remember{ mutableStateOf(0) }
  Scaffold(bottomBar={ NavigationBar{ listOf("Home","Learn","Game","Bolna","Profile").forEachIndexed{ i,t -> NavigationBarItem(selected=tab==i, onClick={tab=i}, label={Text(t)}, icon={Text(listOf("🏠","📚","🎮","🎤","👤")[i])}) } } }){ pad ->
    Column(Modifier.padding(pad).padding(20.dp)){
      Card(Modifier.fillMaxWidth()){ Column(Modifier.padding(16.dp)){ Text("🧑‍🏫 Guru Ji:"); Text("चलो $level, आज का Lesson शुरू करते हैं! Goal: $goal"); Text("🔥 Streak: 1 दिन • 🪙 Coins: 0 • ⭐ XP: 0") } }
      Spacer(Modifier.height(16.dp))
      Text("आज का Plan (Part 1 Preview)")
      listOf("✅ 10 Words - Part 2 में खुलेगा","✅ 1 Grammar Rule - Part 2 में","✅ 1 Speaking Sentence - Part 3 में","✅ Quiz Battle - Part 2 में","✅ Exam Mode - Part 4 में").forEach{ Text(it, modifier=Modifier.padding(4.dp)) }
      Spacer(Modifier.height(16.dp))
      Text("Part 1 में: Splash + Onboarding + Level Test + Home + Bottom Nav + Dark Mode Ready है।")
      Text("Part 2 में Learn + Game जोड़ेंगे।")
    }
  }
}
