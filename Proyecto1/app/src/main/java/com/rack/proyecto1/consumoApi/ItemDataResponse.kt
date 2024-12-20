package com.rack.proyecto1.consumoApi

import com.google.gson.annotations.SerializedName

//Esta clase esta basada en el objeto que devuelve la api, las propiedades hay que cambiarlas segun el json que devuelva (las propiedade se tienen que llamar igual que en el json, al menos en el serialized)
data class ItemDataResponse (@SerializedName("response") val respuesta:String,
                             @SerializedName("results") val items:List<ItemSubDataResponse>) {}

//Como el json tiene un array con los objetos de respuesta, cada item se basa en esta clase
data class ItemSubDataResponse (@SerializedName("id") val itemId:String,
                                @SerializedName("name") val itemName:String,){}