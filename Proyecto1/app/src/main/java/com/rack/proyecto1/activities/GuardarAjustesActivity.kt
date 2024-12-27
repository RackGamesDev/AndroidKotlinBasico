package com.rack.proyecto1.activities

import android.content.Context
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.datastore.core.DataStore
import com.rack.proyecto1.R
import com.rack.proyecto1.databinding.ActivityGuardarAjustesBinding
import androidx.datastore.preferences.core.*
import androidx.datastore.preferences.preferencesDataStore
import com.rack.proyecto1.databinding.ActivityImagenesPicassoBinding
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.first
import kotlinx.coroutines.flow.map
import kotlinx.coroutines.launch


//Para guardar ajustes en una mini-base de datos se usa un plugin de android llamado datastore
val Context.dataStore: DataStore<Preferences> by preferencesDataStore(name = "settings") //Esto es un singleton, crea una unica instancia de dataStore que seria la base de datos (seria conveniente declararlo en un archivo aparte al inicio)

class GuardarAjustesActivity : AppCompatActivity() {
    private lateinit var binding: ActivityGuardarAjustesBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityGuardarAjustesBinding.inflate(layoutInflater)
        setContentView(binding.root)


        CoroutineScope(Dispatchers.IO).launch { //Corrutina para llamar a las funciones que editan los datos
            editarDatos()
            binding.texto.text = leerDatoString(dataStore, "valorstring") //Leer un valor del dataStore con la funcion de mas abajo
        }
    }

    private suspend fun editarDatos(){ //Los ajustes no pueden ser modificados desde el hilo principal
        dataStore.edit { //Editar en la mini-base de datos de ajustes
            it[booleanPreferencesKey("valorbool")] = true //Guardar un valor (dependiendo del tipo se usa una funcion u otra), valorbool es su nombre
            it[intPreferencesKey("valorint")] = 1
            it[stringPreferencesKey("valorstring")] = "adsa"
            it[doublePreferencesKey("valordouble")] = 1.2 //Los hay con todos los tipos primitivos
            it.remove(booleanPreferencesKey("valorbool")) //Eliminar un valor
            //it.clear() //Eliminar los registros
        }
    }

    private suspend fun leerDatoString(dataStore: DataStore<Preferences>, clave:String):String{ //Funcion para sacar un valor (solamente string) del dataStore
        val preferencesKey = stringPreferencesKey(clave)
        val valueFlow: Flow<String?> = dataStore.data.map { preferences ->
            preferences[preferencesKey]
        }
        return valueFlow.first().orEmpty()
    }
}
