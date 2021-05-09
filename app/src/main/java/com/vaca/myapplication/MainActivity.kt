package com.vaca.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.vaca.myapplication.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val bind:ActivityMainBinding=DataBindingUtil.setContentView(this,R.layout.activity_main)
        bind.fuck=Fuck("fxf")
    }
}