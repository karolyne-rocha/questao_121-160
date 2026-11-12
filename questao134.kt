fun algoritmo134() {
    val sc = Scanner(System.`in`)
    print("\nentre com a idade: ")
    val idade = sc.nextInt()

    when {
        idade < 5 -> println("\nnao existe categoria para essa idade")
        idade <= 7 -> println("\ncategoria Infantil A")
        idade <= 10 -> println("\ncategoria Infantil B")
        idade <= 13 -> println("\ncategoria Juvenil A")
        idade <= 17 -> println("\ncategoria Juvenil B")
        else -> println("\ncategoria Senior")
    }
}