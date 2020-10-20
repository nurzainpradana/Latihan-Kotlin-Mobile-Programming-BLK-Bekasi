fun main() {
    var arrayKu = arrayOf('A', 'B', 'C', 'D', 'E')

    print("${arrayKu[0]}, ")
    print("${arrayKu[1]}, ")
    print("${arrayKu[2]}, ")
    print("${arrayKu[3]}, ")
    println("${arrayKu[4]}")

    var arrayKu2 = arrayOf<Int>(1, 2, 3, 4, 5)
    print("${arrayKu2[0]}, ")
    print("${arrayKu2[1]}, ")
    print("${arrayKu2[2]}, ")
    print("${arrayKu2[3]}, ")
    println("${arrayKu2[4]}")

    var arrayKosong = arrayOfNulls<String>(3)
    arrayKosong[0] = "Nur"
    arrayKosong[1] = null
    arrayKosong[2] = "Pradana"

    println("Nama awal ku ${arrayKosong[0]}")
    println("Nama tengah ku ${arrayKosong[1]}")
    println("Nama akhir ku ${arrayKosong[2]}")

    var arrayKu3 = charArrayOf('A', 'B', 'C', 'D', 'E')
    print("${arrayKu3[0]}, ")
    print("${arrayKu3[1]}, ")
    print("${arrayKu3[2]}, ")
    print("${arrayKu3[3]}, ")
    println("${arrayKu3[4]}")

    arrayKu2.forEach {
        urutan -> print("$urutan, ")
    }

}