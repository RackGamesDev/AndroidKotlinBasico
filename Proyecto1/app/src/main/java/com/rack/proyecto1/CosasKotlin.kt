//basico del lenguaje kotlin/java
package com.rack.proyecto1

import android.icu.text.DecimalFormat //importar paquete externo
import kotlin.random.Random

val variableGlobal = 3 //variable/constante que funciona en todas las funciones

//las funciones se declaran asi, main() es la principal
fun main() {
    print("hola") //imprimir por consola
    println("hola") //imprimir por consola y salto de linea

    val constante = "aa" //igual que var pero no se puede cambiar
    var variable = "asdf" //variable de cualquier tipo (solo funcionaria en esta funcion) (tienen que tener valor asignado desde el principio)
    var variable2 = 34
    var variable3:Any = false //lo mismo que ponerle tipo Any
    //al declarar variables de un tipo primitivo se puede poner una u (UInt, UShort) que hacen que puedan ser nulas y se inicializan con: 3432u
    var variableNumero: Int = 5 //esta solo admitiria enteros (Int, Long, Short, Byte)
    var variableDecimal: Float = 5.4f //lo mismo pero con decimales (Float, Double)
    var variableDouble: Double = 5.4
    var caracter: Char = 'e' //un caracter (se pueden usar escapes como \n \" \\ \' etc)
    var texto: String = "asdfd" //textos (un string es un array de char por lo que todas las funciones de array funcionaran)
    var booleano: Boolean = true //true o false
    booleano = !booleano && booleano //operaciones con booleanos
    println(variableDouble) //print admite cualquier variable
    variableNumero = 3 //se puede cambiar el valor de var
    println("aaa $variableNumero") //poniendo una variable en un string
    println("aaa ${variableNumero + 1}") //poniendo expresiones en un string
    println(variableGlobal) //accediendo a una variable declarada fuera de la funcion
    var nula:String? = null //null representa ningun valor, para que una variable pueda ser nula neceista el ? (si es nullable deja de ser un dato primitivo y se convierte en un puntero)
    println(nula?.toString() ?: "null") //solo hace eso en caso de no ser null, si es null hace lo otro (?:)
    variable2 = variableNumero ?: return //si no es del tipo correcto sale de la funcion (en el main no tendria sentido)
    //println(nula!!.toString()) //lo hace si o si, pero si es null crashea


    variableNumero = 3 + 2 - 4 * 6 / 8 % 2 //operaciones con variables
    variable2 = variableNumero.also{variableNumero = variable2} //intercambiar dos variables
    texto = "asdf" + "asddf" //concatenacion de strings
    texto = """as
        |asdf
    """.trimMargin()//string de varias lineas, trimMargin arregla el texto usando | por defecto
    variableNumero += 2 //autooperar
    variableNumero++ //incrementar
    println(variableNumero)
    variableNumero += 3 //autooperar
    println(1 + 1) //operando en funciones
    //las conversiones implicitas son igual que en java (ej: division con doubles)
    variableNumero = variableDecimal.toInt() //conversion explicita (se puede a casi cualquier tipo de variable)
    var numDecimal = 0x0fa3 //numero decimal
    numDecimal+=1 //es igualmente operable
    var numeroBinario = 0b01110 //en binario tambien
    variableNumero = 23_453 //las _ no significan nada
    val numeroGrande = 999999999L //hay varios tamagnos de int
    println(numeroBinario xor 0b1101) //para binarios y hexadecimales hay operaciones como inv, xor, or, and, ushr, shr, shl
    booleano = Random.nextBoolean() //generar bool aleatorio
    variableNumero = (0..10).random() //generar numero aleatorio a partir de rango


    texto = variableNumero.toString() //se puede de casi cualquier tipo primitivo a otro
    texto = "aa $variableNumero" //otra forma de concatenar
    texto = texto.uppercase() //a mayusculas o minusculas (hay muchas mas funciones para )
    caracter = texto[2] //se refiere al tercer caracter
    //val formato = DecimalFormat("#.##")
    //texto = formato.format(variableDecimal) //formatear con decimales
    texto = readln() //lee por consola (usado solo en kotlin en consola de comandos)

    funcion()//llamar a una funcion
    procesar(4) //llamar a una funcion con parametro
    println(procesar(4)) //devolveria el valor procesado por la funcion, ya que tiene return
    println("aa \$${procesar(3, 4)} asdf") //ejecutar una funcion en un string porque devuelve texto (concatenacion)

    if (texto == "aa") { //if en kotlin (|| && !) (> < >= <= ==)
    } else if (booleano) {
    } else {
    }
    if (variableNumero in 1..5){ //para saber si un numero esta en un rango
    }
    booleano = if (texto == "b") true else false //if que devuelve un valor
    if (variableNumero is Int){ //para saber si una variable es de un tipo
    }
    when(variableNumero) { //switch case con una sola linea por cada opcion (al igual que el if podria devolver un valor con x = when(y){...})
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
    val resultadoWhen:String = when(variableNumero){ //guardando contenido en una variable usando when porque when devuelve un valor
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
    nombres.apply{fill("a")} //rellenar el array con un valor
    //hay muchas mas funciones con los arrays

    val listaFija:List<String> = listOf("asdf", "asdfa", "fasdf") //lista inmutable, en este caso funciona igual que un array pero de solo un tipo
    println(listaFija.size)
    println(listaFija) //en este caso si se imprime la lista
    println(listaFija[1])
    println(listaFija.last()) //devuelve el ultimo valor
    listaFija.contains("asdf") //devuelve true si contiene el valor
    listaFija.indexOf("asdf") //devuelve la posicion del valor
    booleano = "asdf" in listaFija //devuelve true si contiene el valor
    listaFija.filter { it.contains("a") }.forEach{println(it)} //devuelve una lista con los valores que cumplan la condicion
    listaFija.forEach { elemento -> println(elemento) } //ejecutar algo por cada valor de la lista (se le puede cambiar el nombre a it)
    //hay muchas mas funciones con las listas

    var lista:MutableList<Int> = mutableListOf(1, 2, 3) //lista mutable, funciona igual pero el tamagno varia
    lista.add(0, 33) //agnadir una posicion en otra especifica, las de mas adelante se desplazaran (si no se pone la posicion se agrega al final)
    lista.removeAt(1) //eliminar una posicion
    booleano = lista.isEmpty() //devuelve true si esta vacia
    lista.sort() //ordenar la lista (si es string alfabeticamente, si es numeros de menor a mayor))
    lista.clear() //elimina toda la lista
    //hay muchas mas funciones con las listas mutables

    var mapa = mapOf("a" to 1, "b" to true, 1 to "eeeee") //como una lista pero cada elemento se asocia con otro (tamagno fijo, .size)
    println(mapa["a"])
    println(mapa[1])
    mapa.keys.forEach{println(it)} //array con todas las claves de los elementos
    mapa.values.forEach{println(it)} //array con todos los elementos
    //hay muchas mas funciones con los mapas

    var elSet = setOf("a", "asdf", "dfasdf", "a") //parecido a un array pero sin elementos repetidos
    //println(elSet.elementAt(3)) //este no estaria y daria error

    try{
        //si falla este codigo (al igual que los ifs tambien podria devolver algo con x = try{...})
        throw IllegalArgumentException("error") //lanza un error personalizado (se pueden lanzar en cualquier momento)
        error("error algo") //otra forma de hacerlo
    }catch(e: Exception){
        print(e.message) //entra aqui con el error localizado
    } finally{
        //codigo que se ejecuta haya error o no
    }

    var instanciaEstr:Estructura = Estructura //instanciando una estructura (struct), similar a una clase
    instanciaEstr.nombre = "asdf" //tiene las propiedades ya declaradas de dicha estructura
}

fun funcion() { //otra funcion distinta de la principal
    println("contenido" + variableGlobal.toString())
}

fun procesar(parametro: Int, otroParametro: Int = 2): Int { //funcion que recibe parametros (el :Int al final es para que pueda retornar un valor)
    require(parametro > 0) { "error, debe ser mayor que 0" } //lanzar un error (similar a throw) si un argumento no es valido
    checkNotNull(parametro) {"error, no puede ser null"} //lanza un error si el argumento es null

    println(parametro) //los parametros son constantes
    return parametro + otroParametro //devolver un valor (solo si la funcion era de un tipo (:Int))
    //a partir de aqui no se ejecuta nada
}

fun procesar2(a: Int, b: Int) = a - b //una funcion de solo una linea

object Estructura{ //declarando una estructura para crear variables que tengan este contenido
    var nombre = ""
    var tamagno = 0
}