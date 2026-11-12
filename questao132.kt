fun algoritmo132() {
    val sc = Scanner(System.`in`)
    print("\ndigite valor em reais a ser convertido: ")
    val r = sc.nextDouble()
    print("\ndigite f - franco suico | l - libra esterlina | d - dolar | m - marco alemao: ")
    val moeda = sc.next().lowercase()

    when (moeda) {
        "f" -> {
            print("\ndigite valor de um franco suico em reais: ")
            val f = sc.nextDouble()
            println("\nTotal de francos suicos: ${r / f}")
        }
        "l" -> {
            print("\ndigite valor de uma libra esterlina em reais: ")
            val l = sc.nextDouble()
            println("\nTotal de libras esterlinas: ${r / l}")
        }
        "d" -> {
            print("\ndigite valor de um dolar em reais: ")
            val d = sc.nextDouble()
            println("\nTotal de dolares: ${r / d}")
        }
        "m" -> {
            print("\ndigite valor de um marco alemao em reais: ")
            val m = sc.nextDouble()
            println("\nTotal de marcos alemaes: ${r / m}")
        }
        else -> println("\nmoeda desconhecida")
    }
}