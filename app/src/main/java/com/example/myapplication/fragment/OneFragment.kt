package com.example.myapplication.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.myapplication.FrameLayoutActivity
import com.example.myapplication.MainActivity
import com.example.myapplication.R
import com.example.myapplication.databinding.FragmentOneBinding

class OneFragment : Fragment() {

    private lateinit var binding : FragmentOneBinding
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState : Bundle?
    ) : View?{

        binding = FragmentOneBinding.inflate(inflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?){
        super.onViewCreated(view, savedInstanceState)
        binding.junyeong1.setOnClickListener{
            if(requireActivity() is MainActivity){
                findNavController().navigate(R.id.action_oneFragment_to_twoFragment)
            } else if(requireActivity() is FrameLayoutActivity){
                requireActivity().supportFragmentManager.beginTransaction().replace(R.id.flMain,
                    TwoFragment::class.java, null)
                    .setCustomAnimations(android.R.anim.slide_in_left,
                        android.R.anim.slide_in_left).commit()
            }

        }
    }

}