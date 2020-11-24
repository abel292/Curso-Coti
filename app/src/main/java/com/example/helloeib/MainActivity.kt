package com.example.helloeib

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_home.*
import kotlinx.android.synthetic.main.activity_login.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        var nameUser = intent.getStringExtra("extraAbeligno")


        var wellcomeText = intent.getStringExtra("extraWellcome")

        intent.putExtra("extraWellcome", textViewWellcome.text.toString())

        textViewWellcome.setText("Te damos la Bienvenida $nameUser")


        imageButtonFFood.setOnClickListener {

            val intent = Intent(this, FoodActivity::class.java)
            startActivity(intent)
        }

    }
}
