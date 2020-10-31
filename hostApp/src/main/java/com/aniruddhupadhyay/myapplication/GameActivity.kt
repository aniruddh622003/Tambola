package com.aniruddhupadhyay.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.aniruddhupadhyay.myapplication.dataBase.DatabaseHandler
import com.aniruddhupadhyay.myapplication.databinding.ActivityGameBinding
import com.aniruddhupadhyay.myapplication.viewModels.GameDBViewModelFactory
import com.aniruddhupadhyay.myapplication.viewModels.GameDBViewmodel

class GameActivity : AppCompatActivity() {
    private var backtime : Long = 0
    private lateinit var dbViewModel : GameDBViewmodel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityGameBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        val application = requireNotNull(this).application
        val dataSource = DatabaseHandler.getInstance(application).numUsedDao
        val dbViemodelFactory = GameDBViewModelFactory(dataSource,application)
        dbViewModel = ViewModelProvider(this,dbViemodelFactory).get(GameDBViewmodel::class.java)

        binding.gameView = dbViewModel
        binding.lifecycleOwner = this

        binding.nextBtn.setOnClickListener(){
            Log.i("LastUsedNum","" + dbViewModel.Recent)
        }
        binding.showBtn.setOnClickListener(){
            var intent = Intent(this, ShowNum::class.java)
            startActivity(intent)
        }

            dbViewModel.num.observe(this, Observer {num->
            binding.textView.text = num
        })

        dbViewModel.timerFinish.observe(this, Observer { fin->
            if (fin == true){

            }
        })
    }

    override fun onBackPressed() {
        val toast = Toast.makeText(applicationContext,"Double Click Back Button To Exit",Toast.LENGTH_SHORT)

        if (backtime + 1000 > System.currentTimeMillis()){
            toast.cancel()
           super.onBackPressed()
            return
        }
        else{
            toast.show()
        }
        backtime = System.currentTimeMillis()

    }


}
