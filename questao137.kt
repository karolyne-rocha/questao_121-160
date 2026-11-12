fun algoritmo137() {
    val sc = Scanner(System.`in`)
    print("\nEntre com valor de a: ")
    val a = sc.nextDouble()
    print("\nEntre com valor de b: ")
    val b = sc.nextDouble()
    print("\nEntre com valor de c: ")
    val c = sc.nextDouble()

    if (a == 0.0) {
        println("\nNao e equacao do 2 grau")
    } else {
        var d = b.pow(2) - 4 * a * c
        if (d >= 0.0) {
            d = sqrt(d)
            val x1 = (-b + d) / (2 * a)
            val x2 = (-b - d) / (2 * a)
            println("\nX1 = $x1\t\tX2 = $x2")
        } else {
            println("\nNao ha raizes reais")
        }
    }
}