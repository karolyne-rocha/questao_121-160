fun algoritmo140() {
    val sc = Scanner(System.`in`)
    print("\nDigite nome: ")
    val nome = sc.next()
    print("\nDigite valor da conta: ")
    val vc = sc.nextDouble()

    val l = nome[0].uppercaseChar()
    if (l == 'A' || l == 'D' || l == 'M' || l == 'S') {
        println("\n$nome valor da conta com desconto: R$ %.2f".format(vc * 0.7))
    } else {
        println("\nQue pena. Nesta semana o desconto nao e para seu nome; mas continue nos prestigiando que sua vez chegara")
    }
}