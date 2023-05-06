package com.rezoo.cryptocurrency_compose.domain.model

data class Coin(
    val id: String,
    val isactive: Boolean,
    val name: String,
    val rank: Int,
    val symbol: String,
)
