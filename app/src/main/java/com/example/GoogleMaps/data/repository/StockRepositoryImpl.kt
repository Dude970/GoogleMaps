package com.example.GoogleMaps.data.repository

import com.example.GoogleMaps.data.local.StockDatabase
import com.example.GoogleMaps.data.mapper.toCompanyListing
import com.example.GoogleMaps.data.remote.StockApi
import com.example.GoogleMaps.domain.model.CompanyListing
import com.example.GoogleMaps.domain.repository.StockRepository
import com.example.GoogleMaps.util.Resource
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class StockRepositoryImpl @Inject constructor(
    val api: StockApi,
    val db: StockDatabase,

    ) : StockRepository {
    private val dao = db.dao

    override suspend fun getCompanyListings(
        fetchFromRemote: Boolean,
        query: String,
    ): Flow<Resource<List<CompanyListing>>> {
        return flow {
            emit(Resource.Loading(true))
            val localListings = dao.searchCompanyListings(query)

            emit(Resource.Success(data = localListings.map { it.toCompanyListing() }))
        }

    }


}