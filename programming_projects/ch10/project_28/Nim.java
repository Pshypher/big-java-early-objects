import java.util.Random;
import java.util.Scanner;

public class Nim implements Game
{
   private static final int PLAYER_1 = 0;
   private static final int PLAYER_2 = 1;
   
   private NimPile pile;
   private int player;
   private Random generator;
   private Scanner in;
   
   /**
      Initializes an instance of a game of nim. 
   */
   public Nim()
   {
      final int NUM_PLAYERS = 2;
      final int MIN_PILE_AMOUNT = 10;
      final int MAX_PILE_AMOUNT = 100;
      
      in = new Scanner(System.in);
      generator = new Random();
      
      int size = generator.nextInt(MAX_PILE_AMOUNT + 1 
            - MIN_PILE_AMOUNT) + MIN_PILE_AMOUNT;
      pile = new NimPile(size);
      player = generator.nextInt(NUM_PLAYERS);
      
   }
   
   public String prompt()
   {
      System.out.printf("Player %d\n", player + 1); 
      System.out.print("Quantity: ");
      String input = in.next();
      return input;         
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
      if (player == PLAYER_1)
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
      System.out.println();
   }
   
   public boolean isGameOver()
   {
      return pile.getPileSize() == 1;
   }
   
   public String winner()
   {
      return String.format("\nPlayer %d wins", (player + 1));
   }
}