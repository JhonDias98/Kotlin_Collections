package array

fun funcoesIdade() {
    val idades: IntArray = intArrayOf(10, 12, 18, 33, 40, 67)

    ////A função contentToString converte todos os valores para String
    println("Idades: ${idades.contentToString()}")

    //A função maxOrNull retorna o valor maior ou nulo caso não tenha nenhum valor no array
    println("Maior idade: ${idades.maxOrNull()}")

    //A função maxOrNull retorna o valor menor ou nulo caso não tenha nenhum valor no array
    println("Menor idade: ${idades.minOrNull()}")

    //A função average calcula a média aritmética
    val mediaIdades: Double = idades.average()
    println("Média das idades: $mediaIdades")

    //A função all será verdadeira caso todos os valores do array satisfazem o predicado
    val todosMaiores: Boolean = idades.all { it >= 18 }
    println("Todos são maiores de idade? $todosMaiores")

    //A função any verifica se um dos valores do array está dentro da condição
    val existeMenor: Boolean = idades.any { it < 18 }
    println("Existe algum menor de idade? $existeMenor")

    //A função filter irá filtrar todos os valores que satisfazem o predicado
    val maiores: List<Int> = idades.filter { it >= 18 }
    println("Maiores de idade: $maiores")

    val menores: IntArray = idades.filter { it < 18 }.toIntArray()
    println("Menores de idade: ${menores.contentToString()}")

    //A função contains verifica se o valor existe no arrey
    val contemDez: Boolean = idades.contains(10)
    println("Existe alguem com 10 anos? $contemDez")

    //A função find retorna o primeiro valor que satisfaz o predicado
    val idade: Int? = idades.find { it == 10 }
    println("Idade encontrada: $idade")
}