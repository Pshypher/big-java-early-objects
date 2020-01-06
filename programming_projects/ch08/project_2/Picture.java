import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JComponent;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileFilter;

/**
   A picture from an image file.
*/
public class Picture
{
   private JLabel label = new JLabel();
   private String source;
   private double x;
   private double y;

   /**
      Constructs a picture from a given file or URL.
      @param source the filename or URL
   */
   public Picture(String source)
   {
      try
      {
         this.source = source;
         BufferedImage image;
         if (source.startsWith("http://"))
         {
            image = ImageIO.read(new URL(source).openStream());
         }
         else
         {
            image = ImageIO.read(new File(source));
         }

         label.setIcon(new ImageIcon(image));
         label.setText("");
         Dimension dim = label.getPreferredSize();
         label.setBounds(0, 0, dim.width, dim.height);
      }
      catch (Exception ex)
      {
         label.setIcon(null);
         ex.printStackTrace();
      }
      Canvas.getInstance().show(this);
   }

   /**
      Returns the bounds of this picture
      @return the rectangle that contains the picture
   */
   public Rectangle getBounds()
   {
      Rectangle r = label.getBounds();
      r.translate((int) Math.round(x), (int) Math.round(y));
      return r;
   }

   /**
      Moves this picture by a given amount.
      @param dx the amount by which to move in x-direction
      @param dy the amount by which to move in y-direction
   */
   public void move(double dx, double dy)
   {
      x += dx;
      y += dy;
      Canvas.getInstance().repaint();
   }

   public String toString()
   {
      return "Picture[source=" + source + ",bounds=" + getBounds() + "]";
   }

   private void paintShape(Graphics2D g2)
   {
      g2.translate(x, y);
      label.paint(g2);
   }

   static class Canvas
   {
      private static Canvas canvas = new Canvas();

      private List<Picture> pictures = new CopyOnWriteArrayList<Picture>();
      private JFrame frame;
      private CanvasComponent component = new CanvasComponent();

      private static final int LOCATION_OFFSET = 120;
      private static final int MIN_SIZE = 100;

      class CanvasComponent extends JComponent
      {
         public void paintComponent(Graphics g)
         {
            g.setColor(java.awt.Color.WHITE);
            g.fillRect(0, 0, getWidth(), getHeight());

            for (Picture s : pictures)
            {
               Graphics2D g2 = (Graphics2D) g.create();
               s.paintShape(g2);
               g2.dispose();
            }
         }

         public Dimension getPreferredSize()
         {
            int maxx = MIN_SIZE;
            int maxy = MIN_SIZE;
            for (Picture s : pictures)
            {
               Rectangle r = s.getBounds();
               maxx = (int) Math.max(maxx, r.getX() + r.getWidth());
               maxy = (int) Math.max(maxy, r.getY() + r.getHeight());
            }
            return new Dimension(maxx, maxy);
         }
      }

      private Canvas()
      {
         if (System.getProperty("com.horstmann.codecheck") == null)
         {
            frame = new JFrame();
            if (!System.getProperty("java.class.path").contains("bluej"))
            {
               frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            }
            frame.add(component);
            frame.pack();
            frame.setLocation(LOCATION_OFFSET, LOCATION_OFFSET);
            frame.setVisible(true);
         }
         else
         {
            final String SAVEFILE ="canvas.png";
            final Thread currentThread = Thread.currentThread();
            Thread watcherThread = new Thread()
               {
                  public void run()
                  {
                     try
                     {
                        final int DELAY = 10;

                        while (currentThread.getState() != Thread.State.TERMINATED)
                        {
                           Thread.sleep(DELAY);
                        }
                        saveToDisk(SAVEFILE);
                     }
                     catch (Exception ex)
                     {
                        ex.printStackTrace();
                     }
                  }
               };
            watcherThread.start();
         }
      }

      public static Canvas getInstance()
      {
         return canvas;
      }

      public void show(Picture s)
      {
         if (!pictures.contains(s))
         {
            pictures.add(s);
         }
         repaint();
      }

      public void repaint()
      {
         if (frame == null) { return; }
         Dimension dim = component.getPreferredSize();
         if (dim.getWidth() > component.getWidth()
            || dim.getHeight() > component.getHeight())
         {
            frame.pack();
         }
         else
         {
            frame.repaint();
         }
      }

      public void saveToDisk(String fileName)
      {
         try
         {
            Dimension dim = component.getPreferredSize();
            java.awt.Rectangle rect = new java.awt.Rectangle(0, 0, dim.width, dim.height);
            BufferedImage image = new BufferedImage(rect.width, rect.height, BufferedImage.TYPE_INT_RGB);
            Graphics2D g = (Graphics2D) image.getGraphics();
            g.setColor(java.awt.Color.WHITE);
            g.fill(rect);
            g.setColor(java.awt.Color.BLACK);
            component.paintComponent(g);
            String extension = fileName.substring(fileName.lastIndexOf('.') + 1);
            ImageIO.write(image, extension, new File(fileName));
            g.dispose();
         }
         catch(Throwable e)
         {
            javax.swing.JOptionPane.showMessageDialog(null, e.getMessage());
            System.err.println("Was unable to save the image to " + fileName);
         }
      }
   }
}
