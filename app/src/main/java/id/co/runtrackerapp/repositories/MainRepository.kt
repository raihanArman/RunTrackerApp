package id.co.runtrackerapp.repositories

import id.co.runtrackerapp.db.dao.Run
import id.co.runtrackerapp.db.dao.RunDao
import javax.inject.Inject

class MainRepository @Inject constructor(
    private val runDao: RunDao
) {

    suspend fun insertRun(run: Run) = runDao.insertRun(run)

    suspend fun deleteRun(run: Run) = runDao.deleteRun(run)

    fun getAllRunsSortedByDate() = runDao.getAllRunsSortedByDate()

    fun getAllRunsSortedByDistance() = runDao.getAllRunsSortedByDistance()

    fun getAllRunsSortedByTimeInMills() = runDao.getAllRunsSortedByTimeInMills()

    fun getAllRunsSortedByAvgSpeed() = runDao.getAllRunsSortedByAvgSpeed()

    fun getAllRunsSortedByColoriesBurned() = runDao.getAllRunsSortedByColoriesBurned()

    fun getTotalAvgSpeed() = runDao.getTotalAvgSpeed()

    fun getTotalDistace() =runDao.getTotalDistance()

    fun getTotalTimeInMills() = runDao.getTotalTimeInMills()

    fun getTotalColoriesBurned() = runDao.getAllRunsSortedByColoriesBurned()

}