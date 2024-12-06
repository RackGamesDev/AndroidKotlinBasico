//Basico del lenguaje kotlin/java
package com.rack.proyecto1 //Indicar a que paquete pertenece el codigo (carpetas)

import android.icu.text.DecimalFormat //Importar paquete externo
import kotlinx.coroutines.*
import kotlin.random.Random

val variableGlobal = 3 //Variable/constante que funciona en todas las funciones

//Las funciones se declaran asi, main() es la inicial
fun main() {
    print("hola") //Imprimir por consola
    println("hola") //Imprimir por consola y salto de linea

    val constante = "aa" //Igual que var pero no se puede cambiar
    var variable = "asdf" //Variable de cualquier tipo (solo funcionaria en esta funcion) (tienen que tener valor asignado desde el principio)
    var variable2 = 34
    var variable3:Any = false //Lo mismo que ponerle tipo Any, tambien puede ser de :dynamic
    //Al declarar variables de un tipo primitivo se puede poner una u (UInt, UShort) que hacen que puedan ser nulas y se inicializan con: 3432u
    var variableNumero: Int = 5 //Esta solo admitiria enteros (Int, Long, Short, Byte)
    var variableDecimal: Float = 5.4f //Lo mismo pero con decimales (Float, Double)
    var variableDouble: Double = 5.4
    var caracter: Char = 'e' //Un caracter (se pueden usar escapes como \n \" \\ \' etc)
    var texto: String = "asdfd" //Textos (un string es un array de char por lo que todas las funciones de array funcionaran)
    var booleano: Boolean = true //true o false
    booleano = !booleano && booleano //Operaciones con booleanos
    println(variableDouble) //print admite cualquier variable
    variableNumero = 3 //Se puede cambiar el valor de var
    println("aaa $variableNumero") //Poniendo una variable en un string
    println("aaa ${variableNumero + 1}") //Poniendo expresiones en un string
    println(variableGlobal) //Accediendo a una variable declarada fuera de la funcion


    var nula:String? = null //null representa ningun valor, para que una variable pueda ser nula neceista el ? (si es nullable deja de ser un dato primitivo y se convierte en un puntero)
    println(nula?.toString() ?: "null") //Solo hace eso en caso de no ser null, si es null hace lo otro (?:) (la parte del ?: "null" es opcional) (tambien se podria usar ?: throw Exception())
    variable2 = variableNumero ?: return //Si no es del tipo correcto sale de la funcion (en el main no tendria sentido)
    variable2 = variableNumero!! //Aunque sea una variable nullable, la trata como normal (y podria dar error)
    nula?.let{println(it)} //Funcion lambda para nullables, si no es null ejecuta lo que este dentro
    val puedeInt:Int? = variable3 as? Int //Intentando castear una variable tipo Any a Int, si falla devuelve null


    variableNumero = 3 + 2 - 4 * 6 / 8 % 2 //Operaciones con variables
    variable2 = variableNumero.also{variableNumero = variable2} //Intercambiar dos variables
    texto = "asdf" + "asddf" //Concatenacion de strings
    texto = """as
        |asdf
    """.trimMargin()//string de varias lineas, trimMargin arregla el texto usando | por defecto
    variableNumero += 2 //Autooperar
    variableNumero++ //Incrementar
    println(variableNumero)
    println(1 + 1) //Operando en funciones
    //Las conversiones implicitas son igual que en java (ej: division con doubles)
    variableNumero = variableDecimal.toInt() //Conversion explicita (se puede a casi cualquier tipo de variable)
    var numDecimal = 0x0fa3 //Numero decimal
    numDecimal+=1 //Es igualmente operable
    var numeroBinario = 0b01110 //En binario tambien
    variableNumero = 23_453 //Las _ no significan nada
    val numeroGrande = 999999999L //Hay varios tamagnos de int
    println(numeroBinario xor 0b1101) //Para binarios y hexadecimales hay operaciones como inv, xor, or, and, ushr, shr, shl
    booleano = Random.nextBoolean() //Generar bool aleatorio
    variableNumero = (0..10).random() //Generar numero aleatorio a partir de rango


    texto = variableNumero.toString() //Se puede de casi cualquier tipo primitivo a otro
    texto = "aa $variableNumero" //Otra forma de concatenar
    texto = texto.uppercase() //A mayusculas o minusculas (hay muchas mas funciones para )
    caracter = texto[2] //Se refiere al tercer caracter
    //val formato = DecimalFormat("#.##")
    //texto = formato.format(variableDecimal) //Formatear con decimales
    texto = readln() //Lee por consola (usado solo en kotlin en consola de comandos)


    if (texto == "aa") { //if en kotlin (|| && !) (> < >= <= ==)
        //== es para comparar si dos variables tienen el mismo contenido (como .equals()), en caso de ser un objeto se puede usar === para saber si referencian al mismo
    } else if (booleano) {
    } else {
    }
    if (variableNumero in 1..5){ //Para saber si un numero esta en un rango
    }
    booleano = if (texto == "b") true else false //if que devuelve un valor
    if (variableNumero is Int){ //Para saber si una variable es de un tipo
    }
    when(variableNumero) { //switch case con una sola linea por cada opcion (al igual que el if podria devolver un valor con x = when(y){...})
        1 -> println("uno") //Si ya entra en un caso no evalua el siguiente
        2 -> {
            println("dos")
            println("dos2") //Asi si se podrian poner varias lineas por opcion
        }
        3, 4, 5, 8 -> println("tres") //Varios casos en uno
        in 6..10 -> println("entre 6 y 10") //Rangos
        !in 6..10 -> println("no esta entre 6 y 10")
        else -> println("no") //El else es obligatorio, funciona como default case
    }
    when (variable3){ //En caso de que una variable sea tipo Any, se puede saber el tipo asi
        is Int -> println("es un int")
        is String -> println("es un string")
        !is String -> println("no es un string")
    }
    val resultadoWhen:String = when(variableNumero){ //Guardando contenido en una variable usando when porque when devuelve un valor
        1 -> "uno"
        2 -> "uno"
        else -> "no"
    }

    while (false){ //Bucle while
    }
    for (i in 0..10){ //Bucle for, se necesita generar un array (tambien podria ser 'a'..'z' para rangos con char)
        println(i) //Imprime del 0 al 10
        break; //Sale del bucle inmediatamente
    }
    for (i in 10 downTo 0 step 2){ //Bucle que decrementa, y de 2 en 2
        println(i)
        continue; //Salta a la siguiente iteracion
    }
    do { //Bucle while que se ejecuta almenos una vez

    } while (false)

    val nombres = arrayOf("asdf", "affadf", 3, arrayOf(1, 5)) //En kotlin los arrays tienen tamagno fijo pero su tipo puede cambiar (para que sean de un tipo se puede con intArrayOf, etc) (se declaran como constantes)
    println(nombres[2]) //Acceder a una posicion del array (tanto para lectura como escritura)
    println(nombres.size) //int del tamagno del array (como .length)
    for (posicion in nombres.indices){ //Recorrer array con un bucle
        println(posicion) //El numero de posicion, desde el 0 hasta el .size
        println(nombres[posicion]) //El valor de la posicion
    }
    for (nombre in nombres) {
        println(nombre)
    }
    nombres.apply{fill("a")} //Rellenar el array con un valor
    //Hay muchas mas funciones con los arrays

    val listaFija:List<String> = listOf("asdf", "asdfa", "fasdf") //Lista inmutable, en este caso funciona igual que un array pero de solo un tipo
    println(listaFija.size)
    println(listaFija) //En este caso si se imprime la lista
    println(listaFija[1])
    println(listaFija.last()) //Devuelve el ultimo valor
    listaFija.contains("asdf") //Devuelve true si contiene el valor
    listaFija.indexOf("asdf") //Devuelve la posicion del valor
    booleano = "asdf" in listaFija //Devuelve true si contiene el valor
    listaFija.filter { it.contains("a") }.forEach{println(it)} //Devuelve una lista con los valores que cumplan la condicion
    listaFija.forEach { elemento -> println(elemento) } //Ejecutar algo por cada valor de la lista (se le puede cambiar el nombre a it)
    println(listOf(1, 2, 3).filter(::esPar)) //Esto se puede hacer con funciones declaradas de la misma manera
    //Hay muchas mas funciones con las listas

    var lista:MutableList<Int> = mutableListOf(1, 2, 3) //Lista mutable, funciona igual pero el tamagno varia
    lista.add(0, 33) //Agnadir una posicion en otra especifica, las de mas adelante se desplazaran (si no se pone la posicion se agrega al final)
    lista.removeAt(1) //Eliminar una posicion
    booleano = lista.isEmpty() //Devuelve true si esta vacia
    lista.sort() //Ordenar la lista (si es string alfabeticamente, si es numeros de menor a mayor))
    lista.clear() //Elimina toda la lista
    //Hay muchas mas funciones con las listas mutables

    var mapa = mapOf("a" to 1, "b" to true, 1 to "eeeee") //Como una lista pero cada elemento se asocia con otro (tamagno fijo, .size) (se podria llegar a usar para instanciar una clase)
    println(mapa["a"])
    println(mapa[1])
    mapa.keys.forEach{println(it)} //array con todas las claves de los elementos
    mapa.values.forEach{println(it)} //array con todos los elementos
    //Hay muchas mas funciones con los mapas

    var elSet = setOf("a", "asdf", "dfasdf", "a") //Parecido a un array pero sin elementos repetidos
    //println(elSet.elementAt(3)) //Este no estaria y daria error

    //Hay muchos mas tipos de colecciones e incluso se podrian crear nuevas

    try{
        //Si falla este codigo (al igual que los ifs tambien podria devolver algo con x = try{...})
        throw IllegalArgumentException("error") //Lanza un error personalizado (se pueden lanzar en cualquier momento)
        error("error algo") //Otra forma de hacerlo
    }catch(e: Exception){
        print(e.message) //Entra aqui con el error localizado
    } finally{
        //Codigo que se ejecuta haya error o no
    }

    funcion()//Llamar a una funcion (hacer funcion.invoke() seria lo mismo)
    procesar(4) //Llamar a una funcion con parametro
    println(procesar(4)) //Devolveria el valor procesado por la funcion, ya que tiene return
    println("aa \$${procesar(3, 4)} asdf") //Ejecutar una funcion en un string porque devuelve texto (concatenacion)
    ejecutarParam({println("aa")}) //Ejecutar una funcion como parametro
    cualquierClase<Int, String>(2, "asdf") //Llamando a una funcion que requiere una clase
    var listafun:List<Int> = varios<Int>(2, 4, 4, 4, 4, 4) //Llamando a una funcion con numero indeterminado de parametros
    listafun = varios<Int>(2, *arrayOf(1,3,4)) //Pasando un array con todos los datos en su lugar
    println(1 sumar 2) //Llamando a una funcion infix
    runBlocking { //Forma de llamar a una funcion asincrona que se ejecuta en un hilo aparte (por fuera del flujo principal) (se necesita llamar desde una corrutina y hay que importarlo)
        val resultadoTarde = async { funcionTardia("asdf") } //La funcion debe estar declarada como suspend
        println(resultadoTarde.await())
    }

    val resultadoL: (Int, Int) -> Int = {a, b -> a + b} //Declarando una funcion lambda, devuelve lo que devuelva la expresion (se puede usar como entrada para funciones que pidan funciones)
    println(resultadoL(2, 3)) //Llamando a una funcion lambda
    val resultadoL2: (Int) -> Int = {a ->
        var b = 3
        b = a
        a //Labmda con varias lineas, la ultima es lo que va a devolver
    }
}

