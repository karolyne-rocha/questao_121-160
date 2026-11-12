fun algoritmo142() {
    val sc = Scanner(System.`in`)
    print("\nDigite os pontos do primeiro jogador: ")
    var p1 = sc.nextInt()
    print("\nDigite os pontos do segundo jogador: ")
    var p2 = sc.nextInt()
    print("\nDigite os pontos do terceiro jogador: ")
    var p3 = sc.nextInt()

    var aux: Int
    // Ordenação decrescente conforme pedido no enunciado
    if (p1 < p2) { aux = p1; p1 = p2; p2 = aux }
    if (p1 < p3) { aux = p1; p1 = p3; p3 = aux }
    if (p2 < p3) { aux = p2; p2 = p3; p3 = aux }

    println("\np1 = $p1\np2 = $p2\np3 = $p3")
    val soma = p1 + p2 + p3
    if (soma > 100) {
        println("\nMedia = %.2f".format(soma / 3.0))
    } else {
        println("\nEquipe desclassificada!")
    }
}