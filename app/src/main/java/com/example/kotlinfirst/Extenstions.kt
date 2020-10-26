package com.example.kotlinfirst

import android.content.Context
import android.widget.Toast
import java.time.Duration


//Activity can be used in place of Context but it will not work in adapters
fun Context.showToast(msg: String, duration: Int =Toast.LENGTH_SHORT){

    Toast.makeText(this, msg,duration ).show()

}