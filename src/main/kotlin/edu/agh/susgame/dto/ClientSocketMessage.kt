package edu.agh.susgame.dto

import edu.agh.susgame.dto.common.GameStatus
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
}
