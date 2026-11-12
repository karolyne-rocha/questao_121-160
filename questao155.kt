fun algoritmo155() {
    val sc = Scanner(System.`in`)
    print("\ndigite palavra: ")
    val pal = sc.next()

    val letra = pal[0].uppercaseChar()
    val pal1 = if (letra == 'L' || letra == 'D') {
        pal.take(2) + pal.last()
    } else {
        pal.drop(1)
    }
    println("\npalavra: $pal1")
}