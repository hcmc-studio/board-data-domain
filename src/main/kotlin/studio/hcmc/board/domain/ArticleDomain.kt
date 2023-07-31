package studio.hcmc.board.domain

import kotlinx.datetime.Instant

interface ArticleDomain<ID, BoardID> {
    val id: ID
    val boardId: BoardID
    val title: String
    val body: String
    val writerNickname: String
    val writerPassword: String
    val writerAddress: String
    val writtenAt: Instant
    val lastModifiedAt: Instant?

    interface Qualified<ID, BoardID> : ArticleDomain<ID, BoardID> {
        val board: BoardDomain.Qualified<BoardID>
    }
}