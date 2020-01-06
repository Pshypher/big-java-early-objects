import java.util.Scanner;

/**
        This program displays the integers entered by a user also 
        printing out whether or not they are in the right order
*/
public class OrderAnalyzer
{
        public static void main(String[] args)
        {
                Scanner in = new Scanner(System.in);
                
                System.out.print("Please enter an integer: ");
                int one = in.nextInt();
                System.out.print("Please enter another integer: ");
                int another = in.nextInt();
                System.out.print("Please enter third integer: ");
                int other = in.nextInt();
                
                String result;
                if (one >= another && another >= other)
                {
                        result = "\tin order";  
                }
                else if (one <= another && another <= other)
                {
                        result = "\tin order";
                }
                else
                {
                        result = "\tnot in order";
                }
                System.out.printf("%d %d %d" + result, 
                        one, another, other);
        }
}