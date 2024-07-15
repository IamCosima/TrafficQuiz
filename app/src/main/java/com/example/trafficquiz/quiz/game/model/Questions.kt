package com.example.trafficquiz.quiz.game.model

import com.example.trafficquiz.R

object Questions {

    fun Sample_Road_Sign() : ArrayList<QuestionModel>{

        val RoadSign_Questions = ArrayList<QuestionModel>()
        //Saves all questions in there own variables to be used
        val quest1  = QuestionModel(0,"This sign shows you... ", R.drawable.winds,"The road winds ahead","There are a number of curves ahead","The Road has a concealed entrance to the left followed by another to the right","The Road looks like a snake","The Road has a concealed entrance to the left followed by another to the right",0)
        //winds.png
        val quest2 = QuestionModel(1,"This road sign implies to you that there... ", R.drawable.two_way,"Is two-way traffic at the following road that crosses the road you are on","The one-way road you are traveling on will become two-way ahead","There are two lanes ahead","is a reverse lane and a forward lane","The one-way road you are traveling on will become two-way ahead",0)
        //two way.png
        val quest3 = QuestionModel(2,"If you see this road sign it means that... ", R.drawable.entry,"You may not enter unless you have special permission","No vehicles may drive here as it is the pedestrians walkway","You will get a dual roadway ahead","You must perform a maths sum ahead to pass","You may not enter unless you have special permission",0)
        //no entry.png
        val quest4 = QuestionModel(3,"What does this road sign show you ", R.drawable.bend,"Can expect a sharp bend to the right","Will get a only way road to the right","you must turn right","You can turn right if there is space","you must turn right",0)
        //sharp bend.png
        val quest5 = QuestionModel(4,"What does this road sign show the driver? ", R.drawable.headlights,"You must switch on your headlights","you must test your lights","if its dark you can switch on your vehicles headlights","No littering zone","You must switch on your headlights",0)
        //headlights.png
        val quest6 = QuestionModel(5,"What does this road sign show you? ", R.drawable.overtake,"Only motorcars may nor pass each other","No motorcars may overtake for the next 500m","There is a bridge ahead and only one vehicle can pass at a time","There is only one lane","No motorcars may overtake for the next 500m",0)
        //overtake.png
        val quest7 = QuestionModel(6,"This sign means... ", R.drawable.bus,"Only tour buses may park here ","Only tour buses may stop here","This part of the road is only for the use of tour buses","You can get on a tour bus here","This part of the road is only for the use of tour buses",0)
        //bus.png
        val quest8 = QuestionModel(7,"This road sign means... ", R.drawable.horn,"Shows you there is  a hospital ahead where you may not make noise","Shows you that you may not pick up people here","Prohibits you from using your hooter","No clowns allowed here","Prohibits you from using your hooter",0)
        //horn.png
        val quest9 = QuestionModel(8,"What does this sign show you? ", R.drawable.intersection,"road crossing ahead and other vehicles from the side must stop at the intersection","There is a four-way stop ahead","there will be a railway crossing ahead","Hospital nearby","road crossing ahead and other vehicles from the side must stop at the intersection",0)
        //intersection.png
        val quest10 = QuestionModel(9,"What must you do when you see this road sign", R.drawable.night,"The maximum speed you may travel at night","The maximum distance you can travel at night","Recommended speed when lights are one ","The time you can have your lights on","The maximum speed you may travel at night",0)
        //night.png
        //Adds all the questions to the list
        RoadSign_Questions.add(quest1)
        RoadSign_Questions.add(quest2)
        RoadSign_Questions.add(quest3)
        RoadSign_Questions.add(quest4)
        RoadSign_Questions.add(quest5)
        RoadSign_Questions.add(quest6)
        RoadSign_Questions.add(quest7)
        RoadSign_Questions.add(quest8)
        RoadSign_Questions.add(quest9)
        RoadSign_Questions.add(quest10)

        return RoadSign_Questions
    }

