package com.example.music_nr.ui.frament

import android.view.LayoutInflater
import android.view.ViewGroup
import com.example.music_nr.databinding.FragmentHomeBinding
import com.example.music_nr.ui.base.BaseFragment

class HomeFragment: BaseFragment<FragmentHomeBinding>() {
    override val LOG_TAG: String
        get() = this::class.java.name
    override val bindingInflater: (LayoutInflater, ViewGroup, Boolean) -> FragmentHomeBinding
        get() = FragmentHomeBinding::inflate

}