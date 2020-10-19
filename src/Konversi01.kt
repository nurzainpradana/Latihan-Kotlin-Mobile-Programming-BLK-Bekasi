fun main(){
    var hargaMobil: Int = 250_000_000
    var hargaMotor: Long = hargaMobil.toLong()

    println(hargaMobil)
    println(hargaMotor)

    when(hargaMobil){
        is Int -> println("Harga Mobil adalah Int")
        !is Int -> println("Harga Mobil adalah Long")
    }

    var x = 3
    x = x * 10
    println("x bernilai $x")

}