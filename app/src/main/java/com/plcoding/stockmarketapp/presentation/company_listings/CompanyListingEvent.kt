package com.plcoding.stockmarketapp.presentation.company_listings

import com.plcoding.stockmarketapp.domain.model.CompanyListing

sealed class CompanyListingEvent {
    object Refresh: CompanyListingEvent()
    data class OnSearchQueryChange(val query: String) : CompanyListingEvent()
}
