package com.example.GoogleMaps.data.remote.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.GoogleMaps.data.local.CompanyListingEntity
import com.example.GoogleMaps.domain.model.CompanyListing

@Dao
interface StockDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
suspend fun insertCompanyListings(
    companyListingEntities: List<CompanyListingEntity>

)
@Query("DELETE FROM companylistingentity")
suspend fun clearCompanyListings(
)
suspend fun searchCompanyListings(query:String):List<CompanyListingEntity>
}