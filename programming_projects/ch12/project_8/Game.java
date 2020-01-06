import java.awt.Graphics2D;
import java.util.Random;

/**
   An interactive game that teaches a young child to read the clock.
*/
public class Game
{
   public static final int CONCEAL = 1;
   public static final int REVEAL = 2;
   
   private AnalogClock clock;
   private int level;
   private int currentScore;
   private int attempts;
   private int state;
   
   /**
      Constructs this game with an analog clock used to
      display the time.
      @param aClock the analog clock
   */
   public Game(AnalogClock aClock)
   {
      clock = aClock;
      level = 1;
      currentScore = 0;
      attempts = 0;
      state = CONCEAL;
   }
   
   /**
      Generates a time with random hour and minute parameters.
   */
   public void nextTime()
   {
      final int QUARTER = 4;
      final int MINUTES_PER_QUARTER = 15;
      Random generator = new Random();
      
      int hour = generator.nextInt(AnalogClock.HOURS);
      if (level == 1)
      { 
         clock.setTime(new Time(hour, 0));
      }
      else if (level == 2)
      {
         int minute = generator.nextInt(QUARTER) * MINUTES_PER_QUARTER;
         clock.setTime(new Time(hour, minute));
      }
      else if (level == 3)
      {
         int minute = generator.nextInt(AnalogClock.HOURS) * 5;
         clock.setTime(new Time(hour, minute)); 
      }
      else if (level == 4)
      {
         int minute = generator.nextInt(AnalogClock.MINUTES);
         clock.setTime(new Time(hour, minute));
      }
   }
   
   /**
      Displays the clock.
      @param g2 the graphics context
   */
   public void draw(Graphics2D g2)
   {
      clock.draw(g2);
   }
   
   /**
      Checks whether the given time is the same as the time 
      displayed on the analog clock
      @param aTime the time
   */
   public boolean checkResponse(Time aTime)
   {
      final int LIMIT = 4;
      boolean correct = clock.getTime().equals(aTime);
      if (correct)
      {
         currentScore++;
         reset(); 
      }
      else
      {
         attempts++;
      }
      
      if (attempts == 2) { state = REVEAL; }
      
      if (currentScore == 5 && level < LIMIT)
      {
         currentScore = 0;
         level++;
      }
      
      return correct;
   }
   
   /**
      Resets this game to its initial state
      (Precondition: state is REVEAL)
   */
   public void reset()
   {
      attempts = 0;
      state = CONCEAL;
   }
   
   /**
      Reveals the answer after two subsequent incorrect responses
      @return string representation of the time 
   */
   public String reveal()
   {
      return clock.getTime().format();
   }
   
   /**
      Formats the current details of this game.
      @return string containing the current level and score of this game
   */
   public String format()
   {
      return String.format("Points:%5d\nLevel:%5d", currentScore, 
         level);
   }
   
   /**
      Gets the state of this game.
      @return the state
   */
   public int getState()
   {
      return state;
   }
}