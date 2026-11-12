fun algoritmo128() {
    val sc = Scanner(System.`in`)
    print("\ndigite verbo: ")
    val verbo = sc.next()

    if (verbo.endsWith("r", ignoreCase = true) && verbo.length >= 2) {
        val penultima = verbo[verbo.length - 2].lowercaseChar()
        when (penultima) {
            'a' -> println("\n1a conjugacao")
            'e', 'o' -> println("\n2a conjugacao")
            'i' -> println("\n3a conjugacao")
            else -> println("\nnao existe verbo com terminacao ur")
        }
    } else {
        println("\nnao e um verbo no infinitivo")
    }
}