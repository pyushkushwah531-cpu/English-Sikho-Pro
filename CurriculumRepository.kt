package com.englishseekho.pro.data

object CurriculumRepository {

    val levelTestQuestions = listOf(
        LevelTestQuestion(
            id = 1,
            promptHi = "सही वाक्य चुनें (मुझे भूख लगी है):",
            sentenceEn = "___ hungry right now.",
            options = listOf("I have", "I am", "I do", "Me is"),
            correctIndex = 1,
            explanationHi = "भूख/प्यास/खुशी महसूस करने के लिए 'I am' लगता है, 'I have' नहीं।"
        ),
        LevelTestQuestion(
            id = 2,
            promptHi = "कल मैं स्कूल गया था — सही शब्द भरें:",
            sentenceEn = "Yesterday I ___ to school.",
            options = listOf("go", "going", "went", "gone"),
            correctIndex = 2,
            explanationHi = "बीते हुए कल (Yesterday) के लिए क्रिया का 2nd form 'went' आता है।"
        ),
        LevelTestQuestion(
            id = 3,
            promptHi = "सोमवार को मिलने के लिए सही Preposition:",
            sentenceEn = "We will meet ___ Monday.",
            options = listOf("in", "on", "at", "to"),
            correctIndex = 1,
            explanationHi = "दिन (Monday, Sunday) और तारीख से पहले हमेशा 'on' का उपयोग होता है।"
        ),
        LevelTestQuestion(
            id = 4,
            promptHi = "निम्न में से कौन-सा वाक्य 100% सही है?",
            sentenceEn = "सही विकल्प चुनें:",
            options = listOf(
                "He did not went there.",
                "He did not go there.",
                "He not went there.",
                "He did no go there."
            ),
            correctIndex = 1,
            explanationHi = "'did' के साथ हमेशा क्रिया का पहला रूप (V1 = go) आता है, 'went' नहीं।"
        ),
        LevelTestQuestion(
            id = 5,
            promptHi = "ऑफिस ईमेल में विनम्र अनुरोध कैसे लिखें?",
            sentenceEn = "___, could you please share the report?",
            options = listOf("Give me fast", "Hi, kindly note", "Please revert back", "Excuse me"),
            correctIndex = 1,
            explanationHi = "प्रोफेशनल ईमेल में 'revert back' गलत है (सिर्फ reply/share लिखें) और 'kindly' विनम्र तरीका है।"
        )
    )

    val dailyTasks = listOf(
        DailyTask("words", "सुबह: 5 नए शब्द याद करें", "Flashcards से हिंदी अर्थ और उच्चारण सुनें", 25, 3),
        DailyTask("grammar", "दोपहर: 1 Visual Grammar नियम", "Tense या Preposition की आसान ट्रिक देखें", 20, 2),
        DailyTask("speak", "शाम: 2 मिनट बोलने का अभ्यास", "माइक पर 2 वाक्य बोलें और उच्चारण जाँचें", 30, 1),
        DailyTask("story", "रात: 1 कहानी पढ़ें और 1 ईमेल सुधारें", "Tap-to-Translate कहानी और Writing Coach", 25, 4)
    )

