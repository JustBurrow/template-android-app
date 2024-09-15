package kr.lul.template.domain

import java.time.Instant
import java.util.UUID

class SampleData(
    val id: Int,
    val uuid: UUID = UUID.randomUUID(),
    val createdAt: Instant = Instant.now()
) : Comparable<SampleData> {
    override fun compareTo(other: SampleData) = id.compareTo(other.id)

    override fun equals(other: Any?) = this === other || (other is SampleData && id == other.id)

    override fun hashCode(): Int = id

    override fun toString() = "SampleData(id=$id, uuid=$uuid, createdAt=$createdAt)"
}
