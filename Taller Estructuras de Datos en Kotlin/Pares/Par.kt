// Pares: Cree 2 pares, luego sume los valores de los 2 pares 
// por separado, después recorra el primer par, finalmente 
// convierta el segundo par a una lista por medio de una funcion.

fun main() {
    // Creamos los 2 pares por medio de la funcion pair()
    // con diferentes valores cada par.
    val par1 = Pair(1, 4)
    val par2 = Pair(2, 8)

    // Luego se procede a hacer la operacion de suma
    // de cada par por separado.
    val sumaPar1 = par1.first + par1.second
    val sumaPar2 = par2.first + par2.second

    // Despues de lo hecho anteriormente, se imprime en consola las
    // variables donde estan guardadas dichas sumas.
    println("La suma del primer par es: $sumaPar1")
    println("La suma del segundo par es: $sumaPar2")

    // Se recorre el primer par por medio de un bucle for, donde primero
    // se convierte en una lista por medio de la funcion toList(), que devolvera
    // una lista con los elementos del par.Finalmente, es utilizado para recorrer
    // cada valor de la lista e imprimirlo en consola
    for (element in par1.toList()) {
        println(element)
    }

    // Finalmente haciendo uso de la funcion toList(), convertimos el par
    // en una lista que contendra sus 2 valores.
    val lista = par2.toList()
    println(lista)
}