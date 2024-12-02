package edu.agh.susgame.dto.rest.games.model

import edu.agh.susgame.dto.rest.model.LobbyId
import kotlinx.serialization.Serializable


@Serializable
data class GameCreationApiResponse(
    val lobbyId: LobbyId,
)
