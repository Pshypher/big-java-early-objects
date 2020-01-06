import java.util.Scanner;
/**
        This program reads four integers and prints "two pairs" if the input consists 
        of two matching pairs (in some order) and "not two pairs" otherwise
*/

public class MatchingPairs
{
        public static void main(String[] args)
        {
                Scanner in = new Scanner(System.in);
                
                // All four integers (a,b,c,d) are read from user input
                System.out.print("Please enter a number: ");
                int a = in.nextInt();
                System.out.print("Please enter a number: ");
                int b = in.nextInt();
                System.out.print("Please enter a number: ");
                int c = in.nextInt();
                System.out.print("Please enter a number: ");
                int d = in.nextInt();
                
                String str;
                if (a == b && c == d)
                {
                        str = "two pairs";
                }
                else if (a == c && b == d)
                {
                        str = "two pairs";
                }
                else if (a == d && b == c)
                {
                        str = "two pairs";
                }
                else if (a == b && b == c && c == d)
                {
                        str = "two pairs";
                }
                else
                {
                        str = "not two pairs";
                }
                
                System.out.printf("%d %d %d %d\t%s", 
                        a, b, c, d, str);
                System.out.println();                        
        }
}