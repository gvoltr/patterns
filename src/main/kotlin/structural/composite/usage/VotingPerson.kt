package structural.composite.usage

import structural.composite.patern.Vote
import structural.composite.patern.VoteComponent

class VotingPerson(private val vote: Vote) : VoteComponent() {

    override fun getVote() = vote

    override fun getVotes(): List<Vote> {
        return listOf(vote)
    }

}