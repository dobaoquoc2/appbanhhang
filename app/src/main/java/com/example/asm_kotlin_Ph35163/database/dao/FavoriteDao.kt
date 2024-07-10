package com.example.asm_kotlin_Ph35163.database.dao

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import com.example.asm_kotlin_Ph35163.database.entities.Favorites
@Dao
interface FavoriteDao {
    @Insert
    suspend fun addToFavorite(favorites: Favorites)

    @Delete
    suspend fun removeFromFavorite(favorites: Favorites)

    @Query("select * from Favorites where email = :email")
    fun getAllFavorite(email: String): LiveData<List<Favorites>>
}