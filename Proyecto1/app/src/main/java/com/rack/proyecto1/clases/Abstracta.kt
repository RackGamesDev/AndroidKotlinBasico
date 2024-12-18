package com.rack.proyecto1.clases

abstract class Abstracta {
    abstract fun funcionAbstracta() //Funcion que no tiene implementacion, sirve para obligar a otras que la tengan
}

class SubClaseAbstracta: Abstracta() {
    override fun funcionAbstracta() { //Como esta clase hereda de una abstracta tiene que obligatoriamente tener sus metodos
        println("funcion abstracta implementada")
    }
}

interface UnaInterfaz{ //Muy similar a una clase abstracta, esta hecha para que otras clases implementen sus metodos y propiedades (pueden heredar de otras interfaces) (una clase puede heredar de vairas interfaces)
    fun funcion(){}
    fun funcion2(){}
    val propiedad:Int
}
interface UnaInterfazDos{
    fun funcion3():Boolean{return true}
}

class SubClaseInterfaz: UnaInterfaz, UnaInterfazDos{ //Una clase que deriva de una interfaz tiene que implementar sus metodos y propiedades
    override fun funcion(){}
    override fun funcion2(){}
    override val propiedad: Int = 3
    override fun funcion3():Boolean{
        super<UnaInterfazDos>.funcion3() //Ejecutaria la funcion original de la interfaz
        return true
    }
}

fun interface InterfazFuncional{ //Interfaz funcional que solo moldea la creacion de una funcion, no de una clase entera
    fun funcionSam(i:Boolean):Boolean
}
typealias InterfazFuncionalRapida = (i:Boolean) -> Boolean //Lo mismo pero mas rapido
