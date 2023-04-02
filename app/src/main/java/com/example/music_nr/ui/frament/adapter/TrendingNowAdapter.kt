package com.example.music_nr.ui.frament.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.music_nr.R
import com.example.music_nr.data.Music
import com.example.music_nr.databinding.ItemTrendingRightNowCardBinding
import com.example.music_nr.util.loadImage

class TrendingNowAdapter(private val itemList: List<Music>): RecyclerView.Adapter<TrendingNowAdapter.TrendingNowViewHolder>() {

    class TrendingNowViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        val binding = ItemTrendingRightNowCardBinding.bind(itemView)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TrendingNowViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_trending_right_now_card,parent,false)
        return TrendingNowViewHolder(view)
    }

    override fun getItemCount() = itemList.size

    override fun onBindViewHolder(holder: TrendingNowViewHolder, position: Int) {
        val currentMusic = itemList[position]
        holder.binding.apply {
            imageBigCard.loadImage(currentMusic.image)
        }
    }
}