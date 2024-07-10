package com.example.asm_kotlin_Ph35163.database.viewModel

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.asm_kotlin_Ph35163.database.entities.Favorites
import com.example.asm_kotlin_Ph35163.database.repository.FavoriteRepository
import kotlinx.coroutines.launch

class FavoriteViewModel(private val favoriteRepository: FavoriteRepository) : ViewModel() {
    fun addToFavorite(favorites: Favorites) {
        viewModelScope.launch {
            favoriteRepository.addToFavorite(favorites)
        }
    }

    fun removeFromFavorite(favorites: Favorites) {
        viewModelScope.launch {
            favoriteRepository.removeFromFavorite(favorites)
        }
    }

    fun getAllFavorite(email: String): LiveData<List<Favorites>> =
        favoriteRepository.getAllFavorites(email)
}