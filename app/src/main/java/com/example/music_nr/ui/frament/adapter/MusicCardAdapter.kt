package com.example.music_nr.ui.frament.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.music_nr.R
import com.example.music_nr.data.Music
import com.example.music_nr.databinding.ItemMusicCardBinding
import com.example.music_nr.util.loadImage

class MusicCardAdapter(private val musicList: List<Music>): RecyclerView.Adapter<MusicCardAdapter.MusicCardViewHolder>() {

    class MusicCardViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        val binding = ItemMusicCardBinding.bind(itemView)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MusicCardViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_music_card,parent,false)
        return MusicCardViewHolder(view)
    }

    override fun getItemCount() = musicList.size

    override fun onBindViewHolder(holder: MusicCardViewHolder, position: Int) {
        val currentMusic = musicList[position]
        holder.binding.apply {
            imageMusic.loadImage(currentMusic.image)
            textSongName.text = currentMusic.title
            textSongWriter.text = currentMusic.songWriters
        }
    }
}