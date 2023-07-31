package studio.hcmc.board.domain

interface BoardDomain<ID> {
    val id: ID
    val name: String

    interface Qualified<ID> : BoardDomain<ID>
}