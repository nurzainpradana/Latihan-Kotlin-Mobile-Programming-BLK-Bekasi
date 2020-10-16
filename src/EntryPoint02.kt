// fun artinya function
// main adalah nama function yang digunakan dan juga sebagai function paling utama
// untuk tempat pemanggilan file kotlin
fun main(args: Array<String>){
    //Membuat Variabel
    var StringWelcome = "Selamat Datang Kotlin"
    var Zain = "Okei"

    // Menampilkan Variabel
    // Mencetak Dalam Bentuk Console / Monitor
    // dan kursor di baris berikutnya
    println(StringWelcome)
    println(StringWelcome + Zain)

    /*
    Mencetak Dalam Bentuk Console / Monitor
    dan kursor di baris berikutnya
     */
    println("Selamat Datang Zain")

    //Variabel dengan String
    println("$StringWelcome dan Zain")

    // Variabel dengan Variabel
    println("$StringWelcome $Zain")
}