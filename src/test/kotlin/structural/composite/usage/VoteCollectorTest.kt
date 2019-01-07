package structural.composite.usage

import org.junit.Assert
import org.junit.Test
import structural.composite.patern.Vote

class VoteCollectorTest {

    @Test
    fun `vote collector should return correct amount of votes` () {
        val personA = VotingPerson(Vote.POSITIVE)
        val personB = VotingPerson(Vote.POSITIVE)
        val personC = VotingPerson(Vote.NEGATIVE)

        val personD = VotingPerson(Vote.ABSTAINED)
        val personE = VotingPerson(Vote.POSITIVE)

        val collectorA = VoteCollector(Vote.NEGATIVE)
        collectorA.addVoting(personA, personB, personC)

        val collectorB = VoteCollector(Vote.ABSTAINED)
        collectorB.addVoting(personD, personE)

        val rootCollector = VoteCollector(Vote.ABSTAINED)
        rootCollector.addVoting(collectorA, collectorB)

        Assert.assertEquals(3, rootCollector.getVotes().count { it == Vote.POSITIVE })
        Assert.assertEquals(2, rootCollector.getVotes().count { it == Vote.NEGATIVE })
    }

}