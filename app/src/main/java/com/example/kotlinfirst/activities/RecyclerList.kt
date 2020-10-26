package com.example.kotlinfirst.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.kotlinfirst.Adapters.HobbiesAdapter
import com.example.kotlinfirst.models.MyDataSource
import com.example.kotlinfirst.R
import kotlinx.android.synthetic.main.activity_recycler_list.*

class RecyclerList : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recycler_list)


        val layoutManager=LinearLayoutManager(this)//setting the recycler view layout manager
        layoutManager.orientation=LinearLayoutManager.VERTICAL

        //attaching the recyclerview to the created LayoutManager
        recyclerView.layoutManager=layoutManager


        //initializing the adapter
        val adapter= HobbiesAdapter(
            this,
            MyDataSource.myHobbyList
        )

        //setting the adapter to the recyclerview
        recyclerView.adapter=adapter







    }
}