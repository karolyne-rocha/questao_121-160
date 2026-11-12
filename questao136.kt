fun algoritmo136() {
    val sc = Scanner(System.`in`)
    print("\nEntre com nome: ")
    val nome = sc.nextLine()
    print("\nEntre com a idade: ")
    val idade = sc.nextInt()

    val valor = when {
        idade <= 10 -> "R$ 30,00"
        idade <= 29 -> "R$ 60,00"
        idade <= 45 -> "R$ 120,00"
        idade <= 59 -> "R$ 150,00"
        idade <= 65 -> "R$ 250,00"
        else -> "R$ 400,00"
    }
    println("\n$nome pagara $valor")
}