import java.awt.Graphics2D;
import java.util.ArrayList;

/**
   A street contains houses and cars
*/
public class Street
{
   private String name;
   private ArrayList<Drawable> shapes; 
   
   /**
      Construct a street with no houses or cars.
      @param aName the name of this street
   */
   public Street(String aName)
   {
      name = aName;
      shapes = new ArrayList<Drawable>();
   }
   
   /**
      Default street constructor
   */
   public Street()
   {
      this("");
   }
   
   /**
      Gets the name of this street.
      @return the name
   */
   public String getStreetName()
   {
      return name;
   }
   
   /**
      Displays this street on a graphic component.
      @param g2 the graphics context
   */
   public void draw(Graphics2D g2)
   {
      for (Drawable obj : shapes)
      {
         obj.draw(g2);
      }
   }
   
   /**
      Adds a car or a house to this street
      @param anObject a car or a house
      @return true if the car or house was added, false otherwise
   */
   public boolean add(Drawable anObject)
   {
      boolean overlaps = false;
      int i = 0;
      while (i < shapes.size() && !overlaps)
      {
         if (shapes.get(i).intersects(anObject))
         {
            overlaps = true;
         }
         i++;
      }
      
      if (!overlaps)
      {
         shapes.add(anObject);
         return true;
      }
      else
      {
         return false;
      }
   }
}