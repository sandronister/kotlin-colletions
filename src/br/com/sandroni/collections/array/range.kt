package br.com.sandroni.collections.array

fun main(){
    val series = 1.rangeTo(10)

    for(s in series){
        println(s)
    }

    val oddNumbers = 0..10 step 2

    for(o in oddNumbers){
        print("$o ->")
    }

    println("-----------------------------------------")

    val evenNumber = 11 downTo 0 step 2

    evenNumber.forEach{ print("$it, ")}

    val inter = 1500.0..15000.00

    val salarie = 11000.00

    println("-------------------------------")

    if(salarie in inter){
        println("Está no range")
    }else{
        println("Não está no range")
    }

    val alfabeto = 'a'..'z'

    println('K' in alfabeto)
}