package com.first.sayitahminproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_tahmin_sayfasi.*
import kotlin.random.Random

class TahminSayfasi : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tahmin_sayfasi)

        val randomsayi= Random.nextInt(101)
        println("Rasgele sayi:${randomsayi}")
        var KalanHak=(5)

        buttonTahmin.setOnClickListener {
            var alinanTahmin=editTextTextPersonName.text.toString().toInt()

            if(alinanTahmin!=randomsayi){
                if(alinanTahmin>randomsayi){
                    textViewTahmin.text="Azalt"
                }else{
                    textViewTahmin.text="Arttır"
                }



                KalanHak = KalanHak - 1
                textView2.text="KALAN HAK:${KalanHak}"
                if(KalanHak==0){

                    val SayfaGecisTahmin=Intent(this@TahminSayfasi,SonucSayfasi::class.java)
                    SayfaGecisTahmin.putExtra("Sonuç",false)
                    SayfaGecisTahmin.putExtra("randomSayi",(randomsayi))
                    finish()
                    startActivity(SayfaGecisTahmin)

                }

            }else{
                val SayfaGecisTahmin=Intent(this@TahminSayfasi,SonucSayfasi::class.java)
                SayfaGecisTahmin.putExtra("Sonuc",true)
                finish()
                startActivity(SayfaGecisTahmin)
            }

        }
    }
}