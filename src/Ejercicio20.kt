/*Generar la siguiente matriz de orden N x N (sólo para valores impares de N
y mayores que 3).*/

fun generarMatriz20(n: Int): Array<IntArray> {
    val matriz = Array(n) { IntArray(n) }

    var valor = 1
    var filaInicio = 0
    var filaFin = n - 1
    var columnaInicio = 0
    var columnaFin = n - 1

    // Llenar la matriz en espiral
    while (filaInicio <= filaFin && columnaInicio <= columnaFin) {
        // Llenar la fila superior (de izquierda a derecha)
        for (i in columnaInicio..columnaFin) {
            matriz[filaInicio][i] = valor++
        }
        filaInicio++

        // Llenar la columna derecha (de arriba a abajo)
        for (i in filaInicio..filaFin) {
            matriz[i][columnaFin] = valor++
        }
        columnaFin--

        // Llenar la fila inferior (de derecha a izquierda)
        if (filaInicio <= filaFin) {
            for (i in columnaFin downTo columnaInicio) {
                matriz[filaFin][i] = valor++
            }
            filaFin--
        }

        // Llenar la columna izquierda (de abajo a arriba)
        if (columnaInicio <= columnaFin) {
            for (i in filaFin downTo filaInicio) {
                matriz[i][columnaInicio] = valor++
            }
            columnaInicio++
        }
    }

    return matriz
}

fun main() {
    println("Ingrese cualquier número impar mayor que 3: ")
    val n = readLine()!!.toInt()
    val matrizResultante = generarMatriz20(n)
    println("Matriz generada para N = $n:")
    imprimirMatriz(matrizResultante)
}