    val thirtyDayCourse = listOf(
        DayCourseLesson(1, "सप्ताह 1: ज़ीरो से शुरुआत", "दिन 1: आत्मविश्वास से अपना परिचय देना", "पहली मुलाकात में साफ और सरल परिचय बोलना सीखें।", listOf("Hello, my name is Aarav." to "नमस्ते, मेरा नाम आरव है।", "I am from a small town in India." to "मैं भारत के एक छोटे शहर से हूँ।", "I am learning English step by step." to "मैं कदम-दर-कदम अंग्रेज़ी सीख रहा हूँ।"), "'Myself Rahul' बोलना गलत है — हमेशा 'I am Rahul' या 'My name is Rahul' बोलें।"),
        DayCourseLesson(2, "सप्ताह 1: ज़ीरो से शुरुआत", "दिन 2: सुबह से रात तक अभिवादन", "समय के अनुसार सही नमस्ते और विदाई बोलना।", listOf("Good morning! How are you doing?" to "सुप्रभात! आप कैसे हैं?", "I am doing well, thank you." to "मैं ठीक हूँ, धन्यवाद।", "Have a wonderful day ahead!" to "आपका दिन शुभ हो!"), "दोपहर 12 से शाम 5 बजे तक 'Good afternoon' और शाम 5 के बाद 'Good evening' बोलें।"),
        DayCourseLesson(3, "सप्ताह 1: ज़ीरो से शुरुआत", "दिन 3: Is, Am, Are का पक्का इस्तेमाल", "अवस्था और पहचान बताने वाले सबसे जरूरी वाक्य।", listOf("I am ready for today's lesson." to "मैं आज के पाठ के लिए तैयार हूँ।", "She is my elder sister." to "वह मेरी बड़ी बहन है।", "We are very excited about this." to "हम इसे लेकर बहुत उत्साहित हैं।"), "I के साथ हमेशा am, एकवचन (He/She/Name) के साथ is, और बहुवचन (You/We/They) के साथ are लगाएं।"),
        DayCourseLesson(4, "सप्ताह 1: ज़ीरो से शुरुआत", "दिन 4: Has और Have (पास होना)", "चीज़ें, रिश्ते या समय अपने पास होना बताना।", listOf("I have two notebooks in my bag." to "मेरे बैग में दो कॉपियाँ हैं।", "He has a lot of patience." to "उसके पास बहुत धैर्य है।", "Do you have a spare pen?" to "क्या आपके पास एक अतिरिक्त पेन है?"), "'I have hunger' कभी न बोलें — भूख के लिए 'I am hungry' ही सही है।"),
        DayCourseLesson(5, "सप्ताह 1: ज़ीरो से शुरुआत", "दिन 5: विनम्र निवेदन (Please & Kindly)", "किसी से प्यार से मदद या कोई चीज़ माँगना।", listOf("Could you please repeat that slowly?" to "क्या आप कृपया उसे धीरे दोहरा सकते हैं?", "Please pass me the water bottle." to "कृपया मुझे पानी की बोतल दे दीजिए।", "Thank you so much for your help." to "आपकी मदद के लिए बहुत धन्यवाद।"), "'Give me' के बजाय 'Could you please give me' बोलने से भाषा तुरंत सभ्य लगती है।"),
        DayCourseLesson(6, "सप्ताह 1: ज़ीरो से शुरुआत", "दिन 6: अपनी दैनिक दिनचर्या (Daily Routine)", "सुबह उठने से रात को सोने तक की आदतें बताना।", listOf("I wake up at six in the morning." to "मैं सुबह छह बजे उठता हूँ।", "Then I revise five English words." to "फिर मैं पाँच अंग्रेज़ी शब्द दोहराता हूँ।", "I go to bed around ten PM." to "मैं रात करीब दस बजे सो जाता हूँ।"), "रोज़ की आदत में हमेशा Verb का पहला रूप (wake, read, eat) लगाएं।"),
        DayCourseLesson(7, "सप्ताह 1: ज़ीरो से शुरुआत", "दिन 7: सप्ताह 1 रिवीजन व 5-वाक्य भाषण", "बिना रुके लगातार 5 वाक्य बोलने का अभ्यास।", listOf("I started learning English seven days ago." to "मैंने सात दिन पहले अंग्रेज़ी सीखना शुरू किया।", "Now I do not feel afraid of mistakes." to "अब मुझे गलतियों से डर नहीं लगता।", "Consistency is my biggest strength." to "नियमितता मेरी सबसे बड़ी ताकत है।"), "गलती होने पर रुकें नहीं — मुस्कुराकर आगे बढ़ें!"),

        DayCourseLesson(8, "सप्ताह 2: रोज़मर्रा के टेंस और सवाल", "दिन 8: सवाल पूछना (What, Where, When)", "सही तरीके से जानकारी माँगना सीखें।", listOf("Where is the nearest bus stop?" to "सबसे नज़दीकी बस स्टॉप कहाँ है?", "What time does the class start?" to "क्लास कितने बजे शुरू होती है?", "When will you reach home?" to "आप घर कब पहुँचेंगे?"), "सवाल पूछते समय 'What you want?' नहीं, 'What do you want?' बोलें।"),
        DayCourseLesson(9, "सप्ताह 2: रोज़मर्रा के टेंस और सवाल", "दिन 9: Why और How से बात बढ़ाना", "बातचीत में कारण और तरीका पूछना।", listOf("Why are you looking so happy today?" to "आज आप इतने खुश क्यों दिख रहे हैं?", "How did you learn this so fast?" to "आपने यह इतनी जल्दी कैसे सीखा?", "How long does it take to reach?" to "पहुँचने में कितना समय लगता है?"), "'How much' गिनती न होने वाली चीज़ों (पानी, कीमत) और 'How many' गिनती वाली चीज़ों के लिए आता है।"),
        DayCourseLesson(10, "सप्ताह 2: रोज़मर्रा के टेंस और सवाल", "दिन 10: बीती हुई बातें (Past Simple)", "कल या पिछले हफ्ते क्या हुआ, साफ बताना।", listOf("Yesterday I met my old school friend." to "कल मैं अपने पुराने स्कूल मित्र से मिला।", "I did not waste time on my phone." to "मैंने फोन पर समय बर्बाद नहीं किया।", "We talked about our future plans." to "हमने अपने भविष्य की योजनाओं पर बात की।"), "'did not' के बाद हमेशा V1 (waste/go/eat) ही आता है।"),
        DayCourseLesson(11, "सप्ताह 2: रोज़मर्रा के टेंस और सवाल", "दिन 11: आने वाला कल (Future Plans)", "भविष्य के इरादे और वादे बताना।", listOf("Tomorrow I will practice speaking for fifteen minutes." to "कल मैं पंद्रह मिनट बोलने का अभ्यास करूँगा।", "I am going to start a new chapter." to "मैं एक नया अध्याय शुरू करने जा रहा हूँ।", "We will surely succeed one day." to "हम एक दिन ज़रूर सफल होंगे।"), "तय योजना के लिए 'going to' और तुरंत निर्णय के लिए 'will' बोलना ज्यादा स्वाभाविक है।"),
        DayCourseLesson(12, "सप्ताह 2: रोज़मर्रा के टेंस और सवाल", "दिन 12: IN, ON, AT का जादू", "समय और स्थान बताने में कभी गलती न करना।", listOf("The train arrives at seven thirty." to "ट्रेन साढ़े सात बजे आती है।", "My exam is on Friday morning." to "मेरी परीक्षा शुक्रवार सुबह को है।", "I live in a peaceful neighbourhood." to "मैं एक शांत मोहल्ले में रहता हूँ।"), "समय = at, दिन = on, शहर/महीना/साल = in।"),
        DayCourseLesson(13, "सप्ताह 2: रोज़मर्रा के टेंस और सवाल", "दिन 13: दुकान व बाज़ार में मोलभाव", "कीमत पूछना और सही सामान माँगना।", listOf("Excuse me, how much is this shirt for?" to "क्षमा करें, यह शर्ट कितने की है?", "Do you have a smaller size in blue?" to "क्या आपके पास नीले रंग में छोटा साइज है?", "Can I pay using UPI?" to "क्या मैं यूपीआई से भुगतान कर सकता हूँ?"), "'Excuse me' कहकर बात शुरू करने से दुकानदार पूरा ध्यान देते हैं।"),
        DayCourseLesson(14, "सप्ताह 2: रोज़मर्रा के टेंस और सवाल", "दिन 14: फोन कॉल पर प्रोफेशनल बातचीत", "फोन उठाने से रखने तक के सटीक वाक्य।", listOf("Hello, may I know who is speaking?" to "नमस्ते, क्या मैं जान सकता हूँ कौन बोल रहा है?", "Your voice is breaking, could you repeat?" to "आपकी आवाज़ कट रही है, क्या आप दोहराएंगे?", "I will call you back in ten minutes." to "मैं आपको दस मिनट में वापस कॉल करूँगा।"), "फोन पर 'Wait' की जगह 'Hold on a moment, please' बोलना ज्यादा विनम्र है।"),
        DayCourseLesson(15, "सप्ताह 2: रोज़मर्रा के टेंस और सवाल", "दिन 15: सप्ताह 2 प्रैक्टिस चैलेंज", "पिछले सप्ताह की सारी संरचनाओं का मिश्रण।", listOf("Last week I learned how to ask polite questions." to "पिछले हफ्ते मैंने विनम्र सवाल पूछना सीखा।", "Now I can talk clearly on phone calls." to "अब मैं फोन कॉल पर साफ बात कर सकता हूँ।", "Next week I will focus on fluency." to "अगले हफ्ते मैं प्रवाह (fluency) पर ध्यान दूँगा।"), "शीशे के सामने खड़े होकर रोज़ 3 वाक्य ज़ोर से बोलें।"),

        DayCourseLesson(16, "सप्ताह 3: आत्मविश्वास और फ्लुएंसी", "दिन 16: Can, Should और Must", "क्षमता, सलाह और ज़रूरी नियम बताना।", listOf("I can understand English easily now." to "मैं अब अंग्रेज़ी आसानी से समझ सकता हूँ।", "You should drink more water daily." to "आपको रोज़ ज्यादा पानी पीना चाहिए।", "We must respect everyone's time." to "हमें हर किसी के समय का सम्मान ज़रूर करना चाहिए।"), "इन शब्दों के बाद कभी 'to' न लगाएं ('can to go' ❌ ➔ 'can go' ✅)।"),
        DayCourseLesson(17, "सप्ताह 3: आत्मविश्वास और फ्लुएंसी", "दिन 17: अभी चल रहा काम (Continuous)", "इस समय क्या हो रहा है, वह बताना।", listOf("Right now I am reading an English story." to "अभी मैं एक अंग्रेज़ी कहानी पढ़ रहा हूँ।", "It is raining heavily outside." to "बाहर तेज़ बारिश हो रही है।", "They are preparing for the interview." to "वे इंटरव्यू की तैयारी कर रहे हैं।"), "जब काम आँखों के सामने चल रहा हो तो is/am/are + verb-ing लगाएं।"),
        DayCourseLesson(18, "सप्ताह 3: आत्मविश्वास और फ्लुएंसी", "दिन 18: अभी-अभी पूरा हुआ काम (Present Perfect)", "Has/Have + V3 का सही उपयोग।", listOf("I have completed my homework already." to "मैंने अपना होमवर्क पहले ही पूरा कर लिया है।", "Have you ever visited Delhi?" to "क्या आप कभी दिल्ली गए हैं?", "She has improved her pronunciation a lot." to "उसने अपना उच्चारण बहुत सुधार लिया है।"), "अक्सर छात्र 'I have did' बोल देते हैं — सही रूप 'I have done' (V3) है।"),
        DayCourseLesson(19, "सप्ताह 3: आत्मविश्वास और फ्लुएंसी", "दिन 19: डॉक्टर और अस्पताल में बात", "बीमारी और लक्षण साफ़-साफ़ बताना।", listOf("I have had a headache since morning." to "मुझे सुबह से सिरदर्द हो रहा है।", "Should I take this tablet after meals?" to "क्या मुझे यह गोली खाने के बाद लेनी चाहिए?", "Thank you doctor, I feel much better now." to "धन्यवाद डॉक्टर, अब मुझे काफी बेहतर लग रहा है।"), "लंबे समय से चल रही परेशानी के लिए 'since morning' या 'for two days' लगाएं।"),
        DayCourseLesson(20, "सप्ताह 3: आत्मविश्वास और फ्लुएंसी", "दिन 20: ट्रेन, बस और यात्रा के वाक्य", "टिकट, प्लेटफॉर्म और रास्ता पूछना।", listOf("Which platform does the Lucknow train arrive on?" to "लखनऊ की ट्रेन किस प्लेटफॉर्म पर आती है?", "Is this seat taken or vacant?" to "क्या यह सीट भरी है या खाली है?", "Could you please tell me when my stop comes?" to "कृपया मुझे बता देंगे जब मेरा स्टॉप आए?"), "'Empty' से ज्यादा सीट के लिए 'Vacant' या 'Available' बोला जाता है।"),
        DayCourseLesson(21, "सप्ताह 3: आत्मविश्वास और फ्लुएंसी", "दिन 21: अपनी राय और सहमति देना", "बिना झिझक अपनी बात रखना।", listOf("In my opinion, daily practice matters most." to "मेरी राय में, रोज़ का अभ्यास सबसे ज्यादा मायने रखता है।", "I completely agree with your point." to "मैं आपकी बात से पूरी तरह सहमत हूँ।", "That is a very interesting idea." to "यह बहुत ही दिलचस्प विचार है।"), "'I am agree' ❌ बिल्कुल न बोलें — हमेशा 'I agree' ✅ बोलें।"),
        DayCourseLesson(22, "सप्ताह 3: आत्मविश्वास और फ्लुएंसी", "दिन 22: दोस्तों के साथ सहज बातचीत", "छोटी-मोटी गपशप (Small Talk) के स्मार्ट वाक्य।", listOf("Long time no see! Where have you been?" to "बहुत दिनों बाद दिखे! कहाँ थे?", "Nothing much, just keeping busy with studies." to "कुछ खास नहीं, बस पढ़ाई में व्यस्त हूँ।", "Let us catch up this weekend." to "चलो इस सप्ताहांत मिलते हैं।"), "'Catch up' का मतलब है पुराने दोस्तों से मिलकर हालचाल जानना।"),
        DayCourseLesson(23, "सप्ताह 3: आत्मविश्वास और फ्लुएंसी", "दिन 23: अटकने पर समय लेने वाले शब्द", "सोचते वक्त घबराएं नहीं — स्मार्ट कनेक्टर बोलें।", listOf("Let me think about that for a second." to "मुझे एक सेकंड इसके बारे में सोचने दीजिए।", "What I mean to say is very simple." to "मेरा कहने का मतलब बहुत सरल है।", "Actually, there are two main reasons for this." to "दरअसल, इसके दो मुख्य कारण हैं।"), "'Umm...' करने से अच्छा है 'Actually...' या 'Let me think...' बोलना।"),

        DayCourseLesson(24, "सप्ताह 4: जॉब और प्रोफेशनल इंग्लिश", "दिन 24: ऑफिस ईमेल की सही शुरुआत व अंत", "छुट्टी और काम के ईमेल की प्रोफेशनल शैली।", listOf("I am writing to request one day of leave." to "मैं एक दिन की छुट्टी के अनुरोध के लिए लिख रहा हूँ।", "Please find the attached document for your review." to "कृपया अपनी समीक्षा के लिए संलग्न दस्तावेज़ देखें।", "Looking forward to hearing from you soon." to "आपकी जल्द प्रतिक्रिया की प्रतीक्षा रहेगी।"), "'Please do the needful' और 'revert back' पुराने हैं — उनकी जगह 'Please reply' लिखें।"),
        DayCourseLesson(25, "सप्ताह 4: जॉब और प्रोफेशनल इंग्लिश", "दिन 25: इंटरव्यू में 'Tell me about yourself'", "60 सेकंड का दमदार परिचय तैयार करना।", listOf("I am a Commerce graduate with strong computer skills." to "मैं मजबूत कंप्यूटर कौशल के साथ कॉमर्स स्नातक हूँ।", "My greatest strength is my willingness to learn." to "मेरी सबसे बड़ी ताकत सीखने की इच्छा है।", "I am looking for a role where I can grow." to "मैं ऐसी भूमिका की तलाश में हूँ जहाँ मैं आगे बढ़ सकूँ।"), "इंटरव्यू में परिवार की पूरी कहानी के बजाय अपनी पढ़ाई, स्किल और लक्ष्य बताएं।"),
        DayCourseLesson(26, "सप्ताह 4: जॉब और प्रोफेशनल इंग्लिश", "दिन 26: अपनी कमज़ोरी और ताकत बताना", "इंटरव्यू के मुश्किल सवालों का स्मार्ट जवाब।", listOf("I used to hesitate in English, so I practiced daily." to "मैं पहले अंग्रेज़ी में झिझकता था, इसलिए मैंने रोज़ अभ्यास किया।", "I work well both independently and in a team." to "मैं अकेले और टीम दोनों के साथ अच्छा काम करता हूँ।", "I take feedback positively to improve myself." to "मैं खुद को बेहतर बनाने के लिए फीडबैक को सकारात्मक रूप से लेता हूँ।"), "अपनी कमज़ोरी के साथ यह ज़रूर जोड़ें कि आप उसे सुधारने के लिए क्या कर रहे हैं।"),
        DayCourseLesson(27, "सप्ताह 4: जॉब और प्रोफेशनल इंग्लिश", "दिन 27: मीटिंग में विनम्र असहमति", "किसी की बात काटे बिना अपना विचार रखना।", listOf("I see your point, however I have a suggestion." to "मैं आपकी बात समझता हूँ, हालांकि मेरा एक सुझाव है।", "Could we look at this from another angle?" to "क्या हम इसे दूसरे नज़रिए से देख सकते हैं?", "Let me clarify that part briefly." to "मुझे उस हिस्से को संक्षेप में स्पष्ट करने दें।"), "सीधे 'You are wrong' कभी न बोलें — 'I have a slightly different view' बोलें।"),
        DayCourseLesson(28, "सप्ताह 4: जॉब और प्रोफेशनल इंग्लिश", "दिन 28: Formal बनाम Informal भाषा", "कहाँ दोस्त जैसी और कहाँ ऑफिस जैसी बात करनी है।", listOf("Informal: Thanks a lot! | Formal: I appreciate your support." to "अंतर: धन्यवाद बोलने का दोस्ताना बनाम ऑफिस तरीका", "Informal: Tell me soon | Formal: Please let me know at your earliest." to "अंतर: जल्दी बताने का विनम्र अनुरोध", "Informal: Sorry I am late | Formal: Apologies for the delay." to "अंतर: देर होने पर माफी माँगना"), "असली प्रोफेशनल वही है जो जगह के हिसाब से सही शब्द चुने।"),
        DayCourseLesson(29, "सप्ताह 4: जॉब और प्रोफेशनल इंग्लिश", "दिन 29: सार्वजनिक मंच और प्रेजेंटेशन", "सबके सामने बोलने के शुरुआती व अंतिम वाक्य।", listOf("Good morning everyone, thank you for your time." to "सभी को सुप्रभात, आपके समय के लिए धन्यवाद।", "Today I would like to share three key points." to "आज मैं तीन मुख्य बिंदु साझा करना चाहूँगा।", "Thank you for listening, I welcome your questions." to "सुनने के लिए धन्यवाद, आपके सवालों का स्वागत है।"), "तेज़ बोलने के बजाय धीरे और ठहराव के साथ बोलने से आवाज असरदार लगती है।"),
        DayCourseLesson(30, "सप्ताह 4: जॉब और प्रोफेशनल इंग्लिश", "दिन 30: ग्रैंड रिव्यू व भविष्य का संकल्प", "30 दिन पूरे! अब धाराप्रवाह बोलने का नया सफर।", listOf("I have completed the thirty-day English foundation." to "मैंने तीस दिन की अंग्रेज़ी नींव पूरी कर ली है।", "English is no longer a barrier for my dreams." to "अंग्रेज़ी अब मेरे सपनों के आड़े नहीं आती।", "I will keep reading and speaking every day." to "मैं हर दिन पढ़ना और बोलना जारी रखूँगा।"), "बधाई हो! रोज़ 10 मिनट इस ऐप की कहानियाँ और Flashcards दोहराते रहें।")
    )

