package id.co.runtrackerapp.ui.fragments

import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import dagger.hilt.android.AndroidEntryPoint
import id.co.runtrackerapp.R
import id.co.runtrackerapp.ui.viewmodels.MainViewModel
import id.co.runtrackerapp.ui.viewmodels.StatisticsViewModel

@AndroidEntryPoint
class StatisticsFragment: Fragment(R.layout.fragment_statistics) {

    private val viewModel: StatisticsViewModel by viewModels()

}