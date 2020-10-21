import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val isian = BufferedReader(InputStreamReader(System.`in`))

    print("Apakah anda masih ingin belajar kotlin? [Y/T]")
    val belajarKotlin: Boolean = when (isian.readLine().toUpperCase()){
        "Y" -> true
        else -> false
    }

    val hasil = when(belajarKotlin){
        true -> println("Lanjut OOP")
        false -> println("Ngulang dari awal")
    }
}