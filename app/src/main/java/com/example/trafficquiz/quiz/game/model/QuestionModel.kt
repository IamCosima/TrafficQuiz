package com.example.trafficquiz.quiz.game.model

data class QuestionModel(
    var id : Int ,
    var Question : String ,
    var Image : Int ,
    var Option_1 : String,
    var Option_2 : String,
    var Option_3 : String,
    var Option_4 : String,
    var Correct_option : String,
    var Times_wrong : Int
)