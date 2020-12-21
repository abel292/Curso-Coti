package com.example.helloeib

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_home.*


class MainActivity : AppCompatActivity() {

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        var nameUser = intent.getStringExtra("extraAbeligno").trim()
        var wellcomeText = intent.getStringExtra("extraWellcome")

        intent.putExtra("extraWellcome", textViewWellcome.text.toString())

        textViewWellcome.setText("Te damos la Bienvenida $nameUser")


        imageButtonFFood.setOnClickListener {

            val intent = Intent(this, FoodActivity::class.java)
            startActivity(intent)
        }



        imageButtonNavComponent.setOnClickListener {

            val intent = Intent(this, NavigationFoodActivity::class.java)
            startActivity(intent)
        }

    }
}
