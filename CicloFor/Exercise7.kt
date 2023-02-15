/** 
* *ESTRUCTURA ITERATIVA | FOR

**3. Haga un algoritmo que solicite n números e indique si son positivos o negativos, también debe indicar si tiene uno o
**más de 2 dígitos
*/

fun main(){
    // Se solicita la cantidad de veces a repetir el sistema por consola
    print("Ingrese la cantidad de veces a repetir: ")
    // Se guarda la informacion pedida anteriormente en la variable cant
    // readLine() es para leer los datos desde la consola
    // El operador !! es para controlar la entrada de valores nulos
    // La funcion toInt() convierte la cadena de texto a un entero
    var cant = readLine()!!.toInt()

    //Empieza el ciclo

    // Se indica el rango de numeros de comienzo y parada
    // y se utiliza la palabra until para iterar en dicho rango pero 
    // sin incluir su elemento final, en este caso la variable cant
    for (i in 0 until cant) {
        // Se solicita el dato numero 1 por consola
        print("Ingrese numero 1: ")
        // Se guarda la informacion pedida anteriormente en la variable x
        // readLine() es para leer los datos desde la consola
        // El operador !! es para controlar la entrada de valores nulos
        // La funcion toInt() convierte la cadena de texto a un entero
        var x = readLine()!!.toInt()


        // Se solicita el dato numero 2 por consola
        print("Ingrese numero 2: ")
        // Se guarda la informacion pedida anteriormente en la variable y
        // readLine() es para leer los datos desde la consola
        // El operador !! es para controlar la entrada de valores nulos
        // La funcion toInt() convierte la cadena de texto a un entero
        var y = readLine()!!.toInt()


        // Se crea la variable suma para hacer la operacion en este caso x+y
        var suma = x + y
        // Se imprime en consola el resultado de la variable suma junto con una cadena de texto
        println("La suma es: $suma")


    // La condicion multiple when toma como parametro el resultado de la suma
    // con anterioridad y luego hace su flujo dependiendo del caso
        when{
            // Si la suma es mayor o igual a 10 se indica que la suma es de 2 digitos y positivo
            suma >= 10 -> println("La suma es mayor o igual a dos digitos y es positivo")
            
            // Si la suma es menor o igual a 0 se indica que la suma arrojo un valor negativo
            suma <= 0 -> {
                println("La suma arrojo un valor negativo")

                // Se valida si la suma es menor o igual a -10 y se indica que es mayor 
                // o igual a 2 digitos y es negativo
                if(suma <= -10){
                    println("La suma es mayor o igual a dos digitos y es negativo!")
                
                // De lo contrario el sistema indica la suma tiene un valor de un digito
                } else {
                    println("La suma arroja un valor de un digito")
                }
            }

            // De lo contrario si la suma arroja otro tipo de dato que no este en el flujo anterior
            // se indica que la suma arroja un valor de un digito y es positivo
            else -> println("La suma arroja un valor de un digito y es positivo!")
        }
    }
    //Finaliza el ciclo
}

