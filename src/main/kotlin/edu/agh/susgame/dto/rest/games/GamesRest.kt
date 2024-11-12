package edu.agh.susgame.dto.rest.games

import edu.agh.susgame.dto.rest.games.model.CreateGameApiResult
import edu.agh.susgame.dto.rest.games.model.GetAllGamesApiResult
import edu.agh.susgame.dto.rest.games.model.GetGameApiResult
import edu.agh.susgame.dto.rest.games.model.GetGameMapApiResult
import edu.agh.susgame.dto.rest.model.LobbyId
import java.util.concurrent.CompletableFuture

interface GamesRest {
    fun getAllGames(): CompletableFuture<GetAllGamesApiResult>

    fun getGame(gameId: LobbyId): CompletableFuture<GetGameApiResult>

    fun getGameMap(gameId: LobbyId): CompletableFuture<GetGameMapApiResult>

    fun createGame(
        gameName: String,
        maxNumberOfPlayers: Int,
        gamePin: String? = null,
    ): CompletableFuture<CreateGameApiResult>
}
