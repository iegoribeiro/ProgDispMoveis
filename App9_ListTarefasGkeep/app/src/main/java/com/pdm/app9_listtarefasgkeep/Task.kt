package com.pdm.app9_listtarefasgkeep

import android.graphics.drawable.Drawable

data class Task(
    var image: Drawable?=null,
    var title: String,
    var content: String,
)