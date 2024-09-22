/*Generar la siguiente matriz de orden N x N (sólo para valores impares de N
y mayores que 3).*/

fun generarMatriz19(n: Int): Array<IntArray> {
    require(n % 2 == 1 && n > 3) { "N debe ser impar y mayor que 3" }

    val matriz = Array(n) { IntArray(n) }
    var num = n * n

    // Llenar la primera columna con números decrementales comenzando desde N*N
    for (i in 0 until n) {
        matriz[i][0] = num--
    }

    // Llenar la ultima fila con números decrementales comenzando desde N*N - N + 1
    for (i in 1 until n) {
        matriz[n-1][i] = num--
    }

    // Llenar la ultima columna con números decrementales comenzando desde N*N - 2*N + 2
    for (i in n-2 downTo 0) {
        matriz[i][n-1] = num--
    }

    // Llenar la primera fila con números decrementales comenzando desde N*N - 3*N + 3
    for (i in n-2 downTo 1) {
        matriz[0][i] = num--
    }

    // Llenar el centro de la matriz con números por ejemnplo columna 2 es 9,8,7
    for (i in 1 until n-1) {
        for (j in 1 until n-1) {
            matriz[j][i] = num--
        }
    }

    //  llenar la columna 4 es 3,4,5 en el cetro de la matriz
    for (i in 1 until n-1) {
        matriz[i][n-2] = num + 2 + i
    }

    // llenar la fila 4 es 7,6,5 en el centro de la matriz
    for (i in 1 until n-1) {
        matriz[n-2][i] = num + 3 + n - i
    }

    // llenar la columna 3 es 2,1 en el centro de la matriz
    for (i in 1 until n-2) {
        matriz[i][n-3] = num + 3 - i
    }

    return matriz
}


fun main() {
    println("Ingrese cualquier número impar mayor que 3: ")
    val n = readLine()!!.toInt()
    val matrizResultante = generarMatriz19(n)
    println("Matriz generada para N = $n:")
    imprimirMatriz(matrizResultante)
}