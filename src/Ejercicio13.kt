/*Generar la siguiente matriz de orden N x N (sólo para valores impares de N
y mayores que 3).*/

fun generarMatriz13(n: Int): Array<IntArray> {
    require(n % 2 == 1 && n > 3) { "N debe ser impar y mayor que 3" }

    val matriz = Array(n) { IntArray(n) }

    // Llenar toda la matriz con ceros
    for (i in 0 until n) {
        for (j in 0 until n) {
            matriz[i][j] = 0
        }
    }

    // Llenar los bordes con unos
    for (i in 0 until n) {
        matriz[0][i] = 1  // Primera fila
        matriz[n-1][i] = 1  // Última fila
        matriz[i][0] = 1  // Primera columna
        matriz[i][n-1] = 1  // Última columna
    }

    return matriz
}


fun main() {
    println("Ingrese cualquier número impar mayor que 3: ")
    val n = readLine()!!.toInt()
    val matrizResultante = generarMatriz13(n)
    println("Matriz generada para N = $n:")
    imprimirMatriz(matrizResultante)
}