package map

//Map: conjunto de chaves únicas com valores
fun main() {
    //Criando um map e inserindo dados
    val pedidos: MutableMap<Int, Double> = mutableMapOf( //Map com a chave do tipo Int e valor do tipo Double
        Pair(1, 20.0), //Pair: pega o par dos argumentos(chave e valor)
        Pair(2, 34.0),
        //Infix: tem problemas de perfomance com muitos valores, nesse caso é recomendado usar o Pair
        3 to 50.0 //Usando o infix/'to' faz a mesma coisa do Pair, porém simplificado
    )
    println("$pedidos \n")

    //Verificando uma posição específica
    val pedido = pedidos[3] //entre os colchetes é passado a chave que queremos
    pedido?.let {
        println("pedido $it \n") //e com isso podemos ver seu valor
    }

    //Percorrendo o map
    for (p: Map.Entry<Int, Double> in pedidos){
        println("número do pedido: ${p.key}")
        println("valor do pedido: ${p.value}")
    }
    println()

    //Como o map é do tipo MutableMap, podemos moficar ela
    pedidos[4] = 70.0 //Podemos atribuir o valor direto, caso não exista a chave, será criada
    println(pedidos)

    pedidos.put(5, 80.0) //Outra forma de alterar/adicionar é usando o 'put'
    println(pedidos)

    pedidos.putIfAbsent(6, 200.0) //Com o 'putIfAbsent' só adiciona o pedido caso o mesmo não existir
    println(pedidos)

    pedidos.putIfAbsent(6, 300.0) //Como acima já foi adicionado a chave 6, o valor vai continuar como 200.0
    println(pedidos)

    pedidos.remove(6) //com o 'remove' podemos remover o pedido de acordo com sua chave
    println(pedidos)

    pedidos.remove(3, 50.0) //Podemos remover passando a chave e seu valor, caso ambos bater com os dados existente
    println(pedidos)
}