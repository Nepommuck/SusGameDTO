package edu.agh.susgame.dto.socket

import edu.agh.susgame.dto.socket.common.GameStatus
import kotlinx.serialization.Serializable

/**
 * Message sent by client via WebSocket
 */
@Serializable
sealed class ClientSocketMessage {
    /**
     * Used for host configuration, change of selected path or number of packets generated per tick
     */
    @Serializable
    data class HostDTO(
        val id: Int,
        val packetPath: List<Int>,
        val packetsSentPerTick: Int,
    ) : ClientSocketMessage()

    /**
     * Used when the player wants to update given device
     */
    @Serializable
    data class UpgradeDTO(
        val deviceId: Int,
    ) : ClientSocketMessage()

    /**
     * Used to initialize a game
     */
    @Serializable
    data class GameState(
        val gameStatus: GameStatus,
    ) : ClientSocketMessage()

    /**
     * Used for chat feature, which is planned to be deleted in the future
     */
    @Serializable
    data class ChatMessage(
        val message: String,
    ) : ClientSocketMessage()

    @Serializable
    data class QuizAnswerDTO(
        val questionId: Int,
        val answer: Int,
    ) : ClientSocketMessage()

    @Serializable
    data class PlayerJoiningRequest(
        val playerId: Int,
        val playerName: String
    ) : ClientSocketMessage()

    /**
     * Used for handling player changing state in lobby
     */
    @Serializable
    data class PlayerChangeReadinessRequest(
        val state: Boolean
    ) : ClientSocketMessage()

    /**
     * Used for handling player leaving lobby
     */
    @Serializable
    data class PlayerLeavingRequest(
        val playerId: Int
    ) : ClientSocketMessage()

}