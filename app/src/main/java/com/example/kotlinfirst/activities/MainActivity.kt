package com.example.kotlinfirst.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import com.example.kotlinfirst.R
import com.example.kotlinfirst.showToast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {


    private val TAG="btn"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        buttonClick.setOnClickListener {

            textViewShow.text = "I have been clicked"

            Log.i(TAG, "onCreate: The button has been clicked")

            showToast("Button has been Clicked")
        }



        nextActivity.setOnClickListener {

                val message: String = inputText.text.toString()
                val intent= Intent(this, SecondActivity::class.java)
                intent.putExtra("mato",message)
                startActivity(intent)

        }


        recyclerBtn.setOnClickListener {

            val intent=Intent(this, RecyclerList::class.java)
            startActivity(intent)

        }

        
    }



}