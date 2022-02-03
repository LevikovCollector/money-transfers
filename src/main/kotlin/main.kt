fun main() {
    val pennyRatio = 100
    val amount = 10 * pennyRatio
    val commission = 0.75
    val minCommision = 35 * pennyRatio

    var result = if (amount * commission <= minCommision) {
        minCommision.toDouble()
    } else {
        amount * commission
    }
    println(result)
}