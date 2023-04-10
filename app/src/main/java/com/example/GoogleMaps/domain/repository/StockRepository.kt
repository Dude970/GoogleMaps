package com.example.GoogleMaps.domain.repository

import androidx.room.Query
import com.example.GoogleMaps.domain.model.CompanyListing
import com.example.GoogleMaps.util.Resource
import kotlinx.coroutines.flow.Flow

interface StockRepository {

    suspend fun getCompanyListings(
        fetchFromRemote:Boolean,
         query: String
    ): Flow<Resource<List<CompanyListing>>>

}