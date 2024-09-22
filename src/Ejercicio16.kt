/*Generar la siguiente matriz de orden N x N (sólo para valores impares de N
y mayores que 3).*/

fun generarMatriz16(n: Int): Array<IntArray> {
    require(n % 2 == 1 && n > 3) { "N debe ser impar y mayor que 3" }

    val matriz = Array(n) { IntArray(n) }
    var num = 1

    // Llenar la diagonal principal
    for (i in 0 until n) {
        matriz[i][i] = num++
    }

    // Llenar las diagonales secundarias
    for (d in 1 until n) {
        for (i in 0 until n - d) {
            matriz[i][i + d] = num++
        }
    }

    return matriz
}


fun main() {
    println("Ingrese cualquier número impar mayor que 3: ")
    val n = readLine()!!.toInt()
    val matrizResultante = generarMatriz16(n)
    println("Matriz generada para N = $n:")
    imprimirMatriz(matrizResultante)
}