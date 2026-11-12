fun algoritmo152() {
    val sc = Scanner(System.`in`)
    print("\ndigite peso: ")
    val peso = sc.nextDouble()
    print("\ndigite idade: ")
    val idade = sc.nextInt()

    val mgPorGota = 500.0 / 20.0

    if (peso < 5.0) {
        println("\nnao pode tomar o remedio porque nao tem peso. Consulte medico.")
    } else if (idade >= 12) {
        if (peso >= 60.0) {
            println("\nTomar ${1000 / mgPorGota} gotas")
        } else {
            println("\nTomar ${875 / mgPorGota} gotas")
        }
    } else {
        val dosagem = when {
            peso <= 9.0 -> 125
            peso <= 16.0 -> 250
            peso <= 24.0 -> 375
            peso <= 30.0 -> 500
            else -> 750
        }
        println("\nTomar ${dosagem / mgPorGota} gotas")
    }
}