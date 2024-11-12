package edu.agh.susgame.dto.rest.games.model

import edu.agh.susgame.dto.rest.ApiResult
import edu.agh.susgame.dto.rest.model.Lobby
import edu.agh.susgame.dto.rest.model.LobbyId
import edu.agh.susgame.dto.socket.server.map.GameMapEdgeDTO
import edu.agh.susgame.dto.socket.server.map.GameMapNodeDTO
import java.net.HttpURLConnection


sealed class GetAllGamesApiResult(responseCode: Int) : ApiResult(responseCode) {
    data class Success(val lobbies: List<Lobby>) : GetAllGamesApiResult(HttpURLConnection.HTTP_OK)
    data object Error : GetAllGamesApiResult(HttpURLConnection.HTTP_INTERNAL_ERROR)
}

sealed class GetGameApiResult(responseCode: Int) : ApiResult(responseCode) {
    data class Success(val lobby: Lobby) : GetGameApiResult(HttpURLConnection.HTTP_OK)
    data object DoesNotExist : GetGameApiResult(HttpURLConnection.HTTP_NOT_FOUND)
    data object OtherError : GetGameApiResult(HttpURLConnection.HTTP_INTERNAL_ERROR)
}

sealed class GetGameMapApiResult(responseCode: Int) : ApiResult(responseCode) {
    data class Success(
        val nodes: List<GameMapNodeDTO>,
        val edges: List<GameMapEdgeDTO>,
    ) : GetGameMapApiResult(HttpURLConnection.HTTP_CREATED)

    data object GameDoesNotExist : GetGameMapApiResult(HttpURLConnection.HTTP_NOT_FOUND)
    data object OtherError : GetGameMapApiResult(HttpURLConnection.HTTP_INTERNAL_ERROR)
}

sealed class CreateGameApiResult(responseCode: Int) : ApiResult(responseCode) {
    data class Success(val createdLobbyId: LobbyId) : CreateGameApiResult(HttpURLConnection.HTTP_CREATED)
    data object NameAlreadyExists : CreateGameApiResult(HttpURLConnection.HTTP_CONFLICT)
    data object OtherError : CreateGameApiResult(HttpURLConnection.HTTP_INTERNAL_ERROR)
}
