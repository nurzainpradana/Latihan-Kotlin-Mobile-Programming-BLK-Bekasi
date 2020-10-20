fun main() {
    var namaAwal: String = "Nur Zain"
    var namaAkhir = "Pradana"

    print(namaAwal)
    println(" memiliki nama akhir $namaAkhir")

    var namaKu = "Zain"
    var karakterNama: Char

    karakterNama = namaKu[3]

    println("Karakter nama ku ? $karakterNama")

    namaKu.forEach {
        cetakVertikal -> println(cetakVertikal.toUpperCase())
    }

    var alamatKu = "Kp. Selang Cau\n" +
            "Kel. Wanasari\n" +
            "Kec. Cibitung\n" +
            "Kab. Bekasi\n" +
            "Jawa Barat"

    println("Saya tinggal di : $alamatKu")


    var alamatKu2 = """Kp. Selang Cau
            |Kel. Wanasari
            |Kec. Cibitung
            |Kab. Bekasi
            |Jawa Barat
            """.trimMargin()

    println(alamatKu2)

    println("Saya tinggal di : $alamatKu")


}