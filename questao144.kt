fun algoritmo144() {
    val sc = Scanner(System.`in`)
    print("\ndigite saldo medio: ")
    val saldoMedio = sc.nextDouble()

    val credito = when {
        saldoMedio < 501.0 -> 0.0
        saldoMedio < 1001.0 -> saldoMedio * 0.3
        saldoMedio < 3001.0 -> saldoMedio * 0.4
        else -> saldoMedio * 0.5
    }

    if (credito != 0.0) {
        println("\nComo seu saldo era de: $saldoMedio seu credito sera de: $credito")
    } else {
        println("\nComo seu saldo era de: $saldoMedio, voce nao tera nenhum credito")
    }
}