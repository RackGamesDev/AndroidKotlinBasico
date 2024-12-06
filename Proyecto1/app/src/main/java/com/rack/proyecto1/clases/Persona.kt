package com.rack.proyecto1.clases

class Persona(nombre:String, var edad:Int, opcional:Int = 3) { //Creando una clase con un constructor (datos a especificar al declararla)
    val nombreMayusculas = nombre.uppercase() //Propiedad calculada
    @JvmField //Modificador para cada propiedad, en este caso no haria nada pero hay muchos utiles en librerias y apis
    var altura:Float = 0f //Propiedad no especificada en el constructor
    var nombre = ""
    val apellido:String get() = "apellido" //Propiedad que no se podra modificar pero se recoge con get()
    private val propiedadPrivada = 3 //Propiedad/metodo que no se podra usar desde la instancia
    public var propiedadPublica = 3 //Propiedad/metodo que se podra usar desde la instancia (no hace falta poner public)
    public var propiedadMixta:Int = 1
        private set //Es publica pero el set para cambiarla no
    internal val varInterna = 0 //Propiedad/metodo que solo se puede usar en ese paquete
    companion object Compa { //Para agnadir funciones y constantes estaticas en clases normales
        private val textoDefecto = "a"
        fun estatica(){println("a")} //Actuaria similar a una funcion estatica
    }

    fun decirNombre(){ //Funcion que se podra usar desde la instancia
        println("nombre: " + this.nombre) //this haria referencia a la clase (al objeto instanciado)
    }
    private fun oculto(){
        //Funcion que no se podra usar desde la instancia
    }
    fun copiarDe(otro: Persona){ //Funcion manual para copiar el contenido de otra instancia
        this.nombre = otro.nombre
        this.altura = otro.altura
        //etc...
    }
    init{ //Lo que pasa cuando se instancia la clase (se pueden hacer varios inits que usan las propiedades y funciones anteriormente declaradas)
        println("se ha creado una persona con el nombre " + nombre)
    }
    constructor(nombre:String, edad:Int, altura:Float):this(nombre, edad) { //Constructor secundario
        //Lo que pasa cuando se declara con el constructor secundario
        println("se creo la clase con este constructor secundario")
        this.altura = altura //Estableciendo el valor de la propiedad con el valor introducido al constructor (porque esta propiedad no era val y se puede modificar)
        this.nombre = nombre
        this.edad = edad
    }
}

//Las data class vienen ademas con funciones como equals()/hashCode(), toString(), copy(), componentN() pero el constructor no puede estar vacio
data class ClaseData(var nombre:String, var tamagno:Int) { //Solo las funciones integradas funcionan con las propiedades del constructor (no pueden ser abstarct, open, sealed, inner)
    var posicion:Float = 3f;
} //Las data class tambien tienen propiedades llamadas component1, component2, etc. que hacen referencia a las propiedades en ese orden

class ImposibleCrear private constructor(){
    //No se puede crear una instancia de esta clase, util para herencias
}

enum class Direccion{ //Clase enumeradora que devuelve un tipo
    NORTE, SUR, ESTE, OESTE
}
enum class Colorr(val valor:Int){ROJO(0), VERDE(1), AZUL(2)} //Cada uno devolveria un int     println(Colorr.ROJO.valor + 1)     println(Colorr.valueOf("ROJO"))
//for (color in Colorr.entries) println(color.toString()) //Imprime cada valor porque .entries es un array

class ErrorPersonalizado : Exception("error personalizado") //Creando un error personalizado mediante una clase, se haria con throw ErrorPersonalizado()

class Combinado<T, U>(t: T, u: U){ //Cada letra en <> sera una clase necesaria al instanciar la clase (cuentan como Any), las propiedades de esa intstancia podran ser de esas clses
    var valor = t
    var valor2 = u
    operator fun get(indice: Int):T { //Forma sencilla de hacer el get
        if (indice == 0)
            return valor
        else
            return valor2 as T //Aqui estaria devolviendo otro tipo, por lo tanto haria un casting (o lo intentaria)
    }
    operator fun set(indice: Int, elQue1: T, elQue2: U){ //lo mismo con el set
        valor = elQue1
        valor2 = elQue2
    }
    fun <V>devolverASiMismo(que: V): V{ //Lo mismo se puede hacer con las funciones
        return que
    } //Ejemplo: devolverASiMismo<String>("asdf") devuelve "asdf":String
} //Ejemplo: var comb:Combinado<Int, String> = Combinado(3, "fasdd")

class Fuera{
    class Dentro{ //Una clase dnetro de otra, similar a las sealed (pero funciona como static) (Fuera tambien podria ser una interfaz, y podria contener mas interfaces, aunque esta clase tambien podria contener interfaces)
        fun funcion(){println("a")}
    }
    inner class Dentro2{ //Igual pero ya no es static
        fun funcion(){println("a")}
        val thisDentroDos = this@Dentro2 //Haciendo que una variable valga lo mismo que el this de cierta clase
        val thisFuera = this@Fuera
    }
} //val x = Fuera.Dentro().funcion()      val x = Fuera().Dentro2().funcion()

@JvmInline
value class Texto(private val s: String){
    fun longitud(): Int {
        return s.length
    }
} //Cuando se hace una clase envoltorio (para dar funcionalidad extra a un valor) se aumenta el rendimiento poniendo value (clase inline)

typealias Nombre = String //Una forma de llamar a otra manera a las clases y funciones y lambdas (util para aceder facilmente a ciertas clases)

object Estructura{ //Declarando una estructura para crear variables que tengan este contenido, se suelen declarar tambien dentro de las clases
    var nombre = ""
    var tamagno = 0
    fun decirTodo(){println(nombre + tamagno)} //Tambien pueden tener funciones
    //Viene con funciones por defecto como toString(), hashCode() y equals()
}
//Tambien se podria hacer asi: val cosa = object {val nombre = "asdf"   override fun toString()=nombre} (similar a los objetos de javascript)

@MustBeDocumented
annotation class ClaseDecorada //Cuando se le van a poner anotaciones (@) a las clases se declaran como annotation, hay muchas y cada una tiene una funcion