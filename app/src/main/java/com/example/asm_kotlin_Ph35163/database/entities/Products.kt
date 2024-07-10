package com.example.asm_kotlin_Ph35163.database.entities

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Products(
    @PrimaryKey(autoGenerate = true)
    val id: Int,
    val nameProduct: String,
    val imgProduct: String,
    val priceProduct: Int,
    val rate: Int
)