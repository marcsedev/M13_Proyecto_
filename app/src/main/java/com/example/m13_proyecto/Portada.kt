package com.example.m13_proyecto

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.m13_proyecto.databinding.ActivityPortadaBinding
enum class PasswordType{
    BASIC
}

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
        val lanzar = Intent(this, Login::class.java)
        startActivity((lanzar))
//prueba
        }
    }

    fun registrarse() {
        binding.btRegistrarse.setOnClickListener{
            val lanzar = Intent(this, Register::class.java)
            startActivity((lanzar))

        //(Toast.makeText( this,"De momento va al recycler view",Toast.LENGTH_SHORT)).show()
        }
    }

}
