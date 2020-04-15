import java.util.Scanner;

/**
   This program simulates a game of tictactoe between a computer
   and a human
*/
public class TicTacToeInterface
{
   public static void main(String[] args)
   {
      Scanner console = new Scanner(System.in);
      TicTacToe tictactoe = new TicTacToe();
      
      
      while (true)
      {
         tictactoe.reset();
         int turn = TicTacToe.HUMAN;
         System.out.print("C)ontinue, Q)uit: ");
         String command = console.next();
         if (command.equalsIgnoreCase("Q"))
         {
            return; 
         }
         else if (command.equalsIgnoreCase("C"))
         {
            while (!tictactoe.hasAWinner())
            {
               if (turn == TicTacToe.HUMAN)
               {
                  do
                  {
                     System.out.print("Row, column: ");
                     int row = console.nextInt();
                     int column = console.nextInt();
                     tictactoe.getPlayerMove(row, column);
                  }
                  while (!tictactoe.play(turn));
                  System.out.println(tictactoe.format());
                  turn = TicTacToe.COMPUTER;
               }
               else
               {
                  tictactoe.play(turn);
                  System.out.println(tictactoe.format());
                  turn = TicTacToe.HUMAN;
               }
            }               
         }
         else
         {
            System.out.println("Illegal command!");
            return;
         }
      }
   }
}