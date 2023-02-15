/** 
* *CONDICIONALES DOBLES

**3. Algoritmo que calcule solicite el nombre y la materia de un estudiante, así como 3 notas parciales y con esto calcule el
**promedio de notas, valide que si el estudiante saca un promedio mayor o igual a 3.5 entonces indique que el estudiante ganó
**la materia, de lo contrario indique que la perdió, el mensaje deberá mencionar el nombre y la materia del estudiante.
*/

fun main(){
    // Se solicita el dato nombre por consola
    println("Ingrese su nombre: ")
    // Se guarda la informacion pedida anteriormente en la variable nombre
    // readLine() es para leer los datos desde la consola 
    // la funcion toString() devuelve una cadena
    var nombre = readLine().toString()


    // Se solicita el dato materia por consola
    println("Ingrese su materia: ")
    // Se guarda la informacion pedida anteriormente en la variable materia
    // readLine() es para leer los datos desde la consola
    // la funcion toString() devuelve una cadena
    var materia = readLine().toString()


    // Se solicita el dato nota1 por consola
    println("Ingrese la nota1: ")
    // Se guarda la informacion pedida anteriormente en la variable nota1
    // readLine es para leer los datos desde la consola
    // El operador !! es para controlar la entrada de valores nulos
    // La funcion toFloat() convierte la cadena de texto a un decimal
    var nota1 = readLine()!!.toFloat()


    // Se solicita el dato nota2 por consola
    println("Ingrese la nota2: ")
    // Se guarda la informacion pedida anteriormente en la variable nota2
    // readLine es para leer los datos desde la consola
    // El operador !! es para controlar la entrada de valores nulos
    // La funcion toFloat() convierte la cadena de texto a un decimal 
    var nota2 = readLine()!!.toFloat()


    // Se solicita el dato nota3 por consola
    println("Ingrese la nota3: ")
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


    // Se crea la condicion doble
    // Se valida si elresultado del promedio es mayor o igual a 3.5
    // o de lo contrario se indica que pierde la materia
    if(prom >= 3.5){
        // Se indica el nombre del estudiante y dicha materia 
        // ganada en una cadena de texto
       println("El estudiante $nombre GANO la materia $materia") 
    } else {
        // Por ultimo se indica el nombre del estudiante y dicha materia 
        // perdida en una cadena de texto
        println("El estudiante $nombre PERDIO la materia $materia")
    }
}