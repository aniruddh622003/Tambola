package com.aniruddhupadhyay.myapplication.dataBase

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update

@Dao
interface NumUsedDao {
    @Insert
    fun insertNum(num : NumUsed)

    @Update
    fun updateNum(num : NumUsed)

    @Query("SELECT * FROM CURRENT_GAME_NUMBER ORDER BY numID DESC")
    fun getUsedNum():LiveData<List<NumUsed>>

    @Query("SELECT number FROM CURRENT_GAME_NUMBER ORDER BY numID DESC")
    fun getNum(): List<Int>

    @Query("SELECT * FROM CURRENT_GAME_NUMBER WHERE NUMID = :key")
    fun getSpecificNum(key : Long): NumUsed

    @Query("DELETE FROM CURRENT_GAME_NUMBER")
    fun clearNumTable()

    @Query("SELECT * FROM CURRENT_GAME_NUMBER ORDER BY numID DESC LIMIT 1")
    fun getLastNum(): NumUsed?
}