fun algoritmo129() {
    val sc = Scanner(System.`in`)
    print("\ndigite salario: ")
    val salario = sc.nextDouble()

    val desconto = when {
        salario <= 600.0 -> 0.0
        salario <= 1200.0 -> salario * 0.20
        salario <= 2000.0 -> salario * 0.25
        else -> salario * 0.30
    }
    println("\ndesconto: $desconto")
}