package com.example.appworkmanager

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.appworkmanager.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.button.setOnClickListener {
            val alarmNotify = AlarmNotify(applicationContext)
            alarmNotify.setOneTimeWorkRequest()
        }
    }
}