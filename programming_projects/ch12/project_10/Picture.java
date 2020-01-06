import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.Shape;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JPanel;

/**
   A picture has a mixture of shapes
*/
public class Picture extends JPanel
{
   private ArrayList<Shape> shapes;
   private ArrayList<Color> colors;
   private Color lastAssignedColor;
   
   /**
      Constructs an empty picture. 
   */
   public Picture()
   {
      shapes = new ArrayList<Shape>();
      colors = new ArrayList<Color>();
      lastAssignedColor = Color.BLACK;
   }
   
   public void paintComponent(Graphics g)
   {
      Graphics2D g2 = (Graphics2D) g;
      for (int i = 0; i < shapes.size(); i++)
      {
         g2.setColor(colors.get(i));
         if (shapes.get(i) instanceof Line2D)
         {
            g2.draw(shapes.get(i));
         }
         else
         {               
            g2.fill(shapes.get(i));
         }               
      }
   }
   
   /**
      Adds a shape to this picture.
   */
   public void addShape(Shape s)
   {
      shapes.add(s);
      colors.add(lastAssignedColor);
   }
   
   /**
      Adjusts the color used to fill the shapes.
      @param c the color
   */
   public void setColor(Color c)
   {
      lastAssignedColor = c;
   }
   
   /**
      Reads a file containing information of a previously saved
      picture with the following format.
      shape1 number1a number1b number1c number1d color1
      shape2 number2a number2b number2c number2d color2
      ... 
      @param filename the file 
   */
   public void readFile(String filename) throws FileNotFoundException
   {
      Scanner in = new Scanner(new File(filename));
      while (in.hasNext())
      {
         String type = in.next();
         int a = in.nextInt();
         int b= in.nextInt();
         int m = in.nextInt();
         int n = in.nextInt();
         String colorString = in.nextLine();
         int i = linearSearch(GraphicsEditor.colorLabels, colorString.trim());
         lastAssignedColor = GraphicsEditor.colorFields[i];
         if (type.equals("r"))
         {
            addShape(new Rectangle(a, b, m, n));
         }
         else if (type.equals("l"))
         {
            addShape(new Line2D.Double(a, b, m, n));
         }
         else if (type.equals("e"))
         {
            addShape(new Ellipse2D.Double(a, b, m, n));
         }
         
      }
      in.close();  
   }
   
   /**
      Saves this picture to a given file.
      @param filename the file
   */
   public void printTo(String filename) throws FileNotFoundException
   {
      PrintWriter out = new PrintWriter(filename);
      for (int i = 0; i < shapes.size(); i++)
      {
         Shape s = shapes.get(i);
         int j = linearSearch(GraphicsEditor.colorFields,
            colors.get(i));
         String colorString = GraphicsEditor.colorLabels[j];   
         if (s instanceof Rectangle)
         {
            Rectangle r = (Rectangle) s;
            
            out.println(String.format("r %d %d %d %d %s",
               (int) r.getX(), (int) r.getY(), (int) r.getWidth(),
               (int) r.getHeight(), colorString));  
         }
         else if (s instanceof Ellipse2D)
         {
            Ellipse2D.Double e = (Ellipse2D.Double) s;
            out.println(String.format("e %d %d %d %d %s", 
               (int) e.getX(), (int) e.getY(), (int) e.getWidth(), 
               (int) e.getHeight(), colorString));
         }
         else if (s instanceof Line2D)
         {
            Line2D.Double l = (Line2D.Double) s;
            out.println(String.format("l %d %d %d %d %s",
               (int) l.getX1(), (int) l.getY1(), (int) l.getX2(), 
               (int) l.getY2(), colorString));
         }
      }
      out.close();
   }
   
   /**
      Searches linearly for an element within an array.
      @param a the array to be searched
      @param element the string searched for
      @return the index of the element, -1 if the element wasn't found
   */
   private int linearSearch(Object[] a, Object element)
   {
      int index = -1;
      boolean found = false;
      int j = 0;
      while (!found && j < a.length)
      {
         if (element.equals(a[j]))
         {
            found = true;
            index = j;
         }
         else
         {
            j++;
         }
      }
      
      return index;
   } 
}