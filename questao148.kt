fun algoritmo148() {
    val sc = Scanner(System.`in`)
    print("\nDigite 1- Regiao Norte 2- Regiao Nordeste 3- Regiao Centro-Oeste 4- Regiao Sul: ")
    val op = sc.nextInt()
    print("\nDigite 1- Ida 2- Ida e Volta: ")
    val iv = sc.nextInt()

    when (op) {
        1 -> if (iv == 1) println("\nO valor da passagem de ida para R.Norte: R\$500.00")
        else println("\nO valor da passagem de ida-volta para R.Norte: R\$900.00")
        2 -> if (iv == 1) println("\nO valor da passagem de ida para R.Nordeste: R\$350.00")
        else println("\nO valor da passagem de ida-volta para R.Nordeste: R\$650.00")
        3 -> if (iv == 1) println("\nO valor da passagem de ida para R.C.Oeste: R\$350.00")
        else println("\nO valor da passagem de ida-volta para R.C.Oeste: R\$600.00")
        4 -> if (iv == 1) println("\nO valor da passagem de ida para R.Sul: R\$300.00")
        else println("\nO valor da passagem de ida-volta para R.Sul: R\$550.00")
        else -> println("\nOpcao Inexistente")
    }
}