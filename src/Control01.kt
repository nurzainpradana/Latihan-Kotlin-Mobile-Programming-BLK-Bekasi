import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    var jenisKelamin = "Pria"

    val isian = BufferedReader(InputStreamReader(System.`in`))
    ("Isilaprintlnh dengan huruf kecil")
    print("Masukkan jenis kelamin: ")
    jenisKelamin = isian.readLine()
    jenisKelamin.toLowerCase()

    if (jenisKelamin == "pria")
        print("Kamu Pria")
    else if (jenisKelamin == "wanita")
        print("Kamu Wanita")
    else if (jenisKelamin == "")
        print("Harap isi jenis kelamin")
    else
        print("Jenis Kelamin tidak terdefinisi")
}