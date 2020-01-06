import java.util.Random;
import java.util.Scanner;

public class NimUI
{
   private static final String PLAYER_1 = "Computer";
   private static final String PLAYER_2 = "Player";
   
   private NimPile pile;
   private String player;
   private int mode;
   private Random generator;
   private Scanner in;
   
   /**
      Constructs an instance of a game of nim. 
   */
   public NimUI()
   {
      final int NUM_PLAYERS = 2;
      final int MIN_PILE_AMOUNT = 10;
      final int MAX_PILE_AMOUNT = 100;
      
      in = new Scanner(System.in);
      generator = new Random();
      
      int size = generator.nextInt(MAX_PILE_AMOUNT + 1 
            - MIN_PILE_AMOUNT) + MIN_PILE_AMOUNT;
      pile = new NimPile(size);
      player = (generator.nextInt(NUM_PLAYERS) == 0) ? 
            PLAYER_1 : PLAYER_2;
      mode = generator.nextInt(2);
   }
   
   /**
      Users take turn removing marbles from the pile while
      the game is allowed to continue.
   */
   public void play()
   {
      while (!gameOver())
      {
         if (player.equals(PLAYER_1))
         {
            NimStrategy.move(mode, pile);
            toggle();
         }
         else
         {
            display();
            System.out.print("Quantity: ");
            String move = in.next();
            if (isValidMove(move))
            {
               executeMove(move);
               toggle();
            }
         }        
      }
      
      toggle();
      System.out.printf("%s wins.\n", player);            
   }
   
   public boolean isValidMove(String move)
   {
      int quantity = Integer.parseInt(move);
      return 1 <= quantity && quantity <= pile.getPileSize() / 2;
   }
   
   public void executeMove(String move)
   {
      int quantity = Integer.parseInt(move);
      pile.remove(quantity);
   }
   
   public void toggle()
   {
      if (player.equals(PLAYER_1))
      {
         player = PLAYER_2; 
      }
      else
      {
         player = PLAYER_1;
      }
   }
        
   public void display()
   {
      int size = pile.getPileSize();
      for (int i = 1; i <= size; i++)
      {
         System.out.print("|");
      }
      System.out.println();
      System.out.printf("%d marbles in pile.\n", size);
   }
   
   public boolean gameOver()
   {
      return pile.getPileSize() == 1;
   }
}