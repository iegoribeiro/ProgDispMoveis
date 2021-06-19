package com.pdm.app3_tabuada

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity () {

    lateinit var resultadoTabuada: TextView
    lateinit var botaoCalcular: Button
    var numeroTabuada: Int? = null

    override fun onCreate ( savedInstanceState : Bundle? ) {
        super .onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        resultadoTabuada = findViewById(R.id.txtResultado)
        botaoCalcular = findViewById(R.id.btnCalc)
        botaoCalcular.setOnClickListener {
            numeroTabuada = findViewById<EditText>(R.id.txtNumero).text.toString().toIntOrNull()
            CalcularTabuada()
        }
    }

    fun CalcularTabuada (){
        var resultado = ""

        numeroTabuada?.let{
            for (i in 1..10) {
                val calculo = it * i
                resultado += "$numeroTabuada X $i = $calculo \n"
            }
        }

        resultadoTabuada.text = resultado
    }
}
