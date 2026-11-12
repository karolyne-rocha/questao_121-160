fun algoritmo147() {
    val sc = Scanner(System.`in`)
    var calorias = 0

    print("\nDigite 1- Vegetariano 2- Peixe 3- Frango 4- Carne: ")
    when (sc.nextInt()) {
        1 -> calorias += 180
        2 -> calorias += 230
        3 -> calorias += 250
        4 -> calorias += 350
    }

    print("\nDigite 1- Abacaxi 2- Sorvete diet 3- Mousse diet 4- Mousse chocolate: ")
    when (sc.nextInt()) {
        1 -> calorias += 75
        2 -> calorias += 110
        3 -> calorias += 170
        4 -> calorias += 200
    }

    print("\nDigite 1- Cha 2- Suco de laranja 3- Suco de melao 4- Refrigerante diet: ")
    when (sc.nextInt()) {
        1 -> calorias += 20
        2 -> calorias += 70
        3 -> calorias += 100
        4 -> calorias += 65
    }

    println("\nTotal de calorias: $calorias")
}