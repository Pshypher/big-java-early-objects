import java.awt.BorderLayout;
import java.awt.Color;
import static java.awt.Color.*;
import java.awt.FlowLayout;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.io.FileNotFoundException;
import java.util.Random;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class GraphicsEditor extends JFrame
{
   private static final int width = 75;
   private static final int height = 50;
   public static final String[] colorLabels = new String[]
      {
         "Black", "Blue", "Cyan", "Dark gray", "Gray", "Green", "Light gray",
         "Magenta", "Orange", "Pink", "Red", "White", "Yellow"
      };
   public static final Color[] colorFields = new Color[]
      {
         BLACK, BLUE, CYAN, DARK_GRAY, GRAY, GREEN, LIGHT_GRAY, MAGENTA,
         ORANGE, PINK, RED, WHITE, YELLOW
      };
         
      
   private JButton ellipseButton;
   private JButton lineButton;
   private JButton rectButton;
   private JButton loadButton;
   private JButton saveButton;
   private JComboBox<String> colors;
   private JPanel subpanel;
   private Picture picture;
   private Random generator;
   
   /**
      Constructs a graphics editor used to diplay a mixture of shapes
   */
   public GraphicsEditor()
   {
      picture = new Picture();
      ellipseButton = new JButton("Ellipse"); 
      lineButton = new JButton("Line");
      rectButton = new JButton("Rectangle");
      loadButton = new JButton("Load");
      saveButton = new JButton("Save");
      colors = new JComboBox<String>(colorLabels);
      generator = new Random();
      
      ellipseButton.addActionListener(new AddEllipseListener());
      lineButton.addActionListener(new AddLineListener());
      rectButton.addActionListener(new AddRectangleListener());
      loadButton.addActionListener(new LoadButtonListener());
      saveButton.addActionListener(new SaveButtonListener());
      
      JPanel controls = new JPanel();
      controls.setLayout(new FlowLayout());
      subpanel = new JPanel();
      subpanel.setLayout(new BorderLayout());
      
      controls.add(ellipseButton);
      controls.add(lineButton);
      controls.add(rectButton);
      controls.add(loadButton);
      controls.add(saveButton);
      controls.add(colors);
      
      subpanel.add(picture, "Center");
      subpanel.add(controls, "South");
      add(subpanel);
   }
   
   class AddEllipseListener implements ActionListener
   {
      public void actionPerformed(ActionEvent event)
      {
         int i = colors.getSelectedIndex();
         picture.setColor(colorFields[i]);
         int xLeft = generator.nextInt(picture.getWidth());
         int yTop = generator.nextInt(picture.getHeight());
         picture.addShape(new Ellipse2D.Double(xLeft, yTop, width, height));
         subpanel.repaint();
      }
   }
   
   class AddLineListener implements ActionListener
   {
      public void actionPerformed(ActionEvent event)
      {
         int i = colors.getSelectedIndex();
         picture.setColor(colorFields[i]);
         int x1 = generator.nextInt(picture.getWidth());
         int y1 = generator.nextInt(picture.getHeight());
         int x2 = generator.nextInt(picture.getWidth());
         int y2 = generator.nextInt(picture.getHeight());
         picture.addShape(new Line2D.Double(x1, y1, x2, y2));
         subpanel.repaint();
      }
   }
   
   class AddRectangleListener implements ActionListener
   {
      public void actionPerformed(ActionEvent event)
      {
         int i = colors.getSelectedIndex();
         picture.setColor(colorFields[i]);
         int xLeft = generator.nextInt(picture.getWidth());
         int yTop = generator.nextInt(picture.getHeight());
         picture.addShape(new Rectangle(xLeft, yTop, width, height));
         subpanel.repaint();
      }
   }
   
   class LoadButtonListener implements ActionListener
   {
      public void actionPerformed(ActionEvent event)
      {
         try
         {
            picture.readFile("shapes.txt");
            subpanel.repaint();
         }
         catch (FileNotFoundException exception)
         {
            JOptionPane.showMessageDialog(null, 
               "Error opening picture file.");
         }            
      }
   }
   
   class SaveButtonListener implements ActionListener
   {
      public void actionPerformed(ActionEvent event)
      {
         try
         {
            picture.printTo("shapes.txt");
         }
         catch (FileNotFoundException exception)
         {
            JOptionPane.showMessageDialog(null, 
               "Error accessing picture file.");
         }            
      }
   }
}