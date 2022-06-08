package com.example.newkrepysh.ui.dashboard

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.newkrepysh.R
import com.example.newkrepysh.databinding.FragmentNewsDescriptionBinding

class NewsDescriptionFragment : Fragment() {

    private lateinit var binding: FragmentNewsDescriptionBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentNewsDescriptionBinding.inflate(inflater, container, false)
        val args = this.arguments?.getString("someArgs")
        binding.fullDesc.text = args
        binding.performBackBtn.setOnClickListener {
            findNavController().popBackStack()
        }
        println(args)
        return binding.root
    }

}