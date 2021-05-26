package array.funcoesBigDecimal

import array.somatoria
import java.math.BigDecimal

fun Array<BigDecimal>.media(): BigDecimal {
    return if(this.isEmpty()) {
        BigDecimal.ZERO
    } else {
        this.somatoria() / this.size.toBigDecimal()
    }
}