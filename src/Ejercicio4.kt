/*Lea N x M números (N y M deben ser leídos y validados) y almacénelos en
una matriz (por filas), y:
a) Señale si la matriz es cuadrada
b) Determine y muestre el promedio de los N x M números
c) Determine y muestre el promedio por fila
d) Determine y muestre el promedio por columna*/

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

    // Crear la matriz de tamaño N x M
    val matriz = Array(n) { IntArray(m) }

    // Leer los elementos de la matriz
    println("Ingresa los elementos de la matriz:")
    var sumaTotal = 0
    for (i in 0 until n) {
        for (j in 0 until m) {
            matriz[i][j] = readLine()!!.toInt()
            sumaTotal += matriz[i][j]
        }
    }

    // a) Señalar si la matriz es cuadrada
    if (n == m) {
        println("La matriz es cuadrada.")
    } else {
        println("La matriz NO es cuadrada.")
    }

    // b) Determinar y mostrar el promedio de todos los elementos
    val totalElementos = n * m
    val promedioTotal = sumaTotal.toDouble() / totalElementos
    println("El promedio de todos los elementos es: $promedioTotal")

    // c) Determinar y mostrar el promedio por fila
    println("Promedio por fila:")
    for (i in 0 until n) {
        val sumaFila = matriz[i].sum()
        val promedioFila = sumaFila.toDouble() / m
        println("Fila ${i + 1}: $promedioFila")
    }

    // d) Determinar y mostrar el promedio por columna
    println("Promedio por columna:")
    for (j in 0 until m) {
        var sumaColumna = 0
        for (i in 0 until n) {
            sumaColumna += matriz[i][j]
        }
        val promedioColumna = sumaColumna.toDouble() / n
        println("Columna ${j + 1}: $promedioColumna")
    }
}
