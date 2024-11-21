package edu.agh.susgame.dto.rest.model

import kotlinx.serialization.Serializable


@Serializable
data class GameMapDTO(
    val server: GameMapServerDTO,
    val host: List<GameMapHostDTO>,
    val router: List<GameMapRouterDTO>,
    val edges: List<GameMapEdgeDTO>,
)

@Serializable
data class Coordinates(val x: Int, val y: Int)


@Serializable
sealed class GameMapServerDTO(
    val id: Int,
    val coordinates: Coordinates,
)

@Serializable
sealed class GameMapHostDTO(
    val id: Int,
    val coordinates: Coordinates,
)

@Serializable
sealed class GameMapRouterDTO(
    val id: Int,
    val coordinates: Coordinates,
    val bufferSize: Int
)

@Serializable
data class GameMapEdgeDTO(val from: Int, val to: Int, val weight: Int)
