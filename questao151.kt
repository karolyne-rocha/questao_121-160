fun algoritmo151() {
    val sc = Scanner(System.`in`)
    print("\ndigite peso: ")
    val peso = sc.nextDouble()
    print("\ndigite altura: ")
    val altura = sc.nextDouble()

    val imc = peso / altura.pow(2)

    when {
        imc < 20.0 -> println("\nabaixo do peso")
        imc <= 25.0 -> println("\nnormal")
        imc <= 30.0 -> println("\nexcesso de peso")
        imc <= 35.0 -> println("\nobesidade")
        else -> println("\nobesidade morbida")
    }
}