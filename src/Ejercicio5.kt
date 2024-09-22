/*Considere la siguiente definición: "Una matriz es rala si para cada columna
y para cada fila todos los elementos que almacena son cero (0) excepto un
elemento que es igual a uno (1)". Construya un diagrama de flujo que lea
una matriz de N x M elementos y determine si es rala.*/


fun main() {
    println("Ejercicio 5")

    println("Ingrese el número de filas (N)")
    val rows = readLine()!!.toInt()

    println("Ingrese el número de columnas (M)")
    val columns = readLine()!!.toInt()

    val matrix = Array(rows) { IntArray(columns) }

    // Leer los valores de la matriz
    for (i in 0 until rows) {
        for (j in 0 until columns) {
            println("Ingrese el valor de la matriz en la posición $i,$j")
            matrix[i][j] = readLine()!!.toInt()
        }
    }

    // Verificar si la matriz es rala
    var isSparse = true

    // Verificar filas
    for (i in 0 until rows) {
        var countOnes = 0
        for (j in 0 until columns) {
            if (matrix[i][j] == 1) {
                countOnes++
            } else if (matrix[i][j] != 0) {
                isSparse = false
                break
            }
        }
        if (countOnes != 1) {
            isSparse = false
            break
        }
    }

    // Verificar columnas
    if (isSparse) {
        for (j in 0 until columns) {
            var countOnes = 0
            for (i in 0 until rows) {
                if (matrix[i][j] == 1) {
                    countOnes++
                } else if (matrix[i][j] != 0) {
                    isSparse = false
                    break
                }
            }
            if (countOnes != 1) {
                isSparse = false
                break
            }
        }
    }

    if (isSparse) {
        println("La matriz es rala.")
    } else {
        println("La matriz no es rala.")
    }
}