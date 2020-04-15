import java.util.Scanner;

public class VideoPokerSimulation
{
    public static void main(String[] args)
    {
        final int HAND_SIZE = 5;
        
        Deck deck = new Deck();
        deck.shuffle();
        
        Card[] hand = deck.deal(HAND_SIZE);
        
        Poker poker = new Poker(hand);
        poker.reveal(); // display the cards in hand
        
        Scanner in = new Scanner(System.in);
        
        prompt();        
        String input;        
        while (!(input = in.next()).equalsIgnoreCase("n"))
        {   
            if (input.equalsIgnoreCase("a"))
            {
                for (int i = 0; i < hand.length; i++)
                {
                    deck.add(hand[i]);
                }
                
                // reject all the previous cards and 
                // deal player 5 new cards
                hand = deck.deal(HAND_SIZE);
            
            }
            else if (input.equalsIgnoreCase("s"))
            {
                System.out.print("Reject at most 5 cards in hand, slots 1-5 ");
                System.out.println("Q to quit: ");
                String entry;
                while (!(entry = in.next()).equalsIgnoreCase("Q"))
                {
                    int slot = Integer.parseInt(entry);
                    if (slot < 1 || slot > 5)
                    {
                        System.out.println(
                            "Slot in hand should be between 1 and 5");
                    }
                    else
                    {
                        deck.add(hand[slot - 1]); // add rejected card to end to deck
                        hand[slot - 1] = deck.remove(0); // replace rejected card
                        
                    }
                }
            } 
            else
            {
                System.out.println("Ilegal input.");
            }
            
            poker = new Poker(hand);
            poker.reveal();
            prompt();
        }
        
        int value = poker.score(); 
        double amount = poker.payout(value);

        System.out.println("Payout: $" + amount);   
    }
    
    public static void prompt()
    {
        System.out.println("Hit 'a' to reject all of the cards");
        System.out.println("Hit 's' to reject some of the cards");
        System.out.println("Hit 'n' to reject none of the cards:");
    }
}