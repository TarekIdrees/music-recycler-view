package com.example.music_nr.ui.frament

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.music_nr.data.DataManger
import com.example.music_nr.databinding.FragmentHomeBinding
import com.example.music_nr.ui.base.BaseFragment
import com.example.music_nr.ui.frament.adapter.MusicCardAdapter
import com.example.music_nr.ui.frament.adapter.TrendingNowAdapter

class HomeFragment: BaseFragment<FragmentHomeBinding>() {
    override val LOG_TAG: String
        get() = this::class.java.name
    override val bindingInflater: (LayoutInflater, ViewGroup, Boolean) -> FragmentHomeBinding
        get() = FragmentHomeBinding::inflate

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setupTrendingNowAdapter()
        setupMusicCardAdapter()
    }

    private fun setupTrendingNowAdapter(){
        val trendingNowAdapter = TrendingNowAdapter(DataManger.songs)
        binding.includeRecyclerViewTrending.recyclerViewTrending.adapter = trendingNowAdapter
    }

    private fun setupMusicCardAdapter(){
        val musicCardAdapter = MusicCardAdapter(DataManger.songs)
        binding.includeRecyclerViewMusicCard.recyclerViewTrending.adapter = musicCardAdapter
    }
}