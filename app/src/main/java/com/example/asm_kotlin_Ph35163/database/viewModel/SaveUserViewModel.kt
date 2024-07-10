package com.example.asm_kotlin_Ph35163.database.viewModel

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.asm_kotlin_Ph35163.database.entities.SaveUsers
import com.example.asm_kotlin_Ph35163.database.repository.SaveUserRepository
import kotlinx.coroutines.launch

class SaveUserViewModel(private val saveUserRepository: SaveUserRepository) : ViewModel() {
    fun addUser(saveUsers: SaveUsers) {
        viewModelScope.launch {
            saveUserRepository.addUser(saveUsers)
        }
    }

    fun deleteUser(saveUsers: SaveUsers) {
        viewModelScope.launch {
            saveUserRepository.deleteUser(saveUsers)
        }
    }

    val getUser: LiveData<SaveUsers> = saveUserRepository.getUser
}