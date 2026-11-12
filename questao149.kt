fun algoritmo149() {
    val sc = Scanner(System.`in`)
    print("\ndigite nome do produto: ")
    val nomep = sc.nextLine()
    print("\ndigite valor da compra: ")
    val vcompra = sc.nextDouble()

    val vvenda = when {
        vcompra < 10.0 -> vcompra * 1.7
        vcompra < 30.0 -> vcompra * 1.5
        vcompra < 50.0 -> vcompra * 1.4
        else -> vcompra * 1.3
    }
    println("\n$nomep sera vendido por R\$ %.2f".format(vvenda))
}