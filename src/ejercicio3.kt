// Declaramos el paquete al que pertenece este programa
package my.program

// Función principal donde inicia la ejecución del programa
fun main(parametro: Array<String>) {

    /* En este primer cambio podemos observar que en Kotlin podemos definir la variable 
       e inmediatamente asignar su valor. Podemos asignar un valor literal como el 100: */

    // Declaramos una variable constante (inmutable) llamada 'valor1' con tipo Int y valor 100
    val valor1: Int = 100

    // Declaramos otra constante llamada 'valor2' con tipo Int y valor 400
    val valor2: Int = 400

    /* También podemos asignar el contenido de otras variables: */

    // Declaramos una variable mutable llamada 'resultado', inicializándola con la suma de valor1 y valor2
    var resultado: Int = valor1 + valor2

    // Mostramos el resultado de la suma en pantalla
    println("La suma de $valor1 + $valor2 es $resultado")

    // Reutilizamos la variable 'resultado' para almacenar el producto de valor1 y valor2
    resultado = valor1 * valor2

    // Mostramos el resultado del producto en pantalla
    println("El producto de $valor1 * $valor2 es $resultado")
}
////
