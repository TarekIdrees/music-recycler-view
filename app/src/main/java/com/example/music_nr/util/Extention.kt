package com.example.music_nr.util

import android.widget.ImageView
import com.bumptech.glide.Glide
import com.example.music_nr.adapter.HomeItem
import com.example.music_nr.adapter.HomeItemType
import com.example.music_nr.data.Music

fun ImageView.loadImage(url: String) {
    Glide.with(context)
        .load(url)
        .into(this)
}

fun Music.toHomeItem(): HomeItem<Any> {
    return HomeItem(this, HomeItemType.MUSIC_CARD)
}