    val dailyUseSentences = listOf(
        DailyUseSentence("घर और परिवार", "Please wake me up early tomorrow.", "प्लीज़ वेक मी अप अर्ली टुमॉरो", "कृपया मुझे कल जल्दी जगा देना।"),
        DailyUseSentence("घर और परिवार", "I am getting ready for college.", "आय एम गेटिंग रेडी फॉर कॉलेज", "मैं कॉलेज के लिए तैयार हो रहा हूँ।"),
        DailyUseSentence("घर और परिवार", "Put the phone on charging.", "पुट द फोन ऑन चार्जिंग", "फोन को चार्जिंग पर लगा दो।"),
        DailyUseSentence("घर और परिवार", "Don't worry, everything will be fine.", "डोंट वरी, एवरीथिंग विल बी फाइन", "चिंता मत करो, सब ठीक हो जाएगा।"),
        DailyUseSentence("घर और परिवार", "Have you had your breakfast?", "हैव यू हैड योर ब्रेकफास्ट", "क्या आपने नाश्ता कर लिया?"),
        DailyUseSentence("घर और परिवार", "Speak softly, grandfather is sleeping.", "स्पीक सॉफ्टली, ग्रैंडफादर इज़ स्लीपिंग", "धीरे बोलो, दादाजी सो रहे हैं।"),

        DailyUseSentence("पढ़ाई और ऑफिस", "Could you explain this topic once more?", "कुड यू एक्सप्लेन दिस टॉपिक वन्स मोर", "क्या आप यह विषय एक बार फिर समझा सकते हैं?"),
        DailyUseSentence("पढ़ाई और ऑफिस", "I need a little more time to finish.", "आय नीड अ लिटिल मोर टाइम टू फिनिश", "मुझे पूरा करने के लिए थोड़ा और समय चाहिए।"),
        DailyUseSentence("पढ़ाई और ऑफिस", "Let me note this down in my diary.", "लेट मी नोट दिस डाउन इन माय डायरी", "मुझे यह अपनी डायरी में लिख लेने दीजिए।"),
        DailyUseSentence("पढ़ाई और ऑफिस", "I am working hard to improve my skills.", "आय एम वर्किंग हार्ड टू इम्प्रूव माय स्किल्स", "मैं अपने कौशल सुधारने के लिए मेहनत कर रहा हूँ।"),
        DailyUseSentence("पढ़ाई और ऑफिस", "Please send me the PDF on WhatsApp.", "प्लीज़ सेंड मी द पीडीएफ ऑन व्हाट्सएप", "कृपया मुझे व्हाट्सएप पर पीडीएफ भेज दीजिए।"),
        DailyUseSentence("पढ़ाई और ऑफिस", "Sorry for the mistake, I will fix it.", "सॉरी फॉर द मिस्टेक, आय विल फिक्स इट", "गलती के लिए क्षमा, मैं इसे ठीक कर दूँगा।"),

        DailyUseSentence("बाज़ार और यात्रा", "How far is the railway station from here?", "हाउ फार इज़ द रेलवे स्टेशन फ्रॉम हियर", "यहाँ से रेलवे स्टेशन कितनी दूर है?"),
        DailyUseSentence("बाज़ार और यात्रा", "Please give me change for five hundred.", "प्लीज़ गिव मी चेंज फॉर फाइव हंड्रेड", "कृपया मुझे पाँच सौ के छुट्टे दे दीजिए।"),
        DailyUseSentence("बाज़ार और यात्रा", "Is there any discount on this item?", "इज़ देयर एनी डिस्काउंट ऑन दिस आइटम", "क्या इस सामान पर कोई छूट है?"),
        DailyUseSentence("बाज़ार और यात्रा", "Wait here, I will be back in five minutes.", "वेट हियर, आय विल बी बैक इन फाइव मिनट्स", "यहीं रुकिए, मैं पाँच मिनट में वापस आता हूँ।"),

        DailyUseSentence("विनम्रता और मदद", "Excuse me, could you help me for a moment?", "एक्सक्यूज़ मी, कुड यू हेल्प मी फॉर अ मोमेंट", "क्षमा करें, क्या आप एक पल मेरी मदद कर सकते हैं?"),
        DailyUseSentence("विनम्रता और मदद", "That is very kind of you.", "दैट इज़ वेरी काइंड ऑफ़ यू", "आपकी बहुत कृपा है।"),
        DailyUseSentence("विनम्रता और मदद", "No problem at all, you are welcome.", "नो प्रॉब्लम एट ऑल, यू आर वेलकम", "कोई बात नहीं, आपका स्वागत है।"),
        DailyUseSentence("विनम्रता और मदद", "Please speak a little slowly, I am learning.", "प्लीज़ स्पीक अ लिटिल स्लोली, आय एम लर्निंग", "कृपया थोड़ा धीरे बोलें, मैं अभी सीख रहा हूँ।")
    )

