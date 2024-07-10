package com.example.asm_kotlin_Ph35163.database.entities

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class SaveUsers(
    @PrimaryKey(autoGenerate = false)
    val id: Int,
    val email: String
)