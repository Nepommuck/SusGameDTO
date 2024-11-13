package edu.agh.susgame.dto.socket

import edu.agh.susgame.dto.socket.common.GameStatus
import edu.agh.susgame.dto.socket.server.*
import kotlinx.serialization.Serializable

/**
 * Message sent by server via WebSocket
 */
@Serializable
sealed class ServerSocketMessage {
    /**
     * Information about the whole game state that is coming periodically from the server
     */
    @Serializable
    data class GameState(
        val routers: List<RouterDTO>,
        val hosts: List<HostDTO>,
        val server: ServerDTO,
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

    @Serializable
    data class QuizQuestionDTO(
        val questionId: Int,
        val question: String,
        val answers: List<String>,
        val correctAnswer: Int,
    ) : ServerSocketMessage()

    /**
     * Used for handling new player joining to lobby
     */
    @Serializable
    data class PlayerJoiningResponse(
        val playerId: Int,
        val playerName: String
    ) : ClientSocketMessage()

    /**
     * Used for handling player changing state in lobby
     */
    @Serializable
    data class PlayerChangeReadynessResponse(
        val state: Boolean
    ) : ClientSocketMessage()

    /**
     * Used for handling player leaving lobby
     */
    @Serializable
    data class PlayerLeavingResponse(
        val playerId: Int
    ) : ClientSocketMessage()
}
