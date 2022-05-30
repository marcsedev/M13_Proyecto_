package com.example.m13_proyecto

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.m13_proyecto.databinding.ActivityPortadaBinding

class Portada : AppCompatActivity() {

    private lateinit var binding: ActivityPortadaBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        Thread.sleep(1000)
        super.onCreate(savedInstanceState)
        binding= ActivityPortadaBinding.inflate(layoutInflater)
        setContentView(binding.root)
        //se inician las funciones
        iniciarsesion()
        registrarse()

    }
    fun iniciarsesion() {
        //funcion para inciar sesion
        binding.btIniciarSesion.setOnClickListener {
        val lanzar = Intent(this, MainActivity::class.java)
        startActivity((lanzar))
//prueba
        }
    }

    fun registrarse() {
        binding.btRegistrarse.setOnClickListener{
            (Toast.makeText( this,"Aún no está activo",Toast.LENGTH_SHORT)).show()
        }
    }

}
