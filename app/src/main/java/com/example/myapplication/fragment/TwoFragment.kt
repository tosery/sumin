package com.example.myapplication.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.myapplication.MainActivity
import com.example.myapplication.R
import com.example.myapplication.databinding.FragmentTwoBinding

class TwoFragment : Fragment(){
    private lateinit var binding : FragmentTwoBinding
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState : Bundle?
    ) : View?{

        binding = FragmentTwoBinding.inflate(inflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?){
        super.onViewCreated(view, savedInstanceState)
        binding.junyeong2.setOnClickListener{
            if(requireActivity() is MainActivity){
                findNavController().navigate(R.id.action_twoFragment_to_threeFragment)
            }

        }
    }
}