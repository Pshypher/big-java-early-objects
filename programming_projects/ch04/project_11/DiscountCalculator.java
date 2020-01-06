import java.util.Scanner;

/**
        This program applies a discount to members of a video club based on
        the number of movies rented and the number of new members referred
*/
public class DiscountCalculator
{
        public static void main(String[] args)
        {
                // Construct an object of the Scanner class
                Scanner in = new Scanner(System.in);
                
                System.out.print("Enter the number of movie rentals: ");
                int moviesRented = in.nextInt();
                System.out.print("Enter the number of members referred to the video club: ");
                int membersReferred = in.nextInt();
                
                double discount = Math.min(moviesRented + membersReferred, 75);
                
                System.out.printf("The discount is equal to: %8.2f percent.", discount);
        }
}