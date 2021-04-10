package br.com.sandroni.classes

data class Shelf(
    val genre: String,
    val books: List<Book>
) {

    fun getListOrderByAuthor():List<Book>{
        return this.books.sortedBy { it.author }
    }

    fun getListOrderByTitle():List<Book>{
        return this.books.sortedBy { it.title }
    }
}