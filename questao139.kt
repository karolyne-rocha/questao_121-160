fun algoritmo139() {
    val sc = Scanner(System.`in`)
    print("\nDigite nome do Municipio: ")
    val nome = sc.nextLine()
    print("\nnumero de eleitores aptos: ")
    val ne = sc.nextInt()
    print("\nnumero de votos do candidato mais votado: ")
    val votos = sc.nextInt()

    if (ne > 20000 && votos <= ne / 2) {
        println("\n$nome tera segundo turno")
    } else {
        println("\n$nome nao tera segundo turno")
    }
}