    val roleplayScenarios = listOf(
        RoleplayScenario(
            id = "interview",
            titleHi = "जॉब इंटरव्यू (Job Interview)",
            contextHi = "HR आपसे आपका परिचय, ताकत और जॉइनिंग पूछ रहे हैं।",
            starterLineEn = "Hello! Tell me a little about yourself and your strengths.",
            starterLineHi = "नमस्ते! मुझे अपने बारे में और अपनी खूबियों के बारे में थोड़ा बताइए।",
            hintHi = "हिंदी हिंट: पहले अपना नाम, पढ़ाई और अपनी 1 अच्छी आदत (जैसे quick learner या hardworking) बोलें।",
            turns = listOf(
                RoleplayTurn(
                    speaker = "HR",
                    englishText = "That sounds good. Why do you want to join our company?",
                    hindiMeaning = "अच्छा लगा। आप हमारी कंपनी में क्यों जुड़ना चाहते हैं?",
                    hintHi = "बोलें: मुझे सीखने का शौक है और आपकी कंपनी में काम करके मैं अपने कौशल बढ़ा सकता हूँ।",
                    suggestedReplies = listOf(
                        "I want to learn new skills and grow with your team.",
                        "Your company has a great work culture, and I am eager to contribute."
                    )
                ),
                RoleplayTurn(
                    speaker = "HR",
                    englishText = "Great! When can you start if selected?",
                    hindiMeaning = "बहुत बढ़िया! अगर आपका चयन होता है तो आप कब से शुरू कर सकते हैं?",
                    hintHi = "बोलें: मैं तुरंत या अगले सोमवार से जुड़ सकता हूँ।",
                    suggestedReplies = listOf(
                        "I can join immediately from next Monday.",
                        "I am available to start as soon as required."
                    )
                )
            )
        ),
        RoleplayScenario(
            id = "shop",
            titleHi = "दुकान या बाज़ार में बातचीत",
            contextHi = "आप एक किताब या मोबाइल कवर खरीदने गए हैं।",
            starterLineEn = "Good morning! How can I help you today?",
            starterLineHi = "सुप्रभात! आज मैं आपकी क्या मदद कर सकता हूँ?",
            hintHi = "हिंदी हिंट: बोलें कि आप एक इंग्लिश ग्रामर की किताब या नोटबुक ढूँढ रहे हैं।",
            turns = listOf(
                RoleplayTurn(
                    speaker = "Shopkeeper",
                    englishText = "Sure, we have two options. Would you like the beginner guide?",
                    hindiMeaning = "जी हाँ, हमारे पास दो विकल्प हैं। क्या आपको शुरुआती गाइड चाहिए?",
                    hintHi = "बोलें: जी हाँ, कृपया कीमत बता दीजिए।",
                    suggestedReplies = listOf(
                        "Yes please. How much does it cost?",
                        "Can you show me the simple one and tell me the price?"
                    )
                )
            )
        ),
        RoleplayScenario(
            id = "doctor",
            titleHi = "डॉक्टर के पास (Doctor Visit)",
            contextHi = "आपको कल से हल्का बुखार और गले में खराश है।",
            starterLineEn = "Hello, please sit down. What problem are you facing?",
            starterLineHi = "नमस्ते, बैठिए। आपको क्या तकलीफ़ हो रही है?",
            hintHi = "हिंदी हिंट: बोलें 'I have had a mild fever since yesterday.'",
            turns = listOf(
                RoleplayTurn(
                    speaker = "Doctor",
                    englishText = "Okay, let me check. Are you taking any medicine right now?",
                    hindiMeaning = "ठीक है, मैं जाँच करता हूँ। क्या आप अभी कोई दवाई ले रहे हैं?",
                    hintHi = "बोलें: नहीं डॉक्टर, मैंने अभी कोई दवाई नहीं ली है।",
                    suggestedReplies = listOf(
                        "No doctor, I have not taken any medicine yet.",
                        "Only warm water, no medicine so far."
                    )
                )
            )
        ),
        RoleplayScenario(
            id = "phone",
            titleHi = "फोन कॉल (Customer Care / Office)",
            contextHi = "आपको कस्टमर केयर या ऑफिस कॉल पर विनम्र बात करनी है।",
            starterLineEn = "Good afternoon, thank you for calling support. How may I assist you?",
            starterLineHi = "नमस्कार, सपोर्ट पर कॉल करने के लिए धन्यवाद। मैं आपकी क्या सहायता कर सकता हूँ?",
            hintHi = "हिंदी हिंट: बोलें कि आपका ऑर्डर या फॉर्म अभी तक अपडेट नहीं हुआ है।",
            turns = listOf(
                RoleplayTurn(
                    speaker = "Agent",
                    englishText = "I understand. Could you please share your registered mobile number?",
                    hindiMeaning = "मैं समझता हूँ। क्या आप कृपया अपना रजिस्टर्ड मोबाइल नंबर बता सकते हैं?",
                    hintHi = "बोलें: जी ज़रूर, कृपया नोट कीजिए।",
                    suggestedReplies = listOf(
                        "Yes sure, please note down my number.",
                        "Of course, thank you for checking this quickly."
                    )
                )
            )
        ),
        RoleplayScenario(
            id = "travel",
            titleHi = "रेलवे स्टेशन व यात्रा पूछताछ",
            contextHi = "आप टिकट काउंटर पर ट्रेन और प्लेटफॉर्म के बारे में पूछ रहे हैं।",
            starterLineEn = "Next please! Where would you like to travel today?",
            starterLineHi = "अगले आइए! आज आप कहाँ की यात्रा करना चाहेंगे?",
            hintHi = "हिंदी हिंट: बोलें 'One ticket to Jaipur, please.'",
            turns = listOf(
                RoleplayTurn(
                    speaker = "Clerk",
                    englishText = "The train departs at 4:15 PM from platform number three.",
                    hindiMeaning = "ट्रेन शाम 4:15 बजे प्लेटफॉर्म नंबर तीन से छूटेगी।",
                    hintHi = "बोलें: धन्यवाद, क्या यह समय पर है?",
                    suggestedReplies = listOf(
                        "Thank you! Is the train running on time today?",
                        "Thanks a lot for the information."
                    )
                )
            )
        )
    )

    val pronunciationDrills = listOf(
        PronunciationDrill("p1", "S / School ट्रिक (इस्कूल न बोलें)", "I go to school every morning at seven.", "आय गो टू स्कूल एवरी मॉर्निंग एट सेवेन", "मैं रोज़ सुबह सात बजे स्कूल जाता हूँ।", "'School' को 'इस्कूल' न बोलें — 'स्-कूल' की हल्की आवाज़ से शुरू करें।"),
        PronunciationDrill("p2", "V और W का फर्क", "We visited a very wonderful village.", "वी विज़िटेड अ वेरी वंडरफुल विलेज", "हमने एक बहुत ही सुंदर गाँव की सैर की।", "V (Very) में ऊपर के दाँत नीचे के होंठ को छुएंगे; W (We) में होंठ गोल होंगे।"),
        PronunciationDrill("p3", "Sh बनाम S का अंतर", "She sells fresh shoes in the shop.", "शी सेल्स फ्रेश शूज़ इन द शॉप", "वह दुकान में नए जूते बेचती है।", "'She' और 'Shoes' में साफ 'श' बोलें, 'सी' या 'सूज़' नहीं।"),
        PronunciationDrill("p4", "Silent Letters (अक्षर जो नहीं बोले जाते)", "An honest person walks calmly with knowledge.", "एन ऑनेस्ट पर्सन वॉक्स कामली विद नॉलेज", "एक ईमानदार व्यक्ति ज्ञान के साथ शांति से चलता है।", "Honest में H, Walk में L, Calm में L और Knowledge में K साइलेंट रहता है।"),
        PronunciationDrill("p5", "Z बनाम J (ज़ू बनाम जू)", "Zero zebras jumped inside the zoo.", "ज़ीरो ज़ेब्राज़ जम्प्ड इनसाइड द ज़ू", "चिड़ियाघर के अंदर शून्य ज़ेब्रा कूदे।", "Zoo और Zero में 'ज़' (नीचे बिंदी वाला) बोलें, 'जू/जीरो' नहीं।"),
        PronunciationDrill("p6", "F बनाम P/Ph (फूल बनाम फूल)", "Five friendly farmers found fresh fruits.", "फाइव फ्रेंडली फार्मर्स फाउंड फ्रेश फ्रूट्स", "पाँच मिलनसार किसानों को ताज़े फल मिले।", "F बोलते समय दोनों होंठ पूरी तरह बंद न करें — हल्की हवा बाहर आने दें।"),
        PronunciationDrill("p7", "Th की सही आवाज़ (द/थ)", "They thanked their mother for this gift.", "दे थैंक्ड देयर मदर फॉर दिस गिफ्ट", "उन्होंने इस उपहार के लिए अपनी माँ को धन्यवाद दिया।", "Thank में 'थ' और They/This में हल्का 'द' बोलें।"),
        PronunciationDrill("p8", "आत्मविश्वास वाला परिचय", "I am practicing English daily to speak fluently.", "आय एम प्रैक्टिसिंग इंग्लिश डेली टू स्पीक फ्लुएंटली", "मैं धाराप्रवाह बोलने के लिए रोज़ अंग्रेज़ी का अभ्यास कर रहा हूँ।", "'Fluently' को तोड़कर साफ बोलें: फ्लू-एंट-ली।")
    )

