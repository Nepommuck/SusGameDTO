package edu.agh.susgame.dto.rest

import edu.agh.susgame.dto.rest.model.Lobby
import edu.agh.susgame.dto.rest.model.LobbyId
import java.util.concurrent.CompletableFuture

interface LobbyRestDTO {
    sealed class CreateNewGameResult {
        data class Success(val lobbyId: LobbyId) : CreateNewGameResult()
        data object NameAlreadyExists : CreateNewGameResult()
        data object OtherError : CreateNewGameResult()
    }

    fun getAll(): CompletableFuture<Map<LobbyId, Lobby>>

    fun getById(lobbyId: LobbyId): CompletableFuture<Lobby?>

    fun createNewGame(
        gameName: String,
        gamePin: String,
        maxNumberOfPlayers: Int,
        gameTime: Int,
    ): CompletableFuture<CreateNewGameResult>
}