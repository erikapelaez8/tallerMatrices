/*Generar la siguiente matriz de orden N x N (sólo para valores impares de N
y mayores que 3).*/

fun generarMatriz18(n: Int): Array<IntArray> {
    require(n % 2 == 1 && n > 3) { "N debe ser impar y mayor que 3" }

    val matriz = Array(n) { IntArray(n) }
    var num = n

    // Llenar la primera columna con números incrementales comenzando desde N
    for (i in 0 until n) {
        matriz[i][0] = num++
    }

    // Llenar la diagonal principal con números decrementales comenzando desde N
    num = n
    for (i in 0 until n) {
        matriz[i][i] = num--
    }

    // Llenar las diagonales secundarias con números incrementales
    num = n + 1
    for (d in 1 until n) {
        if (d % 2 == 1) {
            for (i in 0 until n - d) {
                matriz[i + d][i] = num++
            }
        } else {
            for (i in 0 until n - d) {
                matriz[i + d][i] = num + (n - d - 1 - i)
            }
            num += n - d
        }
    }

    return matriz
}



fun main() {
    println("Ingrese cualquier número impar mayor que 3: ")
    val n = readLine()!!.toInt()
    val matrizResultante = generarMatriz18(n)
    println("Matriz generada para N = $n:")
    imprimirMatriz(matrizResultante)
}