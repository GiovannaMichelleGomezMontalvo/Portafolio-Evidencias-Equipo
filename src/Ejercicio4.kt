// Declaramos el paquete en el que se encuentra este programa
package my.program

// Función principal que se ejecuta al iniciar el programa
fun main(argumento: Array<String>) {

    // Declaramos una variable llamada 'lado' y le asignamos el valor 50
    val lado = 50

    // Calculamos el perímetro del cuadrado (4 veces el valor del lado)
    val perimetro = lado * 4

    // Calculamos la superficie (área) del cuadrado (lado al cuadrado)
    val superficie = lado * lado

    // Mostramos en pantalla el resultado con los valores calculados
    print("El perímetro de un cuadrado de lado $lado es $perimetro y su superficie es $superficie")
}
