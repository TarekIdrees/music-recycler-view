package com.example.music_nr.ui.base

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.viewbinding.ViewBinding

abstract class BaseFragment<VB: ViewBinding> : Fragment(){
    abstract val LOG_TAG : String
    abstract val bindingInflater:(LayoutInflater,ViewGroup,Boolean) -> VB
    private var _binding: VB? = null
    protected val binding get() = _binding!!


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = bindingInflater(inflater, container!!,false)
        return _binding!!.root
    }

    private fun log(value: String){
        Log.v(LOG_TAG,value)
    }
}