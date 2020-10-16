// Secara default, compiler akan membaca kodingan dari atas ke bawah, kecuali kondisi tertentu, misal : looping, dsb
fun main() {
    var doubleKu = 1.12
    var floatKu = 1.12F
    var integerKu = 123
    var byteKu = 127
    var shortKu : Short= 32767

    cetak(doubleKu)
    cetakFloat(floatKu)
    cetakInteger(integerKu)
    cetakByte(byteKu)
    cetakShort(shortKu)
}

// Prosedural
// Fungsinya untuk memudahkan saat penelusuran kode program yang bermasalah
fun cetak(doubleKu: Double) {
    println(doubleKu)
}

fun cetakFloat(floatKu: Float) {
    println(floatKu)
}

fun cetakInteger(integerKu: Int) {
    println(integerKu)
}

fun cetakByte(byteKu: Int) {
    println(byteKu)
}

fun cetakShort(shortKu: Short) {
    println(shortKu)
}