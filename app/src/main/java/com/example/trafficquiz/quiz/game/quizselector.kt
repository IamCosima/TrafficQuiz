package com.example.trafficquiz.quiz.game

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
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
            view.findNavController().navigate(R.id.action_quizselector_to_quizfragment)
        }

        binding.btnRoadMarkings.setOnClickListener{view:View ->
            view.findNavController().navigate(R.id.action_quizselector_to_quizfragment)
        }

        binding.btnSignals.setOnClickListener{view:View ->
            view.findNavController().navigate(R.id.action_quizselector_to_quizfragment)
        }

        binding.btnRoadRules.setOnClickListener{view:View ->
            view.findNavController().navigate(R.id.action_quizselector_to_quizfragment)
        }

        binding.btnVechicleControls.setOnClickListener{view:View ->
            view.findNavController().navigate(R.id.action_quizselector_to_quizfragment)
        }

        binding.btnMock.setOnClickListener{view:View ->
            view.findNavController().navigate(R.id.action_quizselector_to_quizfragment)
        }

        return binding.root
    }

}