package com.rack.fragmentos.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.rack.fragmentos.databinding.FragmentSeccionTresBinding

class SeccionTresFragment : Fragment() {

    private var _binding: FragmentSeccionTresBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView( inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        _binding = FragmentSeccionTresBinding.inflate(inflater, container, false)






        return binding.root
    }

}