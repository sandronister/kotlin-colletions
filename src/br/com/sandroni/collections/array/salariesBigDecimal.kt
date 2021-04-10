package br.com.sandroni.collections.array

import java.math.BigDecimal
import java.math.RoundingMode

fun main() {
    val salaries = bigDecimalArrayof("4500.0", "3000.0", "9700.0", "11500.0", "8600.0")

    val improve = "1.1".toBigDecimal()

    val improveSalaries = salaries.map { it ->
        improveSalaries(it, improve)
    }.toTypedArray()

    println(improveSalaries.contentToString())

    val totalSalaries = improveSalaries.sum()

    val period = 6.toBigDecimal()

    val totalGastos = improveSalaries
        .fold(totalSalaries){acc, salarie ->
            acc+(salarie*period).setScale(2,RoundingMode.UP) }

    val media = improveSalaries
                    .sorted()
                    .takeLast(3)
                    .toTypedArray()
                    .average()

    println("Salaries Total $totalSalaries")
    println("Total 6 Month $totalGastos")
    println("Avg 3 Major Salaries $media")
}

private fun improveSalaries(it: BigDecimal, improve: BigDecimal) =
    if (it < "5000.0".toBigDecimal()) {
        it + "500.0".toBigDecimal()
    } else {
        (it * improve).setScale(2, RoundingMode.UP)
    }

fun bigDecimalArrayof(vararg values:String):Array<BigDecimal>{
    return Array<BigDecimal>(values.size){i->
        values[i].toBigDecimal()
    }
}

fun Array<BigDecimal>.sum():BigDecimal{
    return  this.reduce { acc, bigDecimal ->  acc+bigDecimal}
}

fun Array<BigDecimal>.average():BigDecimal{
    return if(this.isEmpty()){
        BigDecimal.ZERO
    }else {
        this.sum() / this.size.toBigDecimal()
    }
}