package edu.agh.susgame.dto.rest.model

import kotlinx.serialization.Serializable


@Serializable
data class GameMapDTO(
    val nodes: List<GameMapNodeDTO>,
    val edges: List<GameMapEdgeDTO>,
)

@Serializable
data class Coordinates(val x: Int, val y: Int)


@Serializable
sealed class GameMapNodeDTO {
    abstract val id: Int
    abstract val coordinates: Coordinates

    @Serializable
    data class Server(override val id: Int, override val coordinates: Coordinates) : GameMapNodeDTO()

    @Serializable
    data class Host(override val id: Int, override val coordinates: Coordinates) : GameMapNodeDTO()

    @Serializable
    data class Router(
        override val id: Int,
        override val coordinates: Coordinates,
        val bufferSize: Int
    ) : GameMapNodeDTO()
}


@Serializable
data class GameMapEdgeDTO(val from: Int, val to: Int, val weight: Int)
