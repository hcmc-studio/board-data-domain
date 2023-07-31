package studio.hcmc.board.domain

import kotlinx.datetime.Instant

interface CommentDomain<ID, ArticleID> {
    val id: ID
    val articleId: ArticleID
    val body: String
    val writerNickname: String
    val writerPassword: String
    val writerAddress: String
    val writtenAt: Instant
    val lastModifiedAt: Instant?

    interface Qualified<ID, ArticleID, BoardId> : CommentDomain<ID, ArticleID> {
        val article: ArticleDomain.Qualified<ArticleID, BoardId>
    }
}