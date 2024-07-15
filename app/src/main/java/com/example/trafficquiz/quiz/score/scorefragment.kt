package com.example.trafficquiz.quiz.score

import android.annotation.SuppressLint
import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import androidx.navigation.fragment.navArgs
import com.example.trafficquiz.R
import com.example.trafficquiz.databinding.FragmentScoreBinding
import com.example.trafficquiz.quiz.App
import com.example.trafficquiz.quiz.game.WrongDB
import com.example.trafficquiz.quiz.game.model.scoremodel
import java.io.BufferedReader
import java.io.FileInputStream
import java.io.FileOutputStream
import java.io.InputStreamReader


class scorefragment : Fragment() {
    lateinit var binding: FragmentScoreBinding
    private val args : scorefragmentArgs by navArgs()
    @SuppressLint("Range")
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = DataBindingUtil.inflate(inflater,R.layout.fragment_score, container, false)
        val correctNum = args.Correct
        val wrongNum = args.Wrong
        val max = args.max
        val type = args.type

        binding.textviewScore.text = correctNum.toString() + " / "  + max.toString()

        binding.btnFinish.setOnClickListener{view:View ->
            val action = scorefragmentDirections.actionScorefragmentToQuizselector()
            view.findNavController().navigate(action)
        }
        /*
        This creates a helper value to connect to the database and save the values that need to be put into the databse
        into a model for the score
         */
        var helper = WrongDB(requireContext())

        var model = scoremodel()
        model.Type = type
        model.score = correctNum.toString() + " / "  + max.toString()
        //Adds to the database
        helper.add_score(model)


        //This is used to delete the questions from the database if there was a question that the user got right
        var db = helper.readableDatabase
        var I = 0
        var delete = "DELETE FROM Wrong_Questions WHERE Wrong_Times_wrong >= 1"
        db.execSQL(delete)

        //This will show the scores of the top 10 previous attempts
        var rs = db.rawQuery("Select Score_value from Score_TABLE_NAME Where Score_Type = $type ORDER BY Score_value DESC LIMIT 10",null)

        try {
            while (rs.moveToNext()) {
                I = I + 1
                var text = binding.textView3.text
                binding.textView3.text = text.toString() + System.lineSeparator() + I.toString() + " : " + rs.getString(rs.getColumnIndex("Score_value"))
            }
        } finally {
            rs.close();
        }



        //Old TextFile implementation
    /*
        val file:String = "HighScore"
        val data:String = System.lineSeparator() + type.toString()+" : "+ binding.textviewScore.text.toString()
        val fileOutputStream:FileOutputStream
        try {
            fileOutputStream = requireActivity().openFileOutput(file, Context.MODE_APPEND)
            fileOutputStream.write(data.toByteArray())
        }catch (e: Exception){
            e.printStackTrace()
        }

            var fileInputStream: FileInputStream? = null
            fileInputStream = requireActivity().openFileInput(file)
            var inputStreamReader: InputStreamReader = InputStreamReader(fileInputStream)
            val bufferedReader: BufferedReader = BufferedReader(inputStreamReader)
            val stringBuilder: StringBuilder = StringBuilder()
            var text: String? = null
            while ({ text = bufferedReader.readLine(); text }() != null) {
                stringBuilder.append(text)
            }
            //Displaying data on EditText
            binding.textViewPrevious.text = stringBuilder.toString()


        //write a file that stores the Scores where they can be displayed somewhere
        //read from that file for the high scores
        //Store wrong questions
        /*
        var fileInputStream: FileInputStream? = null
        fileInputStream = openFileInput(filename)
        var inputStreamReader: InputStreamReader = InputStreamReader(fileInputStream)
        val bufferedReader: BufferedReader = BufferedReader(inputStreamReader)
        val stringBuilder: StringBuilder = StringBuilder()
        var text: String? = null
        while ({ text = bufferedReader.readLine(); text }() != null) {
            stringBuilder.append(text)
    }
        //Displaying data on EditText
        fileData.setText(stringBuilder.toString()).toString()
         */

        */

        return binding.root

    }

}