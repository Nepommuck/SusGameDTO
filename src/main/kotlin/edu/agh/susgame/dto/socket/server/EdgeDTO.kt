package edu.agh.susgame.dto.socket.server

import kotlinx.serialization.Serializable

@Serializable
data class EdgeDTO(
    val id: Int,
    val upgradeCost: Int,
    val packetsTransported: Int,
)
