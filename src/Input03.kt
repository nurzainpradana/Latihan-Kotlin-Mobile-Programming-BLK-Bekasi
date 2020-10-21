fun main() {
    print("Masukkan sembarang huruf: ")
    var hurufAnda = readLine()

    println("Inisial anda ${hurufAnda?.get(0)}")

    println("Huruf awal : ${hurufAnda?.first()}")
    println("Huruf akhir : ${hurufAnda?.last()} adalah index ke-${hurufAnda?.lastIndex}")
}