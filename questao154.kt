fun algoritmo154() {
    val sc = Scanner(System.`in`)
    print("\ndigite placa: ")
    val placa = sc.next()

    val mes = when (placa.lastOrNull()) {
        '1' -> "janeiro"
        '2' -> "fevereiro"
        '3' -> "marco"
        '4' -> "abril"
        '5' -> "maio"
        '6' -> "junho"
        '7' -> "julho"
        '8' -> "agosto"
        '9' -> "setembro"
        '0' -> "outubro"
        else -> "opcao invalida"
    }
    println("\n$mes")
}