fun algoritmo121() {
    val sc = Scanner(System.`in`)
    print("\ndigite 1 numero: ")
    val n1 = sc.nextInt()
    print("\ndigite 2 numero: ")
    val n2 = sc.nextInt()
    print("\ndigite 3 numero: ")
    val n3 = sc.nextInt()
    print("\ndigite 4 numero: ")
    val n4 = sc.nextInt()
    print("\ndigite 5 numero: ")
    val n5 = sc.nextInt()

    var maior: Int
    var menor: Int

    if (n1 != n2 && n1 != n3 && n1 != n4 && n1 != n5 &&
        n2 != n3 && n2 != n4 && n2 != n5 &&
        n3 != n4 && n3 != n5 && n4 != n5) {

        if (n1 > n2) {
            maior = n1
            menor = n2
        } else {
            maior = n2
            menor = n1
        }

        if (n3 > maior) {
            maior = n3
        } else if (n3 < menor) {
            menor = n3
        }

        if (n4 > maior) {
            maior = n4
        } else if (n4 < menor) {
            menor = n4
        }

        if (n5 > maior) {
            maior = n5
        } else if (n5 < menor) {
            menor = n5
        }

        println("\nMaior = $maior")
        println("Menor = $menor")
    } else {
        println("\nOs valores devem ser diferentes")
    }
}