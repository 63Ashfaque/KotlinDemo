package com.example.kotlindemo

import android.app.ProgressDialog
import android.content.Context
import android.util.Log
import android.widget.ProgressBar
import android.widget.Toast
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.TextInputLayout

class Utils {

     fun logD(message: String) {
        Log.d("Ashu", message);
    }

     fun toaster(context: Context, message: String) {
        Toast.makeText(context, message, Toast.LENGTH_SHORT).show()
    }

    fun textViewEmptyChecker(textInputLayout: TextInputLayout, textInputEditText: TextInputEditText,errorMsg:String): Boolean {
        if(textInputEditText.text.toString().isEmpty())
        {
            textInputLayout.error=errorMsg
            textInputEditText.isFocusable=true
            textInputEditText.requestFocus()
            return false
        }
        textInputLayout.error=null
        return true
    }
}