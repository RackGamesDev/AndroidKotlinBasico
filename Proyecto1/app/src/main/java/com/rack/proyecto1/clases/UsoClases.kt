package com.rack.proyecto1.clases

fun main(){
    val a:Persona = Persona("nombre", 22) //Instanciando una clase con su constructor por defecto
    val b:Persona = Persona("nombre", 22, 2f) //Instanciando una clase con su constructor secundario
    a.apply{ //Manera mas rapida de cambiar las propiedades de una instancia una vez hecha
        nombre = "asdf"
        edad=43
    }
    println(a.nombreMayusculas)
    println(b.altura) //Accediendo a las propiedades de las clases (si son var se pueden modificar)
    a.decirNombre()
    println(a.equals(b)) //Comprobando si dos objetos son iguales (en cuanto a contenido
    println(a == b) //Haria lo mismo qu eequals
    println(a === b) //Comprobaria si apuntan al mismo objeto o no
    //a = b //No haria que ambas variables tengan el mismo contenido sino que apuntaran al mismo objeto (como en java)

    val agrupacion = object{ //Los object tambien se pueden declarar como variables normales (en caso de haberse declarado fuera de una funcion se podria usar como clase)
        var x:Int = 3
        var y:Int = 3
    }

    with(a){ //Ejecutando funciones y accediendo a propiedades como si estuviese dentro de la clase
        println(nombre)
        println(edad)
        decirNombre()
    }
    val unaDireccion = Direccion.NORTE //Accediendo a una clase enum
    println(unaDireccion == Direccion.SUR)

    val c:SubClaseHerencia = SubClaseHerencia(3, 4)
    println("x" + c.tamagno)
    c.sobreescribible()

    val dt:ClaseData = ClaseData("asdf", 3)
    println(dt.equals(ClaseData("asdf", 3))) //Usando las funciones integradas de una data class
    val (dtNombre, dtTamagno) = dt //Extrayendo propiedades de una data class en base a su constructor

    val subSealed:ClaseSealed.SubclaseSealed = ClaseSealed.SubclaseSealed() //Instanciando una subclase de una clase sealed
}

val deInterfazFuncional = InterfazFuncional{!it} //Usando una interfaz funcional (it es el dato de entrada)

fun Persona.nueva(){} //Se pueden declarar funciones nuevas para una clase, pero solo funciona en este archivo (aunque se pueden importar), tambien se pueden sobreescribir las que ya hay
fun <T> MutableList<T>.funcionNuevaListas(): Int{return size} //Esto es util para agnadir funcionalidad a las listas
fun Persona.Compa.algoNuevo() {} //Si la clase tiene companion object {} se puede hacer esto
