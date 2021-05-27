package map

fun main() {
    val pedidos = listOf(
        Pedido(1, 20.0),
        Pedido(2, 60.0),
        Pedido(3, 30.0),
        Pedido(4, 70.0),
        Pedido(5, 40.0)
    )
    println(pedidos)

    //associateBy: associa a lista em um map, retorando index/chave e seu valor
    //Nesse caso a chave é o numero do pedido, e a valor é o próprio pedido
    val pedidosMapeados: Map<Int, Pedido> = pedidos.associateBy { pedido ->
        pedido.numero //Ex: 1=Pedido(numero=1, valor=20.0)
    }
    println(pedidosMapeados)
    println(pedidosMapeados[1])

    //associateWith é no mesmo esquema do anterior, porém retorna também true/false para a condição
    val pedidosFreteGratis: Map<Pedido, Boolean> = pedidos.associateWith { pedido ->
        pedido.valor > 50.0 //Ex: Pedido(numero=1, valor=20.0)=false
    }
    println(pedidosFreteGratis)
    println(pedidosFreteGratis[Pedido(numero = 2, valor = 60.0)])

    //Podemos também retornar o index/chave como boolean, passando uma condição
    //Como a chave é única, só vai retorna o ultimo treu/false
    val mapa: Map<Boolean, Pedido> = pedidos.associateBy { pedido ->
        pedido.valor > 50.0 //Ex: false=Pedido(numero=5, valor=40.0)
    }
    println(mapa)

    //Com o groupBy resolve o problema dos valores unicos
    val pedidosFreteGratisAgrupados: Map<Boolean, List<Pedido>> =
        pedidos.groupBy { pedido: Pedido ->
            pedido.valor > 50.0
        }
    println(pedidosFreteGratisAgrupados) //retorna todos
    println(pedidosFreteGratisAgrupados[false]) //retorna de acordo com o filtro

    val nomes = listOf(
        "Alex",
        "Fran",
        "Gui",
        "Ana",
        "Paulo",
        "Maria",
        "Mario",
        "Gisele"
    )

    //Agrupa a lista de nomes pela primeira letra da lista
    val agenda: Map<Char, List<String>> = nomes.groupBy { nome ->
        nome.first()
    }
    println(agenda) //retorna o map agrupado
    println(agenda['A']) //retorna apenas os valores com a chave 'A'
}

data class Pedido(val numero: Int, val valor: Double)