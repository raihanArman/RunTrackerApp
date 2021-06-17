package id.co.runtrackerapp.db.dao

import android.graphics.Bitmap
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "running_table")
data class Run(
    var img: Bitmap ?= null,
    var timestamp: Long ?= 0L,
    var avgSpeedInKMH: Float ?= 0F,
    var distanceInMeters: Int = 0,
    var timeInMills: Long = 0L,
    var coloriesBurned: Int = 0
){
    @PrimaryKey(autoGenerate = true)
    var id: Int? = null
}