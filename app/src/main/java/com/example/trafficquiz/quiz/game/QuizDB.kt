package com.example.trafficquiz.quiz.game

import android.annotation.SuppressLint
import android.content.ContentValues
import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper
import androidx.core.content.contentValuesOf
import com.example.trafficquiz.quiz.game.model.dbmodel

class QuizDB(context: Context):SQLiteOpenHelper(context, DB_NAME,null, DB_VERSION){

    companion object {
        private val DB_NAME = "TrafficQuizDB"
        private val DB_VERSION = 1


        //Road Signs Table vars
        private val Road_Signs_TABLE_NAME = "Road_Signs"
        private val Road_Signs_ID = "Road_Signs_id"
        //private val Road_Signs_Image = "Road_Signs_Image"
        private val Road_Signs_Question = "Road_Signs_Question"
        private val Road_Signs_Option_1 = "Road_Signs_Option_1"
        private val Road_Signs_Option_2 = "Road_Signs_Option_2"
        private val Road_Signs_Option_3 = "Road_Signs_Option_3"
        private val Road_Signs_Option_4 = "Road_Signs_Option_4"
        private val Road_Signs_Correct_option = "Road_Signs_Correct_option"
        private val Road_Signs_Times_wrong = "Road_Signs_Times_Wrong"

        //Road Markings Table vars
        private val Road_Markings_TABLE_NAME = "Road_Markings"
        private val Road_Markings_ID = "Road_Markings_id"
        //private val Road_Signs_Image = "Road_Markings_Image"
        private val Road_Markings_Question = "Road_Markings_Question"
        private val Road_Markings_Option_1 = "Road_Markings_Option_1"
        private val Road_Markings_Option_2 = "Road_Markings_Option_2"
        private val Road_Markings_Option_3 = "Road_Markings_Option_3"
        private val Road_Markings_Option_4 = "Road_Markings_Option_4"
        private val Road_Markings_Correct_option = "Road_Markings_Correct_option"
        private val Road_Markings_Times_wrong = "Road_Markings_Times_Wrong"

        //Signals Table vars
        private val Signals_TABLE_NAME = "Signals"
        private val Signals_ID = "Signals_id"
        //private val Road_Signs_Image = "Signals_Image"
        private val Signals_Question = "Signals_Question"
        private val Signals_Option_1 = "Signals_Option_1"
        private val Signals_Option_2 = "Signals_Option_2"
        private val Signals_Option_3 = "Signals_Option_3"
        private val Signals_Option_4 = "Signals_Option_4"
        private val Signals_Correct_option = "Signals_Correct_option"
        private val Signals_Times_wrong = "Signals_Times_Wrong"

        //Road Rules Table vars
        private val Road_Rules_TABLE_NAME = "Road_Rules"
        private val Road_Rules_ID = "Road_Rules_id"
        //private val Road_Signs_Image = "Road_Rules_Image"
        private val Road_Rules_Question = "Road_Rules_Question"
        private val Road_Rules_Option_1 = "Road_Rules_Option_1"
        private val Road_Rules_Option_2 = "Road_Rules_Option_2"
        private val Road_Rules_Option_3 = "Road_Rules_Option_3"
        private val Road_Rules_Option_4 = "Road_Rules_Option_4"
        private val Road_Rules_Correct_option = "Road_Rules_Correct_option"
        private val Road_Rules_Times_wrong = "Road_Rules_Times_Wrong"

        //Vehicle Controls Table vars
        private val Vehicle_Controls_TABLE_NAME = "Vehicle_Controls"
        private val Vehicle_Controls_ID = "Vehicle_Controls_id"
        //private val Vehicle_Controls_Image = "Vehicle_Controls_Image"
        private val Vehicle_Controls_Question = "Vehicle_Controls_Question"
        private val Vehicle_Controls_Option_1 = "Vehicle_Controls_Option_1"
        private val Vehicle_Controls_Option_2 = "Vehicle_Controls_Option_2"
        private val Vehicle_Controls_Option_3 = "Vehicle_Controls_Option_3"
        private val Vehicle_Controls_Option_4 = "Vehicle_Controls_Option_4"
        private val Vehicle_Controls_Correct_option = "Vehicle_Controls_Correct_option"
        private val Vehicle_Controls_Times_wrong = "Vehicle_Controls_Times_Wrong"




        /*
        TableName
        Question
        Option 1
        Option 2
        Option 3
        Option 4
        Correct option
        Number of times wrong
        * */
    }

