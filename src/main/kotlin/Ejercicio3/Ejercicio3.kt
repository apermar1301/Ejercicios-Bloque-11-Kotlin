package com.github.apermar1301.Ejercicio3


val String.vowelCount: Int
    get() = this.count { letter -> letter in "aeiouáéíóúAEIOU" }


fun main() {
    println("Hello World".vowelCount)
}

