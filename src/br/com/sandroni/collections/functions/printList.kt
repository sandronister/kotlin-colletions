package br.com.sandroni.collections.functions

import br.com.sandroni.classes.Book

fun List<Book?>.print(){
    val formatedList = this
        .filterNotNull()
        .joinToString(separator = "\n") {
        "- ${it.author} --------${it.publishYear}/${it.title}"
    }

    println("-------------- LIST BOOKS -----------------\n$formatedList")
}