    fun Sample_Road_Markings() : ArrayList<QuestionModel>{

        val Road_Markings_Questions = ArrayList<QuestionModel>()
        //Saves all questions in there own variables to be used
        val quest1  = QuestionModel(0,"What is the purpose of the lines? ", R.drawable.lanes,"It is dividing lines that show the lanes to road users","It divides the road in two","You must drive slower","Shows the road mirrors","It is dividing lines that show the lanes to road users",0)
        //div lanes.png

        val quest2 = QuestionModel(1,"What is the purpose of this road marking? ", R.drawable.ambulance,"No parking zone","Parking is reserved for emergency vehicles","Only peoples name starting with A can park","Always available zone","Parking is reserved for emergency vehicles",0)
        //ambulance.png

        val quest3 = QuestionModel(2,"What does this road marking mean? ", R.drawable.bus_floor,"Buses can park here","Lane is reserved for minibus","Lane is reserved for bicycles","Lane is reserved for buses","Lane is reserved for buses",0)
        //bus_floor.png

        val quest4 = QuestionModel(3,"This road marking warns a driver that he will get a ", R.drawable.speed,"Pedestrian crossing ahead","Speed bump ahead","Railway crossing ahead","There is an intersection ahead","Speed bump ahead",0)
        //speed.png

        val quest5 = QuestionModel(4,"What does the triangle marking mean? ", R.drawable.island,"You can take a break here","You can pick up people here","You must stop here","Only allowed to stop here in an emergency","Only allowed to stop here in an emergency",0)
        //island.png

        val quest6 = QuestionModel(5,"What does this box mean on the road? ", R.drawable.box,"You can swap lanes here","That you cannot stop here","You can make a u turn here","You can take a break here","That you cannot stop here",0)
        //box.png

        val quest7 = QuestionModel(6,"What does this figure mean on the road? ", R.drawable.bicycle,"No pedestrians allowed","Only bikes past this zone","Only cars can cross","Bicycle crossing","Bicycle crossing",0)
        //bicycle.png

        val quest8 = QuestionModel(7,"What does the lines mean? ", R.drawable.crossing,"Bicycle crossing","Speed bump","That there is a pedestrian crossing","Railway crossing","That there is a pedestrian crossing",0)
        //crossing.png

        val quest9 = QuestionModel(8,"What does this marking mean? ", R.drawable.stop,"Speed up","You should stop before the line","Take a break here","Traffic lights ahead","You should stop before the line",0)
        //stop.png

        val quest10 = QuestionModel(9,"What does this marking mean ?", R.drawable.yield,"You should slow down before and make way for approaching traffic","Speed up","Crossings for school","Toll road ahead","You should slow down before and make way for approaching traffic",0)
        //yield.png


        //Adds all the questions to the list
        Road_Markings_Questions.add(quest1)
        Road_Markings_Questions.add(quest2)
        Road_Markings_Questions.add(quest3)
        Road_Markings_Questions.add(quest4)
        Road_Markings_Questions.add(quest5)
        Road_Markings_Questions.add(quest6)
        Road_Markings_Questions.add(quest7)
        Road_Markings_Questions.add(quest8)
        Road_Markings_Questions.add(quest9)
        Road_Markings_Questions.add(quest10)

        return Road_Markings_Questions
    }

    fun Sample_Signals() : ArrayList<QuestionModel>{


        val Signals_Questions = ArrayList<QuestionModel>()
        //Saves all questions in there own variables to be used
        val quest1  = QuestionModel(0,"What does this Light mean?", R.drawable.red_light,"You may proceed","You need to stop at the line","You can take a break","You must slow down","You need to stop at the line",0)
        //red light.png

        val quest2 = QuestionModel(1,"What does this Light mean?", R.drawable.yellow_light,"You must take caution and begin to stop unless unsafe","You can go","You must stop","You can take a break","You must take caution and begin to stop unless unsafe",0)
        //yellow light.png

        val quest3 = QuestionModel(2,"What does this Light mean?", R.drawable.green_light,"You must look at the oncoming traffic","You must slow down","You may proceed if safe","You must stop","You may proceed if safe",0)
        //green light.png

        val quest4 = QuestionModel(3,"What does this arrow mean?", R.drawable.green_arrow,"You cannot turn","You may proceed in the direction of arrow","You must stop","Wait to see if its safe to turn","You may proceed in the direction of arrow",0)
        //green arrow.png

        val quest5 = QuestionModel(4,"What does this arrow mean?", R.drawable.yellow_arrow,"Can turn if you want","Can go straight","Stop at the line","You must stop unless unsafe","You must stop unless unsafe",0)
        //yellow arrow.png

        val quest6 = QuestionModel(5,"What does this arrow mean?", R.drawable.red_arrow,"You must stop","Can turn if you want","Can go straight","You must stop unless unsafe","You must stop",0)
        //red arrow.png

        val quest7 = QuestionModel(6,"What does this hand sign mean?", R.drawable.officer_stop,"You can take a break","You must look at the oncoming traffic","You must stop","Wait to see if its safe to turn","You must stop",0)
        //officer stop.png

        val quest8 = QuestionModel(7,"What does this hand sign mean", R.drawable.proceed,"You must look at the oncoming traffic","You may proceed","Wait to see if its safe to turn","You can take a break","You may proceed",0)
        //proceed.png

        val quest9 = QuestionModel(8,"What does this hand sign mean", R.drawable.construct_stop,"You must stop","You can take a break","You must look at the oncoming traffic","Wait to see if its safe to turn","You must stop",0)
        //construct stop.png

        val quest10 = QuestionModel(9,"What does this hand sign mean", R.drawable.caution,"Wait to see if its safe to turn","You must look at the oncoming traffic","Proceed with caution","You can take a break","Proceed with caution",0)
        //construt coution.png

        //Adds all the questions to the list
        Signals_Questions.add(quest1)
        Signals_Questions.add(quest2)
        Signals_Questions.add(quest3)
        Signals_Questions.add(quest4)
        Signals_Questions.add(quest5)
        Signals_Questions.add(quest6)
        Signals_Questions.add(quest7)
        Signals_Questions.add(quest8)
        Signals_Questions.add(quest9)
        Signals_Questions.add(quest10)

        return Signals_Questions
    }

