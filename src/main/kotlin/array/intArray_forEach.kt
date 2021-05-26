package array

fun idades() {
    val idades: IntArray = intArrayOf(25, 19, 33, 20, 55, 40)

    //Verificando a maior idade
    var maiorIdade = Int.MIN_VALUE
    for(idade in idades) { //for normal
        if(idade > maiorIdade) {
            maiorIdade = idade
        }
    }
    println("Maior idade do array: $maiorIdade")

    //Verificando a maior idade
    var menorIdade = Int.MAX_VALUE
    idades.forEach { idade -> //forEach
        if(idade < menorIdade) {
            menorIdade = idade
        }
    }
    println("Menor idade do array: $menorIdade")
}