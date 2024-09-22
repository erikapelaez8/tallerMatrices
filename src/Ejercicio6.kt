/*Lea dos matrices de orden N x M y
a) genere una tercera con la suma de ambas
b) genere una tercera con la multiplicación de ambas, si es posible.
Para cada caso anterior, muestre la matriz resultante.*/

fun main() {
    // Leer y validar las dimensiones N y M
    var n: Int
    var m: Int
    do {
        print("Ingresa el número de filas (N > 0): ")
        n = readLine()!!.toInt()
    } while (n <= 0)

    do {
        print("Ingresa el número de columnas (M > 0): ")
        m = readLine()!!.toInt()
    } while (m <= 0)

    // Crear y leer las dos matrices A y B de tamaño N x M
    val matrizA = Array(n) { IntArray(m) }
    val matrizB = Array(n) { IntArray(m) }

    println("Ingresa los elementos de la matriz A:")
    for (i in 0 until n) {
        for (j in 0 until m) {
            matrizA[i][j] = readLine()!!.toInt()
        }
    }

    println("Ingresa los elementos de la matriz B:")
    for (i in 0 until n) {
        for (j in 0 until m) {
            matrizB[i][j] = readLine()!!.toInt()
        }
    }

    // a) Generar la matriz suma
    val matrizSuma = Array(n) { IntArray(m) }
    for (i in 0 until n) {
        for (j in 0 until m) {
            matrizSuma[i][j] = matrizA[i][j] + matrizB[i][j]
        }
    }

    // Mostrar la matriz suma
    println("Matriz Suma (A + B):")
    for (i in 0 until n) {
        for (j in 0 until m) {
            print("${matrizSuma[i][j]} ")
        }
        println()
    }

    // b) Generar la matriz multiplicación elemento a elemento (si es posible)
    val matrizMultiplicacion = Array(n) { IntArray(m) }
    for (i in 0 until n) {
        for (j in 0 until m) {
            matrizMultiplicacion[i][j] = matrizA[i][j] * matrizB[i][j]
        }
    }

    // Mostrar la matriz multiplicación
    println("Matriz Multiplicación elemento a elemento (A * B):")
    for (i in 0 until n) {
        for (j in 0 until m) {
            print("${matrizMultiplicacion[i][j]} ")
        }
        println()
    }
}
