package com.example.fragments_trial

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val trans = supportFragmentManager.beginTransaction().apply {
            add(R.id.framelay, StaticBlankFragment1())
            commit()
        }
    }


    }
