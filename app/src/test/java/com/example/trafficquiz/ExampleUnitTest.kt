package com.example.trafficquiz

import android.graphics.Color
import com.example.trafficquiz.quiz.game.model.QuestionModel
import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    @Test
    fun addition_isCorrect() {
        assertEquals(4, 2 + 2)
    }


    fun Test_Sample_Road_Sign() : ArrayList<QuestionModel> {
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

    var question = Test_Sample_Road_Sign()


    fun testcorrect(Option : Int, cursor : Int ): Boolean {
        var type = 1
        var question = Test_Sample_Road_Sign()
        var Option = 2
        var NumCorrect = 0
        var Numwrong = 0
        var QuestionAns = true
        var color = "Red"
        if (type == 1) {
            val list = question[cursor]
            val max = 10
            val Correct_option = list.Correct_option
            if (Option == 1) {
                if (list.Option_1 == Correct_option) {
                    NumCorrect = NumCorrect + 1
                    color = "Green"
                } else {
                    Numwrong = Numwrong + 1
                    QuestionAns = false
                    var color = "Red"
                    if (list.Option_2 == Correct_option) {
                        color = "Green"
                        return QuestionAns
                    } else if (list.Option_3  == Correct_option) {
                        color = "Green"
                        QuestionAns = true
                        return QuestionAns
                    } else if (list.Option_4 == Correct_option) {
                        color = "Green"
                        QuestionAns = true
                        return QuestionAns
                    }
                }

            } else if (Option == 2) {
                if (list.Option_2  == Correct_option) {
                    NumCorrect = NumCorrect + 1
                    color = "Green"
                } else {
                    Numwrong = Numwrong + 1
                    QuestionAns = false
                    var color = "Red"
                    if (list.Option_1 == Correct_option) {
                        color = "Green"
                        QuestionAns = true
                        return QuestionAns
                    } else if (list.Option_3  == Correct_option) {
                        color = "Green"
                        QuestionAns = true
                        return QuestionAns
                    } else if (list.Option_4  == Correct_option) {
                        color = "Green"
                        QuestionAns = true
                        return QuestionAns
                    }
                }

            } else if (Option == 3) {
                if (list.Option_3 == Correct_option) {
                    NumCorrect = NumCorrect + 1
                    color = "Green"
                } else {
                    Numwrong = Numwrong + 1
                    QuestionAns = false
                    var color = "Red"
                    if (list.Option_1  == Correct_option) {
                        color = "Green"
                        QuestionAns = true
                        return QuestionAns
                    } else if (list.Option_2 == Correct_option) {
                        color = "Green"
                        QuestionAns = true
                        return QuestionAns
                    } else if (list.Option_4 == Correct_option) {
                        color = "Green"
                        QuestionAns = true
                        return QuestionAns
                    }
                }
            } else if (Option == 4) {
                if (list.Option_4 == Correct_option) {
                    NumCorrect = NumCorrect + 1
                    color = "Green"
                } else {
                    Numwrong = Numwrong + 1
                    QuestionAns = false
                    var color = "Red"
                    if (list.Option_1 == Correct_option) {
                        color = "Green"
                        QuestionAns = true
                        return QuestionAns
                    } else if (list.Option_2 == Correct_option) {
                        color = "Green"
                        QuestionAns = true
                        return QuestionAns
                    } else if (list.Option_3  == Correct_option) {
                        color = "Green"
                        QuestionAns = true
                        return QuestionAns
                    }
                }
            }


        }
        return QuestionAns
    }


    @Test
    fun tested_Correct() {
        val option = 1
        val cursor = 2
        val correct = testcorrect(option,cursor)
        assertEquals(true,correct)

    }

    fun score(correct : Int,max : Int): Double{
        var value = (correct.toDouble() / max.toDouble()) * 100.0
        return value
    }

    fun testScore(){
        var numcorrect = 5
        var max = 10
        var expect = 50.0
        var output = score(numcorrect,max)
        assertEquals(expect,output)

    }


}