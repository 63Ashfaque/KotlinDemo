package com.example.kotlindemo.room

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.kotlindemo.room.ProductDao
import com.example.kotlindemo.room.ProductModel

@Database(entities = [ProductModel::class], version = 1)
abstract class DataBaseClass:RoomDatabase() {

    abstract fun ProductDao(): ProductDao
}