package com.rack.funcionamientorecyclerview.CocheRecyclerView

//Clase que devuelve la lista de items (normalmente se sacaria mediante una peticion a una API)
class CocheProvider {
    companion object{
        val listaCoches = listOf<Coche>(
            Coche("nom1", "https://imgur.com/WUFGJqR", "normal", 1000f),
            Coche("nom2", "http", "normal", 1000f),
            Coche("nom3", "http", "normal", 1000f),
            Coche("nom4", "http", "normal", 1000f),
            Coche("nom5", "http", "normal", 1000f),
            Coche("nom6", "http", "normal", 1000f),
            Coche("nom7", "http", "normal", 1000f),
            Coche("nom8", "http", "normal", 1000f),
            Coche("nom9", "http", "normal", 1000f),
            Coche("nom10", "http", "normal", 1000f),

        )
    }
}