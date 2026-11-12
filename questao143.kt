fun algoritmo143() {
    val sc = Scanner(System.`in`)
    print("\ndigite uma palavra: ")
    val pal = sc.next()

    if (pal.length % 2 == 0) {
        val n1 = pal.length / 2
        val n2 = n1 - 1
        val p3 = "${pal[n2]}${pal[n1]}"
        if (p3 == "rr" || p3 == "ss") {
            println("\nE rr OU ss")
        } else {
            println("\nNAO E rr OU ss")
        }
    } else {
        val n1 = pal.length / 2
        val p1 = pal[n1].toString()
        if (p1 == "a" || p1 == "e" || p1 == "i" || p1 == "o" || p1 == "u") {
            println("\nE VOGAL")
        } else {
            println("\nNAO E VOGAL")
        }
    }
}