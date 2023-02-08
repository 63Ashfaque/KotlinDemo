package com.example.kotlindemo

import android.content.Context
import android.util.Log
import android.widget.Toast
import com.example.kotlindemo.encrypt.AESUtils
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.TextInputLayout

class Utils {

    fun logD(message: String) {
        Log.d("Ashu", message);
    }

    fun toaster(context: Context, message: String) {
        Toast.makeText(context, message, Toast.LENGTH_SHORT).show()
    }

    fun textViewEmptyChecker(
        textInputLayout: TextInputLayout,
        textInputEditText: TextInputEditText,
        errorMsg: String
    ): String {
        if (textInputEditText.text.toString().isEmpty()) {
            textInputLayout.error = errorMsg
            textInputEditText.isFocusable = true
            textInputEditText.requestFocus()
            return ""
        }
        textInputLayout.error = null
        return textInputEditText.text.toString()
    }

    fun isValidMobile(mobile: String): Boolean {
        val regex = "[6-9]{1}[0-9]{9}";
        return mobile.matches(regex.toRegex())
    }

    //
    fun encrypt(sourceStr: String): String {
        try {
            return AESUtils.encrypt(sourceStr)
        } catch (e: Exception) {
            e.printStackTrace()
        }
        return ""
    }

    fun decrypt(sourceStr: String): String {
        try {
            return AESUtils.decrypt(sourceStr)
        } catch (e: java.lang.Exception) {
            e.printStackTrace()
        }
        return ""
    }
}