// Declaramos el paquete al que pertenece este programa
package my.program

// Función principal del programa, donde inicia la ejecución
fun main(parametro: Array<String>) {

    // Mostramos un mensaje al usuario para ingresar el precio del producto
    print("Ingrese el precio del producto:")

    // Leemos el precio desde el teclado, lo convertimos a tipo Double y lo almacenamos en la variable 'precio'
    val precio = readLine()!!.toDouble()

    // Mostramos un mensaje al usuario para ingresar la cantidad de productos
    print("Ingrese la cantidad de productos:")

    // Leemos la cantidad desde el teclado, la convertimos a entero y la almacenamos en la variable 'cantidad'
    val cantidad = readLine()!!.toInt()

    // Calculamos el total multiplicando el precio por la cantidad
    val total = precio * cantidad

    // Mostramos el total a pagar en pantalla
    println("El total a pagar es $total")
}
