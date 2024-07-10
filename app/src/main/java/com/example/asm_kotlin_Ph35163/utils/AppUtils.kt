package com.example.asm_kotlin_Ph35163.utils

import android.content.Context
import android.widget.Toast

class AppUtils {
    companion object {
        fun ToastUtils(context: Context, message: String) {
            Toast.makeText(context, message, Toast.LENGTH_SHORT).show()
        }
    }
}