fun main() {
    for (i in 50..60){
        print("$i, ")
    }
    println()
    for (i in 60 downTo 50 step 2){
        print("$i, ")
        println()
    }
}