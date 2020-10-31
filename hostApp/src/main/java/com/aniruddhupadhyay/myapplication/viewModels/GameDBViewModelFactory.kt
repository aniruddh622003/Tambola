package com.aniruddhupadhyay.myapplication.viewModels

import android.app.Application
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.aniruddhupadhyay.myapplication.dataBase.NumUsedDao
import java.lang.IllegalArgumentException

class GameDBViewModelFactory (private val dataSource: NumUsedDao, private val application: Application): ViewModelProvider.Factory{
    @Suppress("unchecked_cast")
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        if(modelClass.isAssignableFrom(GameDBViewmodel::class.java)){
            return GameDBViewmodel(dataSource,application)as T
        }
        throw IllegalArgumentException("Unknown Viewmodel Class")
    }
}