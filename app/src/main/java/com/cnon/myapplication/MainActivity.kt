package com.cnon.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import java.util.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        fonksiyon(45,3,867,34,67,8,98,23,4,78,4,9)
        fonksiyon("Sinem ALAGÖZ")
        fonksiyon(3,5)

        var fgfhh :Array<Int> = arrayOf(5,6,86,2,6,34,9,54)

        fonksiyon(fgfhh)




    }

    
    private fun fonksiyon(fgfhh: Array<Int>) {

      var top:Int =0
        for (i in fgfhh)
        {
           top+=i
        }
        println("Toplam: "+top)
    }

    fun fonksiyon (dfe:Int, ttr: Int)
    {
        println(dfe/ttr.toDouble())
    }

    fun fonksiyon (dfe:String)
    {
        println(dfe)
    }


    fun fonksiyon (vararg ase:Int)
    {
        for (i in ase)
        {
            println(i)
        }
    }


}