package list

data class Prateleira (
    val genero: String,
    val livros: List<Livro>
) {
    fun organizarPorAutor(): List<Livro> {
        return livros.sortedBy { it.autor }
    }

    fun organizarPorAnoPublicacao(): List<Livro> {
        return livros.sortedBy { it.anoPublicacao }
    }

    //Usar sortedBy com List e SortBy para MutableList
    /*
    A função sortBy reorganiza os elementos da coleção que a invocou de acordo com um critério,
    enquanto a função sortedBy cria uma nova coleção ordenada de acordo com um critério,
    poupando a lista original
     */
}