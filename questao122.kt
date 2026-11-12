val sc = Scanner(System.`in`)
print("\ndigite 1 lado: ")
val a = sc.nextDouble()
print("\ndigite 2 lado: ")
val b = sc.nextDouble()
print("\ndigite 3 lado: ")
val c = sc.nextDouble()

if (a < b + c && b < a + c && c < a + b) {
    println("\nPodem ser lados de um triangulo")
} else {
    println("\nNao podem ser lados de um triangulo")
}
}