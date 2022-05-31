package com.example.newkrepysh.ui.profile

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import com.bumptech.glide.Glide
import com.example.newkrepysh.ComponentManager
import com.example.newkrepysh.R
import com.example.newkrepysh.databinding.FragmentKidsProfileBinding
import com.example.newkrepysh.databinding.KidsItemLayoutBinding
import com.example.newkrepysh.factory.ViewModelFactory
import com.example.newkrepysh.local.Repository
import com.example.newkrepysh.ui.home.HomeViewModel
import com.github.mikephil.charting.charts.LineChart
import com.github.mikephil.charting.components.YAxis
import com.github.mikephil.charting.data.Entry
import com.github.mikephil.charting.data.LineData
import com.github.mikephil.charting.data.LineDataSet
import kotlinx.android.synthetic.main.fragment_kids_profile.*
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import javax.inject.Inject

class KidsProfileFragment : Fragment() {

    private var _binding: FragmentKidsProfileBinding? = null

    @Inject
    lateinit var factory: ViewModelFactory
    private val model: KidsProfileViewModel by viewModels { factory }
    var args: Int = 0
    var argsUser: Int = 0


    private val binding get() = _binding!!


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        ComponentManager.instance.getFragmentComponent(this).inject(this)
        _binding = FragmentKidsProfileBinding.inflate(inflater, container, false)
        args = this.arguments?.getInt("child_id") ?: 0
        argsUser = this.arguments?.getInt("user_id") ?: 0
        binding.performBackBtn.setOnClickListener {
            findNavController().popBackStack()
        }
        return binding.root


    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        model.initKids(args)
        model.kid.observe(viewLifecycleOwner) {
            binding.kidProfileName.text = "${it.user?.firstName} ${it.user?.secondName}"
            Glide.with(this)
                .load(it.user?.media?.firstOrNull()?.url?.topThumb)
                .into(kid_profile_photo)
            binding.placeInSchoolNumber.text = it.user?.schoolRating.toString()
            binding.placeInCityNumber.text = it.user?.cityRating.toString()
            binding.placeInCountryNumber.text = it.user?.countryRating.toString()


        }
    }
}