package com.example.seriesbacklog.db

import androidx.lifecycle.LiveData
import androidx.room.*
import com.example.seriesbacklog.model.Series

@Dao
interface SeriesDao {
    @Insert
    suspend fun insertSeries(series: Series)

    @Query("SELECT * FROM seriesTable")
    fun getSeries(): LiveData<Series?>

    @Delete
    fun deleteSeries(series: Series)

    @Update
    suspend fun updateSeries(series: Series)
}