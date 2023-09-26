package com.example.tp.ui.eventlist

import com.google.gson.annotations.SerializedName

data class Event(  //datos de cada heroe
    val id:String,
    val name: String,
    val description:String,//de tipo biografia
    val address:String,
    val image:EventImage
)

data class EventImage( //detalla esta informacion con sus propios datos
    val url:String
)