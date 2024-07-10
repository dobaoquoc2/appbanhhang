package com.example.asm_kotlin_Ph35163.database.viewModel

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.asm_kotlin_Ph35163.database.entities.Products
import com.example.asm_kotlin_Ph35163.database.repository.ProductRepository
import kotlinx.coroutines.launch

class ProductViewModel(private val productRepository: ProductRepository) : ViewModel() {

    val getAllProduct: LiveData<List<Products>> = productRepository.getAllProduct
    fun getItemProduct(id: Int) = productRepository.getItemProduct(id)

    fun addProduct(products: Products) {
        viewModelScope.launch {
            productRepository.addProduct(products)
        }
    }
}