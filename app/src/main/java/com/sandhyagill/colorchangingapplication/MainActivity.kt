package com.sandhyagill.colorchangingapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.content.ContextCompat
import com.sandhyagill.colorchangingapplication.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    lateinit var activityInterface: ActivityInterface

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnRed.setOnClickListener {
            activityInterface.getColorRed()
        }
        binding.btnBlue.setOnClickListener {
            activityInterface.getColorBlue()
        }
        binding.btnGreen.setOnClickListener {
            activityInterface.getColorGreen()
        }
        
    }
}