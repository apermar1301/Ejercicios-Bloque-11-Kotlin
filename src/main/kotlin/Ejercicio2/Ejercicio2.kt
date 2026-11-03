package com.github.apermar1301.Ejercicio2

fun String.reverseWords(): String {

    val reversedWord: StringBuilder = StringBuilder()

    for (word in this.split("")) reversedWord.append(word.reversed())

    return reversedWord.toString()

}

fun main() {
    println("hola".reverseWords())
}