package com.rack.proyecto1.clases

//las interfaces suelen ser sealed
sealed interface Interfaz {
    fun funcion() //las interfaces tienen metodos y propiedades abstractas y son obligatoriamente sobreescrivibles por sus subclases
    val valor:Int
}

sealed class ClaseSealed(val nombre:String) : Interfaz { //las sealed class no pueden ser instanciadas pero tienen varias clases dentro que si
    class SubclaseSealed: ClaseSealed("asdf"){
        override fun funcion() { //las subclases de la sealed class deben cumplir las obligaciones de la interfaz
        }
        override val valor:Int = 3
    }
    class OtraSubclaseSealed: ClaseSealed("asdfasdf"){
        override fun funcion(){}
        override val valor:Int = 3
    }
}

