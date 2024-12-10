package edu.agh.susgame.dto.rest.model

import kotlinx.serialization.Serializable


@Serializable
data class LobbyId(val value: Int)

@Serializable
data class LobbyPin(val value: String)

@Serializable
data class LobbyRow(
    val id: LobbyId,
    val name: String,
    val isPinSetUp: Boolean,
    val maxNumOfPlayers: Int,
    val playersWaitingCount: Int,
)

@Serializable
data class LobbyDetails(
    val id: LobbyId,
    val name: String,
    val isPinSetUp: Boolean,
    val maxNumOfPlayers: Int,
    val playersWaiting: List<PlayerREST>,
)
