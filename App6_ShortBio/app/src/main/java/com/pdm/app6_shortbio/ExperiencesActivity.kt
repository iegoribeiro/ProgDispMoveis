package com.pdm.app6_shortbio

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class ExperiencesActivity : AppCompatActivity() {
    private lateinit var btnHome : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_expiriences)

        btnHome = findViewById(R.id.btnHomeExperiences)

        btnHome.setOnClickListener {
            val intent = Intent(this@ExperiencesActivity, MainActivity::class.java)
            startActivity(intent)
        }
    }
}