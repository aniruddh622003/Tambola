package com.aniruddhupadhyay.myapplication

import androidx.room.Room
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.platform.app.InstrumentationRegistry
import com.aniruddhupadhyay.myapplication.dataBase.DatabaseHandler
import com.aniruddhupadhyay.myapplication.dataBase.GamesDao
import com.aniruddhupadhyay.myapplication.dataBase.NumUsed
import com.aniruddhupadhyay.myapplication.dataBase.NumUsedDao
import org.junit.After
import org.junit.Assert
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import java.io.IOException
import java.lang.Exception

@RunWith(AndroidJUnit4::class)
class DatabseTest{
    private lateinit var gamesDao: GamesDao
    private lateinit var numUsedDao: NumUsedDao
    private lateinit var db : DatabaseHandler

    @Before
    fun createdb(){
        val context  = InstrumentationRegistry.getInstrumentation().targetContext
        db = Room.inMemoryDatabaseBuilder(context, DatabaseHandler::class.java)
            .allowMainThreadQueries()
            .build()
        numUsedDao = db.numUsedDao
        gamesDao = db.gamesDao
    }
    @After
    @Throws(IOException::class)
    fun closedb(){
        db.close()
    }

    @Test
    @Throws(Exception::class)
    fun insertAndGet(){
        val num = NumUsed()
        numUsedDao.insertNum(num)
        val recent = numUsedDao.getLastNum()
        Assert.assertEquals(recent?.num,0)
    }


}