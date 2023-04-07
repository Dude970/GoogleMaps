package com.example.GoogleMaps.domain.repository

import com.example.GoogleMaps.domain.model.CompanyListing
import com.example.GoogleMaps.util.Resource
import kotlinx.coroutines.flow.Flow

interface StockRepository {

    suspend fun getCompanyListings(
        fetchFromRemote:Boolean
    ): Flow<Resource<List<CompanyListing>>>

}