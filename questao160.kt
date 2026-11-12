fun algoritmo160() {
    val sc = Scanner(System.`in`)
    print("\ndigite valor de x: ")
    val x = sc.nextDouble()

    val y = when {
        x <= 1.0 -> 1.0
        x <= 2.0 -> 2.0
        x <= 3.0 -> x.pow(2)
        else -> x.pow(3)
    }
    println("\nvalor de f(x): $y")
}