package br.com.renan.calculadoraflex.extensions

fun Double.format(digits: Int) = java.lang.String.format("%.${digits}f", this)