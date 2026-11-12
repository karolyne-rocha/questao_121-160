fun algoritmo135() {
    val sc = Scanner(System.`in`)
    print("\ndigite idade: ")
    val idade = sc.nextInt()

    if (idade < 16) {
        println("\nNao eleitor")
    } else if (idade > 65 || (idade >= 16 && idade < 18)) {
        // Nota: no código do livro está apenas `se (idade > 65)` dentro do senao,
        // mas a regra do enunciado inclui 16 e 17 anos como facultativo.
        println("\nEleitor facultativo")
    } else {
        println("\nEleitor obrigatorio")
    }
}