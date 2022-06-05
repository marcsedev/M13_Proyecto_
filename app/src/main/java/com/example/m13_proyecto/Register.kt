package com.example.m13_proyecto

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.m13_proyecto.databinding.ActivityRegisterBinding
import com.google.firebase.auth.FirebaseAuth

class Register : AppCompatActivity() {

    private lateinit var binding: ActivityRegisterBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRegisterBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setup()
    }

    private fun setup() {
        title = "Autentificación"
        val editTexEmailAddressRegister = binding.editTexEmailAddressRegister
        val editTextPasswordRegister1 =  binding.editTextPasswordRegister1
        val buttonregister= binding.buttonregister
        buttonregister.setOnClickListener {
            if (editTexEmailAddressRegister.text.isNotEmpty() && editTextPasswordRegister1.text.isNotEmpty()) { //&& binding.editTextPassword2.text.isNotEmpty()){
                FirebaseAuth.getInstance().createUserWithEmailAndPassword(
                    editTexEmailAddressRegister.text.toString(),
                    editTextPasswordRegister1.text.toString()
                ).addOnCompleteListener {
                    if (it.isSuccessful) {
                        showHome()//it.result?.user?.email?:"",PasswordType.BASIC)
                        (Toast.makeText( this,"Usuario Registrado correctamente",Toast.LENGTH_SHORT)).show()


                    } else {
                        (Toast.makeText( this,"Error al registrarse",Toast.LENGTH_SHORT)).show()


                    }
                }

            }

        }

        binding.textViewIniciarSesion.setOnClickListener{showLogin()}

    }

    private fun showHome() {//(email:String,password:PasswordType) {
        val homeIntent=Intent(this,Portada::class.java).apply{
            //putExtra("email",email)
            //putExtra("password", password.name)
        }
        startActivity(homeIntent)

    }

    private fun showLogin() {
        val registerIntent = Intent(this, Login::class.java).apply {
            //putExtra("email",email)
            //putExtra("password", password.name)
        }
        startActivity(registerIntent)
    }



}