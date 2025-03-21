// Declaramos el paquete al que pertenece este programa
package my.program

// Función principal donde comienza la ejecución del programa
fun main(parametro: Array<String>) {

    // Solicitamos al usuario que ingrese el primer valor
    print("Ingrese primer valor:")
    // Leemos el valor ingresado, lo convertimos a entero y lo almacenamos en la variable 'v1'
    val v1 = readln().toInt()

    // Solicitamos al usuario que ingrese el segundo valor
    print("Ingrese segundo valor:")
    // Leemos y convertimos el segundo valor a entero, se guarda en 'v2'
    val v2 = readln().toInt()

    // Solicitamos al usuario que ingrese el tercer valor
    print("Ingrese tercer valor:")
    // Leemos y convertimos el tercer valor a entero, se guarda en 'v3'
    val v3 = readln().toInt()

    // Solicitamos al usuario que ingrese el cuarto valor
    print("Ingrese cuarto valor:")
    // Leemos y convertimos el cuarto valor a entero, se guarda en 'v4'
    val v4 = readln().toInt()

    // Calculamos la suma del primer y segundo valor
    val suma = v1 + v2
    // Mostramos el resultado de la suma
    println("La suma de $v1 y $v2 es $suma")

    // Calculamos el producto del tercer y cuarto valor
    val producto = v3 * v4
    // Mostramos el resultado del producto
    println("El producto de $v3 y $v4 es $producto")
}
