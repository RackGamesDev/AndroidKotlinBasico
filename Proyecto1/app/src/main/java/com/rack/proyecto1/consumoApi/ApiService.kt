package com.rack.proyecto1.consumoApi

import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path

//Esta interfaz esta hecha para controlar corrutinas con peticiones usando la libreria externa Retrofit2

interface ApiService {
    @GET("/api/ac277525e043ec1f536e70a4fcb56d34/search/{name}") //La otra parte de la url, se pueden poner parametros
    suspend fun getItem(@Path("name") nombreItem: String): Response<ItemDataResponse>
}