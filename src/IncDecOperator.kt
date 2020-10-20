fun main() {
    var nilaiBilA = 10
    var nilaiBilB = 5

    println("--- Nilai Bilangan A = $nilaiBilA ---")
    println("--- Nilai Bilangan B = $nilaiBilB ---")
    println("*********************")

    //Kotlin Version
    println("Increment / Decrement Operator")
    println("A++ atau A = A + 1 adalah ${nilaiBilA.inc()}")
    println("A-- atau A = A - 1 adalah ${nilaiBilA.dec()}")

    // Java Version
    println(nilaiBilA++) // jika ++ diakhir variabel -> dia mencetak dahulu kemudian baru ditambahkan
    println(nilaiBilA) // akan muncul angka yang sudah dihitung increment pada nilaiBilA++
    println(++nilaiBilA) // jika ++ diawal variabel -> dia akan menghitung dahulu kemudian baru ditampilkan
    println(nilaiBilA)

}