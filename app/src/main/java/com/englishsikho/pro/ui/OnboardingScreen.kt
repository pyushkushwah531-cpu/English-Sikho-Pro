package com.englishsikho.pro.ui
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
@Composable fun OnboardingScreen(onDone:(String,String)->Unit){
  var level by remember{ mutableStateOf("Beginner") }
  var goal by remember{ mutableStateOf("Exam") }
  Column(Modifier.fillMaxSize().padding(20.dp)){
    Text("👋 नमस्ते! मैं हूँ Guru Ji", fontSize=26.sp, fontWeight=FontWeight.Bold)
    Text("तुम्हारा दोस्त टीचर। डरो मत, खेल-खेल में English सिखाऊँगा।", fontSize=16.sp)
    Spacer(Modifier.height(24.dp))
    Text("तुम्हारा Level क्या है?", fontWeight=FontWeight.Bold)
    listOf("Beginner","Basic","Intermediate").forEach{ l ->
      FilterChip(selected=level==l, onClick={level=l}, label={Text(l)}, modifier=Modifier.padding(2.dp))
    }
    Spacer(Modifier.height(16.dp))
    Text("तुम्हारा Goal क्या है?", fontWeight=FontWeight.Bold)
    listOf("Exam","Job","Bolna","School").forEach{ g ->
      FilterChip(selected=goal==g, onClick={goal=g}, label={Text(g)}, modifier=Modifier.padding(2.dp))
    }
    Spacer(Modifier.height(24.dp))
    Button(onClick={onDone(level,goal)}, modifier=Modifier.fillMaxWidth()){ Text("आगे चलें → Level Test") }
    Text("Part 1: Base App • Offline • Dark Mode Ready", style=MaterialTheme.typography.bodySmall)
  }
}
