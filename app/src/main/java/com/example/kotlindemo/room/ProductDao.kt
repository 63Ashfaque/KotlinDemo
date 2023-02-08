package com.example.kotlindemo.room

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update

@Dao
interface ProductDao {

    @Insert
    suspend fun ProductInsert(productModel: ProductModel)

    @Update
    fun ProductUpdate(productModel: ProductModel)

    @Delete
    fun ProductDelete(productModel: ProductModel)

    @Query("Select * From ProductTable")
    fun GetProductList():LiveData<List<ProductModel>>
}