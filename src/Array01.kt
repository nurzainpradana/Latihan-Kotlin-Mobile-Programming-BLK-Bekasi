fun main() {
    var arrayKu = arrayOf(1, 2, 3, 4, 5)
    /*
    val arrayKu = arrayOf(1, 2, 3, 4, 5)
    arrayKu = arrayOf(1, 2, 3, 4, 5)
     */

    println("Ini adalah angkaku :")

    print("${arrayKu[0]}, ")
    print("${arrayKu[1]}, ")
    print("${arrayKu[2]}, ")
    print("${arrayKu[3]}, ")
    println("${arrayKu[4]}")

    var hurufKu = arrayOf('A', 'B', 'C', 'D', 'e', 'X')

    var jumlahHurufKu = hurufKu.size

    println("Jumlah hurufku : $jumlahHurufKu")
    print("${hurufKu[0].toLowerCase()}, ")
    print("${hurufKu[1]}, ")
    print("${hurufKu[2]}, ")
    print("${hurufKu[3]}, ")
    print("${hurufKu[4].toUpperCase()}")
    print("${hurufKu[5]}")
}