fun main() {
    var count = 10
    while (count > 3) {
        println("count = $count")
        count -- // update to avoid infinite loop//
    }
}