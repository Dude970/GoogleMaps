package com.example.GoogleMaps.data.mapper

import com.example.GoogleMaps.data.local.CompanyListingEntity
import com.example.GoogleMaps.domain.model.CompanyListing

fun CompanyListingEntity.toCompanyListing(): CompanyListing{
    return CompanyListing(
        name=name,
        symbol=symbol,
        exchange=exchange
    )
}

fun CompanyListing.toCompanyListing(): CompanyListingEntity{
    return CompanyListingEntity(
        name=name,
        symbol=symbol,
        exchange=exchange
    )
}