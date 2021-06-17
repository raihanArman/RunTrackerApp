package id.co.runtrackerapp.service

import android.arch.lifecycle.LifecycleService
import android.content.Intent
import id.co.runtrackerapp.util.Constants
import timber.log.Timber

class TrackingService : LifecycleService(){
    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {
        intent?.let {
            when(it.action){
                Constants.ACTION_START_OR_RESUME_SERVICE -> {
                    Timber.d("Started or resume service")
                }
                Constants.ACTION_PAUSE_SERVICE -> {
                    Timber.d("Pause service")
                }
                Constants.ACTION_STOP_SERVICE -> {
                    Timber.d("Stop service")
                }
            }
        }
        return super.onStartCommand(intent, flags, startId)
    }
}