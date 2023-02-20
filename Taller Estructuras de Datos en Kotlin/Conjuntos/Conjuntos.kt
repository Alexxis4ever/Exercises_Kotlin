// Conjuntos:  Cree 2 conjuntos mutables de 4 numeros, después 
// elimine 1 elemento del primer conjunto y otro del segundo conjunto, 
// luego haga una unión con los 2 conjuntos, finalmente haga uso de una 
// función para cualquiera de los 2 conjuntos.

fun main(){
    // Primero creamos los conjuntos 1 y 2 
    // mutables, por medio de la interfaz MutableSet, 
    // con 4 numeros los 2
    val conjunto1 = mutableSetOf(1,2,3,4)
    val conjunto2 = mutableSetOf(5,6,7,8)

    // Por medio de la funcion remove() eliminamos un numero en especifico,
    // en este caso del conjunto 1 eliminamos el numero 4
    conjunto1.remove(4)
    // Del conjunto 2 eliminamos el numero 8
    conjunto2.remove(8)

    // Procedemos a imprimir los 2 conjuntos para verificar
    // que los numeros esten eliminados correctamente
    println(conjunto1)
    println(conjunto2)

    // Despues hacemos uso del metodo union() para unir los 2
    // conjuntos, este devolviendo la union en un nuevo conjunto
    val unionDeConjuntos = conjunto1.union(conjunto2)
    println(unionDeConjuntos)
    
    // Finalmente utilizamos la funcion contains() en el conjunto 1
    // para comprobar si el numero 3 se encuentra en el mismo.
    if(conjunto1.contains(3)){
        println("El conjunto 1 contiene el numero 3")
    }
}




