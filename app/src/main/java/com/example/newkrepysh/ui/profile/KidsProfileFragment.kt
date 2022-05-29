package com.example.newkrepysh.ui.profile

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import com.example.newkrepysh.ComponentManager
import com.example.newkrepysh.R
import com.example.newkrepysh.databinding.FragmentKidsProfileBinding
import com.example.newkrepysh.databinding.KidsItemLayoutBinding
import com.example.newkrepysh.factory.ViewModelFactory
import com.github.mikephil.charting.charts.LineChart
import kotlinx.android.synthetic.main.fragment_kids_profile.*
import javax.inject.Inject

class KidsProfileFragment : Fragment() {

    private var _binding: FragmentKidsProfileBinding? = null

    @Inject
    lateinit var factory: ViewModelFactory

//    private var module: KidsProfileViewModel by viewModels { factory }

    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        ComponentManager.instance.getFragmentComponent(this).inject(this)
        _binding = FragmentKidsProfileBinding.inflate(inflater, container, false)
        with(binding){

        }

        val root: View = binding.root
        return root


    }

    private fun initeLineChart() {
        lineChart.axisLeft.setDrawGridLines(false)
    }
}