fun algoritmo124() {
    val sc = Scanner(System.`in`)
    print("\ndigite 1 lado: ")
    val a = sc.nextDouble()
    print("\ndigite 2 lado: ")
    val b = sc.nextDouble()
    print("\ndigite 3 lado: ")
    val c = sc.nextDouble()

    val maior: Double
    val lados: Double

    if (a < b + c && b < a + c && c < a + b) {
        if (a > b && a > c) {
            maior = a.pow(2)
            lados = b.pow(2) + c.pow(2)
        } else if (b > c) {
            maior = b.pow(2)
            lados = a.pow(2) + c.pow(2)
        } else {
            maior = c.pow(2)
            lados = a.pow(2) + b.pow(2)
        }

        if (maior == lados) {
            println("\nTriangulo Retangulo")
        } else if (maior > lados) {
            println("\nTriangulo Obtusangulo")
        } else {
            println("\nTriangulo Acutangulo")
        }
    } else {
        println("\nas medidas nao formam um triangulo")
    }
}