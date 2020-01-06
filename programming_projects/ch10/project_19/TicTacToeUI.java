package project_19;

import java.util.Scanner;

public class TicTacToeUI
{
   public static final String COMPUTER = "computer";
   public static final String USER = "user";
       
   public enum Player { COMPUTER, USER };
   
   public static void main(String[] args)
   {
      Player player = Player.USER;
      TicTacToeBoard board = new TicTacToeBoard();
      MockTicTacToeStrategy computer = new MockTicTacToeStrategy();
      
      Scanner in = new Scanner(System.in);
      while (!board.filled() && !board.matchFound())
      {
         if (player == Player.USER)
         {
            System.out.print("Row(1-3): ");
            int row = in.nextInt();
            System.out.print("Column(1-3): ");
            int col = in.nextInt();
            if (board.empty(--row, --col)) 
            {
               board.register('X', row, col);
               player = Player.COMPUTER;
            }
         }
         else if (player == Player.COMPUTER)
         {
            computer.move(board);
            player = Player.USER;  
         }
         board.display();      
      }
      
      if (board.matchFound())
      {
         String winner;
         if (player == Player.USER)
         {
            winner = USER;
         }
         else
         {
            winner = COMPUTER;
         } 
         System.out.println(winner + " wins.");   
      }
      else
      {
         System.out.println("Stalemate.");
      }
   }
}