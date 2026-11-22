package com.englishsikho.pro.ui
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import kotlinx.coroutines.delay
@Composable fun SplashScreen(onDone:()->Unit){
  LaunchedEffect(Unit){ delay(1800); onDone() }
  Box(Modifier.fillMaxSize(), contentAlignment=Alignment.Center){
    Column(horizontalAlignment=Alignment.CenterHorizontally){
      Text("🧑‍🏫", fontSize=72.sp)
      Text("English Sikho", fontSize=32.sp, fontWeight=FontWeight.Bold)
      Text("Pro • Hindi Medium के लिए", color=MaterialTheme.colorScheme.primary)
      Spacer(Modifier.height(16.dp)); CircularProgressIndicator()
      Spacer(Modifier.height(8.dp)); Text("100% Native • Offline • No WebView")
    }
  }
}
