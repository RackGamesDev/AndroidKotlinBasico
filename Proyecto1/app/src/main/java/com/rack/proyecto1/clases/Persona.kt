package com.rack.proyecto1.clases

class Persona(nombre:String, var edad:Int, opcional:Int = 3) { //creando una clase con un constructor (datos a especificar al declararla)
    val nombreMayusculas = nombre.uppercase() //propiedad calculada
    @JvmField //modificador para cada propiedad, en este caso no haria nada pero hay muchos utiles en librerias y apis
    var altura:Float = 0f //propiedad no especificada en el constructor
    var nombre = ""
    val apellido:String get() = "apellido" //propiedad que no se podra modificar pero se recoge con get()
    private val propiedadPrivada = 3 //propiedad/metodo que no se podra usar desde la instancia
    public var propiedadPublica = 3 //propiedad/metodo que se podra usar desde la instancia (no hace falta poner public)
    public var propiedadMixta:Int = 1
        private set //es publica pero el set para cambiarla no
    internal val varInterna = 0 //propiedad/metodo que solo se puede usar en ese paquete
    companion object {private val textoDefecto = "a"} //para agnadir funcionalidades en otros scirpts mas facil mente (mirar ejemplo UsoClases.kt)

    fun decirNombre(){ //funcion que se podra usar desde la instancia
        println("nombre: " + this.nombre)
    }
    private fun oculto(){
        //funcion que no se podra usar desde la instancia
    }
    fun copiarDe(otro: Persona){ //funcion manual para copiar el contenido de otra instancia
        this.nombre = otro.nombre
        this.altura = otro.altura
        //etc...
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

enum class Direccion{ //clase enumeradora que devuelve un tipo
    NORTE, SUR, ESTE, OESTE
}
enum class Colorr(val valor:Int){ROJO(0), VERDE(1), AZUL(2)} //cada uno devolveria un int     println(Colorr.ROJO.valor + 1)     println(Colorr.valueOf("ROJO"))
//for (color in Colorr.entries) println(color.toString()) //imprime cada valor porque .entries es un array

class ErrorPersonalizado : Exception("error personalizado") //creando un error personalizado mediante una clase, se haria con throw ErrorPersonalizado()

class Combinado<T, U>(t: T, u: U){ //cada letra en <> sera una clase necesaria al instanciar la clase (cuentan como Any), las propiedades de esa intstancia podran ser de esas clses
    var valor = t
    var valor2 = u
    operator fun get(indice: Int):T { //forma sencilla de hacer el get
        if (indice == 0)
            return valor
        else
            return valor2 as T //aqui estaria devolviendo otro tipo, por lo tanto haria un casting (o lo intentaria)
    }
    operator fun set(indice: Int, elQue1: T, elQue2: U){ //lo mismo con el set
        valor = elQue1
        valor2 = elQue2
    }
    fun <V>devolverASiMismo(que: V): V{ //lo mismo se puede hacer con las funciones
        return que
    } //ejemplo: devolverASiMismo<String>("asdf") devuelve "asdf":String
} //ejemplo: var comb:Combinado<Int, String> = Combinado(3, "fasdd")

class Fuera{
    class Dentro{ //una clase dnetro de otra, similar a las sealed (pero funciona como static) (Fuera tambien podria ser una interfaz, y podria contener mas interfaces, aunque esta clase tambien podria contener interfaces)
        fun funcion(){println("a")}
    }
    inner class Dentro2{ //igual pero ya no es static
        fun funcion(){println("a")}
    }
} //val x = Fuera.Dentro().funcion()      val x = Fuera().Dentro2().funcion()

@JvmInline
value class Texto(private val s: String){
    fun longitud(): Int {
        return s.length
    }
} //cuando se hace una clase envoltorio (para dar funcionalidad extra a un valor) se aumenta el rendimiento poniendo value (clase inline)

typealias Nombre = String //una forma de llamar a otra manera a las clases y funciones (util para aceder facilmente a ciertas clases)

object Estructura{ //declarando una estructura para crear variables que tengan este contenido, se suelen declarar tambien dentro de las clases
    var nombre = ""
    var tamagno = 0
    fun decirTodo(){println(nombre + tamagno)} //tambien pueden tener funciones
    //viene con funciones por defecto como toString(), hashCode() y equals()
}
//tambien se podria hacer asi: val cosa = object {val nombre = "asdf"   override fun toString()=nombre} (similar a los objetos de javascript)
