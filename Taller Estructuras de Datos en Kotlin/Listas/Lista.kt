// Listas: Cree una lista mutable con 7 palabras, luego modifique 2 
// elementos de la lista, posteriormente  recorra la lista e imprima 
// el índice y el elemento, por ultimo ordene la lista de forma ascendente.


fun main(){
    // Creamos una lista mutable llamada palabras la cual 
    // contiene 8 numeros enteros, con la funcion intArrayOf() la cual 
    // es usada para inicializar un arreglo de enteros con valores conocidos.
    val palabras = mutableListOf("g", "f", "a", "l", "k", "b", "p")

    // Modificamos 2 elementos de nuestra lista palabras por
    // medio de su indice utilizando la sintaxis de corchetes [] 
    // y luego asignando el nuevo valor.

    // En esta primera parte se modifica el elemento con indice 2, 
    // de la lista palabras por la letra z
    palabras[2]="z"

    // En esta segunda parte se modifica el tercer elemento con indice 3,
    // de la lista palabras por la letra z
    palabras[3]="v"

    // Utilizamos la funcion forEachIndexed, para recorrer los elementos de
    // la lista, la cual toma 2 parametros: el indice actual y el elemento actual,
    // imprimiendo asi un mensaje en cada iteracion que nos muestra el indice y
    // el elemento correspondiente.
    palabras.forEachIndexed { indice, elemento ->
        println("Indice: $indice, Elemento: $elemento")
    }

    // Por medio de la funcion sorted ordenamos los elementos de 
    // la lista,en orden ascendente y luego guardamos lo anterior dicho
    // en la variable listaOrdenada
    val listaOrdenada = palabras.sorted()

    // Por ultimo procedemos a imprimir la variable donde esta la lista
    // ordenada en orden ascendente.
    println(listaOrdenada)
}















