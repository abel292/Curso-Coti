package com.example.helloeib

import AdapterRecyclerFoodies
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_favorite_food.*
import kotlinx.android.synthetic.main.item_favorite_food.*

class ActivityFood : AppCompatActivity() {
    private lateinit var foodAdapter: AdapterRecyclerFoodies

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_favorite_food)

        initRecyclerView()


    }

    private fun initRecyclerView(){
        recyclerViewHistoricalFoodies.apply{
            layoutManager = LinearLayoutManager(this@ActivityFood)
            foodAdapter = AdapterRecyclerFoodies(this@ActivityFood, this@ActivityFood)
            val data = DataFoodies.createDataFoodSet()
            foodAdapter.submitList(data)
            adapter = foodAdapter
        }
    }




 }

