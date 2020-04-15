import java.util.ArrayList;
import java.util.Random;

public class Economy implements Category
{
   private static final int ROWS = 15;
   private static final int SEATS_PER_ROW = 6;
   
   private static final int LEFT_SEAT_W = 0;
   private static final int LEFT_SEAT_C = 1;
   private static final int LEFT_SEAT_A = 2;
   private static final int RIGHT_SEAT_A = 3;
   private static final int RIGHT_SEAT_C = 4;
   private static final int RIGHT_SEAT_W = 5;
   
   
   private Seat[][] layout;
   private ArrayList<Seat> window;
   private ArrayList<Seat> centre;
   private ArrayList<Seat> aisle;
   
   public Economy()
   {
      layout = new Seat[ROWS][SEATS_PER_ROW];
      window = new ArrayList<Seat>();
      centre = new ArrayList<Seat>();
      aisle = new ArrayList<Seat>();
      
      for (int i = 0; i < ROWS; i++)
      {
         for (int j = 0; j < SEATS_PER_ROW; j++)
         {
            if (j == LEFT_SEAT_W || j == RIGHT_SEAT_W)
            {
               layout[i][j] = new Seat(Seat.WINDOW);
               window.add(layout[i][j]);
            }
            else if (j == LEFT_SEAT_A || j == RIGHT_SEAT_A)
            {
               layout[i][j] = new Seat(Seat.AISLE);
               aisle.add(layout[i][j]);
            }
            else if (j == LEFT_SEAT_C || j == RIGHT_SEAT_C)
            {
               layout[i][j] = new Seat(Seat.CENTRE);
               centre.add(layout[i][j]);
            }
         }
      }
   }
   
   public boolean addPassenger(int preference)
   {
      Random generator = new Random();
      boolean found = true;
      if (preference == Seat.WINDOW && window.size() > 0)
      {
         int choice = generator.nextInt(window.size());
         Seat s = window.remove(choice);
         s.book();
      } 
      else if (preference == Seat.AISLE && aisle.size() > 0)
      {
         int choice = generator.nextInt(aisle.size());
         Seat s = aisle.remove(choice);
         s.book();
      }
      else if (preference == Seat.CENTRE 
         && centre.size() > 0)
      {
         int choice = generator.nextInt(centre.size());
         Seat s = centre.remove(choice);
         s.book();
      }
      else
      {
         found = false;
      }
      
      return found;
   }
   
   public String format()
   {
      String r = "";
      for (int i = 0; i < ROWS; i++)
      {
         for (int j = 0; j < SEATS_PER_ROW; j++)
         {
            Seat s = layout[i][j];
            if (s.getType() == Seat.AISLE && j == LEFT_SEAT_A)
            {
               r = r + String.format("%s  ", s.format());
            }
            else if (s.getType() == Seat.AISLE)
            {
               r = r + String.format("  %s", s.format());
            }
            else if (s.getType() == Seat.CENTRE)
            {
               r = r + String.format(" %s ", s.format());
            }
            else
            {
               r = r + s.format();
            }
         }
         r = r + "\n";
      }
      
      return r;
   }
}