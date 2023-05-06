package com.rezoo.cryptocurrency_compose.data.repository

import com.rezoo.cryptocurrency_compose.data.remote.CoinPaprikaApi
import com.rezoo.cryptocurrency_compose.data.remote.dto.CoinDetailDto
import com.rezoo.cryptocurrency_compose.data.remote.dto.CoinDto
import com.rezoo.cryptocurrency_compose.domain.repository.CoinRepository
import javax.inject.Inject

class CoinRepositoryImpl @Inject constructor(
    private val api: CoinPaprikaApi
): CoinRepository{
    override suspend fun getCoins(): List<CoinDto> {
        return api.getCoins()
    }

    override suspend fun getCoinById(coinId : String): CoinDetailDto {
        return  api.getCoinById(coinId)
    }

}