fun algoritmo133() {
    val sc = Scanner(System.`in`)
    print("\nentre com a altura: ")
    val h = sc.nextDouble()
    print("\nentre com o sexo M / F: ")
    val sexo = sc.next()

    val peso = if (sexo.equals("M", ignoreCase = true)) {
        72.7 * h - 58
    } else {
        62.1 * h - 44.7
    }
    println("\nseu peso ideal : $peso")
}