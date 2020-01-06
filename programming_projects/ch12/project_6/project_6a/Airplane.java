public class Airplane
{
   public static final int FIRST = 1;
   public static final int ECONOMY = 2;
   
   private Category[] categories;
   
   /**
      Constructs an airplane of two seperate first and
      economy class categories
   */
   public Airplane()
   {
      categories = new Category[2];
      categories[0] = new First();
      categories[1] = new Economy();
   }
   
   /**
      Formats this airplane as a string.
      @return lay out of this airplane as a string with seats
      in each category
   */
   public String format()
   {
      String r = "";
      for (Category c : categories) { r = r + c.format() + "\n"; }
      return r;              
   }
   
   /**
      Assigns a seat to a passenger according to the given preference
      and marks the seat as occupied.
      @param n one of FIRST or ECONOMY
      @param preference one of WINDOW, CENTER or AISLE
      @return true if the seat was assigned, false otherwise
   */
   public boolean assignSeat(int n, int preference)
   {
      boolean assigned;
      n--;
      assigned = categories[n].addPassenger(preference);
      return assigned;
   }
}