    val bridgeTraps = listOf(
        BridgeTrap("b1", "मुझे भूख लगी है।", "I have hunger. / Hunger is coming to me.", "I am hungry.", "अवस्था बताने के लिए 'I am + hungry/thirsty/sleepy' आता है।"),
        BridgeTrap("b2", "मैं आपसे सहमत हूँ।", "I am agree with you.", "I agree with you.", "'Agree' खुद एक क्रिया (Verb) है — इसके साथ 'am/is/are' नहीं लगता।"),
        BridgeTrap("b3", "वो मेरा चचेरा भाई है।", "He is my cousin brother.", "He is my cousin.", "'Cousin' में भाई/बहन का अर्थ पहले से जुड़ा है, पीछे brother/sister गलत है।"),
        BridgeTrap("b4", "कृपया वापस जवाब दें।", "Please revert back to me.", "Please reply to me. / Please get back to me.", "'Revert' का मतलब ही वापस आना है, इसलिए 'back' नहीं लगाते।"),
        BridgeTrap("b5", "आज मेरी तबीयत ठीक नहीं है।", "Today my health is down.", "I am not feeling well today.", "तबीयत के लिए 'not feeling well' सबसे प्राकृतिक English है।"),
        BridgeTrap("b6", "आपका शुभ नाम क्या है?", "What is your good name?", "May I know your name, please?", "'Good name' हिंदी का सीधा अनुवाद है, सही English में 'your name' बोलें।"),
        BridgeTrap("b7", "मेरा सर घूम रहा है।", "My head is rotating.", "I feel dizzy.", "चक्कर आने या सिर घूमने के लिए 'I feel dizzy' बोला जाता है।"),
        BridgeTrap("b8", "उसकी शादी राहुल से हुई।", "She married with Rahul.", "She married Rahul. / She got married to Rahul.", "'Marry' के बाद सीधा नाम आता है, 'with' नहीं लगता।"),
        BridgeTrap("b9", "चलो इस पर चर्चा करते हैं।", "Let's discuss about this.", "Let's discuss this.", "'Discuss' के बाद 'about' कभी नहीं लगाया जाता।"),
        BridgeTrap("b10", "मुझे ठंड लग रही है।", "Cold is hitting me.", "I am feeling cold.", "सर्दी या गर्मी लगने पर 'I am feeling cold/hot' बोलें।"),
        BridgeTrap("b11", "यह पहले से ज्यादा अच्छा है।", "This is more better than before.", "This is much better than before.", "'Better' खुद तुलनात्मक शब्द है, इसके आगे 'more' लगाना गलत है।"),
        BridgeTrap("b12", "मैं 2 बजे फ्री हो जाऊँगा।", "I will free at 2 o'clock.", "I will be free at 2 o'clock.", "'Free' एक विशेषण है, इसलिए भविष्य में 'will be free' लगेगा।"),
        BridgeTrap("b13", "वह मुझसे गुस्सा है।", "He is angry on me.", "He is angry with me.", "किसी व्यक्ति से गुस्सा होने पर 'angry with', किसी बात पर 'angry at' लगता है।"),
        BridgeTrap("b14", "कृपया पंखा चला दो।", "Please open the fan.", "Please turn on the fan.", "बिजली के उपकरणों के लिए 'open/close' नहीं, 'turn on / turn off' लगाते हैं।"),
        BridgeTrap("b15", "मेरा एग्जाम आने वाला है।", "My exam is coming on head.", "My exam is just around the corner.", "नज़दीक आने वाली चीज़ के लिए 'around the corner' या 'coming soon' बोलें।")
    )

    val sampleHinglishPresets = listOf(
        "Kal main office late jaunga kyuki traffic hai",
        "Mujhe English bolne mein dar lagta hai",
        "Kya aap mujhe chutti de sakte ho",
        "Main roz subah jaldi uthta hun",
        "Mera phone charge nahi ho raha hai",
        "Mujhe samajh nahi aaya please fir se batao"
    )

    fun convertHinglishOffline(input: String): HinglishConversion {
        val clean = input.trim().lowercase()
        return when {
            clean.contains("office") && clean.contains("late") -> HinglishConversion(
                input,
                "Tomorrow I will go to the office late because of traffic.",
                "I may arrive late at the office tomorrow due to heavy traffic.",
                "I'll be running a bit late for work tomorrow — traffic is quite heavy.",
                "भविष्य के लिए 'will / may' लगाएं और 'kyuki traffic hai' के लिए 'because of traffic' बोलें।"
            )
            clean.contains("dar") || clean.contains("scared") || clean.contains("hesitat") -> HinglishConversion(
                input,
                "I feel scared to speak in English.",
                "I often hesitate while speaking English.",
                "I get a little nervous when speaking English, though I'm working on it.",
                "'डर लगना / झिझकना' के लिए 'feel scared' या 'hesitate' सबसे सटीक शब्द हैं।"
            )
            clean.contains("chutti") || clean.contains("leave") -> HinglishConversion(
                input,
                "Can you give me leave today?",
                "Could you please grant me leave for today?",
                "Would it be possible for me to take the day off today?",
                "विनम्र निवेदन के लिए 'Can' से बेहतर 'Could you please' होता है।"
            )
            clean.contains("subah") || clean.contains("uthta") || clean.contains("wake") -> HinglishConversion(
                input,
                "I wake up early every morning.",
                "I maintain a habit of waking up early every morning.",
                "I'm an early riser — I wake up early every day.",
                "रोज़ की आदत के लिए हमेशा Present Simple (I wake up) का उपयोग करें।"
            )
            clean.contains("phone") && clean.contains("charge") -> HinglishConversion(
                input,
                "My phone is not charging.",
                "My mobile device is currently failing to charge.",
                "My phone won't charge properly — maybe the cable is loose.",
                "अभी हो रही समस्या के लिए 'is not + verb-ing' (is not charging) लगाएं।"
            )
            clean.contains("samajh") || clean.contains("batao") || clean.contains("repeat") -> HinglishConversion(
                input,
                "I did not understand, please tell me again.",
                "Could you please explain that again? I could not follow.",
                "Sorry, I missed that part — could you run it by me once more?",
                "'नहीं आया' बीते समय की बात है, इसलिए 'I did not understand' लगेगा।"
            )
            else -> {
                val words = clean
                    .replace("kal", "tomorrow")
                    .replace("aaj", "today")
                    .replace("main", "I")
                    .replace("mujhe", "I")
                    .replace("tum", "you")
                    .replace("aap", "you")
                    .replace("ghar", "home")
                    .replace("kaam", "work")
                    .replace("paani", "water")
                    .replace("khana", "food")
                    .replace("chahiye", "need")
                    .replace("karna hai", "want to do")
                    .replace("jaunga", "will go")
                    .replace("aaunga", "will come")
                HinglishConversion(
                    input,
                    "Simple: \"${words.replaceFirstChar { it.uppercase() }}\"",
                    "Formal: Structure it clearly as Subject + Helping Verb + Main Verb + Object.",
                    "Pro Tip: Settings में अपनी Free Gemini Key जोड़कर अनलिमिटेड Hinglish AI अनुवाद पाएं!",
                    "वाक्य बनाने का गोल्डन नियम: पहले कर्ता (I/You/He) + फिर काम (Verb) + फिर बाकी बात (Object)।"
                )
            }
        }
    }

