fun main() {
    print("Enter your name: ")
    val name = readLine()

    if (name != null && name.isNotEmpty()) {
        repeat(10) {
            println(name)
        }
    } else {
        println("No name entered!")
    }
}
