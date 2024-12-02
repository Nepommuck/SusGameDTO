package edu.agh.susgame.dto.rest.model

import kotlinx.serialization.Serializable


@Serializable
data class GameMapDTO(
    val server: GameMapServerDTO,
    val hosts: List<GameMapHostDTO>,
    val routers: List<GameMapRouterDTO>,
    val edges: List<GameMapEdgeDTO>,
    val gameTime: Long, //in milliseconds
    val gameGoal: Int, //number of packets that server must receive to win
)

@Serializable
data class Coordinates(val x: Int, val y: Int)


@Serializable
data class GameMapServerDTO(
    val id: Int,
    val coordinates: Coordinates,
)

@Serializable
data class GameMapHostDTO(
    val playerId: Int,
    val id: Int,
    val coordinates: Coordinates,
)

@Serializable
data class GameMapRouterDTO(
    val id: Int,
    val coordinates: Coordinates,
    val bufferSize: Int,
)

@Serializable
data class GameMapEdgeDTO(val from: Int, val to: Int, val weight: Int)
