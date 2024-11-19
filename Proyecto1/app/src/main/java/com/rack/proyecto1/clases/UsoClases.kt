package com.rack.proyecto1.clases

fun main(){
    val a:Persona = Persona("nombre", 22) //instanciando una clase con su constructor por defecto
    val b:Persona = Persona("nombre", 22, 2f) //instanciando una clase con su constructor secundario
    println(a.nombreMayusculas)
    println(b.altura) //accediendo a las propiedades de las clases (si son var se pueden modificar)
    a.decirNombre()
    println(a.equals(b)) //comprobando si dos objetos son iguales (en cuanto a contenido
    println(a == b) //haria lo mismo qu eequals
    println(a === b) //comprobaria si apuntan al mismo objeto o no
    //a = b //no haria que ambas variables tengan el mismo contenido sino que apuntaran al mismo objeto (como en java)

    with(a){ //ejecutando funciones y accediendo a propiedades como si estuviese dentro de la clase
        println(nombre)
        println(edad)
        decirNombre()
    }
    val unaDireccion = Direccion.NORTE //accediendo a una clase enum
    println(unaDireccion == Direccion.SUR)

    val c:SubClaseHerencia = SubClaseHerencia(3, 4)
    println("x" + c.tamagno)
    c.sobreescribible()
}

val deInterfazFuncional = InterfazFuncional{!it} //usando una interfaz funcional (it es el dato de entrada)