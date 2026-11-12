fun algoritmo158() {
    val sc = Scanner(System.`in`)
    print("\ndigite valor de x: ")
    val x = sc.nextDouble()

    if (x != 2.0) {
        val fx = 8.0 / (2.0 - x)
        println("\nf(x) = $fx")
    } else {
        println("\nNAO PODE SER FEITA")
    }
}