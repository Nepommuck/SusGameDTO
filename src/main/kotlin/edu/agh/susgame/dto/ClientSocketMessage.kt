package edu.agh.susgame.dto

import kotlinx.serialization.Serializable

@Serializable
sealed class ClientSocketMessage {
    @Serializable
    data class HostDTO(var id: Int, val packetPath: List<Int>, val packetsSentPerTick: Int) : ClientSocketMessage()

    @Serializable
    data class UpgradeDTO(var deviceId: Int) : ClientSocketMessage()

    @Serializable
    data class GameState(var gameStatus: GameStatus) : ClientSocketMessage()
    //used to initialize a game
}