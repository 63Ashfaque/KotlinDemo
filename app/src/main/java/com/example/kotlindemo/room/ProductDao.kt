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
    suspend fun productInsert(productModel: ProductModel)

    @Update
    fun productUpdate(productModel: ProductModel)

    @Delete
    fun productDelete(productModel: ProductModel)

    @Query("Select * From ProductTable")
    fun getProductList():LiveData<List<ProductModel>>
}