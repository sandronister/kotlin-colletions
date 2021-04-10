package br.com.sandroni.collections.list

import br.com.sandroni.classes.Book
import br.com.sandroni.collections.functions.print

val libray = mutableListOf<Book>(book3, book4, book2,book1)

fun main() {
    val orderLibrary = libray.sorted()
    val nullableList = mutableListOf<Book?>(book1,null,book2,null,book3,book4)

    libray.print()
    orderLibrary.print()
    nullableList.print()

    libray.sortedBy { it.title }.print()
    libray.sortedBy { it.author }.print()
    nullableList.sortedBy { it.toString() }.print()

}

