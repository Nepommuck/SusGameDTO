package edu.agh.susgame.dto.socket.server

import kotlinx.serialization.Serializable

@Serializable
data class HostDTO(
    val id: Int,
    val packetRoute: List<Int>,
    val packetsSentPerTick: Int,
)
