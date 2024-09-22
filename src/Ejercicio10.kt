/*En una matriz C de M x 6 se encuentran almacenadas las calificaciones de 6
materias de un grupo de M estudiantes. Elaborar un diagrama de flujo que
nos permita calcular e imprimir los siguiente:
a) La nota promedio de cada estudiante
b) El número de estudiantes que aprobaron cada materia
c) El número de estudiantes que reprobaron cada materia
d) La nota promedio de cada materia*/

fun main() {
    println("Ingrese el número de estudiantes (M)")
    val students = readLine()!!.toInt()
    val subjects = 6

    val grades = Array(students) { IntArray(subjects) }

    // Leer las calificaciones de cada estudiante para cada materia
    for (i in 0 until students) {
        println("Ingrese las calificaciones del estudiante ${i + 1} para cada materia:")
        for (j in 0 until subjects) {
            print("Materia ${j + 1}: ")
            grades[i][j] = readLine()!!.toInt()
        }
    }

    // a) La nota promedio de cada estudiante
    val averageGradesByStudent = DoubleArray(students)
    for (i in 0 until students) {
        var sum = 0
        for (j in 0 until subjects) {
            sum += grades[i][j]
        }
        averageGradesByStudent[i] = sum.toDouble() / subjects
        println("Nota promedio del estudiante ${i + 1}: ${averageGradesByStudent[i]}")
    }

    // b) El número de estudiantes que aprobaron cada materia
    val passingGradesBySubject = IntArray(subjects)
    // c) El número de estudiantes que reprobaron cada materia
    val failingGradesBySubject = IntArray(subjects)
    for (j in 0 until subjects) {
        for (i in 0 until students) {
            if (grades[i][j] >= 60) { // Asumiendo que 60 es la nota mínima para aprobar
                passingGradesBySubject[j]++
            } else {
                failingGradesBySubject[j]++
            }
        }
        println("Número de estudiantes que aprobaron la materia ${j + 1}: ${passingGradesBySubject[j]}")
        println("Número de estudiantes que reprobaron la materia ${j + 1}: ${failingGradesBySubject[j]}")
    }

    // d) La nota promedio de cada materia
    val averageGradesBySubject = DoubleArray(subjects)
    for (j in 0 until subjects) {
        var sum = 0
        for (i in 0 until students) {
            sum += grades[i][j]
        }
        averageGradesBySubject[j] = sum.toDouble() / students
        println("Nota promedio de la materia ${j + 1}: ${averageGradesBySubject[j]}")
    }
}