    fun Sample_Road_Rules() : ArrayList<QuestionModel>{

        val Road_Rules_Questions = ArrayList<QuestionModel>()
        //Saves all questions in there own variables to be used
        val quest1  = QuestionModel(0,"The distance that is required for a driver to stop is", R.drawable.distance,"All of above correct","None is correct","Only(1) is correct","(ii) and (iii) correct","Only(1) is correct",0)
        //distance.png

        val quest2 = QuestionModel(1,"A trailer with a GWM of 1000kg",0,"Must have reflectors on the sides","May have reflectors around trailer,but not needed","May not have reflectors","No reflectors allowed","May have reflectors around trailer,but not needed",0)

        val quest3 = QuestionModel(2,"What must be considered when following a vehicle", 0,"Keep distance of 3 vehicle lengths","Must see the back wheels of car in front","Keep good distance away in case of sudden stop","no following distance required","Keep good distance away in case of sudden stop",0)

        val quest4 = QuestionModel(3,"When can a driver be intoxicated", 0,"Always","Never","Only if medicine contains alcohol","Only during the night","Never",0)

        val quest5 = QuestionModel(4,"Your vehicles lights should be on", R.drawable.lightson,"Only(i) and(ii) are correct","Only(ii) and(iii) are correct","None are correct","All are correct","All are correct",0)

        val quest6 = QuestionModel(5,"You can", 0,"Stop on the side of the road at night","Move backwards as long as its safe","Leave vehicle running while depositing fuel","Drink and drive","Move backwards as long as its safe",0)

        val quest7 = QuestionModel(6,"If a light is blinking red you must..", 0,"Stop and go when safe","Stop and wait for green light","Lookout for roadblocks","Police are nearby","Stop and go when safe",0)

        val quest8 = QuestionModel(7,"What is a gear lever used for", 0,"Change lanes","Change Radio channel","Swap to the correct gear","Used for speed control","Swap to the correct gear",0)

        val quest9 = QuestionModel(8,"A temporary sign implies that", 0,"The rules of the road have changed","The situation on the road is not normal","Traffic must move slowly","Go as per normal","Traffic must move slowly",0)

        val quest10 = QuestionModel(9,"If you have a learners licence",0,"There must be another driver in the car with a licence","No driving on freeway","No passengers allowed","No rules","There must be another driver in the car with a licence",0)


        //Adds all the questions to the list
        Road_Rules_Questions.add(quest1)
        Road_Rules_Questions.add(quest2)
        Road_Rules_Questions.add(quest3)
        Road_Rules_Questions.add(quest4)
        Road_Rules_Questions.add(quest5)
        Road_Rules_Questions.add(quest6)
        Road_Rules_Questions.add(quest7)
        Road_Rules_Questions.add(quest8)
        Road_Rules_Questions.add(quest9)
        Road_Rules_Questions.add(quest10)

        return Road_Rules_Questions
    }

    fun Sample_Vehicle_Controls() : ArrayList<QuestionModel>{
        //Saves all questions in there own variables to be used
        val Vehicle_Controls_Questions = ArrayList<QuestionModel>()

        val quest1 = QuestionModel(0,"To ensure that your parked vehicle does not move, use..", R.drawable.controls,"Number 7","Number 8","Number 9","Number 10","Number 7",0)

        val quest2 = QuestionModel(1,"What is number 2 used for? ", R.drawable.controls,"To clear the windscreen of any water","To warn other road users that you are approaching","To warn other road users that you are about to turn","To warn road users that you are stopping","To clear the windscreen of any water",0)

        val quest3 = QuestionModel(2,"When turning, use... ", R.drawable.controls,"Number 4","Number 5","Number 10","Number 11","Number 4",0)

        val quest4 = QuestionModel(3,"To change gears, use... ", R.drawable.controls,"Number 7 and 9","Number 5 and 8","Number 6 and 8","Number 4 and 8","Number 6 and 8",0)


        val quest5 = QuestionModel(4,"To stop, use… ", R.drawable.controls,"Number 9","Number 8","Number 7","Number 10","Number 9",0)

        val quest6 = QuestionModel(5,"Number (x) is not found in an automatic vehicle ", R.drawable.controls,"Number 10","Number 9","Number 8","Number 7","Number 8",0)

        val quest7 = QuestionModel(6,"When you want to drive faster, use… ", R.drawable.controls,"Number 6","Number 8","Number 10","Number 3","Number 10",0)

        //Adds all the questions to the list
        Vehicle_Controls_Questions.add(quest1)
        Vehicle_Controls_Questions.add(quest2)
        Vehicle_Controls_Questions.add(quest3)
        Vehicle_Controls_Questions.add(quest4)
        Vehicle_Controls_Questions.add(quest5)
        Vehicle_Controls_Questions.add(quest6)
        Vehicle_Controls_Questions.add(quest7)


        return Vehicle_Controls_Questions

    }
}