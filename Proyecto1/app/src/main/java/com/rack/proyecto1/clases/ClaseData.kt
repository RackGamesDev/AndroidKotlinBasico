package com.rack.proyecto1.clases

//Las data class vienen ademas con funciones como equals()/hashCode(), toString(), copy(), componentN() pero el constructor no puede estar vacio
data class ClaseData(var nombre:String, var tamagno:Int) { //Solo las funciones integradas funcionan con las propiedades del constructor (no pueden ser abstarct, open, sealed, inner)
    var posicion:Float = 3f;
}