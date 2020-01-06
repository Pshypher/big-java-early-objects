import java.util.Scanner;

/**
    This program reads in the group of people arriving a bar
    and departing until the bar is filled with 100 persons
*/
public class OysterBar
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        
        int occupants = 0;
        while (occupants < 100)
        {
            System.out.print("How many arrive? ");
            int arrivals = in.nextInt();
            
            if (occupants + arrivals <= 100) 
            {
                occupants = occupants + arrivals;
            }  
            else
            {
                System.out.println("The bar can take at most " + 
                    (100 - occupants) + " persons."); 
            }
            System.out.println(occupants + " in the bar.");
                
            System.out.print("How many depart? ");
            int departures = in.nextInt();
            
            if (occupants - departures < 0)
            {
                System.out.println("No more than " + occupants
                    + " persons can leave the bar.");
            }
            else
            {
                occupants = occupants - departures;
            }
            System.out.println(occupants + " persons left in the bar.");
            
        }
        System.out.println("The bar is full.");
    }
}