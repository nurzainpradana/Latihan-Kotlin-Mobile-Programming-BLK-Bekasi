import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    println("*****************************************************************")
    println("\t\t\t Pendataan Warga Negara Indonesia")
    println("*****************************************************************")

    val isian = BufferedReader(InputStreamReader(System.`in`))

    //Input Nama
    print("Masukkan Nama anda: ")
    val namaKu = isian.readLine().toLowerCase()
    println("-----------------------------------------------------------------")

    //Input Jenis Kelamin
    print("""
        |Opsi Jenis Kelamin
        |> Pria
        |> Wanita
        |
        |Masukkan Jenis Kelamin Anda: 
    """.trimMargin())
    var jenisKelaminKu = isian.readLine().toLowerCase()
    println("-----------------------------------------------------------------")

    //Input Status
    print("""
        |Opsi Status :
        |> Sendiri
        |> Kawin
        |> Cerai
        |
        |Masukkan Status Anda: 
    """.trimMargin())
    var statusKu = isian.readLine().toLowerCase()

    println("=================================================================")
    println("\t\t\t\t\t\t DATA ANDA")
    println("-----------------------------------------------------------------")

    //Mencetak Nama
    println("Nama \t\t\t : ${namaKu.toUpperCase()}")

    //Mencetak Jenis Kelamin
    if (!(jenisKelaminKu == "pria" || jenisKelaminKu == "wanita"))
        //Jika jenis kelamin yang diinput salah
        jenisKelaminKu = "Jenis Kelamin yang anda masukkan salah"
    println("Jenis Kelamin \t : ${jenisKelaminKu.toUpperCase()}")

    //Mencetak Status
    if (!(statusKu == "sendiri" || statusKu == "kawin" || statusKu == "cerai"))
        //Jika status yang diinput salah
        statusKu = "Status Yang Anda Masukkan Salah"
    println("Status \t\t\t : ${statusKu.toUpperCase()}")

    //Mencetak Keterangan
    //Jika status tidak diinput, maka memberi nilai default pada va  riabel keterangan
    var keterangan: String = "Keterangan Tidak Ditemukan"
    if (jenisKelaminKu == "pria"){
        //Jika jenis kelamin = pria
        if (statusKu == "sendiri"){
            //Jika jenis kelamin = pria & status = sendiri
            keterangan = "Perjaka"
        } else if (statusKu == "kawin") {
            //Jika jenis kelamin = pria & status = kawin
            keterangan = "Menikah"
        } else if (statusKu == "cerai") {
            //Jika jenis kelamin = pria & status = cerai
            keterangan = "Duda"
        } else {
            //Jika jenis kelamin = pria & status tidak terdaftar
            keterangan = "Keterangan Tidak Ditemukan"
        }
    } else if (jenisKelaminKu == "wanita"){
        //Jika jenis kelamin = wanita
        if (statusKu == "sendiri"){
            //Jika jenis kelamin = wanita & status = sendiri
            keterangan = "Gadis"
        } else if (statusKu == "kawin") {
            //Jika jenis kelamin = wanita & status = kawin
            keterangan = "Menikah"
        } else if (statusKu == "cerai") {
            //Jika jenis kelamin = wanita & status = cerai
            keterangan = "Janda"
        } else {
            //Jika jenis kelamin = wanita & status tidak terdaftar
            keterangan = "Keterangan Tidak Ditemukan"
        }
    }

    //Mencetak keterangan
    println("Keterangan \t\t : ${keterangan.toUpperCase()}")
    println("=================================================================")


}