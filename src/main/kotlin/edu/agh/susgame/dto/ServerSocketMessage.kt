package edu.agh.susgame.dto

import kotlinx.serialization.Serializable

@Serializable
sealed class ServerSocketMessage {
    @Serializable
    data class RouterDTO(var id: Int, val bufferUse: Int, val bufferSize: Int, val upgradeCost: Int)

    @Serializable
    data class ServerDTO(var id: Int, val packetsReceived: Int)

    @Serializable
    data class HostDTO(var id: Int, val packetPath: List<Int>)

    @Serializable
    data class EdgeDTO(var id: Int, val upgradeCost: Int, val packetsTransported: Int)

    @Serializable
    data class PacketDTO(var id: Int, val currentMoney: Int)

    @Serializable
    data class PlayerDTO(var id: Int, val playerName: String)

    @Serializable
    data class GameState(
        val routers: List<RouterDTO>,
        val servers: List<ServerDTO>,
        val hosts: List<HostDTO>,
        val edges: List<EdgeDTO>,
        val packets: List<PacketDTO>,
        val players: List<PlayerDTO>,
        val gameStatus: GameStatus,
    ) : ServerSocketMessage()

    data class ServerError(val errorMessage: String) : ServerSocketMessage()
    //used to send error messages for example in case of invalid input
}