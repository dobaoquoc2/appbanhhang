package com.example.asm_kotlin_Ph35163.database.repository

import androidx.lifecycle.LiveData
import com.example.asm_kotlin_Ph35163.database.dao.SaveUserDao
import com.example.asm_kotlin_Ph35163.database.entities.SaveUsers

class SaveUserRepository(private val saveUserDao: SaveUserDao) {
    suspend fun addUser(saveUsers: SaveUsers) {
        saveUserDao.addUser(saveUsers)
    }

    suspend fun deleteUser(saveUsers: SaveUsers) {
        saveUserDao.deleteUser(saveUsers)
    }

    val getUser: LiveData<SaveUsers> = saveUserDao.getUser()
}