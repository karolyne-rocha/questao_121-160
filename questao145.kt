fun algoritmo145() {
    val sc = Scanner(System.`in`)
    print("\ndigite nome do livro: ")
    val livro = sc.nextLine()
    print("\ndigite: professor / aluno: ")
    val tipo = sc.nextLine()

    val dia = when {
        tipo.equals("professor", ignoreCase = true) -> 10
        tipo.equals("aluno", ignoreCase = true) -> 3
        else -> 0
    }

    if (dia == 0) {
        println("\nTipo de usuario desconhecido")
    } else {
        println("\nnome do livro: $livro")
        println("nome tipo de usuario: $tipo")
        println("total de dias: $dia")
    }
}