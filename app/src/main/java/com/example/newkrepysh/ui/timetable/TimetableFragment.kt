package com.example.newkrepysh.ui.timetable

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.viewModelScope
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.newkrepysh.databinding.FragmentTimetableBinding
import com.example.newkrepysh.factory.ViewModelFactory
import com.example.newkrepysh.ui.timetable.recyclers.GeneralRecyclerAdapter
import com.example.newkrepysh.utils.ComponentManager
import kotlinx.android.synthetic.main.activity_auth.view.*
import kotlinx.android.synthetic.main.fragment_timetable.*
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import javax.inject.Inject


class TimetableFragment : Fragment() {

    private var _binding: FragmentTimetableBinding? = null

    @Inject
    lateinit var factory: ViewModelFactory
    private val model: TimetableViewModel by viewModels { factory }
    lateinit var adapter: GeneralRecyclerAdapter
    lateinit var adapterSpeed: GeneralRecyclerAdapter
    lateinit var adapterFlex: GeneralRecyclerAdapter

    var args: Int = 0

    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        ComponentManager.instance.getFragmentComponent(this).inject(this)
        adapter = GeneralRecyclerAdapter()
        adapterFlex = GeneralRecyclerAdapter()
        adapterSpeed = GeneralRecyclerAdapter()
        _binding = FragmentTimetableBinding.inflate(inflater, container, false)
        args = this.arguments?.getInt("child_id") ?: 0
        with(binding){
            strengthRecycler.adapter = adapter
            strengthRecycler.layoutManager = GridLayoutManager(requireContext(), 3, LinearLayoutManager.VERTICAL, false)
            agilityRecycler.adapter = adapterFlex
            agilityRecycler.layoutManager = GridLayoutManager(requireContext(), 3, LinearLayoutManager.VERTICAL, false)
            speedRecycler.adapter = adapterSpeed
            speedRecycler.layoutManager = GridLayoutManager(requireContext(), 3, LinearLayoutManager.VERTICAL, false)
        }

        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        model.getDataFromApi(args)
        model.loadingProgress.observe(viewLifecycleOwner){
            when(it){
                LoadingProgress.initial -> {
                    binding.progressBar.visibility = View.GONE
                }
                LoadingProgress.isLoading -> {
                    binding.progressBar.visibility = View.VISIBLE
                }
                else -> {

                }
            }
        }
        model.listStrength.observe(viewLifecycleOwner){
            if (it != null) {
                adapter.update(it)
            }
        }
        model.listFlex.observe(viewLifecycleOwner){
            if (it != null) {
                adapterFlex.update(it)
            }
        }
        model.listSpeed.observe(viewLifecycleOwner){
            if (it != null) {
                adapterSpeed.update(it)
            }
        }
    }
}