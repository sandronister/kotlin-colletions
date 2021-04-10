package br.com.sandroni.collections.list

fun main() {

    libray
        .groupBy { it.publisher ?: "Editora Desconhecida"}
        .forEach { (publisher, books) ->
            println(" $publisher: ${books.joinToString { it.title}}")
        }

}