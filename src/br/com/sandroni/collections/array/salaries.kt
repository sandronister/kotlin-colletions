package br.com.sandroni.collections.array

fun main(){
    val salaries:DoubleArray = doubleArrayOf(3500.0, 8400.0, 7500.0, 8900.0, 11500.0)

    val improve = 0.1

    for(inx in salaries.indices){
        salaries[inx]+= salaries[inx]*improve
    }

    println(salaries.contentToString())

    salaries.forEachIndexed{ inx,sal ->
        salaries[inx]+=sal*improve
    }

    println(salaries.contentToString())
}