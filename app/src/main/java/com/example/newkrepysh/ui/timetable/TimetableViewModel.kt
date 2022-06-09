package com.example.newkrepysh.ui.timetable

import android.content.Context
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.newkrepysh.entities.timetable.TimeTableExampleJson2KtKotlin
import com.example.newkrepysh.entities.timetable.TimetableTrainings
import com.example.newkrepysh.local.Repository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import javax.inject.Inject

class TimetableViewModel @Inject constructor(
    contextApp: Context,
    val repository: Repository,
) : ViewModel() {
    val loadingProgress = MutableLiveData(LoadingProgress.initial)
    val listStrength = MutableLiveData<List<TimetableTrainings>?>()
    val listSpeed = MutableLiveData<List<TimetableTrainings>?>()
    val listFlex = MutableLiveData<List<TimetableTrainings>?>()


    fun getDataFromApi(id:Int){
        loadingProgress.postValue(LoadingProgress.isLoading)
        viewModelScope.launch(Dispatchers.IO) {
            val trainings = repository.api.getTrainingsByMonth(id)
            val body = trainings.body()
            loadingProgress.postValue(LoadingProgress.initial)
            withContext(Dispatchers.Main){
                listFlex.postValue(body?.data?.trainings?.filter { it.area?.type == "flex" })
                listStrength.postValue(body?.data?.trainings?.filter { it.area?.type == "strength" })
                listSpeed.postValue(body?.data?.trainings?.filter { it.area?.type == "speed" })
            }
        }
    }
}
enum class LoadingProgress{
    isLoading, initial, error
}