import java.util.*

fun main() {
    val isian = Scanner(System.`in`)

    print("Masukkan nama anda: ")

    val namaAnda = isian.next()
    // Tidak bisa menggunakan spasi kosong

    val namaAnda2 = isian.nextLine()

    print("Nama Anda $namaAnda")
    print("Nama Anda $namaAnda2")
}