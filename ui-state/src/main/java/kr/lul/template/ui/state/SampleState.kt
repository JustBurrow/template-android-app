package kr.lul.template.ui.state

import androidx.compose.runtime.Immutable
import java.time.Instant
import java.util.UUID

@Immutable
data class SampleState(
    val id: Int,
    val uuid: UUID,
    val createdAt: Instant
)