    override fun onCreate(db: SQLiteDatabase?) {
        val Road_Sign_Table = "CREATE TABLE $Road_Signs_TABLE_NAME($Road_Signs_ID INTEGER PRIMARY KEY,$Road_Signs_Question TEXT,$Road_Signs_Option_1 TEXT,$Road_Signs_Option_2 TEXT,$Road_Signs_Option_3 TEXT,$Road_Signs_Option_4 TEXT,$Road_Signs_Correct_option TEXT,$Road_Signs_Times_wrong INTEGER);"
        val Road_Markings_Table = "CREATE TABLE $Road_Markings_TABLE_NAME($Road_Markings_ID INTEGER PRIMARY KEY,$Road_Markings_Question TEXT,$Road_Markings_Option_1 TEXT,$Road_Markings_Option_2 TEXT,$Road_Markings_Option_3 TEXT,$Road_Markings_Option_4 TEXT,$Road_Markings_Correct_option TEXT,$Road_Markings_Times_wrong INTEGER);"
        val Signals_Table = "CREATE TABLE $Signals_TABLE_NAME($Signals_ID INTEGER PRIMARY KEY,$Signals_Question TEXT,$Signals_Option_1 TEXT,$Signals_Option_2 TEXT,$Signals_Option_3 TEXT,$Signals_Option_4 TEXT,$Signals_Correct_option TEXT,$Signals_Times_wrong INTEGER);"
        val Road_Rules_Table = "CREATE TABLE $Road_Rules_TABLE_NAME($Road_Rules_ID INTEGER PRIMARY KEY,$Road_Rules_Question TEXT,$Road_Rules_Option_1 TEXT,$Road_Rules_Option_2 TEXT,$Road_Rules_Option_3 TEXT,$Road_Rules_Option_4 TEXT,$Road_Rules_Correct_option TEXT,$Road_Rules_Times_wrong INTEGER);"
        val Vehicle_Controls_Table = "CREATE TABLE $Vehicle_Controls_TABLE_NAME($Vehicle_Controls_ID INTEGER PRIMARY KEY,$Vehicle_Controls_Question TEXT,$Vehicle_Controls_Option_1 TEXT,$Vehicle_Controls_Option_2 TEXT,$Vehicle_Controls_Option_3 TEXT,$Vehicle_Controls_Option_4 TEXT,$Vehicle_Controls_Correct_option TEXT,$Vehicle_Controls_Times_wrong INTEGER);"
        db?.execSQL(Road_Sign_Table)
        db?.execSQL(Road_Markings_Table)
        db?.execSQL(Signals_Table)
        db?.execSQL(Road_Rules_Table)
        db?.execSQL(Vehicle_Controls_Table)


    }

    override fun onUpgrade(db: SQLiteDatabase?, oldVersion: Int, newVersion: Int) {
        val Road_Sign_Drop_Table = "Drop TABLE IF EXISTS $Road_Signs_TABLE_NAME"
        val Road_Markings_Drop_Table = "Drop TABLE IF EXISTS $Road_Markings_TABLE_NAME"
        val Signals_Drop_Table = "Drop TABLE IF EXISTS $Signals_TABLE_NAME"
        val Road_Rules_Drop_Table = "Drop TABLE IF EXISTS $Road_Rules_TABLE_NAME"
        val Vehicle_Controls_Drop_Table = "Drop TABLE IF EXISTS $Vehicle_Controls_TABLE_NAME"
        db?.execSQL(Road_Sign_Drop_Table)
        db?.execSQL(Road_Markings_Drop_Table)
        db?.execSQL(Signals_Drop_Table)
        db?.execSQL(Road_Rules_Drop_Table)
        db?.execSQL(Vehicle_Controls_Drop_Table)
        onCreate(db)
    }

