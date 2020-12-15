package com.example.helloeib

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils
import android.view.View
import android.widget.EditText
import android.widget.Toast
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.FirebaseUser
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase
import kotlinx.android.synthetic.main.activity_login.*
import kotlinx.android.synthetic.main.fragment_registro.*
import kotlinx.android.synthetic.main.fragment_registro.*

class RegistroFragment : AppCompatActivity() {


    private lateinit var editTextUserNameRegister: EditText
    private lateinit var editTextUserNickNameRegister: EditText
    private lateinit var editTextPasswordRegistro: EditText
    private lateinit var editTextRepeatPasswordRegistro: EditText
    private lateinit var editTextUserEmailRegister: EditText

    private lateinit var dbReference: DatabaseReference
    private lateinit var database: FirebaseDatabase
    private lateinit var auth: FirebaseAuth


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.fragment_registro)

        database = FirebaseDatabase.getInstance()
        auth = FirebaseAuth.getInstance()

        dbReference = database.reference.child("User")

        fun createNewAccount() {
            val regName: String = editTextUserNameRegister.text.toString().toLowerCase().trim()
            val userRegName: String =
                editTextUserNickNameRegister.text.toString().toLowerCase().trim()
            val emailReg: String = editTextUserEmailRegister.text.toString().toLowerCase().trim()
            val passReg: String = editTextPasswordRegistro.text.toString().toLowerCase().trim()
            val repeatPassReg: String =
                editTextRepeatPasswordRegistro.text.toString().toLowerCase().trim()



            buttonRegistrarme.setOnClickListener() {
                val intent = Intent(this, LoginActivity::class.java)
                startActivity(intent)


                if (passReg != repeatPassReg) {
                    Toast.makeText(this, "Sus contraseñas no coinciden", Toast.LENGTH_LONG).show()
                }


            }

            /*      if (!TextUtils.isEmpty(regName) && !TextUtils.isEmpty(userRegName) && !TextUtils.isEmpty(
                    emailReg
                ) && !TextUtils.isEmpty(passReg) && !TextUtils.isEmpty(repeatPassReg)
            ) {*/

            /*   progressBarRegister.visibility = View.VISIBLE
                auth.createUserWithEmailAndPassword(emailReg, passReg)
                    .addOnCompleteListener(this) { task ->
                        if (task.isComplete) {
                            val user: FirebaseUser? = auth.currentUser

                            val userBD= dbReference.child(user!!.uid)
                            userBD.child("Name").setValue(regName)
                            userBD.child("NickName").setValue(user)
                        }
                    }*/
//
//            }
//        }


            /*fun varifyEmail(user: FirebaseUser?) {
            user!!.sendEmailVerification()
                .addOnCompleteListener(this) { task ->
                    if (task.isComplete) {
                        Toast.makeText(this, "Email enviado", Toast.LENGTH_LONG).show()
                    } else {
                        Toast.makeText(this, "Error al enviar el email", Toast.LENGTH_LONG).show()

                    }

                }
        }*/

            /*    buttonRegistrarme.setOnClickListener {

            createNewAccount()

        }*/


        }
    }}