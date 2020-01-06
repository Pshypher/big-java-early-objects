import java.util.Scanner;

/**
   This program allows a user to assign passengers to seats according 
   to their preference display the seating arrangement.
*/
public class AirplaneDemo
{
   public static void main(String[] args)
   {
      Airplane plane = new Airplane();
      boolean done = false;
      while(!done)
      {
         System.out.print("A = Add passengers, B = Show seats, C = Quit: ");
         Scanner console = new Scanner(System.in);
         String command = console.next();
         if (command.equalsIgnoreCase("A"))
         {
            System.out.print("A = First, B = Economy: ");
            command = console.next();
            
            if (command.equalsIgnoreCase("A")) 
            {
               System.out.print("Passengers (1 or 2): ");
               int passengers = console.nextInt();
               if (passengers > 0 && passengers <= 2)
               {
                  for (int i = 1; i <= passengers; i++)
                  {
                     System.out.println("Seating preference passenger #" + i);
                     System.out.print("A = Aisle, B = Window: ");
                     command = console.next();
                     boolean added = false;
                     if (command.equalsIgnoreCase("A"))
                     {
                        added = plane.assignSeat(Airplane.FIRST, Seat.AISLE);
                     }
                     else if (command.equalsIgnoreCase("B"))
                     {
                        added = plane.assignSeat(Airplane.FIRST, Seat.WINDOW);
                     }
                     else
                     {
                        System.out.println("Illegal command!");
                        return;
                     }
                     
                     if (!added) { System.out.println("No match was found."); }
                  }
               }
            }
            else if (command.equalsIgnoreCase("B")) 
            {
               System.out.print("Passengers (1-3): "); 
               int passengers = console.nextInt();
               if (passengers > 0 && passengers <= 3)
               {
                  for (int i = 1; i <= passengers; i++)
                  {
                     System.out.println("Seating preference passenger #" + i);
                     System.out.print("A = Aisle, B = Window, C = Centre: ");
                     command = console.next();
                     boolean added = false;
                     if (command.equalsIgnoreCase("A"))
                     {
                        added = plane.assignSeat(Airplane.ECONOMY, Seat.AISLE);
                     }
                     else if (command.equalsIgnoreCase("B"))
                     {
                        added = plane.assignSeat(Airplane.ECONOMY, Seat.WINDOW);
                     }
                     else if (command.equalsIgnoreCase("C"))
                     {
                        added = plane.assignSeat(Airplane.ECONOMY, Seat.CENTRE);
                     }
                     else
                     {
                        System.out.println("Illegal command!");
                        return;
                     }
                     
                     if (!added) { System.out.println("No match was found."); }
                  }
               }
            }
            else
            {
               System.out.println("Illegal command!");
               return;
            }
         }
         else if (command.equalsIgnoreCase("B"))
         {
            System.out.println(plane.format());
         }
         else if (command.equalsIgnoreCase("C"))
         {
            done = true;
         }
         else
         {
            System.out.println("Illegal command!");
            return;
         }
      }
   }
}