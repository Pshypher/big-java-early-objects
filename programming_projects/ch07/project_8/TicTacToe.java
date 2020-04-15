import java.util.Scanner;

public class TicTacToe
{
    public static final int ROW_SIZE = 3;
    public static final int COLUMN_SIZE = 3;
    
    public static void main(String[] args)
    {
        Grid grid = new Grid(ROW_SIZE, COLUMN_SIZE);
        Mark mark = new Mark('O');
        Scanner in = new Scanner(System.in);
        
        grid.draw();
        while (grid.has(new Mark(' ')) && !gameWon(grid))
        {
            System.out.println("Player " + mark.getChar() + "'s mark.");
            int row;
            do
            {
                System.out.print("Row (1-3): ");
                row = in.nextInt();
                if (row < 1 || row > 3)
                {
                    System.out.println("Row should be between 1 & 3");
                }
            }
            while (row < 1 || row > 3);
            
            int column;
            do
            {
                System.out.print("Column (1-3): ");
                column = in.nextInt();
                if (column < 1 || column > 3)
                {
                    System.out.println("Column should be between 1 & 3");
                }
            }
            while (column < 1 || column > 3);
            
            if (grid.isOccupied(column - 1, row - 1))
            {
                System.out.println();
                System.out.println("Position is already occupied by "
                    + grid.getMark(column - 1, row - 1));
                System.out.println();
                continue;
            }
            else
            {
                grid.setMark(mark, column - 1, row - 1);
            }
            
            if (mark.getChar() == 'O') { mark = new Mark('X'); }
            else { mark = new Mark('O'); }
            grid.draw();  
        }
        
        if (gameWon(grid)) 
        {
            System.out.printf("Player %s wins\n", grid.winner());
        }
        else
        {
            System.out.println("It's a stalemate.");
        }
    }
    
    public static boolean gameWon(Grid grid)
    {
        return grid.sameHorizontal()
            || grid.sameVertical()
            || grid.sameDiagonal();
    }
}