package com.pdm.app8_listpetscomfoto

import android.graphics.drawable.Drawable

data class Pet(
    var foto: Drawable?=null,
    var nome: String,
    var animal: AnimalEnum,
    var color: ColorEnum
)
