/*Generar la siguiente matriz de orden N x N (sólo para valores impares de N
y mayores que 3).*/

fun generarMatriz15(): Array<IntArray> {
    val n = 5
    val matriz = Array(n) { IntArray(n) }

    // Definir los valores a insertar manualmente según el patrón
    val valores = listOf(
        listOf(1, 2, 6, 7, 15),
        listOf(3, 5, 8, 14, 16),
        listOf(4, 9, 13, 17, 22),
        listOf(10, 12, 18, 21, 23),
        listOf(11, 19, 20, 24, 25)
    )

    // Asignar los valores a la matriz
    for (i in 0 until n) {
        for (j in 0 until n) {
            matriz[i][j] = valores[i][j]
        }
    }

    return matriz
}

fun main() {
    val matrizResultante = generarMatriz15()
    println("Matriz generada para N = 5:")
    imprimirMatriz(matrizResultante)
}


