fun algoritmo153() {
    val sc = Scanner(System.`in`)
    print("\ndigite indice de poluicao: ")
    val indice = sc.nextDouble()

    when {
        indice >= 0.5 -> println("\nsuspender atividades as industrias dos grupos 1, 2 e 3")
        indice >= 0.4 -> println("\nsuspender atividades as industrias dos grupos 1 e 2")
        indice >= 0.3 -> println("\nsuspender atividades as industrias dos grupos 1")
        else -> println("\nindice de poluicao aceitavel para todos os grupos")
    }
}