fun funcion() { //Otra funcion distinta de la principal (por defecto devuelven el tipo de dato Unit, en ese caso cuenta como void y no hace falta un return)
    println("contenido" + variableGlobal.toString())
    fun otraFuncion(){} //Se pueden declarar funciones dentro de otras pero solo funcionaran aqui, incluso se podria hacer sobrecarga
}

fun procesar(parametro: Int, otroParametro: Int = 2): Int { //Funcion que recibe parametros (el :Int al final es para que pueda retornar un valor) (si ya tienen un valor por defecto se pueden omitir)
    require(parametro > 0) { "error, debe ser mayor que 0" } //Lanzar un error (similar a throw) si un argumento no es valido
    checkNotNull(parametro) {"error, no puede ser null"} //Lanza un error si el argumento es null

    println(parametro) //Los parametros son constantes
    return parametro + otroParametro //Devolver un valor (solo si la funcion era de un tipo (:Int))
    //A partir de aqui no se ejecuta nada
}
fun procesar(){ //Sobreescribir, en caso de que se llame a la funcion con otros parametros se ejecuta otro codigo
    println("a")
}

inline fun procesar2(a: Int, b: Int) = a - b //Una funcion de solo una linea (en estos casos puede ser mas optimo para el rendimiento poner inline, pero es opcional)
inline fun procesar3(a: Int, noinline funParam: () -> Unit) = a //El noinline hace que la funcion por parametros no se compile como inline (poner crossinline haria que si fuese lambda no se ejecutase desde los parametros)
fun esPar(x: Int) = x % 2 != 0 //Tambien se puede hacer asi

