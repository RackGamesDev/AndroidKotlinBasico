//basico del lenguaje kotlin/java
package com.rack.proyecto1

val variableGlobal = 3 //variable/constante que funciona en todas las funciones

//las funciones se declaran asi, main() es la principal
fun main(){
    print("hola") //imprimir por consola
    println("hola") //imprimir por consola y salto de linea

    val constante = "aa" //igual que var pero no se puede cambiar
    var variable = "asdf" //variable de cualquier tipo (solo funcionaria en esta funcion) (tienen que tener valor asignado desde el principio)
    var variable2 = 34
    var variableNumero:Int = 5 //esta solo admitiria enteros (Int, Long, Short, Byte)
    var variableDecimal:Float = 5.4f //lo mismo pero con decimales (Float, Double)
    var variableDouble:Double = 5.4
    var caracter:Char = 'e' //un caracter
    var texto:String = "asdfd" //textos
    var booleano:Boolean = true //true o false
    println(variableDouble) //print admite cualquier variable
    variableNumero = 3 //se puede cambiar el valor de var
    println(variableGlobal) //accediendo a una variable declarada fuera de la funcion

    variableNumero = 3 + 2 - 4 * 6 / 8 % 2 //operaciones con variables
    texto = "asdf" + "asddf" //concatenacion de strings
    variableNumero += 2 //autooperar
    variableNumero++ //incrementar
    println(variableNumero)
    println("asdfasdfasdfasdf")
    variableNumero += 3 //autooperar
    println(1+1) //operando en funciones
    //las conversiones implicitas son igual que en java (ej: division con doubles)
    variableNumero = variableDecimal.toInt() //conversion explicita
    texto = variableNumero.toString() //se puede de casi cualquier tipo primitivo a otro
    texto = "aa $variableNumero" //otra forma de concatenar

    funcion()//llamar a una funcion
    procesar(4) //llamar a una funcion con parametro
    println(procesar(4)) //devolveria el valor procesado por la funcion, ya que tiene return
    
}

fun funcion() { //otra funcion distinta de la principal
    println("contenido" + variableGlobal.toString())
}

fun procesar(parametro:Int, otroParametro:Int = 2):Int { //funcion que recibe parametros (el :Int al final es para que pueda retornar un valor)
    println(parametro) //los parametros son constantes
    return parametro + otroParametro //devolver un valor (solo si la funcion era de un tipo (:Int))
    //a partir de aqui no se ejecuta nada
}

fun procesar2(a:Int, b:Int) = a - b //una funcion de solo una linea