package com.aniruddhupadhyay.myapplication.dataBase

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(entities = [NumUsed::class,Games::class],version = 1, exportSchema = false)
abstract class DatabaseHandler : RoomDatabase(){

    abstract val numUsedDao: NumUsedDao
    abstract val gamesDao: GamesDao

    companion object{
        @Volatile
        var INSTANCE:DatabaseHandler? = null

        fun getInstance(context: Context) : DatabaseHandler{
            synchronized(this){
                var instance = INSTANCE

                if (instance == null){
                    instance = Room.databaseBuilder(context.applicationContext,DatabaseHandler::class.java,"Tambola Database")
                        .fallbackToDestructiveMigration()
                        .allowMainThreadQueries().build()
                    INSTANCE = instance
                }

                return instance
            }
        }
    }
}