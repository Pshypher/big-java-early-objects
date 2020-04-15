import java.util.Arrays;

public class Poker
{
    private Card[] hand;

    
    /**
        Construct a game of Poker with a hand of five hand
        @param pokerHand an array of 5 hand
    */
    public Poker(Card[] pokerHand)
    {
        hand = pokerHand;
    }
    
    /**
        Show the cards in hand to the player.
    */
    public void reveal()
    {
        for (int i = 0; i < hand.length; i++)
        {
            if (i > 0)
            {
                System.out.print(", ");
            }
            System.out.print(hand[i]);
        }
        System.out.println();
    }
    
    /**
        The best possible hand in poker, 10, jack, queen,
        king and ace all of the same suit.
        @return true if the hand is a royal flush
    */
    private boolean isRoyalFlush()
    {
        return isFlush()
            && contains("10") 
            && contains("jack") 
            && contains("queen")
            && contains("king")
            && contains("ace");
    }
    
    /**
        Determines if a hand has a card of the specified
        rank
        @param rank the card's rank
    */
    private boolean contains(String rank)
    {
        for (int i = 0; i < hand.length; i++)
        {
            if (hand[i].getRank().equals(rank))
            {
                return true;
            }
        }
        
        return false;
    }
    
    /**
        A hand with a straight and a flush
        @return true of the hand is a straight flush
    */
    private boolean isStraightFlush()
    {
        return isStraight()
            && isFlush();
    }
    
    /**
        A hand with four hand of the same value or rank
        @return true if the hand is four of a kind
    */
    private boolean isFourOfAKind()
    {      
        boolean fourOfAKind = false;
        
        int i = 1;
        outerloop:
        while(i <= Deck.VALUES)
        {
            int sameRank = 0;
            innerloop:
            for (int j = 0; j < hand.length; j++ )
            {
                if (hand[j].getValue() == i) { sameRank++; }
            }
            
            if (sameRank == 4) 
            {
                fourOfAKind = true;
                break outerloop;
            }
            i++;
        }
        
        return fourOfAKind;
        
    }
    
    /**
        A hand with three of a kind and a pair
        @return true if the hand is a full house
    */
    private boolean isFullHouse()
    {
        return isThreeOfAKind()
            && isAPair();
    }
    
    /**
        Five hand not necessarily in order, of the same suit.
        @return true if all hand in hand are of the same suit.
    */
    private boolean isFlush()
    {
        
        boolean sameSuit = true;
        int i = 0;
        while (i < hand.length - 1)
        {   
            if (hand[i].getSuit() != hand[i + 1].getSuit())
            {
                sameSuit = false;
                break;
            }   
            i++;
        }
        
        return sameSuit;  
    }
    
    /**
        Five hand with consecutive values not necessarily of the same
        suit.
        @return true if the values of the hand in hand are consecutive
    */
    private boolean isStraight()
    {
        boolean straight = true;
        
        // get the values of each card in hand
        int[] cardValues = new int[hand.length];
        for (int i = 0; i < hand.length; i++)
        {
            cardValues[i] = hand[i].getValue();
        }
        
        // determine if the hand have consecutive values
        // such as 4, 5, 6, 7 and 8
        Arrays.sort(cardValues);
        int current = cardValues[0];
        for (int i = 1; i < cardValues.length; i++)
        {
            int previous = current;
            current = cardValues[i];
            if (current - previous != 1)
            {
                straight = false;
            }
        }
        
        return straight;
    }
    
    /**
        Three hand of the same value.
        @return if the hand is three of a kind
    */
    private boolean isThreeOfAKind()
    {
        
        boolean threeOfAKind = false;
        for (int i = 1; i <= Deck.VALUES && !threeOfAKind; i++)
        {
            int count = 0;
            for (int j = 0; j < hand.length; j++)
            {
                if (hand[j].getValue() == i)
                {
                    count++;
                }
            }
            
            if (count == 3) { threeOfAKind = true; }
        }
        
        return threeOfAKind;
    }
    
    /**
        Two pair of hand with the same values or rank.
        @return true if the hand contains two pairs
    */
    private boolean isTwoPairs()
    {
        int pairs = 0;
        outerloop:
        for (int i = 0; i < hand.length - 1; i++)
        {
            innerloop:
            for (int j = i + 1; j < hand.length; j++)
            {
                if (hand[i].getValue() == hand[j].getValue()) 
                {
                    pairs++;
                    break innerloop;
                }
            }
        }
        
        return pairs > 1;
    }
    
    /**
        A pair of hand with the same values
        @return true if the hand has a pair of hand with
        the same values.
    */
    private boolean isAPair()
    {
        int pairs = 0;
        outerloop:
        for (int i = 0; i < hand.length - 1; i++)
        {
            innerloop:
            for (int j = i + 1; j < hand.length; j++)
            {
                if (hand[i].getValue() == hand[j].getValue()) 
                {
                    pairs++;
                    break outerloop;
                }
            }
        }
        
        return pairs > 0;
    }
    
    /**
        Computes the score of the hand using the rules of poker.
        @return int the score of the hand
    */
    public int score()
    {
        int score;
        
        if (isRoyalFlush()) { score = 9; }
        else if (isStraightFlush()) { score = 8; }
        else if (isFourOfAKind()) { score = 7; }
        else if (isFullHouse()) { score = 6; }
        else if (isFlush()) { score = 5; }
        else if (isStraight()) { score = 4; }
        else if (isThreeOfAKind()) { score = 3; }
        else if (isTwoPairs()) { score = 2; }
        else if (isAPair()) { score = 1; }
        else { score = 0; }
        
        return score;
        
    }
    
    /**
        The amount paid per score of a player's hand
        @return double the amount paid.
    */
    public double payout(int handScore)
    {
        double amount;
        switch (handScore)
        {
            case 9:
                amount = 250;
                break;
            case 8:
                amount = 50;
                break;
            case 7:
                amount = 25;
                break;
            case 6:
                amount = 6;
                break;
            case 5:
                amount = 5;
                break;
            case 4:
                amount = 4;
                break;
            case 3:
                amount = 3;
                break;
            case 2:
                amount = 2;
                break;
            case 1:
                amount = 1;
                break;
            default:
                amount = 0;
        }
        
        return amount;
    }
} 