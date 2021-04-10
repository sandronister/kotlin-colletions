package br.com.sandroni.collections.array

fun main(){
    val years = intArrayOf(5,15,90,34,25)

    var maxYear = Int.MIN_VALUE
    var minYear = Int.MAX_VALUE

    for(item in years){
        if(item > maxYear){
            maxYear=item
        }
    }

    years.forEach { it ->
        if(it < minYear){
            minYear = it
        }
    }

    println("Max Year $maxYear")
    println("Min Year $minYear")
}