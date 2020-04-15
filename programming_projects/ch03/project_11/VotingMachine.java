/**
        A class used to simulate a Voting Machine
*/
public class VotingMachine
{
        private int democratVotes;
        private int republicanVotes;
        
        /**
                Resets the voting machine back to its default state
        */
        public void clear()
        {
                democratVotes = 0;
                republicanVotes = 0;
        }
        
        /**
                Casts a vote for a Democrat
        */
        public void voteDemocrat()
        {
                democratVotes = democratVotes + 1;
        }
        
        /**
                Cast a vote for a Republican candidate
        */
        public void voteRepublican()
        {
                republicanVotes = republicanVotes + 1;
        }
        
        /**
                Returns the number of votes won by a Democrat
        */
        public int getDemocratTally()
        {
                return democratVotes;
        }
        
        /**
                Returns the number of votes won by a Republican
        */
        public int getRepublicanTally()
        {
                return republicanVotes;
        }
}