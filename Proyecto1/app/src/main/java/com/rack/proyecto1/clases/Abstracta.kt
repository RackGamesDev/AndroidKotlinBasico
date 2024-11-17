package com.rack.proyecto1.clases

abstract class Abstracta {
    abstract fun funcionAbstracta() //funcion que no tiene implementacion, sirve para obligar a otras que la tengan
}

class SubClaseAbstracta: Abstracta() {
    override fun funcionAbstracta() { //como esta clase hereda de una abstracta tiene que obligatoriamente tener sus metodos
        println("funcion abstracta implementada")
    }
}
