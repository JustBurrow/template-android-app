package kr.lul.template.domain

import kotlinx.coroutines.delay
import java.time.Instant
import java.util.UUID

class SampleData(
    val id: Int,
    val uuid: UUID = UUID.randomUUID(),
    /**
     * 민간한 데이터.
     */
    val secretData: UUID = UUID.randomUUID(),
    val createdAt: Instant = Instant.now()
) : Comparable<SampleData> {
    /**
     * UI 스레드에서 사용할 수 없는 멀티 스레드 기능.
     */
    suspend fun multithreadedFunction(): String {
        delay(1000)
        return "${Instant.now()}"
    }

    override fun compareTo(other: SampleData) = id.compareTo(other.id)

    override fun equals(other: Any?) = this === other || (other is SampleData && id == other.id)

    override fun hashCode(): Int = id

    override fun toString() = "SampleData(id=$id, uuid=$uuid, secretData=[ PROTECTED ], createdAt=$createdAt)"
}
