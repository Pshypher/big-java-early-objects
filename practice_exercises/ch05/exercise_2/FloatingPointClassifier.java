import java.util.Scanner;

/**
        Floating-point numbers are entered by users and the program determines the
        magnitude and sign of the number
*/
public class FloatingPointClassifier
{
        public static void main(String[] args)
        {
                // Constant(s)
                final double EPSILON = 1E-14;
                
                Scanner in = new Scanner(System.in);
                
                System.out.print("Please enter a float point number: ");
                double number = in.nextDouble();
                
                String sign;
                String result;
                if (Math.abs(number) <= EPSILON)
                {
                        result = number + " is approximately zero";
                }
                else if (Math.abs(number) < 1)
                {
                        sign = (number < 0) ? "negative" : "positive"; 
                        result = number + " is a small " + sign
                                + " floating point number.";
                }
                else if (Math.abs(number) < 1000000)
                {
                        sign = (number < 0) ? "negative" : "positive";
                        result = number +  " is a " + sign + 
                                " floating point number.";
                }
                else
                {
                        sign = (number < 0) ? "negative" : "positive";
                        result = number + " is a large " + sign
                                + " floating point number.";

                }
                System.out.println(result);
        }
}