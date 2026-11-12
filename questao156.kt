fun algoritmo156() {
    val sc = Scanner(System.`in`)
    print("\ndigite dia: ")
    val dia = sc.nextInt()
    print("\ndigite mes: ")
    val mes = sc.nextInt()
    print("\ndigite ano: ")
    val ano = sc.nextInt()

    var vd = 0
    if (ano >= 1) {
        vd = 1
        if (mes < 1 || mes > 12 || dia < 1 || dia > 31) {
            vd = 0
        } else if ((mes == 4 || mes == 6 || mes == 9 || mes == 11) && dia > 30) {
            vd = 0
        } else if (mes == 2) {
            val bissexto = (ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0)
            if (bissexto && dia > 29) vd = 0
            if (!bissexto && dia > 28) vd = 0
        }
    }

    if (vd == 0) println("\nDATA INVALIDA") else println("\nDATA VALIDA")
}