    val grammarConcepts = listOf(
        GrammarConcept("g1", "Tenses", "Present Simple (रोज़ की आदत)", "Subject + V1 (s/es for He/She)", "हमेशा / रोज़ (Past ◄── [NOW] ──► Future)", "She speaks English clearly.", "वह साफ़ अंग्रेज़ी बोलती है।", "अंत में 'ता है / ती है' आए तो V1 लगाएं; He/She के साथ s/es जोड़ें।"),
        GrammarConcept("g2", "Tenses", "Present Continuous (अभी हो रहा है)", "Subject + is/am/are + V1-ing", "ठीक इसी समय (Past ─── [● NOW] ─── Future)", "I am learning new words right now.", "मैं अभी नए शब्द सीख रहा हूँ।", "जब वाक्य में 'रहा है / रही है' हो तो हमेशा is/am/are + ing लगाएं।"),
        GrammarConcept("g3", "Tenses", "Present Perfect (काम पूरा हो चुका)", "Subject + has/have + V3", "अभी-अभी पूरा हुआ (Past ──► [● NOW])", "I have finished my daily practice.", "मैंने अपना दैनिक अभ्यास पूरा कर लिया है।", "'लिया है / चुका है' के लिए has/have + V3 (done, gone, seen) आता है।"),
        GrammarConcept("g4", "Tenses", "Past Simple (बीती हुई बात)", "Subject + V2  |  did not + V1", "बीता समय ([PAST ●] ──── NOW ──── Future)", "I watched a movie, but I did not sleep late.", "मैंने फिल्म देखी, लेकिन मैं देर से नहीं सोया।", "'did not' आते ही V2 वापस V1 बन जाता है!"),
        GrammarConcept("g5", "Tenses", "Past Continuous (बीते समय चल रहा था)", "Subject + was/were + V1-ing", "बीते समय में जारी ([PAST ~~~] ── NOW)", "It was raining when I left home.", "जब मैं घर से निकला तब बारिश हो रही थी।", "एकवचन के साथ was, बहुवचन (You/We/They) के साथ were।"),
        GrammarConcept("g6", "Tenses", "Future Simple (आने वाला कल)", "Subject + will + V1", "आने वाला समय (Past ──── NOW ──── [● FUTURE])", "I will practice for 10 minutes tonight.", "मैं आज रात 10 मिनट अभ्यास करूँगा।", "'गा / गे / गी' के लिए सबके साथ बिना सोचे 'will + V1' लगा दें।"),
        GrammarConcept("g7", "Prepositions", "IN, ON, AT का पक्का नियम", "IN (महीना/साल/अंदर) · ON (दिन/तारीख/सतह) · AT (सटीक समय)", "बड़ा घेरा (IN) ➔ मध्यम (ON) ➔ सटीक बिंदु (AT)", "The exam is in July, on Monday, at 9:00 AM.", "परीक्षा जुलाई में, सोमवार को, सुबह 9 बजे है।", "साल/महीना = IN, दिन/तारीख = ON, घड़ी का समय = AT।"),
        GrammarConcept("g8", "Prepositions", "SINCE बनाम FOR (कब से?)", "SINCE (निश्चित समय) · FOR (अवधि/गिनती)", "शुरुआती बिंदु (Since) vs कुल घंटे/दिन (For)", "I have lived here since 2022 / for four years.", "मैं यहाँ 2022 से / चार सालों से रह रहा हूँ।", "सुबह/सोमवार/2022 = SINCE; 2 घंटे/5 दिन = FOR।"),
        GrammarConcept("g9", "Modals", "Can, Could, Should और Must", "Modal + V1 (हमेशा पहला रूप)", "क्षमता (Can) · विनम्रता (Could) · सलाह (Should) · ज़रूरी (Must)", "Could you help me? You should stay calm.", "क्या आप मेरी मदद कर सकते हैं? आपको शांत रहना चाहिए।", "इनके बाद कभी 'to' या '-ing' न लगाएं।"),
        GrammarConcept("g10", "Modals", "Used to (पुरानी आदत जो अब छूट गई)", "Subject + used to + V1", "पुरानी आदत (पहले करता था, अब नहीं)", "I used to fear English, now I enjoy it.", "मैं पहले अंग्रेज़ी से डरता था, अब मुझे मज़ा आता है।", "बचपन या पुरानी आदत बताने का सबसे आसान तरीका 'used to' है।")
    )

    val flashcards = listOf(
        FlashcardItem("f1", "Confident", "कॉन्फिडेंट", "आत्मविश्वासी", "Speak slowly and look confident.", "धीरे बोलें और आत्मविश्वासी दिखें।", "Daily Life"),
        FlashcardItem("f2", "Hesitate", "हेज़िटेट", "झिझकना / हिचकिचाना", "Do not hesitate to ask questions.", "सवाल पूछने में हिचकिचाएं नहीं।", "Speaking"),
        FlashcardItem("f3", "Improve", "इम्प्रूव", "सुधार करना", "Daily reading will improve your English.", "रोज़ पढ़ने से आपकी अंग्रेज़ी सुधरेगी।", "Study"),
        FlashcardItem("f4", "Opportunity", "ऑपर्च्युनिटी", "अवसर / मौका", "Every problem brings a new opportunity.", "हर समस्या एक नया अवसर लाती है।", "Career"),
        FlashcardItem("f5", "Polite", "पोलाइट", "विनम्र / सभ्य", "Always be polite with elders and colleagues.", "बड़ों और सहकर्मियों से हमेशा विनम्र रहें।", "Office"),
        FlashcardItem("f6", "Consistent", "कंसिस्टेंट", "लगातार / नियमित", "Be consistent for 30 days to see magic.", "जादू देखने के लिए 30 दिन नियमित रहें।", "Mindset"),
        FlashcardItem("f7", "Appreciate", "अप्रिशिएट", "सराहना करना / कद्र करना", "I really appreciate your timely help.", "मैं आपकी समय पर की गई मदद की सराहना करता हूँ।", "Office"),
        FlashcardItem("f8", "Clarify", "क्लैरिफ़ाय", "स्पष्ट करना", "Let me clarify my point once again.", "मुझे अपनी बात एक बार फिर स्पष्ट करने दें।", "Speaking"),
        FlashcardItem("f9", "Encourage", "एन्करेज", "हिम्मत बढ़ाना", "Good teachers always encourage weak students.", "अच्छे शिक्षक हमेशा कमजोर छात्रों की हिम्मत बढ़ाते हैं।", "Study"),
        FlashcardItem("f10", "Patience", "पेशेंस", "धैर्य / सब्र", "Learning a new skill requires patience.", "नया कौशल सीखने के लिए धैर्य चाहिए।", "Mindset"),
        FlashcardItem("f11", "Determine", "डिटरमिन", "निश्चय करना / तय करना", "Hard work will determine your success.", "कड़ी मेहनत आपकी सफलता तय करेगी।", "Career"),
        FlashcardItem("f12", "Essential", "एसेंशियल", "अत्यंत आवश्यक", "Water and clean air are essential for life.", "पानी और साफ हवा जीवन के लिए अत्यंत आवश्यक हैं।", "Daily Life"),
        FlashcardItem("f13", "Focus", "फोकस", "ध्यान केंद्रित करना", "Stay focused on one chapter at a time.", "एक समय में एक अध्याय पर ध्यान केंद्रित रखें।", "Study"),
        FlashcardItem("f14", "Gratitude", "ग्रैटिट्यूड", "आभार / कृतज्ञता", "Express gratitude to those who guide you.", "जो आपका मार्गदर्शन करें उनके प्रति आभार जताएं।", "Mindset"),
        FlashcardItem("f15", "Genuine", "जेन्युइन", "असली / सच्चा", "He gave me a genuine piece of advice.", "उसने मुझे एक सच्ची सलाह दी।", "Daily Life"),
        FlashcardItem("f16", "Habit", "हैबिट", "आदत", "Reading before sleep is a great habit.", "सोने से पहले पढ़ना एक बहुत अच्छी आदत है।", "Daily Life"),
        FlashcardItem("f17", "Independent", "इंडिपेंडेंट", "आत्मनिर्भर", "Education makes every youth independent.", "शिक्षा हर युवा को आत्मनिर्भर बनाती है।", "Career"),
        FlashcardItem("f18", "Knowledge", "नॉलेज", "ज्ञान", "Practical knowledge helps in interviews.", "व्यावहारिक ज्ञान इंटरव्यू में काम आता है।", "Study"),
        FlashcardItem("f19", "Motivate", "मोटिवेट", "प्रेरित करना", "Small wins motivate us to keep going.", "छोटी जीतें हमें आगे बढ़ते रहने को प्रेरित करती हैं।", "Mindset"),
        FlashcardItem("f20", "Observe", "ऑब्ज़र्व", "ध्यान से देखना", "Observe how fluent speakers pause.", "ध्यान से देखें कि धाराप्रवाह बोलने वाले कहाँ रुकते हैं।", "Speaking"),
        FlashcardItem("f21", "Prepare", "प्रिपेयर", "तैयारी करना", "Prepare two questions before your interview.", "इंटरव्यू से पहले दो सवाल तैयार रखें।", "Career"),
        FlashcardItem("f22", "Reliable", "रिलायबल", "भरोसेमंद", "Be a reliable friend and teammate.", "एक भरोसेमंद दोस्त और साथी बनें।", "Office"),
        FlashcardItem("f23", "Solution", "सॉल्यूशन", "समाधान / हल", "Focus on the solution, not the problem.", "समस्या पर नहीं, समाधान पर ध्यान दें।", "Office"),
        FlashcardItem("f24", "Translate", "ट्रांसलेट", "अनुवाद करना", "Try not to translate word by word.", "शब्द-दर-शब्द अनुवाद न करने की कोशिश करें।", "Speaking"),
        FlashcardItem("f25", "Urgent", "अर्जेंट", "तुरंत / ज़रूरी", "I need to make an urgent phone call.", "मुझे एक ज़रूरी फोन कॉल करना है।", "Daily Life"),
        FlashcardItem("f26", "Valuable", "वैल्यूएबल", "कीमती / उपयोगी", "Thank you for sharing valuable tips.", "उपयोगी टिप्स साझा करने के लिए धन्यवाद।", "Office"),
        FlashcardItem("f27", "Witness", "विटनेस", "गवाह / देखना", "You will witness progress in thirty days.", "तीस दिनों में आप अपनी प्रगति खुद देखेंगे।", "Mindset"),
        FlashcardItem("f28", "Achieve", "अचीव", "हासिल करना", "You can achieve anything with daily effort.", "रोज़ की मेहनत से आप कुछ भी हासिल कर सकते हैं।", "Mindset"),
        FlashcardItem("f29", "Barrier", "बैरियर", "रुकावट / बाधा", "Language should never be a barrier.", "भाषा कभी भी रुकावट नहीं बननी चाहिए।", "Speaking"),
        FlashcardItem("f30", "Fluent", "फ्लुएंट", "धाराप्रवाह", "Speaking daily makes you fluent.", "रोज़ बोलने से आप धाराप्रवाह बनते हैं।", "Speaking")
    )

