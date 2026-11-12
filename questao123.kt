fun algoritmo123() {
    val sc = Scanner(System.`in`)
    print("\ndigite 1 lado: ")
    val a = sc.nextDouble()
    print("\ndigite 2 lado: ")
    val b = sc.nextDouble()
    print("\ndigite 3 lado: ")
    val c = sc.nextDouble()

    if (a < b + c && b < a + c && c < a + b) {
        if (a == b && a == c) {
            println("\nTriangulo equilatero")
        } else if (a == b || a == c || b == c) {
            println("\nTriangulo isosceles")
        } else {
            println("\nTriangulo escaleno")
        }
    } else {
        println("\nAs medidas nao formam um triangulo")
    }
}