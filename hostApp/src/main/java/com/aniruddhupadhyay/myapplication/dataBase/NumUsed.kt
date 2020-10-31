package com.aniruddhupadhyay.myapplication.dataBase

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "current_game_Number")
data class NumUsed(
    @PrimaryKey(autoGenerate = true)
    var numID: Long = 0L,
    @ColumnInfo(name = "number")
    var num: Int = 0
)