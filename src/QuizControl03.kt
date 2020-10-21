import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    println("*****************************************************************")
    println("\t\t NILAI PESERTA PBK MOBILE PROGRAMMING")
    println("*****************************************************************")

    val isian = BufferedReader(InputStreamReader(System.`in`))

    //Input Nama
    print("Masukkan Nama anda: ")
    val namaKu = isian.readLine().toUpperCase()
    println("-----------------------------------------------------------------")

    //Input Nilai Teori
    print("Masukkan Nilai Teori: ")
    var teoriKu = isian.readLine().toDouble()
    // Nilai Teori 30%
    teoriKu *= 0.3

    println("-----------------------------------------------------------------")

    //Input Nilai Praktek
    print("Masukkan Nilai Praktek: ")
    var praktekKu = isian.readLine().toDouble()
    // Nilai Praktek 70%
    praktekKu *= 0.7

    println("-----------------------------------------------------------------")

    println("=================================================================")
    println("\t\t\t\t\t\t DESKRIPSI NILAI ANDA")
    println("-----------------------------------------------------------------")

    println("Nama \t\t\t: $namaKu")
    println("Nilai Teori(30%) \t\t: $teoriKu")
    println("Nilai Praktik(70%) \t\t: $praktekKu")

    // Perhitungan Nilai Akhir
    var nilaiAkhir = teoriKu + praktekKu
    println("Nilai Akhir \t\t\t: $nilaiAkhir")

   //Perhitungan Grade & Keterangan
    var rangeA = 90F..100F
    var rangeB = 80F..90F
    var rangeC = 70F..80F
    var rangeD = 50F..70F
    var rangeE = 0F..50F

    var grade: String
    var keterangan: String

    when(nilaiAkhir){
        in rangeA -> {
            grade = "A"
            keterangan = "Memuaskan"
        }
        in rangeB -> {
            grade = "B"
            keterangan = "Baik"
        }
        in rangeC -> {
            grade = "C"
            keterangan = "Cukup"
        }
        in rangeD -> {
            grade = "D"
            keterangan = "Kurang"
        }
        in rangeE -> {
            grade = "E"
            keterangan = "Buruk"
        }
        else -> {
            grade = "Tidak Ditemukan"
            keterangan = "Tidak Ditemukan"
        }
    }
    println("Grade \t\t\t\t\t: $grade")
    println("Keterangan \t\t\t\t: $keterangan")

    //Penentuan Kompeten
    var kompeten = when(nilaiAkhir){
        in rangeA, in rangeB, in rangeC -> "Kompeten"
        else -> "Belum Kompeten"
    }
    println("Kompetensi \t\t\t\t: $kompeten")

    println("=================================================================")


}