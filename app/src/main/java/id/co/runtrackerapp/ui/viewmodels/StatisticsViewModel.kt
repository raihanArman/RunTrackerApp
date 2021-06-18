package id.co.runtrackerapp.ui.viewmodels

import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.ViewModel
import id.co.runtrackerapp.repositories.MainRepository
import javax.inject.Inject

class StatisticsViewModel @ViewModelInject constructor(
    val mainRepository: MainRepository
): ViewModel() {
    val totalTimeRun = mainRepository.getTotalTimeInMills()
    val totalDistance = mainRepository.getTotalDistace()
    val totalCalories = mainRepository.getTotalColoriesBurned()
    val totalAvgSpeed = mainRepository.getTotalAvgSpeed()

    val runsSortedByDate = mainRepository.getAllRunsSortedByDate()

}