package edu.agh.susgame.dto.server

import kotlinx.serialization.Serializable

@Serializable
data class RouterDTO(
    val id: Int,
    val bufferUse: Int,
    val bufferSize: Int,
    val upgradeCost: Int,
)
