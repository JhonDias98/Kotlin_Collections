package array

import array.funcoesBigDecimal.media
import java.math.BigDecimal
import java.math.RoundingMode

fun salarioBigDecimal() {
    val salarios = bigDecimalArrayOf("1500.55", "2000.00", "5000.00", "10000.00")
    println(salarios.contentToString())

    //Usando Map
    val aumento = "1.1".toBigDecimal()
    val salariosComAumento: Array<BigDecimal> = salarios
        .map { salario ->
            calculaAumentoRelativo(salario, aumento)
        }
        .toTypedArray()
    println(salariosComAumento.contentToString())

    val gastoInicial = salariosComAumento.somatoria()
    println(gastoInicial)

    val meses = 6.toBigDecimal()
    //Fold: bem parecido com o reduce
    val gastoTotal = salariosComAumento.fold(gastoInicial) { acumulador, salario ->
        acumulador + (salario * meses).setScale(2, RoundingMode.UP)
    }
    println(gastoTotal)

    val media = salariosComAumento
        .sorted() //ordena do menor para o maior
        .takeLast(3) //paga os ultimos valores de acordo com o que foi passado no argumento
        .toTypedArray() //retorna um array
        .media()
    println(media)

    val mediaMenoresSalarios = salariosComAumento
        .sorted() //ordena do menor para o maior
        .take(3) //paga os primeiros valores de acordo com o que foi passado no argumento
        .toTypedArray() //retorna um array
        .media()
    println(mediaMenoresSalarios)
}

private fun calculaAumentoRelativo(
    salario: BigDecimal,
    aumento: BigDecimal
) = if (salario < "5000".toBigDecimal()) {
    salario + "500".toBigDecimal()
} else {
    //setScale(N após virgula, tipo de arredondamento)
    (salario * aumento).setScale(2, RoundingMode.UP)
}

