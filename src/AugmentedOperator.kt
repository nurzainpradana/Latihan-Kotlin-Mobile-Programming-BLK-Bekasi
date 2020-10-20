fun main() {
    var nilaiBilA = 10
    var nilaiBilB = 5

    println("--- Nilai Bilangan A = $nilaiBilA ---")
    println("--- Nilai Bilangan B = $nilaiBilB ---")
    println("*********************")

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
}