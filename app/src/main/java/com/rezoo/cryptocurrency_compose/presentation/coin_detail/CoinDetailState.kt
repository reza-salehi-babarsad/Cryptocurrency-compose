package com.rezoo.cryptocurrency_compose.presentation.coin_detail

import com.rezoo.cryptocurrency_compose.domain.model.CoinDetail

data class CoinDetailState(
    val isLoading: Boolean = false,
    val coin: CoinDetail? = null,
    val error: String = ""
)