    @SuppressLint("Range")
    fun getallRoad_Signs():List<dbmodel>{
        val Road_signs_List = ArrayList<dbmodel>()
        val db = writableDatabase
        val selectQuery = "Select * from $Road_Signs_TABLE_NAME"
        val cursor = db.rawQuery(selectQuery,null)
        if (cursor != null){
            if (cursor.moveToFirst()){
                do {
                    val Road_Sign = dbmodel()
                    Road_Sign.id = Integer.parseInt(cursor.getString(cursor.getColumnIndex(Road_Signs_ID)))
                    Road_Sign.Question = cursor.getString(cursor.getColumnIndex(Road_Signs_Question))
                    Road_Sign.Option_1 = cursor.getString(cursor.getColumnIndex(Road_Signs_Option_1))
                    Road_Sign.Option_2 = cursor.getString(cursor.getColumnIndex(Road_Signs_Option_2))
                    Road_Sign.Option_3 = cursor.getString(cursor.getColumnIndex(Road_Signs_Option_3))
                    Road_Sign.Option_4 = cursor.getString(cursor.getColumnIndex(Road_Signs_Option_4))
                    Road_Sign.Correct_option = cursor.getString(cursor.getColumnIndex(Road_Signs_Correct_option))
                    Road_Sign.Times_wrong = Integer.parseInt(cursor.getString(cursor.getColumnIndex(Road_Signs_Times_wrong)))

                }while (cursor.moveToNext())

            }
        }
        cursor.close()
        return Road_signs_List
    }
    @SuppressLint("Range")
    fun getallRoad_Markings():List<dbmodel>{
        val Road_Markings_List = ArrayList<dbmodel>()
        val db = writableDatabase
        val selectQuery = "Select * from $Road_Markings_TABLE_NAME"
        val cursor = db.rawQuery(selectQuery,null)
        if (cursor != null){
            if (cursor.moveToFirst()){
                do {
                    val Road_Markings = dbmodel()
                    Road_Markings.id = Integer.parseInt(cursor.getString(cursor.getColumnIndex(Road_Markings_ID)))
                    Road_Markings.Question = cursor.getString(cursor.getColumnIndex(Road_Markings_Question))
                    Road_Markings.Option_1 = cursor.getString(cursor.getColumnIndex(Road_Markings_Option_1))
                    Road_Markings.Option_2 = cursor.getString(cursor.getColumnIndex(Road_Markings_Option_2))
                    Road_Markings.Option_3 = cursor.getString(cursor.getColumnIndex(Road_Markings_Option_3))
                    Road_Markings.Option_4 = cursor.getString(cursor.getColumnIndex(Road_Markings_Option_4))
                    Road_Markings.Correct_option = cursor.getString(cursor.getColumnIndex(Road_Markings_Correct_option))
                    Road_Markings.Times_wrong = Integer.parseInt(cursor.getString(cursor.getColumnIndex(Road_Markings_Times_wrong)))

                }while (cursor.moveToNext())

            }
        }
        cursor.close()
        return Road_Markings_List
    }
    @SuppressLint("Range")
    fun getallSignals():List<dbmodel>{
        val Signals_List = ArrayList<dbmodel>()
        val db = writableDatabase
        val selectQuery = "Select * from $Road_Signs_TABLE_NAME"
        val cursor = db.rawQuery(selectQuery,null)
        if (cursor != null){
            if (cursor.moveToFirst()){
                do {
                    val Signals = dbmodel()
                    Signals.id = Integer.parseInt(cursor.getString(cursor.getColumnIndex(Signals_ID)))
                    Signals.Question = cursor.getString(cursor.getColumnIndex(Signals_Question))
                    Signals.Option_1 = cursor.getString(cursor.getColumnIndex(Signals_Option_1))
                    Signals.Option_2 = cursor.getString(cursor.getColumnIndex(Signals_Option_2))
                    Signals.Option_3 = cursor.getString(cursor.getColumnIndex(Signals_Option_3))
                    Signals.Option_4 = cursor.getString(cursor.getColumnIndex(Signals_Option_4))
                    Signals.Correct_option = cursor.getString(cursor.getColumnIndex(Signals_Correct_option))
                    Signals.Times_wrong = Integer.parseInt(cursor.getString(cursor.getColumnIndex(Signals_Times_wrong)))

                }while (cursor.moveToNext())

            }
        }
        cursor.close()
        return Signals_List
    }
    @SuppressLint("Range")
    fun getallRoad_Rules():List<dbmodel>{
        val Road_Rules_List = ArrayList<dbmodel>()
        val db = writableDatabase
        val selectQuery = "Select * from $Road_Signs_TABLE_NAME"
        val cursor = db.rawQuery(selectQuery,null)
        if (cursor != null){
            if (cursor.moveToFirst()){
                do {
                    val Road_Rules = dbmodel()
                    Road_Rules.id = Integer.parseInt(cursor.getString(cursor.getColumnIndex(Road_Rules_ID)))
                    Road_Rules.Question = cursor.getString(cursor.getColumnIndex(Road_Rules_Question))
                    Road_Rules.Option_1 = cursor.getString(cursor.getColumnIndex(Road_Rules_Option_1))
                    Road_Rules.Option_2 = cursor.getString(cursor.getColumnIndex(Road_Rules_Option_2))
                    Road_Rules.Option_3 = cursor.getString(cursor.getColumnIndex(Road_Rules_Option_3))
                    Road_Rules.Option_4 = cursor.getString(cursor.getColumnIndex(Road_Rules_Option_4))
                    Road_Rules.Correct_option = cursor.getString(cursor.getColumnIndex(Road_Rules_Correct_option))
                    Road_Rules.Times_wrong = Integer.parseInt(cursor.getString(cursor.getColumnIndex(Road_Rules_Times_wrong)))

                }while (cursor.moveToNext())

            }
        }
        cursor.close()
        return Road_Rules_List
    }
    @SuppressLint("Range")
    fun getallVehicle_Controls():List<dbmodel>{
        val Vehicle_Controls_List = ArrayList<dbmodel>()
        val db = writableDatabase
        val selectQuery = "Select * from $Road_Signs_TABLE_NAME"
        val cursor = db.rawQuery(selectQuery,null)
        if (cursor != null){
            if (cursor.moveToFirst()){
                do {
                    val Vehicle_Controls = dbmodel()
                    Vehicle_Controls.id = Integer.parseInt(cursor.getString(cursor.getColumnIndex(Vehicle_Controls_ID)))
                    Vehicle_Controls.Question = cursor.getString(cursor.getColumnIndex(Vehicle_Controls_Question))
                    Vehicle_Controls.Option_1 = cursor.getString(cursor.getColumnIndex(Vehicle_Controls_Option_1))
                    Vehicle_Controls.Option_2 = cursor.getString(cursor.getColumnIndex(Vehicle_Controls_Option_2))
                    Vehicle_Controls.Option_3 = cursor.getString(cursor.getColumnIndex(Vehicle_Controls_Option_3))
                    Vehicle_Controls.Option_4 = cursor.getString(cursor.getColumnIndex(Vehicle_Controls_Option_4))
                    Vehicle_Controls.Correct_option = cursor.getString(cursor.getColumnIndex(Vehicle_Controls_Correct_option))
                    Vehicle_Controls.Times_wrong = Integer.parseInt(cursor.getString(cursor.getColumnIndex(Vehicle_Controls_Times_wrong)))

                }while (cursor.moveToNext())

            }
        }
        cursor.close()
        return Vehicle_Controls_List
    }

    //inset questions into tables
    fun addRoadSignQuestion(question : dbmodel) : Boolean {
        val db = this.writableDatabase
        val values = ContentValues()
        values.put(Road_Signs_Question,question.Question)
        values.put(Road_Signs_Option_1,question.Option_1)

        val _success = db.insert(Road_Signs_TABLE_NAME,null,values)
        db.close()
        return (Integer.parseInt("$_success") != -1)
    }
}