fun main() {
    fun cetak(doubleKu: Double) {
        println(doubleKu)
    }

    var doubleKu = 1.12

    cetak(doubleKu)

    // Kalau digit desimal diatas 15, maka angka akan dibulatkan
    var bilanganDesimal1 : Double = 6.5673453463453456777777777777777777777777777777745
    var bilanganDesimal2 : Float = 9.001F

    // Kalau ada angka 0 didepan digit, maka cukup ketik . kemudian dibelakangnya dimasukkan angka dibelakangnya
    var bilanganDesimal3 : Double = .123
    var bilanganDesimal4 : Float = 0.12345F

    println(bilanganDesimal1)
    println(bilanganDesimal2)
    println(bilanganDesimal3)
    println(bilanganDesimal4)
}