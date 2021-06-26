package com.pdm.app6_shortbio

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class EducationActivity : AppCompatActivity() {
    private lateinit var btnHome : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_education)

        btnHome = findViewById(R.id.btnHomeEducation)

        btnHome.setOnClickListener {
            val intent = Intent(this@EducationActivity, MainActivity::class.java)
            startActivity(intent)
        }
    }
}