    val confusingQuizzes = listOf(
        ConfusingWordQuiz("q1", "Accept", "स्वीकार करना", "Except", "के अलावा / को छोड़कर", "Everyone came to class ___ Ravi.", "Except", "यहाँ अर्थ है 'रवि को छोड़कर सब क्लास में आए', इसलिए 'Except' सही है।"),
        ConfusingWordQuiz("q2", "Principal", "प्रधानाचार्य / मुख्य", "Principle", "सिद्धांत / नियम", "Honesty is an important ___ in life.", "Principle", "ईमानदारी जीवन का एक 'सिद्धांत' है, इसलिए अंत में '-le' वाला Principle आएगा।"),
        ConfusingWordQuiz("q3", "Affect", "असर डालना (Verb)", "Effect", "परिणाम / असर (Noun)", "Lack of sleep can ___ your focus.", "Affect", "यहाँ 'असर डालना' एक काम (Verb) है, इसलिए 'Affect' सही होगा।"),
        ConfusingWordQuiz("q4", "Advice", "सलाह (Noun)", "Advise", "सलाह देना (Verb)", "My teacher gave me good ___.", "Advice", "'अच्छी सलाह दी' में सलाह एक संज्ञा (Noun) है — इसमें 'c' वाला Advice आता है।"),
        ConfusingWordQuiz("q5", "Loose", "ढीला", "Lose", "खो देना / हारना", "Do not ___ hope if you make a mistake.", "Lose", "यहाँ 'उम्मीद खोना' अर्थ है, इसलिए एक 'o' वाला 'Lose' सही है।"),
        ConfusingWordQuiz("q6", "Quiet", "शांत / चुप", "Quite", "काफ़ी / बिल्कुल", "Please keep ___ in the library.", "Quiet", "पुस्तकालय में 'शांत' रहने के लिए 'Quiet' आता है।"),
        ConfusingWordQuiz("q7", "Then", "फिर / तब", "Than", "से (तुलना में)", "Morning study is better ___ late night cramming.", "Than", "तुलना (better) करने के लिए हमेशा 'Than' लगता है।"),
        ConfusingWordQuiz("q8", "Weather", "मौसम", "Whether", "चाहे / या", "The ___ is very pleasant today.", "Weather", "'मौसम' के लिए 'Weather' और विकल्प के लिए 'Whether' होता है।"),
        ConfusingWordQuiz("q9", "Stationary", "रुका हुआ / स्थिर", "Stationery", "कॉपी-पेन का सामान", "I bought two pens from the ___ shop.", "Stationery", "पेन/कॉपी की दुकान के लिए 'e' वाला Stationery आता है।"),
        ConfusingWordQuiz("q10", "Dairy", "दूध की डेयरी", "Diary", "लिखने वाली डायरी", "Write five new words in your ___ daily.", "Diary", "लिखने वाली डायरी में 'i' पहले आता है (Diary)।"),
        ConfusingWordQuiz("q11", "Hear", "आवाज़ कान में पड़ना", "Listen", "ध्यान से सुनना", "Please ___ to the audio carefully.", "Listen", "ध्यान लगाकर सुनने के लिए हमेशा 'Listen to' आता है।"),
        ConfusingWordQuiz("q12", "Desert", "रेगिस्तान", "Dessert", "खाने के बाद मीठा", "Thar is a famous ___ in Rajasthan.", "Desert", "रेगिस्तान में एक 's' (Desert) और मीठे में दो 's' (Dessert) होते हैं।")
    )

    val stories = listOf(
        StoryItem(
            id = "s1",
            titleEn = "Aarav's First Stage Speech",
            titleHi = "आरव का मंच पर पहला भाषण",
            levelLabel = "Day 1–7 · Beginner",
            paragraphsEn = listOf(
                "Aarav studied in a Hindi medium school in a small town. He always felt nervous when someone spoke English quickly.",
                "One day, his teacher encouraged him to prepare a short speech. Aarav practiced five sentences in front of a mirror every morning.",
                "On Friday, Aarav stood on the stage with courage. He spoke slowly and clearly, and the entire hall clapped with pride."
            ),
            summaryHi = "एक छोटे शहर के हिंदी माध्यम के छात्र आरव ने रोज़ आईने के सामने 5 वाक्यों का अभ्यास करके मंच का डर जीत लिया।",
            glossary = mapOf(
                "nervous" to GlossaryWord("Nervous", "नर्वस", "घबराया हुआ", "Adjective", "Don't feel nervous before an exam."),
                "encouraged" to GlossaryWord("Encouraged", "एन्करेज्ड", "प्रोत्साहित किया", "Verb (Past)", "My parents encouraged me to try again."),
                "prepare" to GlossaryWord("Prepare", "प्रिपेयर", "तैयारी करना", "Verb", "Let's prepare for tomorrow's test."),
                "mirror" to GlossaryWord("Mirror", "मिरर", "आईना / शीशा", "Noun", "Practice speaking in front of a mirror."),
                "courage" to GlossaryWord("Courage", "करेज", "साहस / हिम्मत", "Noun", "It takes courage to speak a new language."),
                "entire" to GlossaryWord("Entire", "एन्टायर", "पूरा / सारा", "Adjective", "The entire class listened quietly."),
                "pride" to GlossaryWord("Pride", "प्राइड", "गर्व", "Noun", "She smiled with pride.")
            )
        ),
        StoryItem(
            id = "s2",
            titleEn = "The Smart Interview Preparation",
            titleHi = "समझदारी भरी इंटरव्यू तैयारी",
            levelLabel = "Day 24–30 · Job-Ready",
            paragraphsEn = listOf(
                "Priya wanted an office job, so she improved her vocabulary and stopped translating every word from Hindi.",
                "During the interview, she was polite and honest. Whenever she needed a second to think, she took a calm breath instead of panicking.",
                "The manager appreciated her clarity and confidence, and offered her the role on the same afternoon."
            ),
            summaryHi = "प्रिया ने शब्द-दर-शब्द हिंदी अनुवाद छोड़ने और शांत रहकर बोलने की कला से अपना पहला ऑफिस इंटरव्यू पास किया।",
            glossary = mapOf(
                "improved" to GlossaryWord("Improved", "इम्प्रूव्ड", "बेहतर बनाया", "Verb (Past)", "He improved his handwriting."),
                "vocabulary" to GlossaryWord("Vocabulary", "वोकैबुलरी", "शब्दावली", "Noun", "Build vocabulary by learning 5 words daily."),
                "translating" to GlossaryWord("Translating", "ट्रांसलेटिंग", "अनुवाद करना", "Verb (-ing)", "Stop translating word-by-word."),
                "polite" to GlossaryWord("Polite", "पोलाइट", "विनम्र", "Adjective", "Be polite when speaking to seniors."),
                "calm" to GlossaryWord("Calm", "काम (L साइलेंट)", "शांत", "Adjective", "Stay calm and speak clearly."),
                "appreciated" to GlossaryWord("Appreciated", "अप्रिशिएटेड", "सराहना की", "Verb (Past)", "The teacher appreciated her effort."),
                "clarity" to GlossaryWord("Clarity", "क्लैरिटी", "स्पष्टता", "Noun", "Clarity beats speed.")
            )
        ),
        StoryItem(
            id = "s3",
            titleEn = "The Train Ticket Counter",
            titleHi = "रेलवे स्टेशन टिकट काउंटर पर संवाद",
            levelLabel = "Day 8–15 · Travel",
            paragraphsEn = listOf(
                "Mohit travelled alone to another city for the first time. At the busy station, he felt confused about the platform number.",
                "Instead of staying silent, he politely asked an officer for guidance. The officer smiled and showed him the exact schedule.",
                "Mohit boarded the train comfortably and realized that simple polite English opens helpful doors everywhere."
            ),
            summaryHi = "मोहित ने चुप रहने के बजाय विनम्रता से सवाल पूछकर सही ट्रेन पकड़ी और सीखा कि सरल English हर जगह मदद दिलाती है।",
            glossary = mapOf(
                "travelled" to GlossaryWord("Travelled", "ट्रैवल्ड", "यात्रा की", "Verb (Past)", "I travelled by train last week."),
                "confused" to GlossaryWord("Confused", "कन्फ्यूज़्ड", "उलझा हुआ", "Adjective", "Ask immediately if you feel confused."),
                "guidance" to GlossaryWord("Guidance", "गाइडेंस", "मार्गदर्शन", "Noun", "Good guidance saves time."),
                "schedule" to GlossaryWord("Schedule", "शेड्यूल", "समय-सारणी", "Noun", "Check the bus schedule online."),
                "boarded" to GlossaryWord("Boarded", "बोर्डेड", "चढ़ा (ट्रेन/बस में)", "Verb (Past)", "We boarded the morning train."),
                "realized" to GlossaryWord("Realized", "रियलाइज़्ड", "एहसास हुआ", "Verb (Past)", "He realized the value of practice.")
            )
        ),
        StoryItem(
            id = "s4",
            titleEn = "Ten Minutes Before Sleep",
            titleHi = "सोने से पहले दस मिनट का नियम",
            levelLabel = "Day 16–23 · Habit",
            paragraphsEn = listOf(
                "Kiran used to scroll videos for hours at night and always felt tired in the morning.",
                "She decided to replace just ten minutes with English reading and listening. She wrote three new words in a notebook every night.",
                "Within one month, her hesitation disappeared and she started helping her younger brother with his school lessons."
            ),
            summaryHi = "किरण ने रात के सिर्फ 10 मिनट पढ़ने-सुनने में लगाए और एक महीने में न सिर्फ खुद सीखा बल्कि अपने भाई को भी सिखाने लगी।",
            glossary = mapOf(
                "scroll" to GlossaryWord("Scroll", "स्क्रॉल", "स्क्रीन ऊपर-नीचे खिसकाना", "Verb", "Do not scroll late at night."),
                "replace" to GlossaryWord("Replace", "रिप्लेस", "बदलना / जगह लेना", "Verb", "Replace fear with practice."),
                "notebook" to GlossaryWord("Notebook", "नोटबुक", "कॉपी", "Noun", "Keep a small vocabulary notebook."),
                "hesitation" to GlossaryWord("Hesitation", "हेज़िटेशन", "झिझक", "Noun", "Speaking daily removes hesitation.")
            )
        ),
        StoryItem(
            id = "s5",
            titleEn = "Helping a Lost Tourist",
            titleHi = "रास्ता भटके यात्री की मदद",
            levelLabel = "Day 8–15 · Speaking",
            paragraphsEn = listOf(
                "Near the old fort, a tourist looked worried while checking a paper map on his phone.",
                "Suresh approached him with a friendly smile and gave simple directions using landmarks like the temple and post office.",
                "The tourist thanked Suresh warmly, and Suresh felt proud that his basic English was genuinely useful."
            ),
            summaryHi = "सुरेश ने अपनी आसान English से एक यात्री को सही रास्ता बताकर मदद की और खुद पर गर्व महसूस किया।",
            glossary = mapOf(
                "worried" to GlossaryWord("Worried", "वरीड", "चिंतित", "Adjective", "She looked worried before the result."),
                "approached" to GlossaryWord("Approached", "अप्रोच्ड", "पास गया", "Verb (Past)", "He approached the counter politely."),
                "directions" to GlossaryWord("Directions", "डायरेक्शंस", "दिशा / रास्ता", "Noun", "Give clear directions."),
                "landmarks" to GlossaryWord("Landmarks", "लैंडमार्क्स", "प्रमुख पहचान के स्थान", "Noun", "Mention famous landmarks when guiding."),
                "genuinely" to GlossaryWord("Genuinely", "जेन्युइनली", "सचमुच", "Adverb", "He genuinely wanted to help.")
            )
        ),
        StoryItem(
            id = "s6",
            titleEn = "The Village Library Club",
            titleHi = "गाँव की लाइब्रेरी का इंग्लिश क्लब",
            levelLabel = "Day 16–23 · Teamwork",
            paragraphsEn = listOf(
                "Four friends in a village wanted to improve their spoken English, but nobody around them spoke it fluently.",
                "They started a rule: for fifteen minutes every evening at the library, they would speak only in simple English without laughing at errors.",
                "Slowly their confidence grew, and ten more students joined their friendly evening club."
            ),
            summaryHi = "गाँव के चार दोस्तों ने बिना एक-दूसरे की गलतियों पर हँसे रोज़ 15 मिनट बोलकर पूरा क्लब खड़ा कर दिया।",
            glossary = mapOf(
                "fluently" to GlossaryWord("Fluently", "फ्लुएंटली", "धाराप्रवाह", "Adverb", "Speak clearly first, then fluently."),
                "errors" to GlossaryWord("Errors", "एरर्स", "गलतियाँ", "Noun", "Learn from small errors."),
                "confidence" to GlossaryWord("Confidence", "कॉन्फिडेंस", "आत्मविश्वास", "Noun", "Practice builds confidence."),
                "friendly" to GlossaryWord("Friendly", "फ्रेंडली", "मित्रतापूर्ण", "Adjective", "Create a friendly group.")
            )
        )
    )

