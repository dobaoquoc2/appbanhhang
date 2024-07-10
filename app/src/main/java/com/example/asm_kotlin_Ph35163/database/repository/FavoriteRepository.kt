package com.example.asm_kotlin_Ph35163.database.repository

import com.example.asm_kotlin_Ph35163.database.dao.FavoriteDao
import com.example.asm_kotlin_Ph35163.database.entities.Favorites

class FavoriteRepository(private val favoriteDao: FavoriteDao) {
    suspend fun addToFavorite(favorites: Favorites) {
        favoriteDao.addToFavorite(favorites)
    }

    suspend fun removeFromFavorite(favorites: Favorites) {
        favoriteDao.removeFromFavorite(favorites)
    }

    fun getAllFavorites(email: String) = favoriteDao.getAllFavorite(email)
}