package com.example.asm_kotlin_Ph35163.database.dao

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import com.example.asm_kotlin_Ph35163.database.entities.SaveUsers
@Dao
interface SaveUserDao {
    @Insert
    suspend fun addUser(saveUsers: SaveUsers)

    @Delete
    suspend fun deleteUser(saveUsers: SaveUsers)

    @Query("select * from SaveUsers where id = 1")
    fun getUser(): LiveData<SaveUsers>
}