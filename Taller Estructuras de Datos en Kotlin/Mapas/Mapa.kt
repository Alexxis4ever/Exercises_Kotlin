// Cree un mapa mutable con 5 elementos, luego actualice el valor de 2
// elementos, después elimine 1 elemento, también recorra el mismo
// y por ultimo usando una función imprima las claves del mapa.



fun main(){
    // Creamos un mapa mutable por medio de la funcion mutableMapOf
    // con 5 elementos y sus respectivas claves.
    val mapa = mutableMapOf("a" to 1, "b" to 2, "c" to 3, "d" to 4, "e" to 5)

    // Modificamos el valor de el elemento "a" a 8. 
    mapa["a"] = 8
    // luego Modificamos el valor de el elemento "c" a 7.
    mapa["c"] = 7 

    // Eliminamos un elemento con la funcion remove(), usando su clave
    // en este caso clave "b"
    mapa.remove("b")

    // Luego se imprime el mapa en consola para ver 
    // los cambios hechos anteriormente
    println(mapa)

    // Por medio del método forEach iteramos sobre las entradas del mapa,
    // tomando este como parametro una clave y un valor e imprimiendo su clave
    // con su respectivo valor
    mapa.forEach { (clave, valor) ->
        println("$clave = $valor")
    }

    // Por medio de la funcion keys() obtenemos la lista de claves del mapa
    val claves = mapa.keys
    println(claves)
}