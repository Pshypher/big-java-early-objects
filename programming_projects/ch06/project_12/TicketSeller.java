import java.util.Scanner;

/**
    This program sells a maximum of 100 tickets. A buyer 
    can purchase at most 4 tickets.
*/
public class TicketSeller
{
    public static void main(String[] args)
    {
        
        Scanner in = new Scanner(System.in);
        
        int buyers = 0;
        int ticketsLeft = 100;
        
        while (ticketsLeft > 0)
        {   
            System.out.println("Remaining tickets " + ticketsLeft);
            System.out.print("How many tickets? ");
            int ticketsOrdered = in.nextInt();
            if (ticketsOrdered <= 4 && ticketsLeft >= ticketsOrdered)
            {
                ticketsLeft = ticketsLeft - ticketsOrdered;
                buyers = buyers + 1;
            }
            else
            {
                if (ticketsLeft < ticketsOrdered)
                {
                    System.out.println("Tickets left less than tickets ordered");
                }
                else
                {
                    System.out.println("You can purchase at most 4 tickets");
                }
            }
        }
    }
}