package com.example.foodapp

import android.content.DialogInterface
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar?.hide()

        btn_menu.setOnClickListener {
            startActivity(Intent(this, ListFoodActivuty::class.java))
        }

        btn_addFood.setOnClickListener {

            var alertDialogBuilder = AlertDialog.Builder(this)
            val positiveButtonClick = { dialog:DialogInterface, which:Int ->
                Toast.makeText(this, "Taom qo'shishingiz mumkin", Toast.LENGTH_SHORT).show()
                startActivity(Intent(this, AddFoodActivity::class.java))

            }

            alertDialogBuilder.setMessage("Taom qo'shishni hohlaysizmi?")
            alertDialogBuilder.setIcon(R.drawable.icon)
            alertDialogBuilder.setPositiveButton("Ha",  positiveButtonClick)
//            alertDialogBuilder.setPositiveButton(R.string.yes) { dialog, which ->
//                Toast.makeText(this, "Taom qo'shishingiz mumkin", Toast.LENGTH_SHORT).show()
//                startActivity(Intent(this, AddFoodActivity::class.java))
//
//            }

            alertDialogBuilder.setNegativeButton(R.string.nooo) { dialog, which ->
                Toast.makeText(this,"Bekor qilindi", Toast.LENGTH_SHORT).show()

            }
            alertDialogBuilder.show()

        }
    }
  }