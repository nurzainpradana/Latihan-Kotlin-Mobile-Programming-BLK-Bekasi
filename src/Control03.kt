import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val isian = BufferedReader(InputStreamReader(System.`in`))

    val deskripsiAplikasi = """
        |Gunakan kedua telapak tangan anda untuk
        |menghitung jari dari kiri ke kanan
    """.trimMargin()
    println(deskripsiAplikasi)

    print("Pilih angka dari 1-10: ")
    val pilihanAnda = isian.readLine().toInt()

    if (pilihanAnda <= 5){
        when (pilihanAnda){
            1 -> print("Tangan Kiri Ibu Jari")
            2 -> print("Tangan Kiri Telunjuk")
            3 -> print("Tangan Kiri Jari Tengah")
            4 -> print("Tangan Kiri Jari Manis")
            else -> print("Tangan Kiri Jari Kelingking")
        }
    } else {
        when (pilihanAnda){
            6 -> print("Tangan Kanan Jari Kelingking")
            7 -> print("Tangan Kanan Jari Manis")
            8 -> print("Tangan Kanan Jari Tengah")
            9 -> print("Tangan Kanan Telunjuk")
            10 -> print("Tangan Kanan Ibu Jari")
        }
    }
}