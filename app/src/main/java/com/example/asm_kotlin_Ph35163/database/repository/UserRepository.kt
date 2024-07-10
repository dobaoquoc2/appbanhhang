package com.example.asm_kotlin_Ph35163.database.repository

import androidx.lifecycle.LiveData
import com.example.asm_kotlin_Ph35163.database.dao.UserDao
import com.example.asm_kotlin_Ph35163.database.entities.Users

class UserRepository(private val userDao: UserDao) {
    fun userSignIn(email: String, password: String): LiveData<List<Users>> =
        userDao.userSignIn(email, password)

    suspend fun userSignUp(users: Users) {
        userDao.userSignUp(users)
    }

    fun getUser(email: String): LiveData<Users> = userDao.getUser(email)
}