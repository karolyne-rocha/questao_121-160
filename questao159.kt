fun algoritmo159() {
    val sc = Scanner(System.`in`)
    print("\ndigite valor de x: ")
    val x = sc.nextDouble()

    if (x > 4.0 || x < -4.0) {
        val fx = (5.0 * x + 3.0) / sqrt(x.pow(2) - 16.0)
        println("\nf(x) = $fx")
    } else {
        println("\nNAO PODE SER FEITA")
    }
}