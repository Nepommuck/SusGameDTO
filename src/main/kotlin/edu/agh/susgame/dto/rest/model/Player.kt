package edu.agh.susgame.dto.rest.model


data class PlayerId(val value: Int)

data class PlayerNickname(val value: String)

class Player(
    val nickname: PlayerNickname,
    val id: PlayerId,
    val colorHex: Long,
)
