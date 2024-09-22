/*Leer los elementos de una matriz de N x N y reemplazar todos los números
negativos por un cero y los positivos por un nueve. Mostrar la matriz
original y la matriz cambiada. (NO USAR MATRICES NI VECTORES
AUXILIARES).*/

fun main() {
    // Leer y validar la dimensión N (para matriz N x N)
    var n: Int
    do {
        print("Ingresa el tamaño de la matriz (N > 0): ")
        n = readLine()!!.toInt()
    } while (n <= 0)

    // Crear la matriz de tamaño N x N
    val matriz = Array(n) { IntArray(n) }

    // Leer los elementos de la matriz
    println("Ingresa los elementos de la matriz:")
    for (i in 0 until n) {
        for (j in 0 until n) {
            matriz[i][j] = readLine()!!.toInt()
        }
    }

    // Mostrar la matriz original
    println("Matriz original:")
    for (i in 0 until n) {
        for (j in 0 until n) {
            print("${matriz[i][j]} ")
        }
        println()
    }

    // Reemplazar números negativos por 0 y positivos por 9 (in-place)
    for (i in 0 until n) {
        for (j in 0 until n) {
            if (matriz[i][j] < 0) {
                matriz[i][j] = 0
            } else if (matriz[i][j] > 0) {
                matriz[i][j] = 9
            }
        }
    }

    // Mostrar la matriz cambiada
    println("Matriz cambiada:")
    for (i in 0 until n) {
        for (j in 0 until n) {
            print("${matriz[i][j]} ")
        }
        println()
    }
}
