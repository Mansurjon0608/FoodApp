package com.example.foodapp


import Cache.MySharedPreferance

import Models.Foods
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_add_food.*

class AddFoodActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_food)
        title = "Taom qo'shish"

        MySharedPreferance.init(this)

        btn_save.setOnClickListener {
            val name = food_name_adding.text.toString().trim()
            val products = edite_food_ingridients.text.toString().trim()
            val preparetion = edite_preparations.text.toString().trim()


            if (name!="" && products!="" && preparetion!=""){
                val list = MySharedPreferance.obejtString
              list.add(Foods(name, products, preparetion))
               MySharedPreferance.obejtString = list
                Toast.makeText(this, "Saved", Toast.LENGTH_SHORT).show()
                finish()
            }
            else {
                Toast.makeText(this, "Something is missing, please check again", Toast.LENGTH_SHORT).show()
            }
        }
    }
}