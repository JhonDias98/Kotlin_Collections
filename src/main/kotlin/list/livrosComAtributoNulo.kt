package list

fun main() {
    listaDeLivros
        .groupBy { it.editora ?: "Editora desconhecida" } //caso for nulo retorna a String
        .forEach { (editora: String, livros: List<Livro>) ->
            println("$editora: ${livros.joinToString { it.titulo }}")
        }
}