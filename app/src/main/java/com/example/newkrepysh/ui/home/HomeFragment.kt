package com.example.newkrepysh.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.newkrepysh.ComponentManager
import com.example.newkrepysh.R
import com.example.newkrepysh.databinding.FragmentHomeBinding
import com.example.newkrepysh.factory.ViewModelFactory
import com.example.newkrepysh.ui.home.recycler.HomeAdapter
import javax.inject.Inject

class HomeFragment : Fragment() {

    private var _binding: FragmentHomeBinding? = null
    private lateinit var adapter: HomeAdapter

    @Inject

    lateinit var factory: ViewModelFactory

    private val model: HomeViewModel by viewModels { factory }

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        adapter = HomeAdapter()
        ComponentManager.instance.getFragmentComponent(this).inject(this)
        adapter = HomeAdapter()
        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        with(binding){
            val decoration = DividerItemDecoration(requireContext(), LinearLayoutManager.VERTICAL)
            requireContext().getDrawable(R.drawable.divider_decoration)
                ?.let { decoration.setDrawable(it) }
            recyclerParentKids.addItemDecoration(decoration)
            recyclerParentKids.adapter = adapter
            recyclerParentKids.layoutManager = LinearLayoutManager(requireContext())

        }
        val root: View = binding.root
        return root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        model.initUser()
        model.list.observe(viewLifecycleOwner){
            adapter.setData(it)
        }
        model.parent.observe(viewLifecycleOwner){user ->
            binding.parentName.text = "${user?.firstName} ${user?.secondName}"
        }


    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}