import java.util.Random;

/**
    This program simulates the problem loosely based on the
    game show hosted by Monty Hall
*/
public class MontyHallParadox
{
    public static void main(String[] args)
    {
        final int ATTEMPTS = 1000;
        
        Random generator = new Random();
        int strategy1 = 0;  // Record wins switching to the 3rd door       
        int strategy2 = 0;  // Record wins by sticking with original choice
        
        for (int i = 1; i <= ATTEMPTS; i++)
        {
            int carDoor = 1 + generator.nextInt(3);
            int selectedDoor = 1 + generator.nextInt(3);
            int hostDoor = 1 + generator.nextInt(3);
            while (hostDoor == selectedDoor)
            {
                hostDoor = 1 + generator.nextInt(3);
            }
            int playerStrategy = generator.nextInt(2);
            if (playerStrategy == 1)
            {
                selectedDoor = hostDoor;
                if (selectedDoor == carDoor)
                {
                    strategy1++;
                }
            }
            else
            {   
                if (selectedDoor == carDoor)
                {
                    strategy2++;
                }
            }
        }  
        System.out.printf("Wins recorded,switching to the third door %d",
            strategy1);
        System.out.println();           
        System.out.printf("Wins recorded,sticking with original choice %d",
            strategy2);
        System.out.println();
    }
}