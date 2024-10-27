//basico del lenguaje kotlin/java
package com.rack.proyecto1

val variableGlobal = 3 //variable/constante que funciona en todas las funciones

//las funciones se declaran asi, main() es la principal
fun main() {
    print("hola") //imprimir por consola
    println("hola") //imprimir por consola y salto de linea

    val constante = "aa" //igual que var pero no se puede cambiar
    var variable = "asdf" //variable de cualquier tipo (solo funcionaria en esta funcion) (tienen que tener valor asignado desde el principio)
    var variable2 = 34
    var variable3:Any = false //lo mismo que ponerle tipo Any
    var variableNumero: Int = 5 //esta solo admitiria enteros (Int, Long, Short, Byte)
    var variableDecimal: Float = 5.4f //lo mismo pero con decimales (Float, Double)
    var variableDouble: Double = 5.4
    var caracter: Char = 'e' //un caracter
    var texto: String = "asdfd" //textos
    var booleano: Boolean = true //true o false
    println(variableDouble) //print admite cualquier variable
    variableNumero = 3 //se puede cambiar el valor de var
    println(variableGlobal) //accediendo a una variable declarada fuera de la funcion
    var nula:String? = null //null representa ningun valor, para que una variable pueda ser nula neceista el ?
    println(nula?.toString() ?: "null") //solo hace eso en caso de no ser null, si es null hace lo otro (?:)
    //println(nula!!.toString()) //lo hace si o si, pero si es null crashea

    variableNumero = 3 + 2 - 4 * 6 / 8 % 2 //operaciones con variables
    texto = "asdf" + "asddf" //concatenacion de strings
    variableNumero += 2 //autooperar
    variableNumero++ //incrementar
    println(variableNumero)
    println("asdfasdfasdfasdf")
    variableNumero += 3 //autooperar
    println(1 + 1) //operando en funciones
    //las conversiones implicitas son igual que en java (ej: division con doubles)
    variableNumero = variableDecimal.toInt() //conversion explicita
    texto = variableNumero.toString() //se puede de casi cualquier tipo primitivo a otro
    texto = "aa $variableNumero" //otra forma de concatenar
    texto = texto.toUpperCase() //a mayusculas o minusculas
    caracter = texto[2] //se refiere al tercer caracter

    funcion()//llamar a una funcion
    procesar(4) //llamar a una funcion con parametro
    println(procesar(4)) //devolveria el valor procesado por la funcion, ya que tiene return
    println("aa \$${procesar(3, 4)} asdf") //ejecutar una funcion en un string porque devuelve texto (concatenacion)

    if (texto == "aa") { //if en kotlin (|| && !) (> < >= <= ==)

    } else if (booleano) {

    } else {

    }
    when(variableNumero) { //switch case con una sola linea por cada opcion
        1 -> println("uno") //si ya entra en un caso no evalua el siguiente
        2 -> {
            println("dos")
            println("dos2") //asi si se podrian poner varias lineas por opcion
        }
        3, 4, 5, 8 -> println("tres") //varios casos en uno
        in 6..10 -> println("entre 6 y 10") //rango
        !in 6..10 -> println("no esta entre 6 y 10") //rango
        else -> println("no") //el else es obligatorio, funciona como default case
    }
    when (variable3){ //en caso de que una variable sea tipo Any, se puede saber el tipo asi
        is Int -> println("es un int")
        is String -> println("es un string")
        !is String -> println("no es un string")
    }
    val resultadoWhen:String = when(variableNumero){ //guardando contenido en una variable usando when
        1 -> "uno"
        2 -> "uno"
        else -> "no"
    }

    while (false){ //bucle while

    }
    for (i in 0..10){ //bucle for, se necesita generar un array
        println(i) //imprime del 0 al 10
        break; //sale del bucle inmediatamente
    }
    for (i in 10 downTo 0 step 2){ //bucle que decrementa, y de 2 en 2
        println(i)
        continue; //salta a la siguiente iteracion
    }
    do { //bucle while que se ejecuta almenos una vez

    } while (false)

    val nombres = arrayOf("asdf", "affadf", 3, arrayOf(1, 5)) //en kotlin los arrays tienen tamagno fijo pero su tipo puede cambiar (para que sean de un tipo se puede con intArrayOf, etc) (se declaran como constantes)
    println(nombres[2]) //acceder a una posicion del array (tanto para lectura como escritura)
    println(nombres.size) //int del tamagno del array (como .length)
    for (posicion in nombres.indices){ //recorrer array con un bucle
        println(posicion) //el numero de posicion, desde el 0 hasta el .size
        println(nombres[posicion]) //el valor de la posicion
    }
    for (nombre in nombres) {
        println(nombre)
    }

    val listaFija:List<String> = listOf("asdf", "asdfa", "fasdf") //lista inmutable, en este caso funciona igual que un array pero de solo un tipo
    println(listaFija.size)
    println(listaFija) //en este caso si se imprime la lista
    println(listaFija[1])
    println(listaFija.last()) //devuelve el ultimo valor
    println(listaFija.filter { it.contains("a") }) //devuelve una lista con los valores que cumplan la condicion
    listaFija.forEach { elemento -> println(elemento) } //ejecutar algo por cada valor de la lista (se le puede cambiar el nombre a it)
    var lista:MutableList<Int> = mutableListOf(1, 2, 3) //lista mutable, funciona igual pero el tamagno varia
    lista.add(0, 33) //agnadir una posicion en otra especifica, las de mas adelante se desplazaran (si no se pone la posicion se agrega al final)
    lista.removeAt(1) //eliminar una posicion
    booleano = lista.isEmpty() //devuelve true si esta vacia
    lista.sort() //ordenar la lista (si es string alfabeticamente, si es numeros de menor a mayor))
    lista.clear() //elimina toda la lista


}

fun funcion() { //otra funcion distinta de la principal
    println("contenido" + variableGlobal.toString())
}

fun procesar(
    parametro: Int,
    otroParametro: Int = 2
): Int { //funcion que recibe parametros (el :Int al final es para que pueda retornar un valor)
    println(parametro) //los parametros son constantes
    return parametro + otroParametro //devolver un valor (solo si la funcion era de un tipo (:Int))
    //a partir de aqui no se ejecuta nada
}

fun procesar2(a: Int, b: Int) = a - b //una funcion de solo una linea