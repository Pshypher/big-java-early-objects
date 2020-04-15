import java.awt.Color;
import static java.awt.Color.*;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class SuburbanSceneFrame extends JFrame
{
   private static final int FRAME_WIDTH = 500;
   private static final int FRAME_HEIGHT = 500;
   private static final Color[] colorFields = new Color[]
      {
         BLACK, BLUE, CYAN, DARK_GRAY, GRAY, GREEN, LIGHT_GRAY, MAGENTA,
         ORANGE, PINK, RED, WHITE, YELLOW
      };
   private static final String[] colorLabels = new String[]
      {
         "Black", "Blue", "Cyan", "Dark gray", "Gray", "Green", "Light gray",
         "Magenta", "Orange", "Pink", "Red", "White", "Yellow"
      };    
   
   private Suburb suburb;
   private SuburbanScene scene;
   private JButton streetButton;
   private JButton houseButton;
   private JButton carButton;
   private JComboBox<String> streets;
   private JComboBox<String> colors;
   private Color currentColor;
   
   public SuburbanSceneFrame()
   {
      setSize(FRAME_WIDTH, FRAME_HEIGHT);
      setLayout(new BorderLayout());
      
      suburb = new Suburb();
      scene = new SuburbanScene();
      streetButton = new JButton("Street");
      houseButton = new JButton("House");
      carButton = new JButton("Car");
      streets = new JComboBox<String>(new String[]{ "<empty>" });
      colors = new JComboBox<String>(colorLabels);
      
      streetButton.addActionListener(new AddStreetListener());
      houseButton.addActionListener(new AddHouseListener());
      carButton.addActionListener(new AddCarListener());
      streets.addActionListener(new StreetSelectionListener());
      colors.addActionListener(new ColorSelectionListener());
     
      JPanel subpanel = new JPanel();
      subpanel.setLayout(new FlowLayout());
      
      subpanel.add(streetButton);
      subpanel.add(houseButton);
      subpanel.add(carButton);
      subpanel.add(streets);
      subpanel.add(colors);
      add(subpanel, "North");
      add(scene, "Center");
   }
   
   
   class AddStreetListener implements ActionListener
   {
      public void actionPerformed(ActionEvent event)
      {
         String name = JOptionPane.showInputDialog("Street");
         String msg;
         if (suburb.isEmpty()) { streets.removeItemAt(0); }
         if (!suburb.addStreet(name)) 
         {
            JOptionPane.showMessageDialog(null, 
               name + " street wasn't added to the suburb.");
         }
         else
         {
            streets.addItem(name);
         }
      }
   }
   
   class AddHouseListener implements ActionListener
   {
      public void actionPerformed(ActionEvent event)
      {
         final int SIZE = 70; 
         int xLeft = Integer.parseInt(JOptionPane.showInputDialog(
            "Position"));
         int yTop = scene.getHeight() - SIZE * 3 / 2;
         if (!scene.add(new House(xLeft, yTop, SIZE, currentColor)))
         {
            JOptionPane.showMessageDialog(null, 
               "Cannot add house to this suburban scene.");
         }
      }
   }
   
   class AddCarListener implements ActionListener
   {
      public void actionPerformed(ActionEvent event)
      {
         final int SIZE = 10;
         int xLeft = Integer.parseInt(JOptionPane.showInputDialog(
            "Position"));
         int yTop = scene.getHeight() - SIZE * 3;
         if (!scene.add(new Car(xLeft, yTop, SIZE, currentColor)))
         {
            JOptionPane.showMessageDialog(null,
               "Cannot add car to this suburban scene.");  
         }
      }
   }
   
   class StreetSelectionListener implements ActionListener
   {
      public void actionPerformed(ActionEvent event)
      {
         Street s = suburb.select((String) streets.getSelectedItem());
         if (s != null) 
         {
            scene.update(s);
         }
      }
   }
   
   class ColorSelectionListener implements ActionListener
   {
      public void actionPerformed(ActionEvent event)
      {
         int index = colors.getSelectedIndex();
         currentColor = colorFields[index];
      }
   }
}