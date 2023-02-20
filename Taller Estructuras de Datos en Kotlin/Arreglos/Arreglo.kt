// Arreglos: Cree un arreglo de 8 numeros enteros, despues modifique 
// uno de los elementos por 8, luego recorra dicho arreglo y 
// multiplique cada elemento.

fun main(){
    // Creamos un arreglo de enteros el cual contiene 
    // 8 numeros enteros, con la funcion intArrayOf() la cual 
    // es usada para inicializar un arreglo de enteros con valores conocidos.
    val arregloNumeros:IntArray = intArrayOf(5,7,3,4,2,5,9)

    // Modificamos el elemento con indice 2 que es = 3 y seguidamente
    // del valor a reemplazar el elemento en este caso 8.
    arregloNumeros[2]=8

    // Procedemos a imprimir el arreglo de numeros enteros, para validar
    // la modificacion que se hizo con anterioridad haciendo uso dela funcion 
    // contentToString que nos es util en este caso para obtener los elementos
    // de el arreglo en forma de cadena.
    println(arregloNumeros.contentToString())

    // Inicializamos la variable producto con valor 1.
    var producto = 1

    // Por medio del bucle for, iteramos a traves de cada elemento y 
    // multiplicamos su valor a la variable producto.
    for (elemento in arregloNumeros) {
        producto *= elemento
    }
    // Finalmente,se imprime el resultado de 
    // dicha multiplicacion o producto en consola
    println("El producto es: $producto")
}












