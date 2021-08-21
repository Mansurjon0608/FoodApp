package com.example.foodapp



import Cache.MySharedPreferance

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_about_food.*

class AboutFoodActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about_food)
        supportActionBar?.hide()

        MySharedPreferance.init(this)

        val list = MySharedPreferance.obejtString
        val position = intent.getIntExtra("position", 0)

        txt_name.text = list[position].name

        txt_Food_products.text = list[position].ingredients

        txt_preperation.text = list[position].preparationOrder

    }
}