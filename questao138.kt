fun algoritmo138() {
    val sc = Scanner(System.`in`)
    print("\ndigite um numero de 1 - 12: ")
    val num = sc.nextInt()

    val mes = when (num) {
        1 -> "janeiro"
        2 -> "fevereiro"
        3 -> "marco"
        4 -> "abril"
        5 -> "maio"
        6 -> "junho"
        7 -> "julho"
        8 -> "agosto"
        9 -> "setembro"
        10 -> "outubro"
        11 -> "novembro"
        12 -> "dezembro"
        else -> "nao existe mes correspondente"
    }
    println("\n$mes")
}