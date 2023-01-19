package com.example.kotlindemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import com.airbnb.lottie.utils.Utils
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.TextInputLayout

class AddProductActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_product)

        val btnAppProduct: Button = findViewById(R.id.btnAddProduct)
        val edTextProductName: TextInputEditText = findViewById(R.id.edTextProductName)
        val textLayoutProductName: TextInputLayout = findViewById(R.id.textLayoutProductName)

        val edTextProductQuantity: TextInputEditText = findViewById(R.id.edTextProductQuantity)
        val textLayoutProductQuantity: TextInputLayout = findViewById(R.id.textLayoutProductQuantity)

        val edTextProductSellingPrice: TextInputEditText = findViewById(R.id.edTextProductSellingPrice)
        val textLayoutProductSellingPrice: TextInputLayout = findViewById(R.id.textLayoutProductSellingPrice)

        val edTextProductBuyingPrice: TextInputEditText = findViewById(R.id.edTextProductBuyingPrice)
        val textLayoutProductBuyingPrice: TextInputLayout = findViewById(R.id.textLayoutProductBuyingPrice)

        btnAppProduct.setOnClickListener {

            if(Utils().textViewEmptyChecker(textLayoutProductName,edTextProductName,"Product Name"))
            {
               if( Utils().textViewEmptyChecker(textLayoutProductQuantity,edTextProductQuantity,"Product Quantity"))
               {
                   if( Utils().textViewEmptyChecker(textLayoutProductSellingPrice,edTextProductSellingPrice,"Product Price")) {

                       if( Utils().textViewEmptyChecker(textLayoutProductBuyingPrice,edTextProductBuyingPrice,"Product Buying Price")) {

                           Utils().logD("first log")
                           Utils().toaster(this, "fgdfg")
                       }
                   }
               }
            }



        }
    }
}