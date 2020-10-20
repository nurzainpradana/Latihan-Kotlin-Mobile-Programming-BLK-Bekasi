fun main() {
    var nilaiBilA = 10
    var nilaiBilB = 5

    println("--- Nilai Bilangan A = $nilaiBilA ---")
    println("--- Nilai Bilangan B = $nilaiBilB ---")
    println("*********************")

    println("A > B adalah ${nilaiBilA.compareTo(nilaiBilB) > 0}")
    println("A < B adalah ${nilaiBilA.compareTo(nilaiBilB) < 0}")
    println("A >= B adalah ${nilaiBilA.compareTo(nilaiBilB) >= 0}")
    println("A <= B adalah ${nilaiBilA.compareTo(nilaiBilB) <= 0}")
}