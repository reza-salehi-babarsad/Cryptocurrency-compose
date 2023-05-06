package com.rezoo.cryptocurrency_compose.domain.model

import com.rezoo.cryptocurrency_compose.data.remote.dto.CoinDetailDto
import com.rezoo.cryptocurrency_compose.data.remote.dto.TeamMember

data class CoinDetail(
    val coinId: String,
    val name: String,
    val description: String,
    val symbol: String,
    val rank: Int,
    val isactive: Boolean,
    val tags: List<String>,
    val team: List<TeamMember>
)
fun CoinDetailDto.toCoinDetail():CoinDetail{
    return CoinDetail(
        coinId = id,
        name = name,
        description = description,
        symbol = symbol,
        rank = rank,
        isactive = is_active,
        tags = tags.map { it.name },
        team = team
    )
}
