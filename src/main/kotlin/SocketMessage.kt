package edu.agh.susgame.dto

import kotlinx.serialization.Serializable


@Serializable
sealed class SocketMessage {
    // TODO CDM-72 Pretty much everything
    @Serializable
    data object GameState : SocketMessage()

    @Serializable
    data class SimpleMessage(
        val authorNickname: String,
        val message: String,
    ) : SocketMessage()
}
