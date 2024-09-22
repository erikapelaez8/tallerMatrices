/*Lea una matriz de N x M y a continuación:
a) Elimine la fila x (x se debe leer y validar).
b) Elimine la columna y (y se debe leer y validar).
c) Inserte una nueva fila en x (x se debe leer y validar).
d) Inserte una nueva columna en y (y se debe leer y validar).*/

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

    // Crear y leer la matriz de tamaño N x M
    val matriz = Array(n) { IntArray(m) }

    println("Ingresa los elementos de la matriz:")
    for (i in 0 until n) {
        for (j in 0 until m) {
            matriz[i][j] = readLine()!!.toInt()
        }
    }

    // a) Eliminar la fila x
    var x: Int
    do {
        print("Ingresa el número de la fila a eliminar (0 <= x < N): ")
        x = readLine()!!.toInt()
    } while (x < 0 || x >= n)

    val matrizSinFila = matriz.filterIndexed { index, _ -> index != x }.toTypedArray()

    println("Matriz sin la fila $x:")
    for (fila in matrizSinFila) {
        println(fila.joinToString(" "))
    }

    // b) Eliminar la columna y
    var y: Int
    do {
        print("Ingresa el número de la columna a eliminar (0 <= y < M): ")
        y = readLine()!!.toInt()
    } while (y < 0 || y >= m)

    val matrizSinColumna = Array(n) { i ->
        matriz[i].filterIndexed { index, _ -> index != y }.toIntArray()
    }

    println("Matriz sin la columna $y:")
    for (fila in matrizSinColumna) {
        println(fila.joinToString(" "))
    }

    // c) Insertar una nueva fila en la posición x
    do {
        print("Ingresa el número de la fila donde insertar la nueva fila (0 <= x <= N): ")
        x = readLine()!!.toInt()
    } while (x < 0 || x > n)

    // Leer la nueva fila
    val nuevaFila = IntArray(m)
    println("Ingresa los elementos de la nueva fila:")
    for (j in 0 until m) {
        nuevaFila[j] = readLine()!!.toInt()
    }

    val matrizConFilaNueva = matrizSinColumna.toMutableList().apply {
        add(x, nuevaFila)
    }

    println("Matriz con la nueva fila en la posición $x:")
    for (fila in matrizConFilaNueva) {
        println(fila.joinToString(" "))
    }

    // d) Insertar una nueva columna en la posición y
    do {
        print("Ingresa el número de la columna donde insertar la nueva columna (0 <= y <= M): ")
        y = readLine()!!.toInt()
    } while (y < 0 || y > m)

    // Leer la nueva columna
    val nuevaColumna = IntArray(n)
    println("Ingresa los elementos de la nueva columna:")
    for (i in 0 until n) {
        nuevaColumna[i] = readLine()!!.toInt()
    }

    val matrizConColumnaNueva = Array(n) { i ->
        matrizConFilaNueva[i].toMutableList().apply {
            add(y, nuevaColumna[i])
        }.toIntArray()
    }

    println("Matriz con la nueva columna en la posición $y:")
    for (fila in matrizConColumnaNueva) {
        println(fila.joinToString(" "))
    }
}
