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
    } else if (lampuKu == "kuning") {
        statusLampu = "Hati-Hati"
    } else if (lampuKu == "hijau") {
        statusLampu = "Berjalan"
    } else if (lampuKu == ""){
        statusLampu = "Warna belum dimasukkan"
    } else {
        statusLampu = "Warna tidak terdaftar"
    }

    println("Warna lampu $lampuKu = $statusLampu")
}