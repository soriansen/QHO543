fun main() {
    // Ask the user if it's rainy (type tes/no?). Press Enter to submit //
    print("Is it rainy? (Yes/No):")
    val rainy = readLine()?.equals ("Yes", ignoreCase = true) == true

    if (rainy) {
        println("Take an umbrella!")

    }
    else {
        println("Wear your sunglasses...")
    }

}