/*Leer una matriz C de orden P (matriz cuadrada). Mostrar los elementos de
la diagonal principal, secundaria, de la matriz triangular superior y de la
matriz triangular inferior.*/

fun main() {
    // Leer el tamaño de la matriz cuadrada (P x P)
    print("Ingresa el tamaño de la matriz cuadrada (P): ")
    val p = readLine()!!.toInt()

    // Crear la matriz cuadrada de tamaño P x P
    val matriz = Array(p) { IntArray(p) }

    // Leer los elementos de la matriz
    println("Ingresa los elementos de la matriz:")
    for (i in 0 until p) {
        for (j in 0 until p) {
            matriz[i][j] = readLine()!!.toInt()
        }
    }

    // Mostrar la diagonal principal
    println("Diagonal Principal:")
    for (i in 0 until p) {
        print("${matriz[i][i]} ")
    }
    println()

    // Mostrar la diagonal secundaria
    println("Diagonal Secundaria:")
    for (i in 0 until p) {
        print("${matriz[i][p - i - 1]} ")
    }
    println()

    // Mostrar la matriz triangular superior
    println("Matriz Triangular Superior:")
    for (i in 0 until p) {
        for (j in 0 until p) {
            if (i <= j) {
                print("${matriz[i][j]} ")
            } else {
                print("  ") // Espacio para mantener el formato
            }
        }
        println()
    }

    // Mostrar la matriz triangular inferior
    println("Matriz Triangular Inferior:")
    for (i in 0 until p) {
        for (j in 0 until p) {
            if (i >= j) {
                print("${matriz[i][j]} ")
            } else {
                print("  ") // Espacio para mantener el formato
            }
        }
        println()
    }
}

