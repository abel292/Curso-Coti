package com.example.helloeib

import android.content.Intent
import android.os.Bundle
import android.text.InputType
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_login.*


class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        editTextUser.setInputType(InputType.TYPE_CLASS_TEXT or InputType.TYPE_TEXT_FLAG_CAP_SENTENCES)


        btnIngresarLogin.setOnClickListener {

            val userName: String = editTextUser.text.toString().toLowerCase().trim()
            val userPassword: String = editTextPassword.text.toString()

            if (userName.trim().isEmpty() || userPassword.trim().isEmpty()) {
                Toast.makeText(this, "Debes Ingresar Usuario y Contraseña", Toast.LENGTH_LONG)
                    .show()


            } else
                if (userName == "abelito") {

                    Toast.makeText(
                        this,
                        "Lo siento Abelito, tu de aquí no pasas",
                        Toast.LENGTH_LONG
                    ).show()
                } else {


                    val intent = Intent(this, MainActivity::class.java)
                    intent.putExtra("extraAbeligno", editTextUser.text.toString())

                    startActivity(intent)

                }
        }

    }


}

