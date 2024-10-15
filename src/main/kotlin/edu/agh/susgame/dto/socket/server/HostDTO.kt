package edu.agh.susgame.dto.socket.server

import kotlinx.serialization.Serializable

@Serializable
data class HostDTO(
    val id: Int,
    val packetPath: List<Int>,
)
