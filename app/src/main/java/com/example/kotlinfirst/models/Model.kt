package com.example.kotlinfirst.models

data class Hobby(var hobbyName:String){

}



object MyDataSource{

    val myHobbyList= listOf<Hobby>(
        Hobby("Swimming"),
        Hobby("Coding"),
        Hobby("Reading"),
        Hobby("Cooking"),
        Hobby("Gaming"),
        Hobby("Writing"),
        Hobby("Browsing"),
        Hobby("Singing"),
        Hobby("Dancing")
    )


}




