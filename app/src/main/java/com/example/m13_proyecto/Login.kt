package com.example.m13_proyecto

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.m13_proyecto.databinding.ActivityLoginBinding
import com.google.firebase.auth.FirebaseAuth


class Login : AppCompatActivity() {

    private lateinit var binding: ActivityLoginBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)
        // Setup
        setup()
    }


    private fun setup() {
        title="Login"
        val buttonlogin= binding.buttonlogin
        val editTexEmailAddressLogin = binding.editTexEmailAddressLogin
        val editTextPasswordLogin = binding.editTextPasswordLogin
            buttonlogin.setOnClickListener {
                if (editTexEmailAddressLogin.text.isNotEmpty() && editTextPasswordLogin.text.isNotEmpty()) { //&& binding.editTextPassword2.text.isNotEmpty()){
                    FirebaseAuth.getInstance().signInWithEmailAndPassword(
                        editTexEmailAddressLogin.text.toString(),
                        editTextPasswordLogin.text.toString()
                    ).addOnCompleteListener {
                        if (it.isSuccessful) {
                            showHome()//(it.result?.user?.email?:"",PasswordType.BASIC)



                        } else {
                            (Toast.makeText( this,"Error al ingresar", Toast.LENGTH_SHORT)).show()


                        }
                    }


                }

            }

    }

    private fun showHome(){//(email:String,password:PasswordType) {
        val homeIntent= Intent(this,MainActivity::class.java).apply{
            //putExtra("email",email)
            //putExtra("password", password.name)
        }
        startActivity(homeIntent)

    }



}
