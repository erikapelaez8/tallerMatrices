/*Generar la siguiente matriz de orden N x N (sólo para valores impares de N
y mayores que 3).*/

fun generarMatriz12(n: Int): Array<IntArray> {
    require(n % 2 == 1 && n > 3) { "N debe ser impar y mayor que 3" }

    val matriz = Array(n) { IntArray(n) { 4 } }

    // Llenar la primera y última fila con el patrón [4, 1, 1, 1, 4]
    for (j in 1..n-2) {
        matriz[0][j] = 1
        matriz[n-1][j] = 1
    }

    // Llenar la segunda y penúltima fila con el patrón [4, 4, 1, 4, 4]
    if (n > 3) {
        for (j in 1..n-2) {
            matriz[1][j] = if (j == n/2) 1 else 4
            matriz[n-2][j] = if (j == n/2) 1 else 4
        }
    }

    // Si n > 5, llenar las filas intermedias con 4
    for (i in 2..n-3) {
        for (j in 1..n-2) {
            matriz[i][j] = 4
        }
    }

    return matriz
}

fun imprimirMatriz(matriz: Array<IntArray>) {
    for (fila in matriz) {
        println(fila.joinToString(" "))
    }
}

fun main() {
    println("Ingrese un número impar mayor que 3: ")
    val n = readLine()!!.toInt()
    val matrizResultante = generarMatriz12(n)
    println("Matriz generada para N = $n:")
    imprimirMatriz(matrizResultante)
}