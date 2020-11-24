package com.example.helloeib

import AdapterRecyclerFoodies
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_favorite_food.*

public class FoodActivity : AppCompatActivity() {
    private lateinit var foodAdapter: AdapterRecyclerFoodies

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_favorite_food)

        initRecyclerView()
    }


    private fun initRecyclerView(){
        recyclerViewHistoricalFoodies.apply{
            layoutManager = LinearLayoutManager(this@FoodActivity)
            foodAdapter = AdapterRecyclerFoodies()
            val data = DataFoodies.createDataFoodSet()
            foodAdapter.submitList(data)
            adapter = foodAdapter
        }
    }

}

