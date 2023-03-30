package com.example.music_nr.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.music_nr.R
import com.example.music_nr.adapter.HomeAdapter
import com.example.music_nr.adapter.HomeInteraction
import com.example.music_nr.adapter.HomeItem
import com.example.music_nr.adapter.HomeItemType
import com.example.music_nr.data.DataManger
import com.example.music_nr.data.Music
import com.example.music_nr.databinding.ActivityMainBinding
import com.example.music_nr.util.toHomeItem

class MainActivity : AppCompatActivity(){

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

}