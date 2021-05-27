package set

//Set: ignora valores repetidos, ou seja, vai conter valores unicos
fun main() {
    val assistiramCursoAndroid: Set<String> = setOf("Alex", "Fran", "Gui", "Maria")
    val assistiramCursoKotlin: Set<String> = setOf("Alex", "Paulo", "Maria")
//    val assistiramAmbos: Set<String> = assistiramCursoAndroid + assistiramCursoKotlin
    val assistiramAmbos = mutableSetOf<String>()
    assistiramAmbos.addAll(assistiramCursoAndroid)
    assistiramAmbos.addAll(assistiramCursoKotlin)
    assistiramAmbos.add("Ana")
    assistiramAmbos.add("Ana")
    println(assistiramAmbos)

    println("Usando UNION")
    println(assistiramCursoKotlin + assistiramCursoAndroid)
    //Uniom: devolve um novo Set com a soma dos elementos dos conjuntos
    println(assistiramCursoKotlin union assistiramCursoAndroid)
    println()

    println("Usando SUBTRACT")
    println(assistiramCursoAndroid - assistiramCursoKotlin)
    //Subtract: devolve um novo Set subtraindo os elementos contidos no segundo conjunto
    println(assistiramCursoAndroid subtract assistiramCursoKotlin)
    println()

    println("Usando INTERSECT")
    //Intersect: devolve um novo Set apenas com os elementos contidos em ambos os conjuntos
    println(assistiramCursoAndroid intersect assistiramCursoKotlin)
    println()

    val assistiramList = assistiramAmbos.toMutableList() //Converte para uma lista mutavel
    assistiramList.add("Alex") //Adicionando o Alex na lista
    println(assistiramList) //Sendo assim vai existir 2 Alex
    println(assistiramList.toSet()) //Com o toSet vai retorna a lista com os valores unicos
}