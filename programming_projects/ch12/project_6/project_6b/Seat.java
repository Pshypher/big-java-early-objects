/**
   An airplane seat can be adjacent to the window, aisle
   or at the center and could be empty or occupied
*/
public class Seat
{
   public static final int WINDOW = 1;
   public static final int CENTRE = 2;
   public static final int AISLE = 3;

   private int type;
   private boolean occupied;
     
   /**
      Constructs a seat at the given position
      @param rowIndex the row index
      @param colIndex the column index
      @param n one of WINDOW, CENTER, or AISLE
   */
   public Seat(int n)
   {
      type = n;
      occupied = false;
   }
   
   /**
      Books this seat, marking it as an occupied seat.
   */
   public void book()
   {
      occupied = true;   
   }
   
   /**
      Checks whether this seat is empty.
      @return true if this seat is empty, false if it is occupied
   */
   public boolean isEmpty()
   {
      return !occupied;
   }
   
   /**
      Gets the type of this seat within an airplane
      @return one of WINDOW, CENTER, or AISLE
   */
   public int getType()
   {
      return type;
   }
   
   /**
      Formats this seat accordingly.
      @return formatted string representing the state of
      this seat
   */
   public String format()
   {
      if (occupied) { 
         return "X"; }
      else { 
         return "_"; }
   }
}