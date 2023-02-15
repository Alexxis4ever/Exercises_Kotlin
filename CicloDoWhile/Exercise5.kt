/** 
* *ESTRUCTURA ITERATIVA | DO-WHILE

**6. Algoritmo que solicite 2 numeros y realice el siguiente proceso del menú
**1. Sumar
**2. Restar
**3. Multiplicar
**4. Dividir
**5. Finalizar
**Haga el sistema con ciclos y valide que el segundo numero no sea negativo o cero en la opción 4
*/


fun main() {
    // Se crea la variable opcion de tipo entero
    var opcion: Int
    // Se crea la variable num1 de tipo decimal
    var num1: Double
    // Se crea la variable num2 de tipo decimal
    var num2: Double

    // Empieza el ciclo
    do{
        // Se solicita el dato primer numero por consola
        print("Ingrese el primer numero: ")
        // Se guarda la informacion pedida anteriormente en la variable num1
        // readLine() es para leer los datos desde la consola
        // El operador !! es para controlar la entrada de valores nulos
        // La funcion toDouble() convierte la cadena de texto a un decimal
        num1 = readLine()!!.toDouble()

        // Se solicita el dato segundo numero por consola
        print("Ingrese el segundo numero: ")
        // Se guarda la informacion pedida anteriormente en la variable num2
        // readLine() es para leer los datos desde la consola
        // El operador !! es para controlar la entrada de valores nulos
        // La funcion toDouble() convierte la cadena de texto a un decimal
        num2 = readLine()!!.toDouble()

        // Se procede a crear un menu de opciones y a imprimir el mismo por consola
        print("Elija una opcion: \n1. Sumar \n2. Restar \n3. Multiplicar \n4. Dividir \n5. Finalizar \n")


        // Usamos la variable opcion antes creada para tomar la opcion ingresada y guardarla en la misma
        // readLine() es para leer los datos desde la consola
        // El operador !! es para controlar la entrada de valores nulos
        // La funcion toInt() convierte la cadena de texto a un entero
        opcion = readLine()!!.toInt()

        // La condicion multiple when toma como parametro la opcion ingresada
        // con anterioridad y luego hace su flujo dependiendo del numero de opcion dada
        when (opcion){
            // Si la opcion ingresada es 1 el sistema hara una suma
            1 -> println("La suma es: ${num1+num2}")
            // Si la opcion ingresada es 2 el sistema hara una resta
            2 -> println("La resta es: ${num1-num2}")
            // Si la opcion ingresada es 3 el sistema hara una multiplicacion
            3 -> println("La multiplicacion es: ${num1*num2}")
            // Si la opcion ingresada es 4 el sistema hara una division
            4 -> {
                // Se valida si el numero 2 es menor o igual a 0
                if (num2 <= 0){
                    // Si es menor o igual a 0, nos indicara que no es posible
                    println("EL segundo numero no puede ser negativo o cero")
                } else {
                    // De lo contrario hara nuestra respectiva division sin problema
                    println("La division es: ${num1 / num2}")
                }
            }
            // Si la opcion ingresada es 5 el sistema dara por finalizado
            5 -> println("Programa finalizado")
            // De lo contrario si la opcion es diferente de 1, 2, 3, 4 o 5
            // nos indicara que es una opcion no valida
            else -> println("Opcion invalida")
        }
    } while(opcion != 5)
    // Finaliza siempre y cuadno la opcion sea diferente de 5
}











