package edu.agh.susgame.dto.rest.games.model

import kotlinx.serialization.Serializable


@Serializable
data class GameCreationRequest(
    val gameName: String,
    val maxNumberOfPlayers: Int,
    val gamePin: String?,
)
