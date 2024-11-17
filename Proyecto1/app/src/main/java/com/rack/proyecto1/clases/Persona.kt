package com.rack.proyecto1.clases

class Persona(nombre:String, edad:Int) { //creando una clase con un constructor (datos a especificar al declararla)
    val nombreMayusculas = nombre.uppercase() //propiedad calculada
    var altura:Float = 0f //propiedad no especificada en el constructor
    var nombre = ""
    var edad = 0
    private val propiedadPrivada = 3 //propiedad que no se podra usar desde la instancia
    fun decirNombre(){ //funcion que se podra usar desde la instancia
        println("nombre: " + this.nombre)
    }
    private fun oculto(){
        //funcion que no se podra usar desde la instancia
    }
    init{ //lo que pasa cuando se instancia la clase (se pueden hacer varios inits que usan las propiedades y funciones anteriormente declaradas)
        println("se ha creado una persona con el nombre " + nombre)
    }
    constructor(nombre:String, edad:Int, altura:Float):this(nombre, edad) { //constructor secundario
        //lo que pasa cuando se declara con el constructor secundario
        println("se creo la clase con este constructor secundario")
        this.altura = altura //estableciendo el valor de la propiedad con el valor introducido al constructor (porque esta propiedad no era val y se puede modificar)
        this.nombre = nombre
        this.edad = edad
    }
}

class ImposibleCrear private constructor(){
    //no se puede crear una instancia de esta clase, util para herencias
}
