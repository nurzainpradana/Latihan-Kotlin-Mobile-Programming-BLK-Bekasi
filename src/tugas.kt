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




    //var x: Double = 3.12

    var tinyNum: Short = 500

    var isPunk = false

    var y = 7
    var bigNum: Long = y.toLong()
    println(bigNum)

    var b: Byte = 2
    var smallNum = b.toShort()

    b = smallNum.toByte()

    var k = y.toDouble()

    b = k.toByte()

    var s: Short
    s = 0b10001
    println(s)
    println(s.toString())


    //Nomor 4
    var x = 3
    val name = "Cormoran"
    x = x * 10
    println("X is $x.")


    //Nomor 8
    printSum(5,6)
}

fun printSum(int1: Int, int2: Int) {
    val result = int1 + int2
    print("Hasil PrintSum = ")
    println(result)
}
