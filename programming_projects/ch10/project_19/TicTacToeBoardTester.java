package project_19;

/**
    This program tests the TicTacToeBoard class
*/
public class TicTacToeBoardTester
{
   public static void main(String[] args)
   {
      TicTacToeBoard board1 = new TicTacToeBoard();
      board1.register('X', 0, 1);
      System.out.println("Across row: " + board1.matchingRows());
      System.out.println("Expected: false");
      
      board1.register('X', 0, 0);
      board1.register('X', 0, 2);
      System.out.println("Across row: " + board1.matchingRows());
      System.out.println("Expected: true");
      
      TicTacToeBoard board2 = new TicTacToeBoard();
      board2.register('O', 2, 2);
      System.out.println("Along column: " + board2.matchingColumns());
      System.out.println("Expected: false");
      
      board2.register('O', 0, 2);
      board2.register('O', 1, 2);
      System.out.println("Along column: " + board2.matchingColumns());
      System.out.println("Expected: true");
      
      TicTacToeBoard board3 = new TicTacToeBoard();
      board3.register('O', 0, 2);
      System.out.println("Along diagonal: " + board3.matchingDiagonal());
      System.out.println("Expected: false");
      
      board3.register('O', 1, 1);
      board3.register('O', 2, 0);
      System.out.println("Along diagonal: " + board3.matchingDiagonal());
      System.out.println("Expected: true");
   }
}