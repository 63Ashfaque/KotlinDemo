package com.example.kotlindemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.room.Room
import com.example.kotlindemo.room.DataBaseClass
import com.example.kotlindemo.room.ProductModel
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.TextInputLayout
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

class AddProductActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_product)

        val btnAppProduct: Button = findViewById(R.id.btnAddProduct)
        val edTextProductName: TextInputEditText = findViewById(R.id.edTextProductName)
        val textLayoutProductName: TextInputLayout = findViewById(R.id.textLayoutProductName)

        val edTextProductQuantity: TextInputEditText = findViewById(R.id.edTextProductQuantity)
        val textLayoutProductQuantity: TextInputLayout =
            findViewById(R.id.textLayoutProductQuantity)

        val edTextProductSellingPrice: TextInputEditText =
            findViewById(R.id.edTextProductSellingPrice)
        val textLayoutProductSellingPrice: TextInputLayout =
            findViewById(R.id.textLayoutProductSellingPrice)

        val edTextProductBuyingPrice: TextInputEditText =
            findViewById(R.id.edTextProductBuyingPrice)
        val textLayoutProductBuyingPrice: TextInputLayout =
            findViewById(R.id.textLayoutProductBuyingPrice)


        Utils().logD(Utils().encrypt("ashu"))
        Utils().logD(Utils().decrypt("D158C90256023E2C62F39FD9728D1D6C"))


        val database =
            Room.databaseBuilder(applicationContext, DataBaseClass::class.java, "ProductDataBase")
                .build()
        val productDao = database.ProductDao()


        btnAppProduct.setOnClickListener {

            if (Utils().textViewEmptyChecker(
                    textLayoutProductName,
                    edTextProductName,
                    "Product Name"
                ).isNotEmpty()
            ) {
                if (Utils().textViewEmptyChecker(
                        textLayoutProductQuantity,
                        edTextProductQuantity,
                        "Product Quantity"
                    ).isNotEmpty()
                ) {
                    if (Utils().textViewEmptyChecker(
                            textLayoutProductSellingPrice,
                            edTextProductSellingPrice,
                            "Product Price"
                        ).isNotEmpty()
                    ) {

                        if (Utils().textViewEmptyChecker(
                                textLayoutProductBuyingPrice,
                                edTextProductBuyingPrice,
                                "Product Buying Price"
                            ).isNotEmpty()
                        ) {

                            val pName = edTextProductName.text.toString()
                            val pQuantity = edTextProductQuantity.text.toString().toInt()
                            val pSellPrice = edTextProductSellingPrice.text.toString().toDouble()
                            val pBuyPrice = edTextProductBuyingPrice.text.toString().toDouble()

                            if (Utils().textViewEmptyChecker(
                                    textLayoutProductBuyingPrice,
                                    edTextProductBuyingPrice,
                                    "Product Buying Price"
                                ).isNotEmpty()
                            ) {

                                GlobalScope.launch {

                                    val insert = productDao.productInsert(
                                        ProductModel(
                                            0,
                                            pName,
                                            pQuantity,
                                            pSellPrice,
                                            pBuyPrice
                                        )
                                    )
                                    Utils().toaster(applicationContext, "Insert Successful")
                                }

                            }
                        }
                    }
                }


            }
        }
    }
}