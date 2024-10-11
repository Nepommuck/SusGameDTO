package edu.agh.susgame.dto.rest.games.model


data class GameCreationRequest(
    val gameName: String,
    val maxNumberOfPlayers: Int = 4,
    val gamePin: String? = null,
)
