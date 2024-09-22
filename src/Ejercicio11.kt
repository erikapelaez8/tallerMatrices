/*Diseñar un programa que lea información referente a las horas trabajadas
en cada día de la semana por los empleados de la empresa "La Huelga
S.A.", y las almacene en una matriz. Por cada empleado se tienen los
siguientes datos: Código del empleado(entero en el rango [1..100]), Horas
trabajadas en horario normal, Horas trabajadas en sobre tiempo. La
empresa paga un sueldo de $ 2.350 bruto por hora normal y $ 3.500 por
hora de sobre tiempo. Emitir un informe en el cual por cada empleado se
imprima: código del empleado, cantidad de horas normales trabajadas, $
por horas normales, cantidad de horas de sobre*/

fun main() {
    // Definir constantes para las tarifas por hora
    val tarifaNormal = 2350
    val tarifaSobreTiempo = 3500

    // Leer el número de empleados
    var numEmpleados: Int
    do {
        print("Ingresa el número de empleados (1-100): ")
        numEmpleados = readLine()!!.toInt()
    } while (numEmpleados < 1 || numEmpleados > 100)

    // Inicializar la matriz para almacenar horas trabajadas
    val horasTrabajadas = Array(numEmpleados) { IntArray(2) } // [0] = horas normales, [1] = horas sobre tiempo

    // Leer la información de cada empleado
    for (i in 0 until numEmpleados) {
        print("Código del empleado (1-100): ")
        val codigoEmpleado = readLine()!!.toInt()

        print("Horas trabajadas en horario normal: ")
        horasTrabajadas[i][0] = readLine()!!.toInt()

        print("Horas trabajadas en sobre tiempo: ")
        horasTrabajadas[i][1] = readLine()!!.toInt()

        println("Empleado $codigoEmpleado registrado.")
    }

    // Generar el informe
    println("\nInforme de empleados:\n")
    println("Código\tHoras Normales\t$ Normal\tHoras Sobretime\t$ Sobretime")

    for (i in 0 until numEmpleados) {
        val horasNormales = horasTrabajadas[i][0]
        val horasSobreTiempo = horasTrabajadas[i][1]
        val pagoNormal = horasNormales * tarifaNormal
        val pagoSobreTiempo = horasSobreTiempo * tarifaSobreTiempo

        println("${i + 1}\t\t\t$horasNormales\t\t\t$pagoNormal\t\t\t\t$horasSobreTiempo\t\t\t$pagoSobreTiempo")
    }
}
