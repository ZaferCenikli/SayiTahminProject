package com.first.sayitahminproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_sonuc_sayfasi.*

class SonucSayfasi : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sonuc_sayfasi)
        var gelenVeri=intent.getBooleanExtra("Sonuç",true)
        println(gelenVeri)
        var gelenRandomSayi=intent.getIntExtra("randomSayi",0).toString()
        println(gelenRandomSayi)


        if(gelenVeri==true){
            imageViewSonuc.setImageResource(R.drawable.baseline_sentiment_very_satisfied_24)

            textViewSonuc.text="KAZANDINIZ"





        }else{
            textViewKayip.text=("Doğru sayu : ${gelenRandomSayi} ")
            imageViewSonuc.setImageResource(R.drawable.baseline_sentiment_very_dissatisfied_24)
            textViewSonuc.text="KAYBETTİNİZ"




        }
buttonSonuc.setOnClickListener {
    var sayfaGecisMain=Intent(this@SonucSayfasi,MainActivity::class.java)
    finish()
    startActivity(sayfaGecisMain)
}


    }
}