package com.example.myfirstapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import com.example.myfirstapp.databinding.ActivityMainBinding
import android.util.Log
import android.view.View


class MainActivity : AppCompatActivity() {

    lateinit var bindingClass: ActivityMainBinding

    override fun onCreate(s: Bundle?) {

        super.onCreate(s)

        bindingClass = ActivityMainBinding.inflate(layoutInflater)

        setContentView(bindingClass.root)

        bindingClass.btResult.setOnClickListener {

            val resultValue = bindingClass.edValue.text.toString().toInt()

            when(resultValue) {
                in 0..1000 -> {
                    bindingClass.tvResult.visibility = View.VISIBLE
                    bindingClass.tvResult.text = "Вы начинающий блогер"
                }
                in 1000..100000 -> {
                    bindingClass.tvResult.visibility =View.VISIBLE
                    bindingClass.tvResult.text = "Вы средний блогер"
                }
                    else -> {
                        bindingClass.tvResult.visibility = View.VISIBLE
                        bindingClass.tvResult.text = "Вы супер звезда!"
                    }
            }



        }



    }
}