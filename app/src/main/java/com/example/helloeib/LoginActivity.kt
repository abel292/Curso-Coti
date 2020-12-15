package com.example.helloeib

import android.content.Intent
import android.os.Bundle
import android.text.InputType
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.firebase.analytics.FirebaseAnalytics
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.FirebaseUser
import com.google.firebase.database.*
import com.google.firebase.ktx.Firebase
import kotlinx.android.synthetic.main.activity_login.*
import java.lang.Exception


class LoginActivity : AppCompatActivity() {

    /*  */

    private lateinit var database: FirebaseDatabase
    private lateinit var auth: FirebaseAuth
    private lateinit var dbReference: DatabaseReference


    override fun onCreate(savedInstanceState: Bundle?) {
        database = FirebaseDatabase.getInstance()
        auth = FirebaseAuth.getInstance()

        dbReference = database.reference.child("User")
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        //Analytics Event
        val analytics: FirebaseAnalytics = FirebaseAnalytics.getInstance(this)
        val bundle = Bundle()
        bundle.putString("message", "Integración de Firebase completa")
        analytics.logEvent("InitScreen", bundle)


        editTextUserEmail.setInputType(InputType.TYPE_CLASS_TEXT or InputType.TYPE_TEXT_FLAG_CAP_SENTENCES)


        btnRegistroLogin.setOnClickListener {
            val intent = Intent(this, RegistroActivity::class.java)
            startActivity(intent)
        }


        btnIngresarLogin.setOnClickListener {

            val userEmail: String = editTextUserEmail.text.toString().toLowerCase().trim()
            val userPassword: String = editTextPassword.text.toString()

            if (userEmail.trim().isEmpty() || userPassword.trim().isEmpty()) {

                Toast.makeText(this, "Debes Ingresar Usuario y Contraseña", Toast.LENGTH_LONG)
                    .show()


            }
            auth.signInWithEmailAndPassword(userEmail, userPassword).addOnCompleteListener {

                try {
                    var usuario = it.result?.user
                    val intent = Intent(this, MainActivity::class.java)
                    intent.putExtra("extraAbeligno", editTextUserEmail.text.toString())
                    startActivity(intent)

                } catch (e: Exception) {
                    Toast.makeText(this, "El usuario no se encuentra registrado", Toast.LENGTH_LONG)
                        .show()


                } finally {
                    Toast.makeText(this, "El proceso terminó", Toast.LENGTH_LONG).show()


                }

            }
        }


    }

}


