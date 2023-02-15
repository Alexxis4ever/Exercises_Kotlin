/** 
* *ESTRUCTURA ITERATIVA | WHILE

**5. Haga un algoritmo que solicite el nombre de n cantidad de personas que llegan a una clase, se permitirá el ingreso
**hasta que el usuario decida, el sistema deberá indicar al final la cantidad de personas que llegaron
*/

fun main(){
    // Se crea la resp de tipo String con una cadena de "si"
    var resp = "si"
    // Se crea la variable cont inicializada en 0
    var cont = 0

    // Empieza el ciclo
    // Si la condicion se cumple se ejecutara el ciclo
    // de lo contrario se terminara
    while(resp == "si"){
        // Se solicita el dato nombre por consola
        print("\nIngrese su nombre: ")
        // Se guarda la informacion pedida anteriormente en la variable nombre
        // readLine() es para leer los datos desde la consola
        // El operador !! es para controlar la entrada de valores nulos
        var nombre = readLine()!!

        // Se imprime en consola una de cadena de texto 
        // inidicando el nombre y dando una bienvenida
        println("Hola $nombre bienvenido a la clase!\n")
        // Se utiliza la variable count que itera 
        // cada vez que se ejecuta el ciclo
        cont++
        // Se solicita una respuesta para continuar ejecutando el sistema
        print("Ingrese si, si hay mas personas: ")
        // Se guarda la respuesta pedida anteriormente en la variable resp
        // readLine() es para leer los datos desde la consola
        // El operador !! es para controlar la entrada de valores nulos
        resp = readLine()!!
    }
    // Finaliza el ciclo

    // Despues de finalizar el ciclo se indica la cantidad 
    // personas que llegaron en una cadena de texto
    println("Llegaron $cont Personas!")
    // Se recalca el fin del ciclo
    println("Fin del Ciclo!")
}

