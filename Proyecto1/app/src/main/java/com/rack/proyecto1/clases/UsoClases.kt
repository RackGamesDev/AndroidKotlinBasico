package com.rack.proyecto1.clases

fun main(){
    val a:Persona = Persona("nombre", 22) //instanciando una clase con su constructor por defecto
    val b:Persona = Persona("nombre", 22, 2f) //instanciando una clase con su constructor secundario
    println(a.nombreMayusculas)
    println(b.altura) //accediendo a las propiedades de las clases (si son var se pueden modificar)

}