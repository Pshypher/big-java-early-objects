import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.IOException;
import java.util.Arrays;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.sound.sampled.AudioFileFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

/**
   This program processes a 16 bit uncompressed mono .WAV file.
*/
public class SoundClip
{
   private static final int HEADER_SIZE = 44;
   private byte[] header = new byte[HEADER_SIZE];
   private int[] samples;
   private int sampleRate;

   public int[] getSampleValues()
   {
      return samples;
   }

   public int getSampleRate()
   {
      return sampleRate;
   }

   /**
      Displays a file chooser for picking a clip.
   */ 
   public void pick()
   {
      JFileChooser chooser = new JFileChooser(".");
      if (chooser.showOpenDialog(null) == JFileChooser.APPROVE_OPTION)
      {
         load(chooser.getSelectedFile());
      }
   }   

   /**
      Shows a frame with the sample values and a Play button
   */
   public void show()
   {
      if (samples != null)
      {
         JFrame frame = new SoundClipFrame();
         frame.setVisible(true);
      }
   }

   // -----------------------------------------------------------------

   /*
     The code below processes a file in the WAV format.
     You can use this program to manipulate sound files without 
     reading or understanding the code below. 
     
     The code uses Java features that are introduced in later chapters
     as well as the internals of the WAV format 
     (https://ccrma.stanford.edu/courses/422/projects/WaveFormat/)
   */

   /**
      Loads a picture from a given source. 
      @param source the image source.
      @return true if the file was loaded successfully
   */ 
   private void load(File source)
   {
      try 
      {
         InputStream in = new FileInputStream(source);
         for (int i = 0; i < HEADER_SIZE; i++)
         {
            int b = in.read();
            if (b == -1)
            {
               error("Premature end of file");
            }
            header[i] = (byte) b;
         }
         
         int formatType = getUnsignedInt2(20);
         if (formatType != 1)
         {
            error("Not an uncompressed sound file.");
         }
         int numChannels = getUnsignedInt2(22);
         if (numChannels != 1)
         {
            error("Not a mono sound file.");
         }

         sampleRate = getUnsignedInt2(24);

         int bitsPerSample = getUnsignedInt2(34);
         if (bitsPerSample != 16)
         {
            error("Not a 16 bit sound file.");
         }

         // Read data size and allocate data array
         int dataSize = getUnsignedInt4(40) / 2; // 2 bytes per data
         samples = new int[dataSize];
         
         // Read sound data
         for (int i = 0; i < dataSize; i++) 
         {
            samples[i] = getSignedInt2(in);
         }
      }
      catch (Exception ex)
      {
         error(ex.getMessage());
      }
   }      

   private void error(String message)
   {
      JOptionPane.showMessageDialog(null, message);
   }

   /**
      Gets a byte from the header as an unsigned value.
      @param offset the offset from the start of the header
      @return the integer
   */
   private int getUnsignedInt1(int offset)
   {
      int result = header[offset];
      if (result >= 0) { return result; }
      else { return result + 256; }
   }

   /**
      Gets an unsigned 4-byte integer from the header
      @param offset the offset from the start of the header
      @return the integer 
   */
   private int getUnsignedInt4(int offset) 
   {
      int result = 0;
      int base = 1;
      for (int i = 0; i < 4; i++)
      {
         result = result + getUnsignedInt1(offset + i) * base;
         base = base * 256;
      }
      return result;
   }

   /**
      Gets an unsigned 2-byte integer from a random access file.
      @param in the file
      @return the integer
   */
   private int getUnsignedInt2(int offset)
   {
      return getUnsignedInt1(offset) + 256 * getUnsignedInt1(offset + 1);
   }

   /**
      Gets a signed 2-byte integer from a random access file.
      @param in the file
      @return the integer
   */
   private static int getSignedInt2(InputStream in)
      throws IOException
   {
      int lo = in.read();
      int hi = in.read();
      int result = lo + 256 * hi;
      if (result >= 32768) { result = result - 65536; }
      return result;
   }

   private static int frames;
   private static int offsets;

   class SoundClipFrame extends JFrame
   {
      private int[] samples; 
      
      
      public SoundClipFrame()
      {
         frames++;
         offsets++;
         samples = Arrays.copyOf(SoundClip.this.samples, 
            SoundClip.this.samples.length);

         addWindowListener(new WindowAdapter()
            {
               @Override public void windowClosing(WindowEvent event)
               {
                  frames--;
                  if (frames == 0) System.exit(0);
               }
            });

         final int FRAME_WIDTH = 800;
         final int FRAME_HEIGHT = 200;
         final int OFFSET_WIDTH = 100;

         setBounds(offsets * OFFSET_WIDTH, offsets * OFFSET_WIDTH, FRAME_WIDTH, FRAME_HEIGHT);

         JComponent component = new JComponent()
            {
               public void paintComponent(Graphics graph)
               {
                  int increment = samples.length / getWidth();
                  
                  final int LARGEST = 32767;
                  int x = 0;
                  for (int i = 0; i < samples.length; i = i + increment)
                  {
                     int value = samples[i];
                     value = Math.min(LARGEST, value);
                     value = Math.max(-LARGEST, value);
                     
                     int height = getHeight() / 2;
                     int y = height - samples[i] * height / LARGEST;
                     graph.drawLine(x, y, x, height);
                     x++;
                  }
               }
            };
      
         add(component);
         JPanel panel = new JPanel();
         JButton button = new JButton("Play");
         button.addActionListener(new ActionListener() 
            {
               public void actionPerformed(ActionEvent event) { play(); }
            });
         panel.add(button);
         add(panel, BorderLayout.SOUTH);
      }

      private void play()
      {
         byte[] out = new byte[HEADER_SIZE + 2 * samples.length];
         for (int i = 0; i < HEADER_SIZE; i++)
         {
            out[i] = header[i];
         }
         for (int i = 0; i < samples.length; i++)
         {
            int value = samples[i];
            if (value < 0) { value = value + 65536; }
            out[HEADER_SIZE + 2 * i] = (byte)(value % 256);
            out[HEADER_SIZE + 2 * i + 1] = (byte)(value / 256);
         }

         try
         {
            Clip clip = AudioSystem.getClip();
            clip.open(AudioSystem.getAudioInputStream(new ByteArrayInputStream(out)));
            clip.start(); 
         }
         catch (Exception ex)
         {
            error(ex.getMessage());
         }
      }
   }   
}

