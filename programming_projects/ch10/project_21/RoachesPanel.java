package project_21;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.JPanel;

public class RoachesPanel extends JPanel
{
   private static final int LENGTH = 27;
   private static final int THICKNESS = 12;
    
   private ArrayList<Ellipse2D.Double> roaches;
   private Random generator;
   
   /**
      Constructs an empty component with no roach.
   */
   public RoachesPanel()
   {     
      generator = new Random();
      roaches = new ArrayList<Ellipse2D.Double>();     
   }
   
   public void paintComponent(Graphics g)
   {
      super.paintComponent(g);
      Graphics2D g2 = (Graphics2D) g;
      
      if (!(roaches.size() > 0))
      {
         int x1 = generator.nextInt(getWidth());
         int y1 = generator.nextInt(getHeight());
         int x2 = generator.nextInt(getWidth());
         int y2 = generator.nextInt(getHeight());
         
         roaches.add(new Ellipse2D.Double(x1, y1, LENGTH, THICKNESS));
         roaches.add(new Ellipse2D.Double(x2, y2, LENGTH, THICKNESS));
      }
      
      for (Ellipse2D.Double e : roaches)
      {
         g2.fill(e);  
      }
   }
   
   /**
      Increase the population of the roaches.
   */
   public void increasePopulation()
   {
      int newPopulation = roaches.size() * 2;
      int previousPopulation = roaches.size();
      for (int i = 1; i <= newPopulation - previousPopulation; i++)
      { 
         int x = generator.nextInt(getWidth());
         int y = generator.nextInt(getHeight());
         roaches.add(new Ellipse2D.Double(x, y, LENGTH, THICKNESS));
      }
      
      repaint();
   }
}