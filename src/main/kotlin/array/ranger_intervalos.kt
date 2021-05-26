package array

fun ranger() {
    //Gera uma serie de numeros, nesse caso de 1 a 100
    val serie: IntRange = 1..10
    for (i in serie) {
        print("$i ")
    }
    println()

    for (i in 1..100) {
        if(i % 2 == 0) {
            print("$i ")
        }
    }
    println()

    val numerosPares: IntProgression = 2..100 step 2
    numerosPares.forEach { print("$it ") }
    println()

    val numerosParesReverso: IntProgression = 100 downTo 2 step 2
    numerosParesReverso.forEach { print("$it ") }
    println()

    val salarios: DoubleArray = doubleArrayOf(1500.55, 9100.0, 2990.99, 8500.0, 10000.0)

    val base = 1500.0
    val topo = 4000.0
    var contador = 0
    for (salario in salarios) {
        if(salario in base..topo) {
            println("Salario: $salario está fora do intervalo")
            contador++
        }
    }
    println()

    //Seria de caracteres, a até z
    val alfabeto: CharRange = 'a'..'z'

    alfabeto.forEach { print("$it ") }
    println()

    if('k' in alfabeto) {
        println("O caractere 'k' está contido em $alfabeto")
    }
}