package com.rack.proyecto1.clases
//Las clases sealed solo pueden ser heredadas dentro del mismo archivo

//Las interfaces suelen ser sealed
sealed interface Interfaz {
    fun funcion() //Las interfaces tienen metodos y propiedades abstractas y son obligatoriamente sobreescrivibles por sus subclases
    val valor:Int
}

sealed class ClaseSealed(val nombre:String) : Interfaz { //Suelen tener aveces vairas clases dentro
    class SubclaseSealed: ClaseSealed("asdf"){
        override fun funcion() { //Las subclases de la sealed class deben cumplir las obligaciones de la interfaz
        }
        override val valor:Int = 3
    }
    class OtraSubclaseSealed: ClaseSealed("asdfasdf"){
        override fun funcion(){}
        override val valor:Int = 3
    }
}

