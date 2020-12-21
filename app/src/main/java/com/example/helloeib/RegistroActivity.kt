package com.example.helloeib

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import com.google.firebase.analytics.FirebaseAnalytics
import com.google.firebase.auth.FirebaseAuth
import kotlinx.android.synthetic.main.activity_registro.*
import java.util.*

class RegistroActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registro)


        //Analytics Event
        val analytics: FirebaseAnalytics = FirebaseAnalytics.getInstance(this)
        val bundle = Bundle()
        bundle.putString("message", "Integración de Firebase completa")
        analytics.logEvent("InitScreen", bundle)

        //SetUp
        setup()

    }


    private fun setup() {


        buttonRegistrarme.setOnClickListener {


            val userEmail: String =
                editTextUserEmail.text.toString().toLowerCase(Locale.ROOT).trim()
            val userPassword: String = editTextPassword.text.toString()
            val userNick: String = editTextPassword.text.toString()



            if (userEmail.isEmpty() || userPassword.isEmpty() || userNick.isEmpty()) {

                Toast.makeText(this, "Debe completar todos los campos", Toast.LENGTH_LONG).show()

            } else {
                FirebaseAuth.getInstance().createUserWithEmailAndPassword(
                    userEmail,
                    userPassword
                ).addOnCompleteListener {
                    if (it.isComplete) {

                        showLogin(it.result?.user?.email ?: "")

                    } else {
                        showAlert()
                    }
                }
            }
        }
    }
    private fun showAlert() {
        val builder = AlertDialog.Builder(this)
        builder.setTitle("Error")
        builder.setMessage("Se ha producido un error autenticando al usuario")
        builder.setPositiveButton("Aceptar", null)
        val dialog: AlertDialog = builder.create()
        dialog.show()
    }

    private fun showLogin(email: String) {
        val loginIntent: Intent = Intent(this, LoginActivity::class.java).apply {
            putExtra("email", email)
            Toast.makeText(this@RegistroActivity, "Usuario registrado", Toast.LENGTH_LONG).show()
        }
        startActivity(loginIntent)
    }
}
