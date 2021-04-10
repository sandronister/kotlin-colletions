package br.com.sandroni.collections.list

import br.com.sandroni.classes.Shelf
import br.com.sandroni.collections.functions.print

fun main() {

    val shelf = Shelf("Literarura", libray)

    val l1 = shelf.getListOrderByAuthor()
    val l2 = shelf.getListOrderByTitle()

    l1.print()
    l2.print()

}