package edu.agh.susgame.dto.server

import kotlinx.serialization.Serializable

@Serializable
data class HostDTO(
    val id: Int,
    val packetPath: List<Int>,
)
