package br.com.sandroni.collections.array

fun main() {
    val years = intArrayOf(10, 15, 18, 32, 64)

    val majorYear = years.maxOrNull()
    val minYear = years.minOrNull()
    val majorEighteen = years.all { it >= 18 }
    val anyEighteen = years.any{it >=18}
    val average = years.average()
    val filter = years.filter { it < 18 }
    val find = years.find { it ==18 }

    println("Major: $majorYear")
    println("Minor: $minYear")
    println("Major Eighteen $majorEighteen")
    println("Any Eighteen $anyEighteen")
    println("Average $average")
    println("Filter $filter")
    println("Find $find")
}


