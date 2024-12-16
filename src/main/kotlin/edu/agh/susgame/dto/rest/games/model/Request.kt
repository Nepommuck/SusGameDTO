package edu.agh.susgame.dto.rest.games.model

import edu.agh.susgame.dto.rest.model.LobbyPin
import kotlinx.serialization.Serializable


@Serializable
data class GameCreationRequest(
    val gameName: String,
    val maxNumberOfPlayers: Int,
    val gamePin: LobbyPin?,
)
