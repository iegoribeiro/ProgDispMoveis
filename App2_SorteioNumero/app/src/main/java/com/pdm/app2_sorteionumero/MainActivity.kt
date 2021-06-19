package com.pdm.app2_sorteionumero

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import java.util.*

class MainActivity : AppCompatActivity() {

    lateinit var botaoSortear: Button
    lateinit var texto: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        texto = findViewById(R.id.txtNumero)
        botaoSortear = findViewById(R.id.btnSortear)
        botaoSortear.setOnClickListener {
            SortearNumero()
        }
    }

    fun SortearNumero(){
        val numeroSorteado = Random().nextInt(11)
        texto.setText("O número é: $numeroSorteado")
    }
}