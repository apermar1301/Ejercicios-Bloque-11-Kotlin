package com.github.apermar1301.Ejercicio1

private class PhysicsConstants {
    companion object {
        const val C = 299_792_458
        const val H = 6.62607015e-34
        const val G = 6.67430e-11
    }
}

fun main() {
    println("La velocidad de la luz en el vacío (c): ${PhysicsConstants.C}")
    println("La constante de Planck (h): ${PhysicsConstants.H}")
    println("La constante de gravitación universal (G): ${PhysicsConstants.G}")
}