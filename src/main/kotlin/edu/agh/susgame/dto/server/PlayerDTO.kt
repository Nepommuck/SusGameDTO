package edu.agh.susgame.dto.server

import kotlinx.serialization.Serializable

@Serializable
data class PlayerDTO(
    val id: Int,
    val playerName: String,
    val currentMoney: Int,
)