fun ejecutarParam(funcionParam: (num: Int) -> Unit){ //Funcion que recibe una funcion como parametro
    funcionParam(2)
}// Se ejecutaria asi: ejecutarParam(::funcion(3))
fun devuelveFuncion(): (num: Int, num2: Int) -> Int{
    return ::procesar //Devolviendo una funcion con las mismas entradas y salidas
}

fun <T, U> cualquierClase(variable:T, variable2:U){ //Una funcion que necesita una clase para algo (T es esa clase y podria tener mas)
    println(variable)
    println(variable2)
}

fun <T> varios(num:Int, vararg items: T): List<T>{ //Funcion que recibe numero indeterminado de parametros de x tipo (items seria un array)
    val result = ArrayList<T>()
    for (t in items)
        result.add(t)
    return result
}

//Funcion hecha para funcionar como operador matematico (se hace despues que la suma y la resta) (1 sumar 2, x = 2  this = 1) (se hace sobre una clase ya existente)
infix fun Int.sumar(x: Int): Int {return x + this}
//Similar a infix pero para sobreescribir operadores (hacer 2 + "hola" seria 6 ya que Int.plus es +)
operator fun Int.plus(str: String) = this + str.length

suspend fun funcionTardia(entrada: String): String{ //Funcion asincrona que puede ser llamada desde una corrutina para que funcione con un flujo alternativo al programa
    delay(10000) //Esperar
    return entrada
}

