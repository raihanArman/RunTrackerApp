package id.co.runtrackerapp.db

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverter
import androidx.room.TypeConverters
import id.co.runtrackerapp.db.dao.Run
import id.co.runtrackerapp.db.dao.RunDao

@Database(
    entities = [Run::class],
    version = 1,
    exportSchema = false
)
@TypeConverters(Converter::class)
abstract class RunDatabase : RoomDatabase(){
    abstract fun getRunDao() : RunDao
}