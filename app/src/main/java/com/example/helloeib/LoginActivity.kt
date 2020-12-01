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
        var edit_user_name = findViewById(R.id.editTextUser) as EditText
        var edit_user_password = findViewById(R.id.editTextPassword) as EditText

        edit_user_name.setInputType(InputType.TYPE_CLASS_TEXT or InputType.TYPE_TEXT_FLAG_CAP_SENTENCES)


        val button = findViewById<Button>(R.id.btnIngresarLogin)
        button.setOnClickListener {

            if (edit_user_name.text.toString().toLowerCase() == "abelito") {

                Toast.makeText(this, "Lo siento Abelito, tu de aquí no pasas", Toast.LENGTH_LONG).show()
            } else {


                val intent = Intent(this, MainActivity::class.java)
                intent.putExtra("extraAbeligno", editTextUser.text.toString())

                startActivity(intent)

            }

        }


    }
}
