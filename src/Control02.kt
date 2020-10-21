import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val isian = BufferedReader(InputStreamReader(System.`in`))

    print("Masukkan bilangan 1 - 9: ")
    val bilKu = isian.readLine().toInt()

    val hasil =
            if (bilKu < 5){
                "Kurang dari 5"
            } else {
                "Lebih dari 5"
            }
    print("Bilangan anda $bilKu adalah $hasil")
}