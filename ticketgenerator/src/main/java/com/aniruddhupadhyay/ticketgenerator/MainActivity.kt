package com.aniruddhupadhyay.ticketgenerator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.aniruddhupadhyay.ticketgenerator.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}
