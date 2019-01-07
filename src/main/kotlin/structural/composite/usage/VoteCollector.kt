package structural.composite.usage

import structural.composite.patern.Vote
import structural.composite.patern.VoteComponent

class VoteCollector(private val vote: Vote) : VoteComponent() {

    private val voters : ArrayList<VoteComponent> by lazy { ArrayList<VoteComponent>() }

    override fun getVote() = vote

    override fun addVoting(vararg voters: VoteComponent) {
        this.voters.addAll(voters)
    }

    override fun getVotes(): List<Vote> {
        val allVotesBelow = voters.map { it.getVotes() }.flatten().toTypedArray()
        return listOf(getVote(), *allVotesBelow)
    }

}