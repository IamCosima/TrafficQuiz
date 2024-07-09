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

        fun Sample_Road_Sign() : Boolean{
            val quest1  = "INSERT INTO $Road_Signs_TABLE_NAME(1,'This sign shows you... ','The road winds ahead','There are a number of curves ahead','The Road has a concealed entrance to the left followed by another to the right','The Road looks like a snake','The Road has a concealed entrance to the left followed by another to the right',0)"//winds.png
            val quest2 = "INSERT INTO $Road_Signs_TABLE_NAME(2,'This road sign implies to you that there... ','Is two-way traffic at the following road that crosses the road you are on','The one-way road you are traveling on will become two-way ahead','There are two lanes ahead','is a reverse lane and a forward lane','The one-way road you are traveling on will become two-way ahead',0)"//two way.png
            val quest3 = "INSERT INTO $Road_Signs_TABLE_NAME(3,'If you see this road sign it means that... ','You may not enter unless you have special permission','No vehicles may drive here as it is the pedestrians walkway','You will get a dual roadway ahead','You must perform a maths sum ahead to pass','You may not enter unless you have special permission',0)"//no entry.png
            val quest4 = "INSERT INTO $Road_Signs_TABLE_NAME(4,'What does this road sign show you ','Can expect a sharp bend to the right','Will get a only way road to the right','you must turn right','You can turn right if there is space','you must turn right',0)"//sharp bend.png
            val quest5 = "INSERT INTO $Road_Signs_TABLE_NAME(5,'What does this road sign show the driver? ','You must switch on your headlights','you must test your lights','if its dark you can switch on your vehicles headlights','No littering zone','You must switch on your headlights',0)"//headlights.png
            val quest6 = "INSERT INTO $Road_Signs_TABLE_NAME(6,'What does this road sign show you? ','Only motorcars may nor pass each other','No motorcars may overtake for the next 500m','There is a bridge ahead and only one vehicle can pass at a time','There is only one lane','No motorcars may overtake for the next 500m',0)"//overtake.png
            val quest7 = "INSERT INTO $Road_Signs_TABLE_NAME(7,'This sign means... ','Only tour buses may park here ','Only tour buses may stop here','This part of the road is only for the use of tour buses','You can get on a tour bus here','This part of the road is only for the use of tour buses',0)"//bus.png
            val quest8 = "INSERT INTO $Road_Signs_TABLE_NAME(8,'This road sign means... ','Shows you there is  a hospital ahead where you may not make noise','Shows you that you may not pick up people here','Prohibits you from using your hooter','No clowns allowed here','Prohibits you from using your hooter',0)"//horn.png
            val quest9 = "INSERT INTO $Road_Signs_TABLE_NAME(9,'What does this sign show you? ','road crossing ahead and other vehicles from the side must stop at the intersection','There is a four-way stop ahead','there will be a railway crossing ahead','Hospital nearby','road crossing ahead and other vehicles from the side must stop at the intersection',0)"//intersection.png
            val quest10 = "INSERT INTO $Road_Signs_TABLE_NAME(10,'What must you do when you see this road sign','The maximum speed you may travel at night','The maximum distance you can travel at night','Recommended speed when lights are one ','The time you can have your lights on','The maximum speed you may travel at night',0)"//night.png
            return true
        }
        fun Sample_Road_Markings() : Boolean{
            val quest1  = "INSERT INTO $Road_Markings_TABLE_NAME(1,'What is the purpose of the lines? ','It is dividing lines that show the lanes to road users','It divides the road in two','You must drive slower','Shows the road mirrors','It is dividing lines that show the lanes to road users ',0)"//div lines.png
            val quest2 = "INSERT INTO $Road_Markings_TABLE_NAME(2,'What is the purpose of this road marking? ','No parking zone','Parking is reserved for emergency vehicles','Only peoples name starting with A can park','Always available zone','Parking is reserved for emergency vehicles',0)"//ambulance.png
            val quest3 = "INSERT INTO $Road_Markings_TABLE_NAME(3,'What does this road marking mean? ','Buses can park here','Lane is reserved for minibus','Lane is reserved for bicycles','Lane is reserved for buses','Lane is reserved for buses',0)"//bus.png
            val quest4 = "INSERT INTO $Road_Markings_TABLE_NAME(4,'This road marking warns a driver that he will get a ','Pedestrian crossing ahead','Speed bump ahead','Railway crossing ahead','There is an intersection ahead','Speed bump ahead',0)"//speed.png
            val quest5 = "INSERT INTO $Road_Markings_TABLE_NAME(5,'What does the triangle marking mean? ','You can take a break here','You can pick up people here','You must stop here','Only allowed to stop here in an emergency','Only allowed to stop here in an emergency',0)"//island.png
            val quest6 = "INSERT INTO $Road_Markings_TABLE_NAME(6,'What does this box mean on the road? ','You can swap lanes here','That you cannot stop here','You can make a u turn here','You can take a break here','That you cannot stop here',0)"//box.png
            val quest7 = "INSERT INTO $Road_Markings_TABLE_NAME(7,'What does this figure mean on the road? ','No pedestrians allowed','Only bikes past this zone','Only cars can cross','Bicycle crossing','Bicycle crossing',0)"//bicycle.png
            val quest8 = "INSERT INTO $Road_Markings_TABLE_NAME(8,'What does the lines mean? ','Bicycle crossing','Speed bump','That there is a pedestrian crossing','Railway crossing','That there is a pedestrian crossing',0)"//crossing.png
            val quest9 = "INSERT INTO $Road_Markings_TABLE_NAME(9,'What does this marking mean? ','Speed up','You should stop before the line','Take a break here','Traffic lights ahead','You should stop before the line',0)"//stop.png
            val quest10 = "INSERT INTO $Road_Markings_TABLE_NAME(10,'What does this marking mean ?','You should slow down before and make way for approaching traffic','Speed up','Crossings for school','Toll road ahead','You should slow down before and make way for approaching traffic',0)"//yield.png
            return true
        }

        fun Sample_Signals() : Boolean{
            val quest1  = "INSERT INTO $Signals_TABLE_NAME(1,'What does this Light mean?','You may proceed','You need to stop at the line','You can take a break','You must slow down','You need to stop at the line',0)"//red light.png
            val quest2 = "INSERT INTO $Signals_TABLE_NAME(2,'What does this Light mean?','You must take caution and begin to stop unless unsafe','You can go','You must stop','You can take a break','You must take caution and begin to stop unless unsafe',0)"//yellow light.png
            val quest3 = "INSERT INTO $Signals_TABLE_NAME(3,'What does this Light mean?','You must look at the oncoming traffic','You must slow down','You may proceed if safe','You must stop','You may proceed if safe',0)"//green light.png
            val quest4 = "INSERT INTO $Signals_TABLE_NAME(4,'What does this arrow mean?','You cannot turn','You may proceed in the direction of arrow','You must stop','Wait to see if its safe to turn','You may proceed in the direction of arrow',0)"//green arrow.png
            val quest5 = "INSERT INTO $Signals_TABLE_NAME(5,'What does this arrow mean?','Can turn if you want','Can go straight','Stop at the line','You must stop unless unsafe','You must stop unless unsafe',0)"//yellow arrow.png
            val quest6 = "INSERT INTO $Signals_TABLE_NAME(6,'What does this arrow mean?','You must stop','Can turn if you want','Can go straight','You must stop unless unsafe','You must stop',0)"//red arrow.png
            val quest7 = "INSERT INTO $Signals_TABLE_NAME(7,'What does this hand sign mean?','You can take a break','You must look at the oncoming traffic','You must stop','Wait to see if its safe to turn','You must stop',0)"//officer stop.png
            val quest8 = "INSERT INTO $Signals_TABLE_NAME(8,'What does this hand sign mean','You must look at the oncoming traffic','You may proceed','Wait to see if its safe to turn','You can take a break','You may proceed',0)"//proceed.png
            val quest9 = "INSERT INTO $Signals_TABLE_NAME(9,'What does this hand sign mean','You must stop','You can take a break','You must look at the oncoming traffic','Wait to see if its safe to turn','You must stop',0)"//construct stop.png
            val quest10 = "INSERT INTO $Signals_TABLE_NAME(10,'What does this hand sign mean','Wait to see if its safe to turn','You must look at the oncoming traffic','Proceed with caution','You can take a break','Proceed with caution',0)"//construt coution.png
            return true
        }

        fun Sample_Road_Rules() : Boolean{
            val quest1  = "INSERT INTO $Road_Rules_TABLE_NAME(1,'The distance that is required for a driver to stop is','All of above correct','None is correct','Only(1) is correct','(ii) and (iii) correct','Only(1) is correct',0)"//distance.png
            val quest2 = "INSERT INTO $Road_Rules_TABLE_NAME(2,'A trailer with a GWM of 1000kg','Must have reflectors on the sides','May have reflectors around trailer,but not needed','May not have reflectors','No reflectors allowed','May have reflectors around trailer,but not needed',0)"
            val quest3 = "INSERT INTO $Road_Rules_TABLE_NAME(3,'What must be considered when following a vehicle','Keep distance of 3 vehicle lengths','Must see the back wheels of car in front','Keep good distance away in case of sudden stop','no following distance required','Keep good distance away in case of sudden stop',0)"
            val quest4 = "INSERT INTO $Road_Rules_TABLE_NAME(4,'When can a driver be intoxicated','Always','Never','Only if medicine contains alcohol','Only during the night','Never',0)"
            val quest5 = "INSERT INTO $Road_Rules_TABLE_NAME(5,'Your vehicles lights should be on','Only(i) and(ii) are correct','Only(ii) and(iii) are correct','None are correct','All are correct','All are correct',0)"
            val quest6 = "INSERT INTO $Road_Rules_TABLE_NAME(6,'You can','Stop on the side of the road at night','Move backwards as long as its safe','Leave vehicle running while depositing fuel','Drink and drive','Move backwards as long as its safe',0)"
            val quest7 = "INSERT INTO $Road_Rules_TABLE_NAME(7,'If a light is blinking red you must..','Stop and go when safe','Stop and wait for green light','Lookout for roadblocks','Police are nearby','Stop and go when safe',0)"
            val quest8 = "INSERT INTO $Road_Rules_TABLE_NAME(8,'What is a gear lever used for','Change lanes','Change Radio channel','Swap to the correct gear','Used for speed control','Swap to the correct gear',0)"
            val quest9 = "INSERT INTO $Road_Rules_TABLE_NAME(9,'A temporary sign implies that','The rules of the road have changed','The situation on the road is not normal','Traffic must move slowly','Go as per normal','Traffic must move slowly',0)"
            val quest10 = "INSERT INTO $Road_Rules_TABLE_NAME(10,'If you have a learners licence','There must be another driver in the car with a licence','No driving on freeway','No passengers allowed','No rules','There must be another driver in the car with a licence',0)"
            return true
        }

        fun Sample_Vehicle_Controls() : Boolean{
            val quest1 = "INSERT INTO $Vehicle_Controls_TABLE_NAME(1,'To ensure that your parked vehicle does not move, use..','Number 7','Number 8','Number 9','Number 10','Number 7',0)"
            val quest2 = "INSERT INTO $Vehicle_Controls_TABLE_NAME(2,'What is number 2 used for? ','To clear the windscreen of any water','To warn other road users that you are approaching','To warn other road users that you are about to turn','To warn road users that you are stopping','To clear the windscreen of any water',0)"
            val quest3 = "INSERT INTO $Vehicle_Controls_TABLE_NAME(3,'When turning, use... ','Number 4','Number 5','Number 10','Number 11','Number 4',0)"
            val quest4 = "INSERT INTO $Vehicle_Controls_TABLE_NAME(4,'To change gears, use... ','Number 7 and 9','Number 5 and 8','Number 6 and 8','Number 4 and 8','Number 6 and 8',0)"
            val quest5 = "INSERT INTO $Vehicle_Controls_TABLE_NAME(5,'To stop, use… ','Number 9','Number 8','Number 7','Number 10','Number 9',0)"
            val quest6 = "INSERT INTO $Vehicle_Controls_TABLE_NAME(6,'Number (x) is not found in an automatic vehicle ','Number 10','Number 9','Number 8','Number 7','Number 8',0)"
            val quest7 = "INSERT INTO $Vehicle_Controls_TABLE_NAME(7,'When you want to drive faster, use… ','Number 6','Number 8','Number 10','Number 3','Number 10',0)"
            //val quest = "INSERT INTO $(id,'question','opt1','opt2','opt3','opt4','correct',0)"
            //db?.execSQL()
            return true

        }



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
    //get all values from tables
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
    fun addRoadSign_Question(question : dbmodel) : Boolean {
        val db = this.writableDatabase
        val values = ContentValues()
        values.put(Road_Signs_Question,question.Question)
        values.put(Road_Signs_Option_1,question.Option_1)
        values.put(Road_Signs_Option_2,question.Option_2)
        values.put(Road_Signs_Option_3,question.Option_3)
        values.put(Road_Signs_Option_4,question.Option_4)
        values.put(Road_Signs_Correct_option,question.Correct_option)
        values.put(Road_Signs_Times_wrong,question.Times_wrong)

        val _success = db.insert(Road_Signs_TABLE_NAME,null,values)
        db.close()
        return (Integer.parseInt("$_success") != -1)
    }
    fun addRoad_Markings_Question(question : dbmodel) : Boolean {
        val db = this.writableDatabase
        val values = ContentValues()
        values.put(Road_Markings_Question,question.Question)
        values.put(Road_Markings_Option_1,question.Option_1)
        values.put(Road_Markings_Option_2,question.Option_2)
        values.put(Road_Markings_Option_3,question.Option_3)
        values.put(Road_Markings_Option_4,question.Option_4)
        values.put(Road_Markings_Correct_option,question.Correct_option)
        values.put(Road_Markings_Times_wrong,question.Times_wrong)

        val _success = db.insert(Road_Markings_TABLE_NAME,null,values)
        db.close()
        return (Integer.parseInt("$_success") != -1)
    }
    fun addSignals_Question(question : dbmodel) : Boolean {
        val db = this.writableDatabase
        val values = ContentValues()
        values.put(Signals_Question,question.Question)
        values.put(Signals_Option_1,question.Option_1)
        values.put(Signals_Option_2,question.Option_2)
        values.put(Signals_Option_3,question.Option_3)
        values.put(Signals_Option_4,question.Option_4)
        values.put(Signals_Correct_option,question.Correct_option)
        values.put(Signals_Times_wrong,question.Times_wrong)

        val _success = db.insert(Signals_TABLE_NAME,null,values)
        db.close()
        return (Integer.parseInt("$_success") != -1)
    }
    fun addRoad_Rules_Question(question : dbmodel) : Boolean {
        val db = this.writableDatabase
        val values = ContentValues()
        values.put(Road_Rules_Question,question.Question)
        values.put(Road_Rules_Option_1,question.Option_1)
        values.put(Road_Rules_Option_2,question.Option_2)
        values.put(Road_Rules_Option_3,question.Option_3)
        values.put(Road_Rules_Option_4,question.Option_4)
        values.put(Road_Rules_Correct_option,question.Correct_option)
        values.put(Road_Rules_Times_wrong,question.Times_wrong)

        val _success = db.insert(Road_Rules_TABLE_NAME,null,values)
        db.close()
        return (Integer.parseInt("$_success") != -1)
    }
    fun addVehicle_Controls_Question(question : dbmodel) : Boolean {
        val db = this.writableDatabase
        val values = ContentValues()
        values.put(Vehicle_Controls_Question,question.Question)
        values.put(Vehicle_Controls_Option_1,question.Option_1)
        values.put(Vehicle_Controls_Option_2,question.Option_2)
        values.put(Vehicle_Controls_Option_3,question.Option_3)
        values.put(Vehicle_Controls_Option_4,question.Option_4)
        values.put(Vehicle_Controls_Correct_option,question.Correct_option)
        values.put(Vehicle_Controls_Times_wrong,question.Times_wrong)

        val _success = db.insert(Vehicle_Controls_TABLE_NAME,null,values)
        db.close()
        return (Integer.parseInt("$_success") != -1)
    }

}