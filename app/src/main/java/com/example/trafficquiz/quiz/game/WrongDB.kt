package com.example.trafficquiz.quiz.game

import android.annotation.SuppressLint
import android.content.ContentValues
import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper
import com.example.trafficquiz.quiz.game.model.QuestionModel
import com.example.trafficquiz.quiz.game.model.dbmodel
import com.example.trafficquiz.quiz.game.model.scoremodel

class WrongDB(context: Context): SQLiteOpenHelper(context, DB_NAME,null, DB_VERSION) {

    companion object {
        private val DB_NAME = "TrafficQuizWrongDB"
        private val DB_VERSION = 1

        //Wrong Table vars
        private val Wrong_TABLE_NAME = "Wrong_Questions"
        private val Wrong_ID = "Wrong_ID"

        private val Wrong_Image = "Wrong_Image"
        private val Wrong_Question = "Wrong_Question"
        private val Wrong_Option_1 = "Wrong_Option_1"
        private val Wrong_Option_2 = "Wrong_Option_2"
        private val Wrong_Option_3 = "Wrong_Option_3"
        private val Wrong_Option_4 = "Wrong_Option_4"
        private val Wrong_Correct_option = "Wrong_Correct_option"
        private val Wrong_Times_wrong = "Wrong_Times_wrong"


        //Score Table vars
        private val Score_TABLE_NAME = "Score_TABLE_NAME"
        private val Score_ID = "Score_ID"
        private val Score_Type = "Score_Type"
        private val Score_value = "Score_value"


    }

    override fun onCreate(db: SQLiteDatabase?) {
        val Wrong_Table = "CREATE TABLE $Wrong_TABLE_NAME($Wrong_ID INTEGER PRIMARY KEY AUTOINCREMENT,$Wrong_Image INTEGER,$Wrong_Question TEXT,$Wrong_Option_1 TEXT,$Wrong_Option_2 TEXT,$Wrong_Option_3 TEXT,$Wrong_Option_4 TEXT,$Wrong_Correct_option TEXT,$Wrong_Times_wrong INTEGER);"
        val Score_Table = "CREATE TABLE $Score_TABLE_NAME($Score_ID INTEGER PRIMARY KEY AUTOINCREMENT,$Score_value TEXT,$Score_Type INTEGER);"
        db?.execSQL(Wrong_Table)
        db?.execSQL(Score_Table)

    }
    @SuppressLint("Range")
    fun getallWrong():List<dbmodel>{
        //gets all values from wrong questions database
        val Wrong_List = ArrayList<dbmodel>()
        val db =  readableDatabase
        val selectQuery = "Select * from $Wrong_TABLE_NAME"
        val cursor = db.rawQuery(selectQuery,null)
        if (cursor != null){
            if (cursor.moveToFirst()){
                do {
                    val Wrong = dbmodel()
                    Wrong.id = Integer.parseInt(cursor.getString(cursor.getColumnIndex(Wrong_ID)))
                    Wrong.Image = Integer.parseInt(cursor.getString(cursor.getColumnIndex(Wrong_Image)))
                    Wrong.Question = cursor.getString(cursor.getColumnIndex(Wrong_Question))
                    Wrong.Option_1 = cursor.getString(cursor.getColumnIndex(Wrong_Option_1))
                    Wrong.Option_2 = cursor.getString(cursor.getColumnIndex(Wrong_Option_2))
                    Wrong.Option_3 = cursor.getString(cursor.getColumnIndex(Wrong_Option_3))
                    Wrong.Option_4 = cursor.getString(cursor.getColumnIndex(Wrong_Option_4))
                    Wrong.Correct_option = cursor.getString(cursor.getColumnIndex(Wrong_Correct_option))
                    Wrong.Times_wrong = Integer.parseInt(cursor.getString(cursor.getColumnIndex(Wrong_Times_wrong)))
                    Wrong_List.add(Wrong)
                }while (cursor.moveToNext())

            }
        }
        cursor.close()
        return Wrong_List
    }

    @SuppressLint("Range")
    fun getallScore():List<scoremodel>{
        //gets all the values from the score database
        val Score_List = ArrayList<scoremodel>()
        val db = readableDatabase
        val selectQuery = "Select * from $Score_TABLE_NAME"
        val cursor = db.rawQuery(selectQuery,null)
        if (cursor != null){
            if (cursor.moveToFirst()){
                do {
                    val Score = scoremodel()
                    Score.id = Integer.parseInt(cursor.getString(cursor.getColumnIndex(Score_ID)))
                    Score.score = cursor.getString(cursor.getColumnIndex(Score_value))
                    Score.Type = Integer.parseInt(cursor.getString(cursor.getColumnIndex(Score_Type)))
                    Score_List.add(Score)
                }while (cursor.moveToNext())

            }
        }
        cursor.close()
        return Score_List
    }

    fun addWrong_Question(question : dbmodel) : Boolean {
        //Open Database To allow to write data to it
        val db = this.writableDatabase
        //Store all the values into a ContentValue
        val values = ContentValues()
        values.put(Wrong_Image,question.Image)
        values.put(Wrong_Question,question.Question)
        values.put(Wrong_Option_1,question.Option_1)
        values.put(Wrong_Option_2,question.Option_2)
        values.put(Wrong_Option_3,question.Option_3)
        values.put(Wrong_Option_4,question.Option_4)
        values.put(Wrong_Correct_option,question.Correct_option)
        values.put(Wrong_Times_wrong,question.Times_wrong)
        //If the Process was successful
        val _success = db.insert(Wrong_TABLE_NAME,null,values)
        db.close()
        return (Integer.parseInt("$_success") != -1)
    }

    fun add_score(score : scoremodel) : Boolean {
        //saves values to the score database
        val db = this.writableDatabase
        val values = ContentValues()
        values.put(Score_value,score.score)
        values.put(Score_Type,score.Type)
        val _success = db.insert(Score_TABLE_NAME,null,values)
        db.close()
        return (Integer.parseInt("$_success") != -1)
    }

fun wrong_correct(question : String){
    //if the question was correct increment times wrong to be used later in the score model
    val dbupdate = this.writableDatabase
    val values = ContentValues()
    values.put(Wrong_Times_wrong,1)
    val where = "$Wrong_Question = ?"
    val whereargs = arrayOf(question)
    dbupdate.update(Wrong_TABLE_NAME,values,where,whereargs)
    dbupdate.close()

}

    override fun onUpgrade(db: SQLiteDatabase?, oldVersion: Int, newVersion: Int) {
        val Score_drop_table = "DROP TABLE IF EXISTS $Score_TABLE_NAME"
        val Wrong_drop_table = "DROP TABLE IF EXISTS $Wrong_TABLE_NAME"
        db?.execSQL(Score_drop_table)
        db?.execSQL(Wrong_drop_table)
        onCreate(db)
    }
}