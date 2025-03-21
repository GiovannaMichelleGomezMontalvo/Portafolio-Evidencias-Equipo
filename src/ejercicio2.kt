/*Creado por giovanna michelle el 14-03-25*/
package my.program

fun main(parametro: Array<String>) {
    //definimos e inicializamos dos variables int inmutables(utilizamos la palabra clave val):

    val valor1: Int
    val valor2: Int
    valor1 = 100
    valor2 = 400

    //definimos un tercer variable mutable tambien de tipo int
    var resultado: Int

    /*Primero en la variable resultado almacenamos la suma de los contenidos de las variables
    valor1 y valor2*/

    resultado = valor1 + valor2

    /*Para mostrar por la Consola el contenido de la variable $resultado utilizamos la función
    println y dentro del String que muestra donde queremos que aparezca el contenido de la
    variable le antecedimos el caracter $*/

    println("La suma de $valor1 + $valor2 es $resultado")


    /*Como la variable resultado es mutable podemos ahora almacenar el producto de las dos
    primeras variables*/

    resultado = valor1 * valor2
    println("El producto de $valor1 * $valor2 es $resultado")
}