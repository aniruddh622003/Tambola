package com.aniruddhupadhyay.myapplication.viewModels

import android.app.Application
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.aniruddhupadhyay.myapplication.dataBase.NumUsedDao
import java.lang.IllegalArgumentException

class ShowNumDBViewModelFactory (private val dataSource: NumUsedDao, private val application: Application): ViewModelProvider.Factory{
    @Suppress("unchecked_cast")
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        if(modelClass.isAssignableFrom(ShowNumDBViewModel::class.java)){
            return ShowNumDBViewModel(dataSource,application)as T
        }
        throw IllegalArgumentException("Unknown Viewmodel Class")
    }
}