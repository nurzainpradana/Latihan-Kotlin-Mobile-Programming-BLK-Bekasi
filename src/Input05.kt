import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val isian = BufferedReader(InputStreamReader(System.`in`))

    print("Masukkan nama Anda: ")
    val namaKu = isian.readLine()

    print("Namaku adalah $namaKu")

}