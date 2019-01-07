package structural.composite.patern

abstract class VoteComponent : Voting {

    open fun addVoting(vararg voters: VoteComponent) {
        throw UnsupportedOperationException()
    }

    open fun getVotes() : List<Vote> {
        throw UnsupportedOperationException()
    }

}