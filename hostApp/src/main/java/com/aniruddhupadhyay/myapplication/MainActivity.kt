package com.aniruddhupadhyay.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.Window
import android.widget.Button
import android.widget.TextView
import androidx.core.app.ActivityOptionsCompat
import androidx.lifecycle.ViewModelProvider
import com.aniruddhupadhyay.myapplication.dataBase.DatabaseHandler
import com.aniruddhupadhyay.myapplication.databinding.ActivityMainBinding
import com.aniruddhupadhyay.myapplication.viewModels.GameDBViewModelFactory
import com.aniruddhupadhyay.myapplication.viewModels.GameDBViewmodel

class MainActivity : AppCompatActivity() {

    lateinit var tv : TextView
    lateinit var btn1 : Button
    lateinit var btn2 : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        //Shared Element Transition
        window.requestFeature(Window.FEATURE_CONTENT_TRANSITIONS)

        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        tv = binding.textView2
        btn1 = binding.button3
        btn2 = binding.button4
        val application = requireNotNull(this).application
        val dataSource = DatabaseHandler.getInstance(application).numUsedDao
        val dbViemodelFactory = GameDBViewModelFactory(dataSource,application)
        val dbViewModel = ViewModelProvider(this,dbViemodelFactory).get(GameDBViewmodel::class.java)

        binding.button3.setOnClickListener {
            dbViewModel.onStartNewGame()
            sharedElement()
        }

    }

    fun sharedElement() {
        val p1 = androidx.core.util.Pair.create<View,String>(tv,"TV Shared")
        val p2 = androidx.core.util.Pair.create<View,String>(btn1,"Btn1 shared")
        val p3 = androidx.core.util.Pair.create<View,String>(btn2,"Btn2 Shared")

        val acitivityOption  = ActivityOptionsCompat.makeSceneTransitionAnimation(this,p1,p2,p3)
        val i = Intent(this,GameActivity::class.java)

        startActivity(i,acitivityOption.toBundle())
    }


}
