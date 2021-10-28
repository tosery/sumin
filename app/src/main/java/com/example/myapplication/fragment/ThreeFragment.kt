package com.example.myapplication.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.myapplication.databinding.FragmentThreeBinding
import com.example.myapplication.databinding.FragmentTwoBinding

class ThreeFragment : Fragment(){
    private lateinit var binding : FragmentThreeBinding
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState : Bundle?
    ) : View?{

        binding = FragmentThreeBinding.inflate(inflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?){
        super.onViewCreated(view, savedInstanceState)
        binding.junyeong3.setOnClickListener{

        }
    }
}