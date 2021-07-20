package com.example.a2_proyectokotlinvariables

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val nombre = "Benito"
        val apellido = "Floro"
        val edad = 18
        var profesion= "Entrenador"

        //vamos a declarar variables en Kotlin, var, val, o de forma explícita
        //Declararemos la variable con val(recomendable para que consuma menos) si el valor de la variable no será modificado (como final en Java)
        //Por otro lado, lo declararemos con var si el valor puede ser modificado.
        //Si intentamos modificar el valor de una variable declarada con val, obtendremos un error del compilador.
        //variables variant se declaran por debajo del tipo que se designan.  "Alex" se declara por debajo de tipo string, si pongo 25 por debajo las
        //asigna un entero. VAR es de tipo variant


        btnMostrar.setOnClickListener{
            profesion ="Bombero"
            //edad=19 al ser de tipo val el compilador se queja
            txtMensaje.text= nombre + " " + apellido + " " + edad+ " " + profesion
        }


    }
}