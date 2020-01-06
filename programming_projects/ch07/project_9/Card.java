public class Card
{

    private int value;
    private String suit;
    
    /**
        Construct a Card of a specific rank and suit
        @param value the rank of the Card in the range of 1-13
        @param suit could be either one of spade, club, hearts
        or diamond
    */
    public Card(int value, String suit)
    {
        this.value = value;
        this.suit = suit;
    }
    
    /**
        Fetches the rank of this Card
        @return this Card's rank
    */
    public String getRank()
    {
        String rank;
        switch (value)
        {
            case 1:
                rank = "ace";
                break;
            case 11:
                rank = "jack";
                break;
            case 12:
                rank = "queen";
                break;
            case 13:
                rank =  "king";
                break;
            default:
                rank = "" + value;
        }
        
        return rank;
    }
    
    /**
        Get this Card's value
        @return int the value for this Card
    */
    public int getValue()
    {
        return value;
    }
    
    /**
        The suit of a card
        @return String this Card's suit
    */
    public String getSuit()
    {
        return suit;
    }
    
    /**
        A String representation of a Card
        @return a String
    */
    public String toString()
    {
        return "( " + getRank() + ", " + suit + " )";
    }
}