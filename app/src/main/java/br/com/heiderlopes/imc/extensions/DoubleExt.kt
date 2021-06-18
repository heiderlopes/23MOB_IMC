package br.com.heiderlopes.imc.extensions

fun Double.format(digitos: Int) = String.format("%.${digitos}f", this)