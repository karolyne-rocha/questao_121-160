fun algoritmo125() {
    val sc = Scanner(System.`in`)
    print("\ndigite sua idade: ")
    val idade = sc.nextInt()

    if (idade >= 65) {
        println("\nmaior de 65")
    } else if (idade >= 18) {
        println("\nmaior de idade")
    } else {
        println("\nmenor de idade")
    }
}