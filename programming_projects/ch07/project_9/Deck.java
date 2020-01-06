import java.util.Arrays;
import java.util.Random;

public class Deck
{
    public static final int SUITS = 4;
    public static final int VALUES = 13;
    
    private Card[] deckOfCards = new Card[SUITS * VALUES];
    private int sizeOfDeck = 0;
    
    /**
        Constructs of a deck of 52 cards
    */
    public Deck()
    {
        int[] values = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13 };
        String[] suits = { "club", "diamond", "heart", "spade" };
        
        for (int i = 0; i < SUITS; i++)
        {
            for (int j = 0; j < VALUES; j++)
            {
                set(sizeOfDeck, new Card(values[j], suits[i]));
                sizeOfDeck++;
            }
        }
    
    }
    
    /**
        Places a card in this Deck at the slot specified in the
        argument pos
        @param pos the position in this Deck to place the card
        @param c the card to be placed in this Deck
    */
    public void set(int pos, Card c)
    {
        deckOfCards[pos] = c;            
    }
    
    /**
        Fetch the card in slot pos of this Deck
        @return Card the card at pos of this Deck
    */
    public Card get(int pos)
    {
        return deckOfCards[pos];
    }
    
    /**
        Deal the player some specified number of cards in the deck,
        whilst removing the card from the deck.
        @param amount the number of cards to be dealt
        @return an Array of cards
    */
    public Card[] deal(int amount)
    {
        Card[] cardsDealt = new Card[amount];
        for (int i = 0; i < amount && deckOfCards.length > 0; i++)
        {
            cardsDealt[i] = remove(0);
        }
        
        return cardsDealt; 
    }
    
    /**
        Adds a card at the end of this Deck
    */
    public void add(Card c)
    {
        if (sizeOfDeck < deckOfCards.length)
        {
            sizeOfDeck++;
            deckOfCards[sizeOfDeck - 1] = c;
        }
        
    }
    
    /**
        Removes a card from this Deck and returns the
        card removed
        @return Card the removed card
    */
    public Card remove(int pos)
    {
        Card c = get(pos);
        for (int i = pos + 1; i < sizeOfDeck; i++)
        {
            deckOfCards[i - 1] = deckOfCards[i];
        }
        sizeOfDeck--;
        
        return c;
    }
    
    /**
        Randomly shuffle the order of the Cards in the deck    
    */
    public void shuffle()
    {
        Card[] shuffledDeck = new Card[sizeOfDeck];
        Random generator = new Random();
        
        int currentSize = 0;
        while (sizeOfDeck > 0)
        {
            int pos = generator.nextInt(sizeOfDeck);
            shuffledDeck[currentSize] = remove(pos);
            currentSize++;
        }
        
        sizeOfDeck = currentSize;
        deckOfCards = shuffledDeck;
    }
}