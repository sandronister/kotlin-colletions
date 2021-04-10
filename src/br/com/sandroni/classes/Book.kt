package br.com.sandroni.classes

data class Book(
    val title: String,
    val author: String,
    val publishYear: Long,
    val publisher: String? = null
):Comparable<Book>{

    override fun compareTo(other: Book): Int {
        return this.publishYear.compareTo(other.publishYear)
    }

}