/** 
* *CONDICIONALES MULTIPLES CON WHEN

**2. Basado en el siguiente menú
**1. Saludar
**2. Pedir Nombre de una Persona
**3. Sumar 2 Números
**Haga un algoritmo que dependiendo del código ingresado, realice la acción correspondiente
*/


fun main(){

    // Se crea la variable menu la cual contendra sus respectivas opciones
    var menu = """
    MENU DE OPCIONES
    1. Saludar
    2. Pedir Nombre de una Persona
    3. Sumar 2 Numeros
    Ingrese una opcion:"""

    // Se imprime en consola el menu
    print(menu)

    // Se crea una variable opcion para tomar la opcion ingresada
    // y guardarla en la misma
    // readLine() es para leer los datos desde la consola
    // El operador !! es para controlar la entrada de valores nulos
    // La funcion toInt() convierte la cadena de texto a un entero
    var opcion = readLine()!!.toInt()

    // La condicion multiple when toma como parametro la opcion ingresada
    // con anterioridad y luego hace su flujo dependiendo del numero de opcion dada
    when (opcion){
        // Si la opcion ingresada es 1 el sistema saludara
        1 -> println("Hola!")
        // Si la opcion ingresada es 2 el sistema pide el nombre de una persona
        2 -> {
            // Se solicita el dato nombre por consola
            print("Ingrese el nombre de una persona: ")
            // Se guarda la informacion pedida anteriormente en la variable name
            // readLine() es para leer los datos desde la consola
            var  name = readLine()
            // Se imprime en consola el saludo y el nombre ingresado
            println("Hola, $name")
        }
        // Si la opcion ingresada es 3 el sistema pide 2 numeros
        // y hace su respectiva suma
        3 ->{
            // Se solicita el dato num1 por consola
            print("Ingrese el primer numero: ")
            // Se guarda la informacion pedida anteriormente en la variable num1
            // readLine() es para leer los datos desde la consola
            // El operador !! es para controlar la entrada de valores nulos
            // La funcion toInt() convierte la cadena de texto a un entero
            var num1 = readLine()!!.toInt()

            // Se solicita el dato num2 por consola
            print("Ingrese el segundo numero: ")
            // Se guarda la informacion pedida anteriormente en la variable num2
            // readLine() es para leer los datos desde la consola
            // El operador !! es para controlar la entrada de valores nulos
            // La funcion toInt() convierte la cadena de texto a un entero
            var num2 = readLine()!!.toInt()

            // Se crea la variable sum para hacer la suma de num1 + num2 y se guarda en la misma
            var sum = (num1 + num2)
            // Se imprime en consola la respectiva suma junto con una cadena de texto
            println("La suma de $num1 y $num2 es: "+sum)
        }
        // De lo contrario si la opcion ingresada es diferente de 1, 2 o 3
        // el sistema nos indica que la opcion es invalida
        else -> println("Opcion es invalida")
    }
}
