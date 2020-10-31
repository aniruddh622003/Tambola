package com.aniruddhupadhyay.myapplication.viewModels

import android.app.Application
import android.util.Log
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.MutableLiveData
import com.aniruddhupadhyay.myapplication.dataBase.NumUsedDao
import kotlinx.coroutines.*

class ShowNumDBViewModel(val db: NumUsedDao, application: Application): AndroidViewModel(application) {
    private var viewmodeljob = Job()
    private var uiScope = CoroutineScope(Dispatchers.Main + viewmodeljob)
    private lateinit var _numList: List<Int>
    var _tvID: MutableLiveData<MutableList<String>> = MutableLiveData(mutableListOf("not Initialised"))

    init {
        Log.i("ShowNumViewModel","ShowNum ViewModel Created")
        _tvID.value = mutableListOf("Not Initialised")
        getallNumUsed()

    }
    override fun onCleared() {
        super.onCleared()
        Log.i("Number DB ViewModel","Number DB ViewModel Destroyed")
        viewmodeljob.cancel()
    }


    private fun getallNumUsed(){
        _numList = db.getNum()

            val TVID : MutableList<String> = mutableListOf()
            _tvID.value = TVID
            for (i in _numList){
                val tvid = "tv"+i
                TVID.add(tvid)
                _tvID.value = TVID
                println(""+i)

        }
    }


}