package com.example.newkrepysh.ui.profile

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.bumptech.glide.Glide
import com.example.newkrepysh.utils.ComponentManager
import com.example.newkrepysh.R
import com.example.newkrepysh.databinding.FragmentKidsProfileBinding
import com.example.newkrepysh.entities.kidprofile.DataObject
import com.example.newkrepysh.factory.ViewModelFactory
import com.example.newkrepysh.ui.dashboard.DashboardFragmentDirections
import com.example.newkrepysh.ui.dashboard.PerformClickFromAdapter
import com.example.newkrepysh.ui.profile.recycler.KidsProfileAdapter
import com.github.mikephil.charting.components.YAxis
import com.github.mikephil.charting.data.Entry
import com.github.mikephil.charting.data.LineData
import com.github.mikephil.charting.data.LineDataSet
import kotlinx.android.synthetic.main.fragment_kids_profile.*
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import javax.inject.Inject

class KidsProfileFragment : Fragment(), KidPossibleHandler {

    private var _binding: FragmentKidsProfileBinding? = null

    @Inject
    lateinit var factory: ViewModelFactory
    private val model: KidsProfileViewModel by viewModels { factory }
    var args: Int = 0
    var argsUser: Int = 0
    lateinit var adapter: KidsProfileAdapter
    var dataList = listOf("абонементы", "расписание", "история тренировок", "достижения", "анкета")


    private val binding get() = _binding!!


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        ComponentManager.instance.getFragmentComponent(this).inject(this)

//        val data: MutableList<DataObject> = ArrayList()
//
//        data.add(DataObject("абонементы"))
//        data.add(DataObject("расписание"))
//        data.add(DataObject("история тренировок"))
//        data.add(DataObject("достижения"))
//        data.add(DataObject("анкета"))

        _binding = FragmentKidsProfileBinding.inflate(inflater, container, false)


        adapter = KidsProfileAdapter(dataList, this)
        binding.performBackBtn.setOnClickListener {
            findNavController().popBackStack()
        }
        with(binding){
            kidProfileRecycler.hasFixedSize()
            kidProfileRecycler.adapter = adapter
            kidProfileRecycler.layoutManager = LinearLayoutManager(requireContext(), LinearLayoutManager.HORIZONTAL, false)
        }
        return binding.root


    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        args = this.arguments?.getInt("child_id") ?: 0
        argsUser = this.arguments?.getInt("user_id") ?: 0
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

            initeLineChart()

            initeProgressBar()

        }
    }

    private fun initeProgressBar() {
        val progress = 40
        with(binding) {
            workingOutProgressBar.setProgress(progress, false)

        }
    }


    private fun initeLineChart() {
        val entries = ArrayList<Entry>()

        entries.add(Entry(1f, 10f))
        entries.add(Entry(2f, 2f))
        entries.add(Entry(3f, 7f))
        entries.add(Entry(4f, 20f))
        entries.add(Entry(5f, 16f))

        val set = LineDataSet(entries, " ")
        set.mode = LineDataSet.Mode.CUBIC_BEZIER
        set.lineWidth = 3F

        set.color = requireActivity().resources.getColor(R.color.text_orange)
        set.setDrawCircles(false)
        set.setDrawFilled(true)
        set.fillColor = requireActivity().resources.getColor(R.color.text_orange)
        set.highLightColor = requireActivity().resources.getColor(R.color.text_orange)
        set.fillAlpha = 20
        set.setDrawValues(false)
        val dat = LineData(set)
        with(binding) {
            lineChart.setDrawBorders(false)
            val yaxis = lineChart.getAxis(YAxis.AxisDependency.LEFT)
            val secondYaxis = lineChart.getAxis(YAxis.AxisDependency.RIGHT)
            yaxis.setDrawAxisLine(false)
            secondYaxis.setDrawAxisLine(false)
            yaxis.setDrawLabels(false)
            lineChart.minOffset = 0F
            secondYaxis.setDrawLabels(false)
            yaxis.isEnabled = false
            secondYaxis.isEnabled = false
            lineChart.xAxis.isEnabled = false
            lineChart.axisLeft.setDrawGridLines(false)
            lineChart.axisRight.setDrawGridLines(false)
            lineChart.legend.isEnabled = false
            lineChart.setDrawGridBackground(false)
            lineChart.data = dat
            lineChart.description.isEnabled = false
            GlobalScope.launch(Dispatchers.Main) {
                lineChart.invalidate()
            }
        }
    }

    override fun handler(pos: Int) {
        when(pos){
            0 -> {}
            1 -> {findNavController().navigate(KidsProfileFragmentDirections.actionKidsProfileFragmentToTimetableFragment(args, argsUser))}
            2 -> {}
            3 -> {}
            4 -> {}


        }
    }


}