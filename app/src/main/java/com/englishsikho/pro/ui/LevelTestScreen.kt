package com.englishsikho.pro.ui
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
data class Q(val q:String, val opts:List<String>, val ans:Int)
val questions = listOf(
 Q("___ is my friend. (मैं)", listOf("I","He","They"),0),
 Q("'Book' का Hindi Meaning क्या है?", listOf("किताब","कलम","कुर्सी"),0),
 Q("I ___ going to school.", listOf("am","are","is"),0),
 Q("Good का Opposite क्या है?", listOf("Bad","Big","New"),0),
 Q("He ___ football.", listOf("plays","play","playing"),0)
)
@Composable fun LevelTestScreen(onDone:(String)->Unit){
  var idx by remember{ mutableStateOf(0) }
  var score by remember{ mutableStateOf(0) }
  if(idx>=questions.size){
    val lvl = when{ score>=4->"Intermediate"; score>=2->"Basic"; else->"Beginner" }
    Column(Modifier.fillMaxSize().padding(20.dp)){
      Text("🎉 Test पूरा!"); Text("Score: $score / ${questions.size}"); Text("तुम्हारा Level: $lvl")
      Button(onClick={onDone(lvl)}){ Text("Home पर चलें") }
    }; return
  }
  val q = questions[idx]
  Column(Modifier.fillMaxSize().padding(20.dp)){
    Text("Question ${idx+1} / ${questions.size}")
    Text(q.q, style=MaterialTheme.typography.headlineSmall)
    Spacer(Modifier.height(16.dp))
    q.opts.forEachIndexed{ i,opt ->
      Button(onClick={ if(i==q.ans) score++; idx++ }, modifier=Modifier.fillMaxWidth().padding(4.dp)){ Text(opt) }
    }
    Text("Guru Ji Tip: गलत होगा तो भी कोई बात नहीं, हम फिर से सीखेंगे।")
  }
}
