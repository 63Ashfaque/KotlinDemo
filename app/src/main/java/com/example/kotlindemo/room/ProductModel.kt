package com.example.kotlindemo.room

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "ProductTable")
data class ProductModel(

    @PrimaryKey(autoGenerate = true)
    val id:Long,
    val PName:String,
    val PQuantity:Int,
    //Selling Price
    val PPrice:Double,
    //Buying Price
    val PRate:Double
)
