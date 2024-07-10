package com.example.asm_kotlin_Ph35163.database.dao

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import com.example.asm_kotlin_Ph35163.database.entities.Users

@Dao
interface UserDao {
    @Insert
    suspend fun userSignUp(users: Users)

    @Query("SELECT * FROM users WHERE email = :email AND password = :password")
    fun userSignIn(email: String, password: String): LiveData<List<Users>>

    @Query("SELECT * FROM users WHERE email = :email")
    fun getUser(email: String): LiveData<Users>
}
