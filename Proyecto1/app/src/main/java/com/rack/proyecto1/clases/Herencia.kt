package com.rack.proyecto1.clases

import android.content.Context

open class Herencia(tamagno:Int) { //Esta clase es open para que pueda heredar a otras
    val tamagno = 10
    open val propiedadSobreescribible:Int = 0 //Esta propiedad/funcion puede ser sobreescrita por las subclases
    open protected val soloHeredable = 3 //Esta propiedad/funcion solo puede ser accedida por subclases
    fun decir(){
        println(tamagno)
    }
    open fun sobreescribible(){ //Esta funcion puede ser sobreescrita por las subclases
        println("codigo original")
    }
}
open class HerenciaDos(var nombre:String){ //Forma mas sencilla de hacer el constructor por defecto
}

class SubClaseHerencia(tamagno2:Int, tamagno:Int): Herencia(tamagno) { //Esta clase hereda de la otra y tiene sus metodos y propiedades (solo puede heredar de una)
    //En este caso, en el constructor por defecto tiene sus propiedades y las de la superclase (al declararla habrian que poner los atributos nuevos y los originales)
    var tamagno2 = 3
    override val propiedadSobreescribible:Int = 2 //Sobreescribiendo una propiedad de la superclase para que se inicialice con otro valor
    fun decirdecir(){
        decir()
    }
    override fun sobreescribible(){ //Sobreescribiendo una funcion de la superclase (podria ser final override fun para que no se siga sobreescribiendo)
        println("codigo modificado")
        super.sobreescribible() //Ejecutaria la funcion original de la superclase
    }
}
