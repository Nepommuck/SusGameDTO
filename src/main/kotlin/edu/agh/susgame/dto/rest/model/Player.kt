package edu.agh.susgame.dto.rest.model

import edu.agh.susgame.dto.common.ColorDTO
import kotlinx.serialization.Serializable


@Serializable
data class PlayerId(val value: Int)

@Serializable
data class PlayerNickname(val value: String)

@Serializable
data class PlayerREST(
    val nickname: PlayerNickname,
    val id: PlayerId,
    val color: ColorDTO,
    val readiness: Boolean,
)
