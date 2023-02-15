/** 
* *CONDICIONALES SIMPLES

* * 5. Algoritmo que calcule solicite el nombre y la materia de un estudiante, así como 3 notas parciales y con 
* * esto calcule el promedio de notas, valide que si el estudiante saca un promedio menor que 3.5 entonces 
* * indique que el estudiante perdió la materia, el mensaje deberá mencionar el nombre y la materia del estudiante.
*/

fun main(){
    // Se solicita el dato nombre por consola
    println("Ingrese su nombre: ")
    // Se guarda la informacion pedida anteriormente en la variable nombre
    // readLine() es para leer los datos desde la consola
    var nombre = readLine()

    // Se solicita el dato materia por consola
    println("Ingrese su materia: ")
    // Se guarda la informacion pedida anteriormente en la variable materia
    // readLine() es para leer los datos desde la consola
    var materia = readLine()

    // Se solicita el dato nota1 por consola
    println("Ingrese la nota 1: ")
    // Se guarda la informacion pedida anteriormente en la variable nota1
    // readLine es para leer los datos desde la consola
    // El operador !! es para controlar la entrada de valores nulos
    // La funcion toFloat() convierte la cadena de texto a un decimal
    var nota1 = readLine()!!.toFloat()


    // Se solicita el dato nota2 por consola
    println("Ingrese la nota 2: ")
    // Se guarda la informacion pedida anteriormente en la variable nota2
    // readLine es para leer los datos desde la consola
    // El operador !! es para controlar la entrada de valores nulos
    // La funcion toFloat() convierte la cadena de texto a un decimal   
    var nota2 = readLine()!!.toFloat()


    // Se solicita el dato nota3 por consola
    println("Ingrese la nota 3: ")
    // Se guarda la informacion pedida anteriormente en la variable nota3
    // readLine es para leer los datos desde la consola
    // El operador !! es para controlar la entrada de valores nulos
    // La funcion toFloat() convierte la cadena de texto a un decimal
    var nota3 = readLine()!!.toFloat()


    // Se crea la variable prom para hacer el promedio y
    // guardarlo en la misma
    var prom = (nota1 + nota2 + nota3) / 3


    // Se imprime en consola el resultado del promedio
    // junto con un mensaje en una cadena de texto
    println("El promedio de notas es: $prom")


    // Se crea la condicion simple
    // Se valida si elresultado del promedio es mayor a 3.5
    if (prom < 3.5){
        // Por ultimo se indica el nombre del estudiante y dicha materia 
        // perdida en una cadena de texto
        println("El estudiante $nombre perdio la materia $materia")
    }
}


















