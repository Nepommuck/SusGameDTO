package edu.agh.susgame.dto.rest.games.model

import edu.agh.susgame.dto.socket.server.map.GameMapEdgeDTO
import edu.agh.susgame.dto.socket.server.map.GameMapNodeDTO


data class GameCreationApiResponse(
    val gameId: Int,
)

data class GetGameMapApiResponse(
    val nodes: List<GameMapNodeDTO>,
    val edges: List<GameMapEdgeDTO>
)
