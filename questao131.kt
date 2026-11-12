fun algoritmo131() {
    val sc = Scanner(System.`in`)
    print("\nDigite nome: ")
    val nome = sc.nextLine()

    if (nome.isNotEmpty()) {
        val l = nome[0].uppercaseChar()
        when (l) {
            in 'A'..'K' -> println("\n$nome sala: 101")
            in 'L'..'N' -> println("\n$nome sala: 102")
            in 'O'..'Z' -> println("\n$nome sala: 103")
            else -> println("\nNOME INVALIDO")
        }
    } else {
        println("\nNOME INVALIDO")
    }
}