import java.util.Scanner;

/**
        This program reads three numbers and print the largest of the input
*/
public class Maximum
{
        public static void main(String[] args)
        {
                Scanner in = new Scanner(System.in);
                
                System.out.print("Please enter three number: ");
                String numbers = in.nextLine();
                
                // Splits each number in the string seperated by whitespaces
                int whitespace = numbers.indexOf(" ");
                double a = Double.parseDouble(numbers.substring(0, whitespace));
                numbers = numbers.substring(whitespace + 1);
                whitespace = numbers.indexOf(" ");
                double b = Double.parseDouble(numbers.substring(0, whitespace));
                numbers = numbers.substring(whitespace + 1);
                double c = Double.parseDouble(numbers);   
                                
                double maximum;
                if (a > b)
                {
                        maximum = (a > c) ? a : c;
                }
                else
                {
                        maximum = b;
                        maximum = (b > c) ? b : c;
                }
                
                System.out.println("The largest number is " + maximum);
        }
}