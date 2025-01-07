//Los fragment por defecto vienen de manera distinta, este esta hecho con el binding y sin el metodo antiguo de parametros

package com.rack.fragmentos.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.rack.fragmentos.databinding.FragmentSeccionUnoBinding

class SeccionUnoFragment : Fragment() {

    private var _binding: FragmentSeccionUnoBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView( inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        _binding = FragmentSeccionUnoBinding.inflate(inflater, container, false)





        return binding.root
    }

}