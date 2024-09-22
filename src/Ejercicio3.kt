/*Leer una matriz X de orden A x B y hallar su transpuesta. Mostrar ambas
matrices.*/

fun main() {
    // Leer las dimensiones de la matriz A x B
    print("Ingresa el número de filas (A): ")
    val a = readLine()!!.toInt()
    print("Ingresa el número de columnas (B): ")
    val b = readLine()!!.toInt()

    // Crear la matriz de tamaño A x B
    val matriz = Array(a) { IntArray(b) }

    // Leer los elementos de la matriz
    println("Ingresa los elementos de la matriz:")
    for (i in 0 until a) {
        for (j in 0 until b) {
            matriz[i][j] = readLine()!!.toInt()
        }
    }

    // Calcular la transpuesta de la matriz
    val transpuesta = Array(b) { IntArray(a) }
    for (i in 0 until a) {
        for (j in 0 until b) {
            transpuesta[j][i] = matriz[i][j]
        }
    }

    // Mostrar la matriz original
    println("Matriz Original:")
    for (i in 0 until a) {
        for (j in 0 until b) {
            print("${matriz[i][j]} ")
        }
        println()
    }

    // Mostrar la matriz transpuesta
    println("Matriz Transpuesta:")
    for (i in 0 until b) {
        for (j in 0 until a) {
            print("${transpuesta[i][j]} ")
        }
        println()
    }
}
