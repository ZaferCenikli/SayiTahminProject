package com.first.sayitahminproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import java.util.Collections.list
import java.util.zip.Inflater
import kotlin.math.log
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button.setOnClickListener {

            val sayfagecis=Intent(this@MainActivity,TahminSayfasi::class.java)
            finish()
            startActivity(sayfagecis)


        }

    }
}