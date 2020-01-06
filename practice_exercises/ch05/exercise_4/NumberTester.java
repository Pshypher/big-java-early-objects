import java.util.Scanner;

/**
        This program checks that three numbers entered by a
        user are all the same or all different 
*/
public class NumberTester
{
        public static void main(String[] args)
        {
                Scanner in = new Scanner(System.in);
                
                System.out.print("Please enter a number: ");
                int one = in.nextInt();
                System.out.print("Please enter another number: ");
                int other = in.nextInt();
                System.out.print("Please enter a number: ");
                int another = in.nextInt();
                
                String result;
                if (one == other && other == another)
                {
                        result = "all the same";
                }
                else if (one != other && other != another && one != another)
                {
                        result = "all different";
                }
                else
                {
                        result = "neither";
                }
                System.out.println(result);
        }
}