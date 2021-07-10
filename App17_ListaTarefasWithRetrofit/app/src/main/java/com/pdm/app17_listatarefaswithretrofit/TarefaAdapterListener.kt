package com.pdm.app17_listatarefaswithretrofit

import com.pdm.app17_listatarefaswithretrofit.data.model.Tarefa

interface TarefaAdapterListener {
    fun excluirTarefa(tarefa: Tarefa)
}