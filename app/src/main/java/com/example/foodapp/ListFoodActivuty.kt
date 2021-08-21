package com.example.foodapp

import Adapters.MyAdapter
import Cache.MySharedPreferance
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import kotlinx.android.synthetic.main.activity_list_food_activuty.*

class ListFoodActivuty : AppCompatActivity() {

    lateinit var myAdapter:MyAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_food_activuty)
        title = "Barcha taomlar"

        MySharedPreferance.init(this)

        val list = MySharedPreferance.obejtString
        myAdapter = MyAdapter(this, list)
        list_food.adapter = myAdapter
        
        list_food.setOnItemClickListener { parent, view, position, id ->
           val intent = Intent(this, AboutFoodActivity::class.java)
            intent.putExtra("position", position)
            startActivity(intent)
        }

    }
}