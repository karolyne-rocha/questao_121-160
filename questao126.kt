fun algoritmo126() {
    val sc = Scanner(System.`in`)
    print("\ndigite valor de X: ")
    val x = sc.nextDouble()

    if (x == 5.0) {
        println("\nO numero e o 5")
    } else if (x == 200.0) {
        println("\nO numero e o 200")
    } else if (x == 400.0) {
        println("\nO numero e o 400")
    } else if (x >= 500.0 && x <= 1000.0) {
        println("\nIntervalo 500-1000")
    } else {
        println("\nFora do escopo")
    }
}