/*Generar la siguiente matriz de orden N x N (sólo para valores impares de N
y mayores que 3).*/

fun generarMatriz17(n: Int): Array<IntArray> {
    require(n % 2 == 1 && n > 3) { "N debe ser impar y mayor que 3" }

    val matriz = Array(n) { IntArray(n) }

    // Llenar la primera y última fila con unos
    for (j in 0 until n) {
        matriz[0][j] = 1
        matriz[n-1][j] = 1
    }

    // Llenar la diagonal secundaria con unos
    for (i in 0 until n) {
        matriz[i][n-i-1] = 1
    }

    // Llenar la diagonal principal con unos y ceros alternados
    for (i in 0 until n) {
        matriz[i][i] = if (i % 2 == 0) 1 else 0
    }

    return matriz
}


fun main() {
    println("Ingrese cualquier número impar mayor que 3: ")
    val n = readLine()!!.toInt()
    val matrizResultante = generarMatriz17(n)
    println("Matriz generada para N = $n:")
    imprimirMatriz(matrizResultante)
}