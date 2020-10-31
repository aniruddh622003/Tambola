package com.aniruddhupadhyay.myapplication.viewModels

import android.app.Application
import android.os.CountDownTimer
import android.text.format.DateUtils
import android.util.Log
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Transformations
import com.aniruddhupadhyay.myapplication.dataBase.NumUsed
import com.aniruddhupadhyay.myapplication.dataBase.NumUsedDao
import kotlinx.coroutines.*

class GameDBViewmodel(val db: NumUsedDao, application: Application): AndroidViewModel(application) {

    private var viewModelJob = Job()
    private val uiScope = CoroutineScope(Dispatchers.Main + viewModelJob)
    private var lastUsedNum = MutableLiveData<NumUsed?>()
    private val nums = db.getUsedNum()
    var lastNum:Int = 0
    val Recent: Int get() = lastUsedNum.value!!.num


    var num  = MutableLiveData<String>()
    lateinit var numList : MutableList<Int>
    private var timer: CountDownTimer

    companion object{
        //Defines a Second
        private const val ONE_SECOND = 1000L
        //User Will Have 10 min total
        private const val COUNTDOWN_TIME = 1800000L
    }

    val timerFinish = MutableLiveData<Boolean>(false)
    private val _currentTime = MutableLiveData<Long>()
    val currentTime: LiveData<Long> get() = _currentTime
    var currentTimeString = Transformations.map(currentTime,{ time->
        DateUtils.formatElapsedTime(time)
    })


    init {
        Log.i("Number DB ViewModel","Number DB ViewModel Created")
        resetList()
        initializeRecentNum()
        num.value = ""
        timer = object : CountDownTimer(COUNTDOWN_TIME, ONE_SECOND){
            override fun onFinish() {
                timerFinish.value = true
                _currentTime.value = 0L
            }

            override fun onTick(millisUntilFinished: Long) {
                _currentTime.value = (millisUntilFinished / ONE_SECOND)
            }
        }
        timer.start()
    }

    override fun onCleared() {
        super.onCleared()
        Log.i("Number DB ViewModel","Number DB ViewModel Destroyed")
        viewModelJob.cancel()

        timer.cancel()
    }
    private fun initializeRecentNum(){
        uiScope.launch {
            lastUsedNum.value = getLastNumFromDataBase()
        }
    }

    private suspend fun getLastNumFromDataBase() : NumUsed?{
        return withContext(Dispatchers.IO){
            var lastUsedNum = db.getLastNum()
            lastUsedNum
        }
    }


    private suspend fun insert(numUsed: NumUsed){
        withContext(Dispatchers.IO){
            db.insertNum(numUsed)
        }
    }

    fun onStartNewGame(){
        uiScope.launch {
            clear()
            Log.i("GameDBViewModel","Table Cleared")
            lastUsedNum.value = null
        }
    }
    private suspend fun clear(){
        db.clearNumTable()
    }

    private fun resetList(){
        numList = mutableListOf(
            1,2,3,4,5,6,7,8,9,10,
            11,12,13,14,15,16,17,18,19,20,
            21,22,23,24,25,26,27,28,29,30,
            31,32,33,34,35,36,37,38,39,40,
            41,42,43,44,45,46,47,48,49,50,
            51,52,53,54,55,56,57,58,59,60,
            61,62,63,64,65,66,67,68,69,70,
            71,72,73,74,75,76,77,78,79,80,
            81,82,83,84,85,86,87,88,89,90
        )
        numList.shuffle()
    }
    fun nextNum(){
        var myNum: Int = 0
        var newNum: NumUsed
        if(numList.isEmpty()){
            Log.i("Game DB ViewModel","List Empty")
            num.value = "G/O"
        }
        else{
            num.value = "" + numList.removeAt(0)
            myNum = num.value!!.toInt()
            Log.i("Game DB ViewModel","" + num.value)
        }

        uiScope.launch {
            newNum = NumUsed()
            newNum.num = myNum
            insert(newNum)
            lastNum = getLastNumFromDataBase()?.num ?: 0

            Log.i("GameDBViewModel","" + lastNum)
        }

    }
    suspend fun <T> withIO(block: suspend CoroutineScope.()-> T) = withContext(Dispatchers.IO,block)

}