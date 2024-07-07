package edu.agh.susgame.dto

import edu.agh.susgame.dto.common.GameStatus
import edu.agh.susgame.dto.server.*
import kotlinx.serialization.Serializable

/**
 * Message sent by server via WebSocket
 */
@Serializable
sealed class ServerSocketMessage {

    @Serializable
    data class GameState(
        val routers: List<RouterDTO>,
        val servers: List<ServerDTO>,
        val hosts: List<HostDTO>,
        val edges: List<EdgeDTO>,
        val players: List<PlayerDTO>,
        val gameStatus: GameStatus,
    ) : ServerSocketMessage()

    /**
     * Used to send error messages (for example in the case of invalid input)
     */
    @Serializable
    data class ServerError(
        val errorMessage: String,
    ) : ServerSocketMessage()

    /**
     * Used for chat feature, which is planned to be deleted in the future
     */
    @Serializable
    data class ChatMessage(
        val authorNickname: String,
        val message: String,
    ) : ServerSocketMessage()
}
