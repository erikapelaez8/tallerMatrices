/*Una compañía tiene N sucursales en todo el país. Se formó una matriz de
N por 12 que contiene las ventas de cada sucursal durante los 12 meses del
año. Elaborar un diagrama de flujo que nos permita hallar e imprimir lo
siguiente:
a) Total de ventas de la compañía
b) Total de ventas por cada sucursal
c) Sucursal que más vendió durante el año
d) Mes que menos vendió la compañía*/

fun main() {
    println("Ingrese el número de sucursales (N)")
    val branches = readLine()!!.toInt()

    val sales = Array(branches) { IntArray(12) }

    // Leer las ventas de cada sucursal para cada mes
    for (i in 0 until branches) {
        println("Ingrese las ventas de la sucursal ${i + 1} para cada mes:")
        for (j in 0 until 12) {
            print("Mes ${j + 1}: ")
            sales[i][j] = readLine()!!.toInt()
        }
    }

    // a) Total de ventas de la compañía
    var totalSales = 0
    for (i in 0 until branches) {
        for (j in 0 until 12) {
            totalSales += sales[i][j]
        }
    }
    println("Total de ventas de la compañía: $totalSales")

    // b) Total de ventas por cada sucursal
    val totalSalesByBranch = IntArray(branches)
    for (i in 0 until branches) {
        var branchSales = 0
        for (j in 0 until 12) {
            branchSales += sales[i][j]
        }
        totalSalesByBranch[i] = branchSales
        println("Total de ventas de la sucursal ${i + 1}: $branchSales")
    }

    // c) Sucursal que más vendió durante el año
    var maxSales = totalSalesByBranch[0]
    var bestBranch = 0
    for (i in 1 until branches) {
        if (totalSalesByBranch[i] > maxSales) {
            maxSales = totalSalesByBranch[i]
            bestBranch = i
        }
    }
    println("La sucursal que más vendió durante el año es la sucursal ${bestBranch + 1} con ventas de $maxSales")

    // d) Mes que menos vendió la compañía
    val totalSalesByMonth = IntArray(12)
    for (j in 0 until 12) {
        var monthSales = 0
        for (i in 0 until branches) {
            monthSales += sales[i][j]
        }
        totalSalesByMonth[j] = monthSales
    }

    var minSales = totalSalesByMonth[0]
    var worstMonth = 0
    for (j in 1 until 12) {
        if (totalSalesByMonth[j] < minSales) {
            minSales = totalSalesByMonth[j]
            worstMonth = j
        }
    }
    println("El mes que menos vendió la compañía es el mes ${worstMonth + 1} con ventas de $minSales")
}