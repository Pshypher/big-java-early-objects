import java.util.Scanner;

/**
        This program simulates an Automated Teller Machine alongside a bank card where a
        user with the aid of a personal identification number (PIN) accesses his account
*/
public class ATM
{
        public static void main(String[] args)
        {
                final int PIN = 1234;
                final int MAXIMUM_NUMBER_OF_ATTEMPTS = 3;
                
                Scanner in = new Scanner(System.in);
                
                System.out.print("Enter your PIN: ");
                int pin = in.nextInt();
                
                String output;
                if (pin == PIN)
                        output = "Your PIN is correct";
                else
                {
                        System.out.println("Your PIN is incorrect");
                        System.out.print("Enter your PIN: ");
                        pin = in.nextInt();
                        
                        if (pin == PIN)
                                output = "Your PIN is correct";
                        else
                        {
                                System.out.println("Your PIN is incorrect");
                                System.out.print("Enter your PIN: ");
                                pin = in.nextInt();
                                
                                if (pin == PIN)
                                        output = "Your PIN is correct";
                                else
                                {
                                        output = "Your bank card is blocked";
                                }                    
                        }                                
                }
                System.out.println(output);
        }
}