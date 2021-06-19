package com.pdm.app4_alcoolgasolina

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    lateinit var botaoCalcular: Button
    lateinit var resultadoCombustivel: TextView
    private var precoEtanol: Double = 0.0;
    private var precoGasolina: Double = 0.0;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        resultadoCombustivel = findViewById(R.id.textResultado)
        botaoCalcular = findViewById(R.id.btnCalc)

        botaoCalcular.setOnClickListener {
            val precoEtanolNullable = findViewById<EditText>(R.id.editEtanol).text.toString().toDoubleOrNull()
            val precoGasolinaNullable = findViewById<EditText>(R.id.editGasolina).text.toString().toDoubleOrNull()

            if (precoEtanolNullable == null || precoEtanolNullable < 1 || precoGasolinaNullable == null || precoGasolinaNullable < 1) {
                resultadoCombustivel.text = "Valores inválidos"
            } else {
                precoEtanol = precoEtanolNullable
                precoGasolina = precoGasolinaNullable
                calcular()
            }
        }
    }

    private fun calcular (){
        if (precoEtanol / precoGasolina >= 0.7) {
            resultadoCombustivel.text = "Melhor abastecer com os dinossauros!"
        } else {
            resultadoCombustivel.text = "51 é uma boa ideia!"
        }
    }
}