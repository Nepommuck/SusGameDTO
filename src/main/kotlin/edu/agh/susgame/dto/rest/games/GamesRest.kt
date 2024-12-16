package edu.agh.susgame.dto.rest.games

import edu.agh.susgame.dto.rest.games.model.CreateGameApiResult
import edu.agh.susgame.dto.rest.games.model.GetAllGamesApiResult
import edu.agh.susgame.dto.rest.games.model.GetGameApiResult
import edu.agh.susgame.dto.rest.games.model.GetGameMapApiResult
import edu.agh.susgame.dto.rest.model.LobbyId
import edu.agh.susgame.dto.rest.model.LobbyPin
import java.util.concurrent.CompletableFuture

interface GamesRest {
    fun getAllGames(): CompletableFuture<GetAllGamesApiResult>

    fun getGameDetails(gameId: LobbyId, gamePin: LobbyPin?): CompletableFuture<GetGameApiResult>

    fun getGameMap(gameId: LobbyId): CompletableFuture<GetGameMapApiResult>

    fun createGame(
        gameName: String,
        maxNumberOfPlayers: Int,
        gamePin: LobbyPin? = null,
    ): CompletableFuture<CreateGameApiResult>
}
