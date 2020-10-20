fun main() {
    var nilaiBilA = 10
    var nilaiBilB = 5

    println("--- Nilai Bilangan A = $nilaiBilA ---")
    println("--- Nilai Bilangan B = $nilaiBilB ---")

    println("Unary Operator")
    println("A adalah ${nilaiBilA.unaryMinus()}")
    println("*********************")
    println("Increment / Decrement Operator")
    println("A++ atau A = A + 1 adalah ${nilaiBilA.inc()}")
    println("A-- atau A = A - 1 adalah ${nilaiBilA.dec()}")
    println("*********************")
    println("Arithmetic Operator")
    println("A + B adalah ${nilaiBilA.plus(nilaiBilB)}")
    println("A - B adalah ${nilaiBilA.minus(nilaiBilB)}")
    println("A * B adalah ${nilaiBilA.times(nilaiBilB)}")
    println("A / B adalah ${nilaiBilA.div(nilaiBilB)}")
    println("A % B adalah ${nilaiBilA.rem(nilaiBilB)}")
    println("A .. B adalah ${nilaiBilA.rangeTo(nilaiBilB)}")
    println("*********************")
    println("Augmented Operator")
    nilaiBilA += nilaiBilB
    println("A += B atau A = A + B adalah $nilaiBilA")
    nilaiBilA -= nilaiBilB
    println("A -= B atau A = A - B adalah $nilaiBilA")
    nilaiBilA *= nilaiBilB
    println("A *= B atau A = A * B adalah $nilaiBilA")
    nilaiBilA /= nilaiBilB
    println("A /= B atau A = A / B adalah $nilaiBilA")
    nilaiBilA %= nilaiBilB
    println("A %= B atau A = A % B adalah $nilaiBilA")
    println("*********************")
    println("Comparison Operator")
    println("A > B adalah ${nilaiBilA.compareTo(nilaiBilB) > 0}")
    println("A < B adalah ${nilaiBilA.compareTo(nilaiBilB) < 0}")
    println("A >= B adalah ${nilaiBilA.compareTo(nilaiBilB) >= 0}")
    println("A <= B adalah ${nilaiBilA.compareTo(nilaiBilB) <= 0}")
    println("*********************")

}