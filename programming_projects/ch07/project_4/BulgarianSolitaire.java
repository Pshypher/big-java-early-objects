import java.util.ArrayList;
import java.util.Random;

public class BulgarianSolitaire
{

    public static void main(String[] args)
    {
        Random generator = new Random();
        
        // divide a pile of 45 cards into seperate individual random piles
        int numberOfCards = 45;
        ArrayList<Integer> listOfPiles = new ArrayList<Integer>();
        
        while (numberOfCards > 0)
        {
            int pile = generator.nextInt(numberOfCards) + 1;
            numberOfCards = numberOfCards - pile;
            listOfPiles.add(pile);
        }
        System.out.print("Starting configuration: ");
        display(listOfPiles);
        
        while (!puzzleSolved(listOfPiles))
        {
            int newPile = 0;
            for (int i = 0; i < listOfPiles.size(); i++)
            {
                int pile = listOfPiles.get(i) - 1;
                if (pile > 0) { listOfPiles.set(i, pile); }
                else { listOfPiles.remove(i); }
                newPile++;
            }
            listOfPiles.add(newPile);
            System.out.print("Configuration: ");
            display(listOfPiles);
        }
        
        System.out.print("Final configuration: ");
        display(listOfPiles);
    }
    
    public static boolean puzzleSolved(ArrayList<Integer> piles)
    {
        final int FINAL_PILES_AMOUNT = 9;
        if (piles.size() != FINAL_PILES_AMOUNT) { return false; }
        
        boolean allFound = true;
        for (int i = 1; i <= FINAL_PILES_AMOUNT && allFound; i++)
        {
            boolean found = false;
            for (int j = 0; j < piles.size() && !found; j++)
            {
                if (piles.get(j) == i) { found = true; }
            }
            
            if (!found) { allFound = false; }
        }
        
        return allFound;
    }
    
    public static void display(ArrayList<Integer> piles)
    {
        for (int i = 0; i < piles.size(); i++)
        {
            if (i > 0)
            {
                System.out.print(", ");
            }
            System.out.print(piles.get(i));
        }
        System.out.println();
    }
}