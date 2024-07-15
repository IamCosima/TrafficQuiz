package com.example.trafficquiz.quiz.game

import android.os.Bundle
import android.text.Layout.Directions
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import com.example.trafficquiz.R
import com.example.trafficquiz.databinding.FragmentQuizselectorBinding

class quizselector : Fragment() {
    lateinit var binding: FragmentQuizselectorBinding
    lateinit var btn_RoadSign : Button
    lateinit var btn_RoadMarkings : Button
    lateinit var btn_Signals : Button
    lateinit var btn_RoadRules : Button
    lateinit var btn_VehicleControls : Button
    lateinit var btn_Mock : Button
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        binding = DataBindingUtil.inflate(inflater,R.layout.fragment_quizselector,container,false)

        binding.btnRoadSign.setOnClickListener{view:View ->
            val action = quizselectorDirections.actionQuizselectorToQuizfragment(1)
            view.findNavController().navigate(action)
        }

        binding.btnRoadMarkings.setOnClickListener{view:View ->
            val action = quizselectorDirections.actionQuizselectorToQuizfragment(2)
            view.findNavController().navigate(action)
        }

        binding.btnSignals.setOnClickListener{view:View ->
            val action = quizselectorDirections.actionQuizselectorToQuizfragment(3)
            view.findNavController().navigate(action)
        }

        binding.btnRoadRules.setOnClickListener{view:View ->
            val action = quizselectorDirections.actionQuizselectorToQuizfragment(4)
            view.findNavController().navigate(action)
        }

        binding.btnVechicleControls.setOnClickListener{view:View ->
            val action = quizselectorDirections.actionQuizselectorToQuizfragment(5)
            view.findNavController().navigate(action)
        }

        binding.btnWrongs.setOnClickListener{view:View ->
            val action = quizselectorDirections.actionQuizselectorToQuizfragment(6)
            view.findNavController().navigate(action)
        }


        return binding.root
    }

}