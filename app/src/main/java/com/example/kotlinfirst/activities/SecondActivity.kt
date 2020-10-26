package com.example.kotlinfirst.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.kotlinfirst.R
import kotlinx.android.synthetic.main.activity_second.*

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val bundle: Bundle? =intent.extras
        //will run only if its not null
        val msg =bundle!!.getString("mato")

        sendShow.text=msg

    }
}