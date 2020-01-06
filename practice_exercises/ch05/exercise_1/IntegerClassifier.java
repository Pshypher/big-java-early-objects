import java.util.Scanner;
/**
        This program determines if the integer entered by the user is
        positive, zero or negative 
*/
public class IntegerClassifier
{
        public static void main(String[] args)
        {
                Scanner in = new Scanner(System.in);
                
                System.out.print("Please an integer: ");
                int integer = in.nextInt();
                
                String type; 
                if (integer < 0)
                {
                        type = "negative";
                }
                else if (integer > 0)
                {
                        type = "positive";
                }
                else
                {
                        type = "zero";
                }
                System.out.printf("%d is %s\n", integer, type); 
        }
}