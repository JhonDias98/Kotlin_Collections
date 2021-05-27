package map

fun main() {
    val pedidos: MutableMap<Int, Double> = mutableMapOf(
        Pair(1, 20.0),
        Pair(2, 64.0),
        3 to 50.0,
        4 to 100.0,
        5 to 100.0,
        6 to 80.0
    )

    //get(chave): retorna o valor correspondente a chave, caso não exista retorna null
    val valorPedido = pedidos.getValue(5)

    //getValue(): retorna o valor correspondente a chave, caso não exista retorna uma exception
    val valorPedido1 = pedidos.getValue(5)

    //getOrElse(chave){caso não achar, executa o bloco entre as chaves}
    val mensagem: Double? = pedidos.getOrElse(0) {
        0.0
    }
    println(mensagem)

    //getOrDefault procura a chave do seu primeiro argumento, caso não achar, retorna o valor padrão que definimos no segundo
    println(pedidos.getOrDefault(1, -1.0))
    println(pedidos.getOrDefault(0, -1.0))

    //Retorna todas as chaves do map
    println(pedidos.keys)
    //Percorre as chaves do map
    for (numero in pedidos.keys){
        println("Pedido $numero")
    }

    //Retorna todos os valores do map
    println(pedidos.values)
    //Percorre os valores do map
    for (valor in pedidos.values){
        println("Valor do pedido: $valor")
    }

    //Para usar o filter é preciso passar tanto a chave como o valor
    val pedidosFiltrados = pedidos.filter { (numero, valor) ->
        numero % 2 == 0 && valor > 70.0 //retorna pedidos onde sua chave é par e seu valor acima de 70
    }
    println(pedidosFiltrados)

    //filterValues: filtra pelo valor
    val pedidosAcima = pedidos.filterValues { valor ->
        valor > 70.0 //retorna pedidos com o valor acima de 70
    }
    println(pedidosAcima)

    //filterKeys: filtra pela chave
    val pedidosPares = pedidos.filterKeys { numero ->
        numero % 2 == 0 //retorna pedidos onde sua chave é par
    }
    println(pedidosPares)

    //Duas formar de somar maps, os dados do 'pedidos' não é alterado, apenas se atribuir a um novo map
    println(pedidos + Pair(7, 50.0))
    println(pedidos + mapOf(8 to 90.0, 9 to 20.0))
    println(pedidos)

    //Duas formar de subtrair maps pela chave, os dados do 'pedidos' não é alterado, apenas se atribuir a um novo map
    println(pedidos - 2)
    println(pedidos - listOf(6, 5))
    println(pedidos)

    //Duas formas de acrescentar dados no map, caso algum dado já exista, vai ser atualizado
    pedidos.putAll(listOf<Pair<Int,Double>>(7 to 90.0, 8 to 20.0, 8 to 30.0))
    pedidos += listOf<Pair<Int,Double>>(7 to 90.0, 8 to 20.0, 8 to 30.0)
    println(pedidos)

    //keys.remove: remove de acordo com a chave informada no parâmetro
    pedidos.keys.remove(1)
    println(pedidos)

    //values.remove: remove o primeiro valor que ele encontrar
    //Caso encontrar mais de um, remove somente o primeiro, deixando o restante
    pedidos.values.remove(50.0)
    println(pedidos)

    //Outra forma de remover pela chave
    pedidos -= 6
    println(pedidos)
}
