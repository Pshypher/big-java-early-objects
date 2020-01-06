public class First implements Category
{
   private static final int ROWS = 5;
   private static final int SEATS_PER_ROW = 4;
   
   private static final int LEFT_SEAT_W = 0;
   private static final int LEFT_SEAT_A = 1;
   private static final int RIGHT_SEAT_A = 2;
   private static final int RIGHT_SEAT_W = 3;
   
   
   private Seat[][] layout;
   private Seat lastAssignedWindowSeat;
   private Seat lastAssignedAisleSeat;
   
   public First()
   {
      layout = new Seat[ROWS][SEATS_PER_ROW];
      lastAssignedWindowSeat = new Seat(0, 0, Seat.WINDOW);
      lastAssignedAisleSeat = new Seat(0, 1, Seat.AISLE);
      
      for (int i = 0; i < ROWS; i++)
      {
         for (int j = 0; j < SEATS_PER_ROW; j++)
         {
            if (j == LEFT_SEAT_W || j == RIGHT_SEAT_W)
            {
               layout[i][j] = new Seat(i, j, Seat.WINDOW);
            }
            else if (j == LEFT_SEAT_A || j == RIGHT_SEAT_A)
            {
               layout[i][j] = new Seat(i, j, Seat.AISLE);
            }
         }
      }
   }
   
   public boolean addPassenger(int preference)
   {
      boolean found = false;
      Seat s;
      if (preference == Seat.WINDOW) { s = lastAssignedWindowSeat; }
      else { s = lastAssignedAisleSeat; }
      
      int i = s.row();
      int j = s.column();
      while (!found && i < ROWS)
      {
         while (!found && j < SEATS_PER_ROW)
         {
            s = layout[i][j];
            if (s.getType() == preference && s.isEmpty())
            {
               s.book();
               if (s.getType() == Seat.AISLE) { lastAssignedAisleSeat = s; }
               else { lastAssignedWindowSeat = s; }
               found = true;
            }
            j++;
         }
         j = 0;
         i++;
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
               r = r + String.format("   %s  ", s.format());
            }
            else if (s.getType() == Seat.AISLE)
            {
               r = r + String.format("  %s   ", s.format());
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