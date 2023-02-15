/** 
* *CONDICIONALES ANIDADOS

**4. De un operario se conoce su sueldo y los años de antigüedad. Se pide crear un programa que lea 
**los datos de entrada e informe:
**-Si el sueldo es inferior a 500 y su antigüedad es igual o superior a 10 años, otorgarle un aumento del 20%, mostrar el sueldo
**a pagar.
**-Si el sueldo es inferior a 500 pero su antigüedad es menor a 10 años, otorgarle un aumento de 5%.
**-Si el sueldo es mayor o igual a 500 mostrar el sueldo en pantalla sin cambios.
*/


fun main(){
    // Se solicita el dato sueldo por consola
    print("Ingrese su sueldo: ")
    // Se guarda la informacion pedida anteriormente en la variable valorSueldo
    // readLine() es para leer los datos desde la consola
    // El operador !! es para controlar la entrada de valores nulos
    // La funcion toDouble() convierte la cadena de texto a un decimal
    var valorSueldo = readLine()!!.toDouble()


    // Se solicita el años de antiguedad por consola
    print("Ingrese su años de antiguedad: ")
    // Se guarda la informacion pedida anteriormente en la variable añosAntiguedad
    // readLine() es para leer los datos desde la consola
    // El operador !! es para controlar la entrada de valores nulos
    // La funcion toInt() convierte la cadena de texto a un entero
    var añosAntiguedad = readLine()!!.toInt()


    // Se crea las condiciones anidadas 
    // Se valida si valorSueldo es menor a 500 y si añosAntiguedad
    // es mayor o igual a 10
    if(valorSueldo < 500 && añosAntiguedad >=10){
        // Se hace la operacion recibiendo un parametro valorSueldo y 20%.
        var aumento:Double = (valorSueldo * 0.20)
        // Se hace la operacion recibiendo un parametro valorSueldo y aumento.
        var sueldoFinal:Double = (valorSueldo + aumento)
        // Se indica el % de aumento y su nuevo sueldo en una cadena de texto
        println("Usted tiene un aumento del 20%, su sueldo nuevo es: $ $sueldoFinal")
    
    // Se valida si valorSueldo es menor a 500 y si añosAntiguedad
    // es menor a 10
    } else if (valorSueldo <500 && añosAntiguedad <10 ){
        // Se hace la operacion tomando valorSueldo y 5%.
        var aumento:Double = (valorSueldo * 0.05)
        // Se hace la operacion recibiendo un parametro valorSueldo y aumento.
        var sueldoFinal:Double = (valorSueldo + aumento)
        // Se indica el % de aumento y su nuevo sueldo en una cadena de texto
        println("Usted tiene un aumento del 5%, su sueldo nuevo es: $ $sueldoFinal")

    // De lo contrario se indica que no hay aumento alguno  
    } else {
        // Se indica que el aumento no tiene cambios y se imprime el mismo en una cadena de texto
        println("Usted no tiene ningun aumento, su sueldo es: $ $valorSueldo")
    }
}
