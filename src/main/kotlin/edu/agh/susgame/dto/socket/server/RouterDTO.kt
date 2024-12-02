package edu.agh.susgame.dto.socket.server

import kotlinx.serialization.Serializable

@Serializable
data class RouterDTO(
    val id: Int,
    val bufferSize: Int,
    val spaceLeft: Int,
    val upgradeCost: Int,
    val overheatLevel: Int,
    val isWorking: Boolean
)