/*Generar la siguiente matriz de orden N x N (sólo para valores impares de N
y mayores que 3).*/

fun generarMatriz14(n: Int): Array<IntArray> {
    val matrix = Array(n) { IntArray(n) }
    var value = 1
    var top = 0
    var bottom = n - 1
    var left = 0
    var right = n - 1

    while (value <= n * n) {
        // Llenar la fila superior de derecha a izquierda
        for (i in right downTo left) {
            matrix[top][i] = value++
        }
        top++

        // Llenar la columna izquierda de arriba hacia abajo
        for (i in top..bottom) {
            matrix[i][left] = value++
        }
        left++

        // Llenar la fila inferior de izquierda a derecha
        for (i in left..right) {
            matrix[bottom][i] = value++
        }
        bottom--

        // empezar en la fila 2 de derecha a izquierda y hacer lo mismo
        for (i in bottom downTo top) {
            matrix[i][right] = value - 1
        }
    }
    return matrix
}

fun main() {
    println("Ingrese un número impar mayor que 3:")
    val n = readLine()!!.toInt()
    val matrix = generarMatriz14(n)
    imprimirMatriz(matrix)
}





