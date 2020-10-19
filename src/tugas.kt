fun main(){
    //Nomor 1
    val height = 9 //Mendefinisikan variabel height dengan jenis val dengan nilai 9

    println("Hello") //Mencetakn kalimat "Hello" ke layar
    //println("MyCat is called $name") -> ERROR karena variabel $name belum di definisikan
    println("My Cat is $height inches tall") //Mencetak kalimat dan nilai dari variabel $height

    val a = 6 //Membuat variabel a berjenis val dengan nilai 6
    val b = 7 //Membuat variabel b berjenis val dengan nilai 7
    val c = a + b + 10 //Membuat variabel c dengan jenis val dengan nilai hasil penjumlahan nilai a + b + 10
    val str = c.toString() //Membuat variabel str dengan jenis val yang bernilai hasil konversi dari nilai  variabel c

    //Nomor 2
    /*
        fun main(args: Array<String>){
            //Your code goes here
        }

        1)fun -> Membuat sebuah function
        2)main -> Function main / utama yang akan dijalankan paling awal oleh compiler
        3)() -> Parameter dari sebuah fungsi
        4){ -> Curly braches yang menandakan awal dari sebuah function
        5)} -> Curly braches yang menandakan akhir dari sebuah function
        6){ ... } -> Tempat dimana kita akan membuat baris kode dalam dalam sebuah function
     */

    //Nomor 3
    /*
        fun main (args: Array<String>){
            println("Pow!")
        }

        Membuat function main, kemudian membuat perintah untuk manampilkan kalimat ke
        layar dengan perintah println (mencetak sebuah nilai kemudian kursor pindah
        ke baris baru). dan ketika program di run, akan muncul kalimat “Pow!” pada
        layar.

     */

    //Nomor 4
    var x = 3
    val name = "Cormoran"
    x = x * 10
    println("X is $x.")

    //Nomor 5
    //var x: Int = 3.12 -> ERROR Karena
    // Perintah diatas akan menampilkan pesan error karena 3.12 merupakan
    // bilangan desimal sedangkan tipe data Int untuk bilangan desimal,
    //
    //Solusinya yaitu menggunakan tipe data float. Karena tipe data float
    // mampu menampung nilai dengan desimal berdigit 6-7.
    //var x: Float = 3.12

    //Nomor 6
    //var tinyNum: Byte = 500 -> ERROR karena
    /*
        Perintah diatas akan menampilkan pesan  error karena 500 diluar dari
        range tipe data Byte. Tipe data Byte memiliki range diantara -128 sampai
        dengan 127.

        Solusinya yaitu menggunakan tipe data Short. Karena tipe data Short
        memiliki range dari -32768 sampai 32767.
     */
    var tinyNum: Short = 500

    //Nomor 7
    //var x: Int = 65.2 -> ERROR karena
    /*
        Baris ini akan error, karena 65.2 merupakan bilangan desimal,
        harusnya menggunakan tipe data float -> var x: Float = 65.2
     */

    var isPunk = true
    /*
        variabel isPunk memiliki nilai true  dan sistem akan otomatis
        mendeteksi bahwa variabel tersebut bertipe data boolean.
     */

    //var message = 'hello' -> ERROR
    /*
        baris ini akan error dikarenakan tanda single qoutes (‘) digunakan
         jika bertipe data char. Sedangkan char hanya berisi 1 karakter,
         solusinya mengganti tanda single quotes
         menjadi double quotes (“) -> “Hello”
     */

    var y = 7
    /*
        membuat variabel y bernilai 7 dan sistem akan otomatis mendeteksi
        tipe data variabel tersebut adalah Int.
     */

    var z: Int = y
    /*
        baris ini akan error karena y bukan sebuah bilangan / angka dari Int.
        Solusinya yaitu mengganti tipe datanya menjadi Char dan menambahkan
        single quotes pada nilai y -> ‘y’
     */

    y = y + 50
    /*
         mengubah nilai dari variabel y menjadi hasil dari nilai
         variabel y (sebelumnya) ditambah dengan 50 -> y = 7 + 50 -> y = 57
     */

    var s: Short
    /*
        membuat variabel s dengan tipe data Short tanpa memberikan nilai awal.
     */

    var bigNum: Long = y.toLong()
    /*
        membuat variabel bigNum dengan tipe data Long yang memiliki nilai
        hasil dari konversi dari nilai variabel y menjadi tipe data Long
     */

    var B: Byte = 2
    /*
        membuat variabel b dengan tipe data Byte dengan nilai 2
     */

    var smallNum = b.toShort()
    /*
        membuat variabel smallNum dengan nilai hasil dari konversi nilai dari
        variabel b
     */

    //b = smallNum -> ERROR
    /*
        baris ini akan menampilkan pesan error karena variabel b bertipe data Byte
         sedangkan smallNum bertipe data Short. Solusinya konversikan dahulu
         tipe datanya dari Short ke Byte -> smallNum.toByte()
     */

    //isPunk = "false" -> ERROR
    /*
        baris ini akan menampilkan pesan error karena variabel isPunk bertipe data
        Boolean, sedangkan nilai “false” karena menggunakan double quotes jadi
        sistem akan mendeteksi kalau itu bertipe data String
     */

    var k = y.toDouble()
    /*
        membuat variabel k dengan nilai hasil konversi dari nilai variabel y
        menjadi tipe data Double
     */

    B = k.toByte()
    /*
        - mengubah nilai dari variabel b menjadi hasil konversi dari nilai variabel k
        menjadi tipe data Byte
     */

    s = 0b10001
    /*
         mengubah nilai dari variabel s dengan nilai 0b10001, 0b diawal merupakan
         penanda bahwa nilai ini merupakan bilangan biner. Dan nantinya nilai ini
         akan dikonversi secara otomatis kebilangan desimal dengan tipe data Short.
         Dan ketika variabel s dicetak akan menampilkan nilai 17
     */

    //Nomor 8
    printSum(5,6)
    /*
        Membuat function main, kemudian membuat function printSum dengan parameter
        int1 dengan tipe data Int dan int2 dengan tipe data Int. Kemudian membuat
        baris kode dalam function printSum, dimana berisi :
        - membuat variabel result dengan jenis val dengan nilai hasil dari penjumlahan
        nilai dari varibel int1 dan int2 (dari parameter)
        - kemudian membuat perintah untuk mencetak kelayar untuk menampilkan nilai
        dari result

        Setelah itu memanggil function printSum pada function main serta memberikan
        nilai dari parameternya, disini perintah yang dibuat yaitu
        printSum(5,6) dimana 5 dan 6 merupakan parameter, 5 itu nantinya akan menjadi
        int1 dan 6 menjadi int2.

        Kemudian printSum(5,6) akan diproses, pada function printSum, variabel result
        bernilai hasil dari penjumlahan int1 dan int2, int1 bernilai 5, int2 bernilai 6.
        maka result akan bernilai 11. dan akan ditampilkan kelayar nilai dari result tersebut.
     */

    //Nomor 9
    //val x: Int = 7
    //val y: Int = 8
    //printSum(x, y)

    /*
        Membuat function main yang berisi :
        - membuat variabel x dengan jenis val dengan tipe data Int yang diberi
           nilai 7
        - membuat variabel y dengan jenis val dengan tipe data Int yang diberi
        nilai 8
        - memanggil / menjalankan function printSum disertai dengan parameter,
        dengan parameter 1 nilai dari variabel x yaitu 7 dan parameter 2 nilai
        dari variabel y yaitu 8.

        Kemudian membuat function printSum yang memiliki parameter int1 dan
         int2 dimana int1 bertipe data Int, dan int2 bertipe data Int. Setelah
         itu membuat baris kode pada printSum yang berisi :
        - membuat variabel result dengan nilai hasil dari penjumlahan nilai
        variabel int1 dan nilai variabel int2.
        - kemudian mencetak nilai variabel result ke layar

    Ketika function main menjalankan function printSum, variabel result akan
    memiliki nilai hasil dari penjumlahan dari nilai variabel int1 yaitu 7 dan
    nilai variabel int2 yaitu 8. dan result akan memiliki nilai 15. dan kemudian
     akan menampilkan nilai result ke layar.
     */


}

fun printSum(int1: Int, int2: Int) {
    val result = int1 + int2
    print("Hasil PrintSum = ")
    println(result)
}
