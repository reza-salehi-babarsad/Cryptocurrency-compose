package com.rezoo.cryptocurrency_compose.domain.repository

import com.rezoo.cryptocurrency_compose.data.remote.dto.CoinDetailDto
import com.rezoo.cryptocurrency_compose.data.remote.dto.CoinDto

interface CoinRepository  {
    suspend fun getCoins(): List<CoinDto>
    suspend fun getCoinById(coinId :String) : CoinDetailDto
}