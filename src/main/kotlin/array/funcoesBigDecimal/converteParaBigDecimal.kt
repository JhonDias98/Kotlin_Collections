package array

import java.math.BigDecimal

//Vararg: pode receber mais de um valor no argumento do método
//método para converter String em BigDecimal
fun bigDecimalArrayOf(vararg valores: String): Array<BigDecimal> {
    return Array<BigDecimal>(valores.size) { i ->
        valores[i].toBigDecimal()
    }
}