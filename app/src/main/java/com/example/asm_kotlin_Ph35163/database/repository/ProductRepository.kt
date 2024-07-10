package com.example.asm_kotlin_Ph35163.database.repository

import androidx.lifecycle.LiveData
import com.example.asm_kotlin_Ph35163.database.dao.ProductDao
import com.example.asm_kotlin_Ph35163.database.entities.Products

class ProductRepository(private val productDao: ProductDao) {
    val getAllProduct: LiveData<List<Products>> = productDao.getAllProduct()
    fun getItemProduct(id: Int): LiveData<Products> = productDao.getItemProduct(id)
    suspend fun addProduct(products: Products) {
        productDao.addProduct(products)
    }
}