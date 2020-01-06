import java.util.Arrays;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class TheatreSeatsBooker
{
    public static final int ROWS =   9;
    public static final int COLUMNS = 10;

    public static void main(String[] args)
    {        
        int[][] seats = new int[ROWS][COLUMNS];
        
        Scanner in = new Scanner(System.in);
        fill(seats, in);
       
        boolean done = false;        
        while (!done)
        {   
            String input;
            System.out.print("Enter 's' to book seat,'p' to book by price: ");
            do 
            {
                input = in.next();
            }
            while(!(input.equalsIgnoreCase("s") 
                || input.equalsIgnoreCase("p")));
            
        
            if (input.equalsIgnoreCase("s"))
            {
                bookBySeat(seats, in);       
            }
            else
            {
                bookByPrice(seats, in);  
            }
            
            System.out.print("Book more seats? (Y or N): ");
            String response = in.next();
            if (response.equalsIgnoreCase("N")) { done = true; }
        }
        System.out.println();
        display(seats);
    }
    
    public static void fill(int[][] seats, Scanner in)
    {
        int total = 0;
        System.out.println("Enter ticket prices per seat, Q to quit: ");
        while (in.hasNextInt())
        {
            if (!(total < ROWS * COLUMNS))
            {
                System.out.println("No more ticket prices can be added.");
                return;
            }
            int row = total / COLUMNS;
            int col = total % COLUMNS;
            seats[row][col] = in.nextInt();
            total++;
        }        
    }
    
    public static void bookBySeat(int[][] seats, Scanner in)
    {
        int row;
        int column;
        do 
        {
            System.out.print("Row (1 - 9): ");
            row = in.nextInt() - 1;
            System.out.print("Column (1 - 10): ");
            column = in.nextInt() - 1;
            if (row >= ROWS || column >= COLUMNS) 
            {   
                String out = "Position not within theatre's seating seats";
                System.out.println(out);
            }
        }
        while (row >= ROWS || column >= COLUMNS);
            
        if (seats[row][column] != 0)
        {
            System.out.printf("Cost of seat is $%d", seats[row][column]);
            System.out.println();                    
            seats[row][column] = 0;     
        }
        else
        {
            System.out.println("Seat has already been booked.");
        }
    }
    
    public static void bookByPrice(int[][] seats, Scanner in)
    {
        double price;
        double cost;
        double change;
        do 
        {
            System.out.print("Cost of seat between $10 - $50: ");
            price = in.nextDouble();
            cost = Math.floor(price / 10) * 10;
            change = price - cost;
            if (10 > price || price >= 60)
            {
                System.out.println("Price should be between $10 - $50");
            }
        }
        while (10 > price || price >= 60);
        
        Position s = position(cost, seats);
                    
        if (s.getRow() < 0 || s.getColumn() < 0)
        {
            System.out.printf("$%.2f seats have all been booked",
                cost);
            System.out.println();                             
        }
        else
        {
            System.out.printf("Booked seat at " + s);
            System.out.println();
            System.out.printf("Paid $%.2f\n", price);
            System.out.printf("Change $%.2f\n", change);
            
        }
    }
    
    public static Position position(double cost, int[][] seats)
    {
        // find a random seat in the seating chart
        // with the same price as the specified cost
        ArrayList<Position> choices = new ArrayList<Position>();
        Random generator = new Random();
        for (int j = 0; j < seats[0].length; j++)
        {
            for (int i = 0; i < seats.length; i++)
            {
                if (seats[i][j] == cost)
                {
                    choices.add(new Position(i, j));
                } 
            }
        }
        
        if (choices.size() > 0)
        {
            Position s = choices.get(generator.nextInt(choices.size()));
            int col = s.getColumn();
            int row = s.getRow();
            seats[row][col] = 0;
            return s;
        }
        else
        {
            return new Position(-1, -1);
        }
    }
    
    public static void display(int[][] seats)
    {
        for (int[] row : seats)
        {
            for (int j = 0; j < row.length; j++)
            {
                if (j > 0)
                {
                    System.out.print(", ");
                }
                System.out.print(row[j]);
                
            }
            System.out.println();
        }
    }          
}