package br.com.sandroni.collections.list

import br.com.sandroni.classes.Book
import br.com.sandroni.collections.functions.print


fun main() {

    val book1 = Book(
        title = "Grande Sertão: Veredas",
        author = "João Guimarães Rosa",
        publishYear = 1956
    )

    val book2 = Book(
        title = "Minha vida de menina",
        author = "Helena Morley",
        publishYear = 1942,
        publisher = "Editora A"
    )

    val book3 = Book(
        title = "Memórias Póstumas de Brás Cubas",
        author = "Machado de Assis",
        publishYear = 1881
    )

    val book4 = Book(
        title = "Iracema",
        author = "José de Alencar",
        publishYear = 1865,
        publisher = "Editora B"
    )

    val libray = mutableListOf<Book>(book3,book4,book1,book2)
    val orderLibrary = libray.sorted()
    val nullableList = mutableListOf<Book?>(book1,null,book2,null,book3,book4)

    libray.print()
    orderLibrary.print()
    nullableList.print()

    libray.sortedBy { it.title }.print()
    libray.sortedBy { it.author }.print()
    nullableList.sortedBy { it.toString() }.print()

}

