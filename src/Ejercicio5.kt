// Declaramos el paquete al que pertenece este programa
package my.program

// Función principal donde comienza la ejecución del programa
fun main(argumento: Array<String>) {

    // Declaramos la variable 'peso1' y le asignamos el valor 89.4 como tipo Float
    val peso1 = 89.4f

    // Declaramos la variable 'peso2' y le asignamos el valor 67 como tipo Float
    val peso2 = 67f

    // Declaramos la variable 'peso3' y le asignamos el valor 87.45 como tipo Float
    val peso3 = 87.45f

    // Calculamos el promedio de los tres pesos sumándolos y dividiéndolos entre 3
    val promedio = (peso1 + peso2 + peso3) / 3

    // Mostramos el resultado del promedio en consola
    println("El promedio de los tres pesos de personas es $promedio")
}


