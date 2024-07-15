package com.example.trafficquiz.quiz.game

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.example.trafficquiz.R
import com.example.trafficquiz.databinding.FragmentRedoBinding


lateinit var binding: FragmentRedoBinding
class redoFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        binding = DataBindingUtil.inflate(inflater,R.layout.fragment_redo,container,false)
        return binding.root
    }

}