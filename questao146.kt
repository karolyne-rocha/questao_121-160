fun algoritmo146() {
    val sc = Scanner(System.`in`)
    print("\ndigite tipo de carro (A / B / C): ")
    val tipo = sc.next()
    print("\ndigite percurso: ")
    val percurso = sc.nextDouble()

    val consumo = when (tipo.uppercase()) {
        "C" -> percurso / 12.0
        "B" -> percurso / 9.0 // Nota: o enunciado diz 9 km e o código original usa 10
        "A" -> percurso / 8.0
        else -> 0.0
    }

    if (consumo != 0.0) {
        println("\nConsumo estimado em litros: %.2f".format(consumo))
    } else {
        println("\nModelo inexistente")
    }
}