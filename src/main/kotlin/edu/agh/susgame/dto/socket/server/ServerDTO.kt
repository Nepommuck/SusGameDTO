package edu.agh.susgame.dto.socket.server

import kotlinx.serialization.Serializable

@Serializable
data class ServerDTO(
    val id: Int,
    val packetsReceived: Int,
)
