package array

import java.math.BigDecimal

//Reduce: reduz todos oa valores do array em um só valor, nesse caso acumulando eles
fun Array<BigDecimal>.somatoria(): BigDecimal {
    return this.reduce { acumulador, valor ->
        acumulador + valor
    }
}