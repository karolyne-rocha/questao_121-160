fun algoritmo127() {
    val sc = Scanner(System.`in`)
    print("\ndigite nome: ")
    val nome = sc.nextLine()
    print("\ndigite 1a nota: ")
    val nota1 = sc.nextDouble()
    print("\ndigite 2a nota: ")
    val nota2 = sc.nextDouble()

    val media = (nota1 + nota2) / 2.0

    if (media >= 7.0) {
        println("\n$nome $media AP")
    } else if (media < 3.0) {
        println("\n$nome $media RP")
    } else {
        println("\n$nome $media PF")
    }
}