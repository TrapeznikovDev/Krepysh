package com.example.newkrepysh.ui.dashboard

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.newkrepysh.ComponentManager
import com.example.newkrepysh.databinding.FragmentDashboardBinding
import com.example.newkrepysh.entities.news.DataForNews
import com.example.newkrepysh.factory.ViewModelFactory
import com.example.newkrepysh.ui.NewsDescriptionFragment
import com.example.newkrepysh.ui.dashboard.recycler.NewsAdapter
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import javax.inject.Inject

class DashboardFragment : Fragment(), PerformClickFromAdapter {

    private var _binding: FragmentDashboardBinding? = null
    lateinit var adapter: NewsAdapter
    @Inject
    lateinit var factory: ViewModelFactory
    private val model: DashboardViewModel by viewModels { factory }
    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!
    var list : List<DataForNews>? = listOf()
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        ComponentManager.instance.getFragmentComponent(this).inject(this)
        adapter = NewsAdapter(this)
        _binding = FragmentDashboardBinding.inflate(inflater, container, false)
        with(binding){
            newsRecyclerView.adapter = adapter
            newsRecyclerView.layoutManager = LinearLayoutManager(requireContext())
        }



        return binding.root
    }

    override fun navigate(pos: Int) {
        findNavController().navigate(DashboardFragmentDirections.actionNavigationDashboardToNewsDescriptionFragment(list?.get(pos)?.fullDescription))
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        CoroutineScope(Dispatchers.IO).launch {
            model.getDataFromApi()
        }

        model.list.observe(viewLifecycleOwner){
            list = it
            adapter.update(it)

        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}