package com.aniruddhupadhyay.myapplication

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.aniruddhupadhyay.myapplication.dataBase.DatabaseHandler
import com.aniruddhupadhyay.myapplication.databinding.ActivityShowNumBinding
import com.aniruddhupadhyay.myapplication.viewModels.ShowNumDBViewModel
import com.aniruddhupadhyay.myapplication.viewModels.ShowNumDBViewModelFactory

class ShowNum : AppCompatActivity() {

    private lateinit var showNumViewModel: ShowNumDBViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityShowNumBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val application = requireNotNull(this).application
        val dataSource = DatabaseHandler.getInstance(application).numUsedDao
        val dbViemodelFactory = ShowNumDBViewModelFactory(dataSource,application)
        showNumViewModel = ViewModelProvider(this,dbViemodelFactory).get(ShowNumDBViewModel::class.java)

        showNumViewModel._tvID.observe(this, Observer { idList->
            for (i in idList){
                when (i) {
                    "tv1" -> {
                        binding.tv1.setBackgroundResource(R.drawable.token_red)
                        binding.tv1.setTextColor(Color.WHITE)
                    }
                    "tv2" -> {
                        binding.tv2.setBackgroundResource(R.drawable.token_red)
                        binding.tv2.setTextColor(Color.WHITE)
                    }
                    "tv3" -> {
                        binding.tv3.setBackgroundResource(R.drawable.token_red)
                        binding.tv3.setTextColor(Color.WHITE)
                    }
                    "tv4" -> {
                        binding.tv4.setBackgroundResource(R.drawable.token_red)
                        binding.tv4.setTextColor(Color.WHITE)
                    }
                    "tv5" -> {
                        binding.tv5.setBackgroundResource(R.drawable.token_red)
                        binding.tv5.setTextColor(Color.WHITE)
                    }
                    "tv6" -> {
                        binding.tv6.setBackgroundResource(R.drawable.token_red)
                        binding.tv6.setTextColor(Color.WHITE)
                    }
                    "tv7" -> {
                        binding.tv7.setBackgroundResource(R.drawable.token_red)
                        binding.tv7.setTextColor(Color.WHITE)
                    }
                    "tv8" -> {
                        binding.tv8.setBackgroundResource(R.drawable.token_red)
                        binding.tv8.setTextColor(Color.WHITE)
                    }
                    "tv9" -> {
                        binding.tv9.setBackgroundResource(R.drawable.token_red)
                        binding.tv9.setTextColor(Color.WHITE)
                    }
                    "tv10" -> {
                        binding.tv10.setBackgroundResource(R.drawable.token_red)
                        binding.tv10.setTextColor(Color.WHITE)
                    }
                    "tv11" -> {
                        binding.tv11.setBackgroundResource(R.drawable.token_red)
                        binding.tv11.setTextColor(Color.WHITE)
                    }
                    "tv12" -> {
                        binding.tv12.setBackgroundResource(R.drawable.token_red)
                        binding.tv12.setTextColor(Color.WHITE)
                    }
                    "tv13" -> {
                        binding.tv13.setBackgroundResource(R.drawable.token_red)
                        binding.tv13.setTextColor(Color.WHITE)
                    }
                    "tv14" -> {
                        binding.tv14.setBackgroundResource(R.drawable.token_red)
                        binding.tv14.setTextColor(Color.WHITE)
                    }
                    "tv15" -> {
                        binding.tv15.setBackgroundResource(R.drawable.token_red)
                        binding.tv15.setTextColor(Color.WHITE)
                    }
                    "tv16" -> {
                        binding.tv16.setBackgroundResource(R.drawable.token_red)
                        binding.tv16.setTextColor(Color.WHITE)
                    }
                    "tv17" -> {
                        binding.tv17.setBackgroundResource(R.drawable.token_red)
                        binding.tv17.setTextColor(Color.WHITE)
                    }
                    "tv18" -> {
                        binding.tv18.setBackgroundResource(R.drawable.token_red)
                        binding.tv18.setTextColor(Color.WHITE)
                    }
                    "tv19" -> {
                        binding.tv19.setBackgroundResource(R.drawable.token_red)
                        binding.tv19.setTextColor(Color.WHITE)
                    }
                    "tv20" -> {
                        binding.tv20.setBackgroundResource(R.drawable.token_red)
                        binding.tv20.setTextColor(Color.WHITE)
                    }
                    "tv21" -> {
                        binding.tv21.setBackgroundResource(R.drawable.token_red)
                        binding.tv21.setTextColor(Color.WHITE)
                    }
                    "tv22" -> {
                        binding.tv22.setBackgroundResource(R.drawable.token_red)
                        binding.tv22.setTextColor(Color.WHITE)
                    }
                    "tv23" -> {
                        binding.tv23.setBackgroundResource(R.drawable.token_red)
                        binding.tv23.setTextColor(Color.WHITE)
                    }
                    "tv24" -> {
                        binding.tv24.setBackgroundResource(R.drawable.token_red)
                        binding.tv24.setTextColor(Color.WHITE)
                    }
                    "tv25" -> {
                        binding.tv25.setBackgroundResource(R.drawable.token_red)
                        binding.tv25.setTextColor(Color.WHITE)
                    }
                    "tv26" -> {
                        binding.tv26.setBackgroundResource(R.drawable.token_red)
                        binding.tv26.setTextColor(Color.WHITE)
                    }
                    "tv27" -> {
                        binding.tv27.setBackgroundResource(R.drawable.token_red)
                        binding.tv27.setTextColor(Color.WHITE)
                    }
                    "tv28" -> {
                        binding.tv28.setBackgroundResource(R.drawable.token_red)
                        binding.tv28.setTextColor(Color.WHITE)
                    }
                    "tv29" -> {
                        binding.tv29.setBackgroundResource(R.drawable.token_red)
                        binding.tv29.setTextColor(Color.WHITE)
                    }
                    "tv30" -> {
                        binding.tv30.setBackgroundResource(R.drawable.token_red)
                        binding.tv30.setTextColor(Color.WHITE)
                    }
                    "tv31" -> {
                        binding.tv31.setBackgroundResource(R.drawable.token_red)
                        binding.tv31.setTextColor(Color.WHITE)
                    }
                    "tv32" -> {
                        binding.tv32.setBackgroundResource(R.drawable.token_red)
                        binding.tv32.setTextColor(Color.WHITE)
                    }
                    "tv33" -> {
                        binding.tv33.setBackgroundResource(R.drawable.token_red)
                        binding.tv33.setTextColor(Color.WHITE)
                    }
                    "tv34" -> {
                        binding.tv34.setBackgroundResource(R.drawable.token_red)
                        binding.tv34.setTextColor(Color.WHITE)
                    }
                    "tv35" -> {
                        binding.tv35.setBackgroundResource(R.drawable.token_red)
                        binding.tv35.setTextColor(Color.WHITE)
                    }
                    "tv36" -> {
                        binding.tv36.setBackgroundResource(R.drawable.token_red)
                        binding.tv36.setTextColor(Color.WHITE)
                    }
                    "tv37" -> {
                        binding.tv37.setBackgroundResource(R.drawable.token_red)
                        binding.tv37.setTextColor(Color.WHITE)
                    }
                    "tv38" -> {
                        binding.tv38.setBackgroundResource(R.drawable.token_red)
                        binding.tv38.setTextColor(Color.WHITE)
                    }
                    "tv39" -> {
                        binding.tv39.setBackgroundResource(R.drawable.token_red)
                        binding.tv39.setTextColor(Color.WHITE)
                    }
                    "tv40" -> {
                        binding.tv40.setBackgroundResource(R.drawable.token_red)
                        binding.tv40.setTextColor(Color.WHITE)
                    }
                    "tv41" -> {
                        binding.tv41.setBackgroundResource(R.drawable.token_red)
                        binding.tv41.setTextColor(Color.WHITE)
                    }
                    "tv42" -> {
                        binding.tv42.setBackgroundResource(R.drawable.token_red)
                        binding.tv42.setTextColor(Color.WHITE)
                    }
                    "tv43" -> {
                        binding.tv43.setBackgroundResource(R.drawable.token_red)
                        binding.tv43.setTextColor(Color.WHITE)
                    }
                    "tv44" -> {
                        binding.tv44.setBackgroundResource(R.drawable.token_red)
                        binding.tv44.setTextColor(Color.WHITE)
                    }
                    "tv45" -> {
                        binding.tv45.setBackgroundResource(R.drawable.token_red)
                        binding.tv45.setTextColor(Color.WHITE)
                    }
                    "tv46" -> {
                        binding.tv46.setBackgroundResource(R.drawable.token_red)
                        binding.tv46.setTextColor(Color.WHITE)
                    }
                    "tv47" -> {
                        binding.tv47.setBackgroundResource(R.drawable.token_red)
                        binding.tv47.setTextColor(Color.WHITE)
                    }
                    "tv48" -> {
                        binding.tv48.setBackgroundResource(R.drawable.token_red)
                        binding.tv48.setTextColor(Color.WHITE)
                    }
                    "tv49" -> {
                        binding.tv49.setBackgroundResource(R.drawable.token_red)
                        binding.tv49.setTextColor(Color.WHITE)
                    }
                    "tv50" -> {
                        binding.tv50.setBackgroundResource(R.drawable.token_red)
                        binding.tv50.setTextColor(Color.WHITE)
                    }
                    "tv51" -> {
                        binding.tv51.setBackgroundResource(R.drawable.token_red)
                        binding.tv51.setTextColor(Color.WHITE)
                    }
                    "tv52" -> {
                        binding.tv52.setBackgroundResource(R.drawable.token_red)
                        binding.tv52.setTextColor(Color.WHITE)
                    }
                    "tv53" -> {
                        binding.tv53.setBackgroundResource(R.drawable.token_red)
                        binding.tv53.setTextColor(Color.WHITE)
                    }
                    "tv54" -> {
                        binding.tv54.setBackgroundResource(R.drawable.token_red)
                        binding.tv54.setTextColor(Color.WHITE)
                    }
                    "tv55" -> {
                        binding.tv55.setBackgroundResource(R.drawable.token_red)
                        binding.tv55.setTextColor(Color.WHITE)
                    }
                    "tv56" -> {
                        binding.tv56.setBackgroundResource(R.drawable.token_red)
                        binding.tv56.setTextColor(Color.WHITE)
                    }
                    "tv57" -> {
                        binding.tv57.setBackgroundResource(R.drawable.token_red)
                        binding.tv57.setTextColor(Color.WHITE)
                    }
                    "tv58" -> {
                        binding.tv58.setBackgroundResource(R.drawable.token_red)
                        binding.tv58.setTextColor(Color.WHITE)
                    }
                    "tv59" -> {
                        binding.tv59.setBackgroundResource(R.drawable.token_red)
                        binding.tv59.setTextColor(Color.WHITE)
                    }
                    "tv60" -> {
                        binding.tv60.setBackgroundResource(R.drawable.token_red)
                        binding.tv60.setTextColor(Color.WHITE)
                    }
                    "tv61" -> {
                        binding.tv61.setBackgroundResource(R.drawable.token_red)
                        binding.tv61.setTextColor(Color.WHITE)
                    }
                    "tv62" -> {
                        binding.tv62.setBackgroundResource(R.drawable.token_red)
                        binding.tv62.setTextColor(Color.WHITE)
                    }
                    "tv63" -> {
                        binding.tv63.setBackgroundResource(R.drawable.token_red)
                        binding.tv63.setTextColor(Color.WHITE)
                    }
                    "tv64" -> {
                        binding.tv64.setBackgroundResource(R.drawable.token_red)
                        binding.tv64.setTextColor(Color.WHITE)
                    }
                    "tv65" -> {
                        binding.tv65.setBackgroundResource(R.drawable.token_red)
                        binding.tv65.setTextColor(Color.WHITE)
                    }
                    "tv66" -> {
                        binding.tv66.setBackgroundResource(R.drawable.token_red)
                        binding.tv66.setTextColor(Color.WHITE)
                    }
                    "tv67" -> {
                        binding.tv67.setBackgroundResource(R.drawable.token_red)
                        binding.tv67.setTextColor(Color.WHITE)
                    }
                    "tv68" -> {
                        binding.tv68.setBackgroundResource(R.drawable.token_red)
                        binding.tv68.setTextColor(Color.WHITE)
                    }
                    "tv69" -> {
                        binding.tv69.setBackgroundResource(R.drawable.token_red)
                        binding.tv69.setTextColor(Color.WHITE)
                    }
                    "tv70" -> {
                        binding.tv70.setBackgroundResource(R.drawable.token_red)
                        binding.tv70.setTextColor(Color.WHITE)
                    }
                    "tv71" -> {
                        binding.tv71.setBackgroundResource(R.drawable.token_red)
                        binding.tv71.setTextColor(Color.WHITE)
                    }
                    "tv72" -> {
                        binding.tv72.setBackgroundResource(R.drawable.token_red)
                        binding.tv72.setTextColor(Color.WHITE)
                    }
                    "tv73" -> {
                        binding.tv73.setBackgroundResource(R.drawable.token_red)
                        binding.tv73.setTextColor(Color.WHITE)
                    }
                    "tv74" -> {
                        binding.tv74.setBackgroundResource(R.drawable.token_red)
                        binding.tv74.setTextColor(Color.WHITE)
                    }
                    "tv75" -> {
                        binding.tv75.setBackgroundResource(R.drawable.token_red)
                        binding.tv75.setTextColor(Color.WHITE)
                    }
                    "tv76" -> {
                        binding.tv76.setBackgroundResource(R.drawable.token_red)
                        binding.tv76.setTextColor(Color.WHITE)
                    }
                    "tv77" -> {
                        binding.tv77.setBackgroundResource(R.drawable.token_red)
                        binding.tv77.setTextColor(Color.WHITE)
                    }
                    "tv78" -> {
                        binding.tv78.setBackgroundResource(R.drawable.token_red)
                        binding.tv78.setTextColor(Color.WHITE)
                    }
                    "tv79" -> {
                        binding.tv79.setBackgroundResource(R.drawable.token_red)
                        binding.tv79.setTextColor(Color.WHITE)
                    }
                    "tv80" -> {
                        binding.tv80.setBackgroundResource(R.drawable.token_red)
                        binding.tv80.setTextColor(Color.WHITE)
                    }
                    "tv81" -> {
                        binding.tv81.setBackgroundResource(R.drawable.token_red)
                        binding.tv81.setTextColor(Color.WHITE)
                    }
                    "tv82" -> {
                        binding.tv82.setBackgroundResource(R.drawable.token_red)
                        binding.tv82.setTextColor(Color.WHITE)
                    }
                    "tv83" -> {
                        binding.tv83.setBackgroundResource(R.drawable.token_red)
                        binding.tv83.setTextColor(Color.WHITE)
                    }
                    "tv84" -> {
                        binding.tv84.setBackgroundResource(R.drawable.token_red)
                        binding.tv84.setTextColor(Color.WHITE)
                    }
                    "tv85" -> {
                        binding.tv85.setBackgroundResource(R.drawable.token_red)
                        binding.tv85.setTextColor(Color.WHITE)
                    }
                    "tv86" -> {
                        binding.tv86.setBackgroundResource(R.drawable.token_red)
                        binding.tv86.setTextColor(Color.WHITE)
                    }
                    "tv87" -> {
                        binding.tv87.setBackgroundResource(R.drawable.token_red)
                        binding.tv87.setTextColor(Color.WHITE)
                    }
                    "tv88" -> {
                        binding.tv88.setBackgroundResource(R.drawable.token_red)
                        binding.tv88.setTextColor(Color.WHITE)
                    }
                    "tv89" -> {
                        binding.tv89.setBackgroundResource(R.drawable.token_red)
                        binding.tv89.setTextColor(Color.WHITE)
                    }
                    "tv90" -> {
                        binding.tv90.setBackgroundResource(R.drawable.token_red)
                        binding.tv90.setTextColor(Color.WHITE)
                    }
                }
                println("Id Used $i")
            }
        })
    }
}
