// Declaramos el paquete al que pertenece este programa
package my.program

// Función principal donde comienza la ejecución del programa
fun main(argumento: Array<String>) {

    // Mostramos un mensaje en consola solicitando al usuario el primer valor
    print("Ingrese primer valor:")

    // Leemos el primer valor ingresado por el usuario desde la consola, lo convertimos a entero y lo almacenamos en la variable 'valor1'
    val valor1 = readLine()!!.toInt()

    // Mostramos un mensaje en consola solicitando al usuario el segundo valor
    print("Ingrese segundo valor:")

    // Leemos el segundo valor ingresado por el usuario desde la consola, lo convertimos a entero y lo almacenamos en la variable 'valor2'
    val valor2 = readLine()!!.toInt()

    // Calculamos la suma de los dos valores
    val suma = valor1 + valor2

    // Mostramos el resultado de la suma en consola
    println("La suma de $valor1 y $valor2 es $suma")

    // Calculamos el producto (multiplicación) de los dos valores
    val producto = valor1 * valor2

    // Mostramos el resultado del producto en consola
    println("El producto de $valor1 y $valor2 es $producto")
}
