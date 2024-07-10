package com.example.asm_kotlin_Ph35163

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.example.asm_kotlin_Ph35163.bottom_nav.NDinhThi

import com.fpoly.com.example.asm_kotlin_ph39907.ui.theme.ASM


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ASM {
               NDinhThi()
            }
        }
    }
}