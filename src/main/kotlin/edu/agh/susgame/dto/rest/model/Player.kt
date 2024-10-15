package edu.agh.susgame.dto.rest.model

import kotlinx.serialization.Serializable


@Serializable
data class PlayerId(val value: Int)

@Serializable
data class PlayerNickname(val value: String)

@Serializable
data class Player(
    val nickname: PlayerNickname,
    val id: PlayerId,
    val colorHex: Long,
)
