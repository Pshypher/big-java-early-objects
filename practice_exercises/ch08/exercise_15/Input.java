import java.util.Scanner;

public class Input
{
    /**
        Reads and integer between a minimum and a maximum value.
        @param in Scanner object used to read input.
        @param prompt the message displayed on the console for the
        user of the program.
        @param error message displayed when illegal input values
        are entered.
        @param min the smallest value the integer entered can be.
        @param max the largest value the integer input can assume.
        @return the entered integer value.
    */
    public static int readInt(
        Scanner in, String prompt, String error, int min, int max)
    {
        int input;
        do
        {
            System.out.print(prompt);
            input = in.nextInt();
            if (input < min || input > max)
            {
                System.out.print(error);
            }
        }
        while (input < min || input > max);
        
        return input;
    }        
               
}