package edu.agh.susgame.dto.rest.model

import kotlinx.serialization.Serializable


@Serializable
data class LobbyId(val value: Int)

@Serializable
data class Lobby(
    val id: LobbyId,
    val name: String,
    val maxNumOfPlayers: Int,
    val gameTime: Int,
    val playersWaiting: List<Player>,
)
