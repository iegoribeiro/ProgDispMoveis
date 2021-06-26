package com.pdm.app9_listtarefasgkeep

import android.content.res.Resources
import android.os.Build
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.StaggeredGridLayoutManager

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rv = findViewById<RecyclerView>(R.id.rvTarefas)

        val lista = mutableListOf<Task>(
            Task(title="Finalizar Curso", content="Concluir o curso de Jenkins na plataforma Alura!", image= resources.getDrawable(R.drawable.jenkins, getApplicationContext().getTheme())),
            Task(title="Happy Hour", content="Happy hour 30/06 19h no Outback", image= resources.getDrawable(R.drawable.happy, getApplicationContext().getTheme())),
            Task(title="Exame", content="Exame de sangue dia 28/06 08h, jejum 12h antes", image= resources.getDrawable(R.drawable.exame, getApplicationContext().getTheme())),
            Task(title="Dividendos", content="Data COM ações ITSA4: 01/07", image= resources.getDrawable(R.drawable.cash, getApplicationContext().getTheme())),
            Task(title="Beber Água!", content="Não esquecer de beber água!", image= resources.getDrawable(R.drawable.water, getApplicationContext().getTheme())),
            Task(title="Antibiótico", content="Tomar até 15/07 de 8/8h.", image= resources.getDrawable(R.drawable.remedio, getApplicationContext().getTheme())),
        )

        rv.adapter = TarefaAdapter(lista)

        rv.layoutManager = StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL)
    }
}