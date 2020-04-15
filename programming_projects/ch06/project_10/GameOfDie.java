import java.util.Random;

/**
    This program simulates a game of die rolled 24 times. The game
    is repeated a million times the player wins the bet whenever a 
    double-six is rolled during each bet.
*/
public class GameOfDie
{
    public static void main(String[] args)
    {
        final int ROLLS = 24;
        final int ROUNDS = 1000000;
        
        Random generator = new Random();
        
        int wins = 0;
        int losses = 0;
        for (int attempts = 0; attempts < ROUNDS; attempts++)
        {
            boolean won = false;
            for (int count = 0; count < ROLLS && !won; count++)
            {
                int die1 = 1 + generator.nextInt(6);
                int die2 = 1 + generator.nextInt(6);
                if (die1 == die2) 
                {
                    wins++;
                    won = true;
                }
            }
            losses = !won ? losses + 1 : losses;
        }
        System.out.println("Wins " + wins);
        System.out.println("Losses " + losses);
    }
}