    val writingTemplates = listOf(
        WritingTemplate("w1", "1 दिन की छुट्टी का ईमेल (Leave Email)", "Office / College", "Subject: Request for one day leave\n\nRespected Sir/Madam,\n\nI am not feeling well today, so I will not be able to attend the office/class. Kindly grant me leave for today (1 day).\n\nThank you,\nYour Name"),
        WritingTemplate("w2", "घर के ज़रूरी काम से छुट्टी (Urgent Leave)", "Office / College", "Subject: Application for two days leave\n\nRespected Sir/Madam,\n\nI have an urgent family work at home, so I need leave for two days from Monday to Tuesday. I will complete my pending work once I return.\n\nSincerely,\nYour Name"),
        WritingTemplate("w3", "नौकरी के लिए आवेदन ईमेल (Job Application)", "Career", "Subject: Application for Junior Executive Role\n\nDear Hiring Manager,\n\nI am writing to apply for the Junior Executive position. I am a quick learner with strong dedication and good communication skills. Please find my resume attached.\n\nWarm regards,\nYour Name"),
        WritingTemplate("w4", "शिक्षक से संदेह पूछने का संदेश", "Study", "Hello Sir/Madam,\n\nI revised today's chapter, and I have a small doubt in question number three. Whenever you are free, could you please guide me?\n\nThank you,\nYour Name"),
        WritingTemplate("w5", "गलतियों वाला वाक्य जाँचें (Test Mistake Fixer)", "Practice", "Hello sir, I did not went to college yesterday because I am agree with my cousin brother. Please revert back to me.")
    )

    fun analyzeWritingOffline(text: String): List<WritingCorrection> {
        val findings = mutableListOf<WritingCorrection>()
        val lower = text.lowercase()

        if (lower.contains("did not went") || lower.contains("didn't went")) {
            findings.add(WritingCorrection("did not went", "did not go", "'did' के साथ हमेशा V1 ('go') आता है, 'went' नहीं।"))
        }
        if (lower.contains("did not came") || lower.contains("didn't came")) {
            findings.add(WritingCorrection("did not came", "did not come", "'did' के साथ हमेशा V1 ('come') आता है, 'came' नहीं।"))
        }
        if (lower.contains("i am agree")) {
            findings.add(WritingCorrection("I am agree", "I agree", "'Agree' एक क्रिया है, इसके पहले 'am' नहीं लगाते।"))
        }
        if (lower.contains("cousin brother") || lower.contains("cousin sister")) {
            findings.add(WritingCorrection("cousin brother/sister", "cousin", "सिर्फ 'cousin' काफी है; पीछे brother या sister लगाना गलत है।"))
        }
        if (lower.contains("revert back")) {
            findings.add(WritingCorrection("revert back", "reply / get back", "'Revert' का मतलब पहले से वापस आना होता है, 'back' न लगाएं।"))
        }
        if (lower.contains("more better")) {
            findings.add(WritingCorrection("more better", "much better", "'Better' खुद तुलनात्मक शब्द है, इसके आगे 'more' नहीं लगता।"))
        }
        if (lower.contains("discuss about")) {
            findings.add(WritingCorrection("discuss about", "discuss", "'Discuss' के बाद 'about' नहीं लगता (जैसे: Let's discuss the plan)।"))
        }
        if (lower.contains("good name")) {
            findings.add(WritingCorrection("what is your good name", "may I know your name", "English में 'good name' नहीं बल्कि 'your name' बोलते हैं।"))
        }
        if (lower.contains("myself ")) {
            findings.add(WritingCorrection("Myself [Name]", "I am [Name] / My name is [Name]", "परिचय देते समय 'Myself Rahul' बोलना गलत है; 'I am Rahul' बोलें।"))
        }
        if (lower.contains("return back")) {
            findings.add(WritingCorrection("return back", "return", "'Return' का अर्थ ही वापस लौटना है, 'back' अतिरिक्त है।"))
        }
        if (lower.contains("married with")) {
            findings.add(WritingCorrection("married with", "married to / married", "'Married' के साथ 'with' नहीं, 'to' या सीधा नाम लगाते हैं।"))
        }
        if (lower.contains("angry on")) {
            findings.add(WritingCorrection("angry on", "angry with", "व्यक्ति से नाराजगी के लिए 'angry with' आता है, 'on' नहीं।"))
        }
        if (lower.contains("do the needful")) {
            findings.add(WritingCorrection("do the needful", "please take the necessary action / please help", "आधुनिक प्रोफेशनल ईमेल में 'do the needful' के बजाय स्पष्ट अनुरोध लिखें।"))
        }
        if (lower.contains("years back")) {
            findings.add(WritingCorrection("years back", "years ago", "औपचारिक लेखन में 'back' की जगह 'years ago' लिखना बेहतर है।"))
        }

        if (findings.isEmpty()) {
            findings.add(
                WritingCorrection(
                    original = "General Review",
                    corrected = "आपका वाक्य साफ दिख रहा है! (No common literal-Hindi traps found)",
                    reasonHi = "बहुत बढ़िया! बड़ी हिंदी-अनुवाद गलतियाँ नहीं मिलीं। और गहरी जाँच के लिए आप Settings में फ्री Gemini Key जोड़ सकते हैं।"
                )
            )
        }
        return findings
    }
}
