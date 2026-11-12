fun algoritmo157() {
    val sc = Scanner(System.`in`)
    print("\ndata no formato ddmmaaaa: ")
    val data = sc.nextInt()

    val dia = data / 1000000
    val mes = (data % 1000000) / 10000
    val ano = data % 10000

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