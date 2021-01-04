package com.example.helloeib

import android.annotation.SuppressLint
import android.app.SearchManager
import android.content.Intent
import android.graphics.Insets.add
import android.net.Uri
import android.os.Bundle
import android.util.Log
import android.view.Window
import android.widget.Button
import android.widget.Toast
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.OneShotPreDrawListener.add
import androidx.lifecycle.lifecycleScope
import kotlinx.android.synthetic.main.activity_favorite_food.*
import kotlinx.android.synthetic.main.activity_form.*
import kotlinx.android.synthetic.main.activity_home.*
import kotlinx.android.synthetic.main.activity_login.*
import kotlinx.android.synthetic.main.activity_login.editTextPassword
import kotlinx.coroutines.launch
import AdapterRecyclerFoodies as AdapterRecyclerFoodies1

class FormActivity() : AppCompatActivity() {

    val app = applicationContext as FoodApp

    @SuppressLint("ShowToast")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_form)

        buttonSaveFormFood.setOnClickListener {

            lifecycleScope.launch{
                val food = app.room.foodDao().getAll()
                Log.d("","onCreate: ${food.size} food")
            }


        val foodNameForm: String = editTextFoodNameForm.text.toString().toLowerCase().trim()
        val foodDescriptionForm: String = editTextFoodDescriptionForm.text.toString()
        var foodUrlForm = editTextFoodUrlForm.text.toString().toLowerCase().trim()


        buttonSearchUrl.setOnClickListener {

            val foodUrlForm: String = editTextFoodUrlForm.text.toString().toLowerCase().trim()

            editTextFoodUrlForm.setText("")
            if (foodUrlForm.trim().isEmpty()) {

                Toast.makeText(this, "Debes Ingresar una comida", Toast.LENGTH_LONG)
                    .show()

            } else {
                val uri = Uri.parse("https://www.google.com/search?q=$foodUrlForm")
                val intent = Intent(Intent.ACTION_VIEW, uri)
                startActivity(intent)
                println(uri)

            }
        }





            if (foodNameForm.trim().isEmpty() || foodDescriptionForm.trim()
                    .isEmpty() || foodUrlForm.trim().isEmpty()
            ) {
                Toast.makeText(
                    this,
                    "Debes Ingresar Nombre, Descripción y Url",
                    Toast.LENGTH_LONG
                )
                    .show()
            } else {

                val foodNameForm: String = editTextFoodNameForm.text.toString().toLowerCase().trim()
                val foodDescriptionForm: String = editTextFoodDescriptionForm.text.toString()
                var foodUrlForm = editTextFoodUrlForm.text.toString().toLowerCase().trim()


                Toast.makeText(
                    this,
                    "Se intento guardar el item comida",
                    Toast.LENGTH_LONG
                )

            }
        }


    }
}




