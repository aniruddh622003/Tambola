package com.aniruddhupadhyay.myapplication.dataBase

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "games_played")
data class Games(
    @PrimaryKey(autoGenerate = true)
    var gameID: Long = 0L,
    @ColumnInfo(name = "start_Time")
    var startTime : Long = System.currentTimeMillis(),
    @ColumnInfo(name = "end_time")
    var endTime: Long = startTime
)