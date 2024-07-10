package com.example.asm_kotlin_Ph35163.database.factory

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.asm_kotlin_Ph35163.database.repository.SaveUserRepository
import com.example.asm_kotlin_Ph35163.database.viewModel.SaveUserViewModel

class SaveUserFactory(private val saveUserRepository: SaveUserRepository) :
    ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(SaveUserViewModel::class.java)) {
            @Suppress("UNCHECKED_CAST")
            return SaveUserViewModel(saveUserRepository) as T
        }
        throw IllegalArgumentException("Unknown ViewModel class")
    }
}