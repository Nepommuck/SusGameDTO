package edu.agh.susgame.dto.rest.model

data class LobbyId(val value: Int)

data class Lobby(
    val id: LobbyId,
    val name: String,
    val maxNumOfPlayers: Int,
    val gameTime: Int,
    val playersWaiting: Map<PlayerId, Player> = emptyMap(),
)
