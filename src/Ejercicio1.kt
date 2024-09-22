/*Leer una matriz A de orden M x N y un número K. Multiplicar todos los
elementos de la matriz por el número K. Mostrar la matriz resultante.*/

fun main() {
    // Leer las dimensiones de la matriz MxN
    print("Ingresa el número de filas (M): ")
    val m = readLine()!!.toInt()
    print("Ingresa el número de columnas (N): ")
    val n = readLine()!!.toInt()

    // Crear la matriz de tamaño MxN
    val matriz = Array(m) { IntArray(n) }

    // Leer los elementos de la matriz
    println("Ingresa los elementos de la matriz:")
    for (i in 0 until m) {
        for (j in 0 until n) {
            matriz[i][j] = readLine()!!.toInt()
        }
    }

    // Leer el número K
    print("Ingresa el número K: ")
    val k = readLine()!!.toInt()

    // Multiplicar cada elemento de la matriz por K
    val matrizResultado = Array(m) { IntArray(n) }
    for (i in 0 until m) {
        for (j in 0 until n) {
            matrizResultado[i][j] = matriz[i][j] * k
        }
    }

    // Mostrar la matriz resultante
    println("Matriz resultante:")
    for (i in 0 until m) {
        for (j in 0 until n) {
            print("${matrizResultado[i][j]} ")
        }
        println()
    }
}