package com.example.kotlinfirst.Adapters

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.example.kotlinfirst.models.Hobby
import com.example.kotlinfirst.R
import com.example.kotlinfirst.showToast
import kotlinx.android.synthetic.main.hobby_list.view.*

class HobbiesAdapter(val  context: Context, private val hobbiesList:List<Hobby>) : RecyclerView.Adapter<HobbiesAdapter.MyCustomViewHolder>(){


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyCustomViewHolder {
        //used to create each of the viewholder list items in the recyclerview


         //this line of code inflates our custom xml layout file
        val view= LayoutInflater.from(context).inflate(R.layout.hobby_list,parent,false)

        //the method returns the custom view holders
        return MyCustomViewHolder(view)
        
    }

    override fun getItemCount(): Int {
        //responsible  for returning the length of list items to be displayed in the list

        return  hobbiesList.size
    }

    override fun onBindViewHolder(holder: MyCustomViewHolder, position: Int) {
        //it binds all the data with the created views

        val hobbyItemValue=hobbiesList[position]

        holder.setData(hobbyItemValue)
    }



    inner class MyCustomViewHolder(itemView: View):RecyclerView.ViewHolder(itemView){

             var hobbyObject: Hobby?=null

           init {

               itemView.setOnClickListener {

                   var msg="you have selected ${hobbyObject!!.hobbyName} hobby"

                   context.showToast(msg)

                   //Toast.makeText(context, , Toast.LENGTH_SHORT).show()
               }


               itemView.imgShare.setOnClickListener {

                   var message="you have selected ${hobbyObject!!.hobbyName} hobby"

                   ///using the implicit intent sample. The Target activity has not been specified
                   val intent=Intent()
                   intent.action= Intent.ACTION_SEND
                   intent.putExtra(Intent.EXTRA_TEXT, message)
                   intent.type="text/plain"
                   context.startActivity(Intent.createChooser(intent,"Please select your prefered app"))
               }

           }



           fun  setData(hobby: Hobby?){
               this.hobbyObject=hobby
               ///set the hobby name only when its not nullable
               itemView.hobby_textView.text=hobby!!.hobbyName

           }



    }



}