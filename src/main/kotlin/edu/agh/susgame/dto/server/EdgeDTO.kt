package edu.agh.susgame.dto.server

import kotlinx.serialization.Serializable

@Serializable
data class EdgeDTO(
    val id: Int,
    val upgradeCost: Int,
    val packetsTransported: Int,
)
