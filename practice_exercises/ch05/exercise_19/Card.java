/**
        The Card class depicts a deck of cards with 13 ranks 
        and 4 suits
*/
public class Card
{

        // Constant(s)
        final static double MIN_RANK = 2;
        final static double MAX_RANK = 10;
        
        private String notation;
        
        public Card(String cardNotation)
        {
                notation = cardNotation;
        }
        
        /**
                Describes the shorthand notation of the rank
                and suit of a card from a deck of cards
                @return a full description of the card
        */
        public String getDescription()
        {
                String rank;                 
                String suit;               
                if (notation.length() == 2)
                {
                        rank = notation.substring(0, 1);   
                        suit = notation.substring(1);
                }
                else if (notation.length() == 3)
                {
                        rank = notation.substring(0, 2);
                        suit = notation.substring(2);
                }
                else
                {
                        return "Unknown";        
                }
                
                if (rank.equals("A"))
                {
                        rank = "Ace";
                        if (suit.equals("D"))
                        {
                                suit = "Diamonds";
                        }
                        else if (suit.equals("H"))
                        {
                                suit = "Hearts";
                        }
                        else if (suit.equals("S"))
                        {
                                suit = "Spades";
                        }
                        else if (suit.equals("C"))
                        {
                                suit = "Clubs";
                        }
                        else
                        {
                                return "Unknown";
                        }                      
                }
                else if (rank.equals("J"))
                {
                        rank = "Jack";
                        if (suit.equals("D"))
                        {
                                suit = "Diamonds";
                        }
                        else if (suit.equals("H"))
                        {
                                suit = "Hearts";
                        }
                        else if (suit.equals("S"))
                        {
                                suit = "Spades";
                        }
                        else if (suit.equals("C"))
                        {
                                suit = "Clubs";
                        }
                        else
                        {
                                return "Unknown";
                        }
                }
                else if (rank.equals("Q"))
                {
                        rank = "Queen";
                        if (suit.equals("D"))
                        {
                                suit = "Diamond"; 
                        }
                        else if (suit.equals("H"))
                        {
                                suit = "Hearts";
                        }
                        else if (suit.equals("S"))
                        {
                                suit = "Spades";
                        }
                        else if (suit.equals("C"))
                        {
                                suit = "Clubs";
                        }
                        else
                        {
                                return "Unknown";
                        }
                        
                }
                else if (rank.equals("K"))
                {
                        rank = "King";
                        if (suit.equals("D"))
                        {
                                suit = "Diamonds";
                        }
                        else if (suit.equals("H"))
                        {
                                suit = "Hearts";
                        }
                        else if (suit.equals("S"))
                        {
                                suit = "Spades";
                        }
                        else if (suit.equals("C"))
                        {
                                suit = "Clubs";
                        }
                        else
                        {
                                return "Unknown";
                        }
                }
                else if (Character.isDigit(rank.charAt(0)))
                {
                        int rankValue = Integer.parseInt(rank);
                        if (!(MIN_RANK <= rankValue  && rankValue <= MAX_RANK))
                        {
                                return "Unknown";
                        }
                        
                        if (suit.equals("D"))
                        {
                                suit = "Diamonds";
                        }
                        else if (suit.equals("H"))
                        {
                                suit = "Hearts";
                        }
                        else if (suit.equals("S"))
                        {
                                suit = "Spades";
                        }
                        else if (suit.equals("C"))
                        {
                                suit = "Clubs";
                        }
                        else
                        {
                                return "Unknown";
                        }
                }
                else
                {
                        return "Unknown";
                }
                
                return rank + " of " + suit;
        }
}