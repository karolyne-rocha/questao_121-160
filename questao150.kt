fun algoritmo150() {
    val sc = Scanner(System.`in`)
    print("\ndigite angulo em graus: ")
    val ang = sc.nextDouble()
    val rang = ang * PI / 180.0

    if ((rang > PI / 2 && rang <= PI) || (rang > 3 * PI / 2 && rang <= 2 * PI)) {
        println("\nseno: ${sin(rang)}")
    } else {
        println("\nco-seno: ${cos(rang)}")
    }
}