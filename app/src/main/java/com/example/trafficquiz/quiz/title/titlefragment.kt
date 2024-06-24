package com.example.trafficquiz.quiz.title

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import com.example.trafficquiz.R
import com.example.trafficquiz.databinding.FragmentTitleBinding


class titlefragment : Fragment() {
    lateinit var binding: FragmentTitleBinding
    lateinit var btn_start:Button
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        binding = DataBindingUtil.inflate(inflater,R.layout.fragment_title,container,false)

        binding.StartBtn.setOnClickListener{view:View ->
            view.findNavController().navigate(R.id.action_titlefragment_to_quizselector)
        }


        return binding.root
    }
}