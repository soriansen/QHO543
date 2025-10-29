fun main() {
     // ----------- val (read-only references) -----------
    val a: Int = 3              // EXPLICIT type (Int) + val
    val b = 4                   // INFERRED type -> Int + val
    val pi = 3.14159            // INFERRED type -> Double + val
    val title: String = "Kotlin"// EXPLICIT type (String) + val
    val f: Float = 1.23f        // EXPLICIT type (Float) + val
    val nickname: String? = null// EXPLICIT nullable String + val

    // ----------- var (reassignable references) -----------
    var c = 5                   // INFERRED type -> Int + var
    var message: String = "Hello" // EXPLICIT type (String) + var
    c = 1                      // ok (var can change)
    message = "Hi"              // ok

    // ----------- Summary printout -----------
    println("VALs (read-only):")
    println("  a = $a, b = $b, pi = $pi, title = $title, f = $f, nickname = $nickname")
    println("\nVARs (mutable):")
    println("  c = $c, message = $message")
}

