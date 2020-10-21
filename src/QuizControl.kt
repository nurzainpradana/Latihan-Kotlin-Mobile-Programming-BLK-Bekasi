import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val isian = BufferedReader(InputStreamReader(System.`in`))

    println("**********************************************")
    println("\t\t\t Lampu Lalu Lintas")
    println("**********************************************")
    print("Masukkan Warna Lampu Lalu Lintas: ")

    val lampuKu = isian.readLine().toLowerCase()

    var statusLampu: String

    if (lampuKu == "merah"){
        statusLampu = "Berhenti"
        informasi
        println("Warna lampu $lampuKu artinya Berhenti")
    } else if (lampuKu == "kuning") {
        println("Warna lampu $lampuKu artinya Hati-Hati")
    } else if (lampuKu == "hijau") {
        println("Warna lampu $lampuKu artinya Berjalan")
    } else if (lampuKu == ""){
        println("Anda belum memasukkan warna lampu")
    } else {
        println("Warna lampu $lampuKu tidak ditemukan")
    }

    fun informasi(lampuKu: String, statusLampu: String){
        println("Warna lampu $lampuKu artinya Berhenti")
    }
}