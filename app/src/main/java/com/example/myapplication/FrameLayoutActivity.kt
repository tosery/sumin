package com.example.myapplication

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

import com.example.myapplication.databinding.ActivityFrameLayoutBinding
import com.example.myapplication.fragment.OneFragment

class FrameLayoutActivity: AppCompatActivity() {

    private lateinit var binding: ActivityFrameLayoutBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityFrameLayoutBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportFragmentManager.beginTransaction().add(R.id.flMain, OneFragment::class.java, null).commit()

    }

}