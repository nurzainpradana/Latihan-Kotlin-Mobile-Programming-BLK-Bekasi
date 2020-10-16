fun main(){
    var hargaMobil: Int = 250_000_000
    var hargaMotor: Long = hargaMobil.toLong()

    println(hargaMobil)
    println(hargaMotor)

    when(hargaMobil){
        is Int -> print("Harga Mobil adalah Int")
        !is Int -> print("Harga Mobil adalah Long")
    }

}