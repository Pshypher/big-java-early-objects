import java.util.Scanner;

/**
        This program calculates the price of an order from the total price
        and the number of the books that were ordered
*/

public class BookStore
{
        public static void main(String[] args)
        {
                final double PERCENT_TAX = 7.5;
                final double CHARGE_PER_BOOK = 2;
                       
                // Construct an object of the Scanner class
                Scanner in = new Scanner(System.in);
                
                System.out.print("Enter the total book price: ");
                double priceOfBooks = in.nextDouble();
                System.out.print("Enter the number of books ordered: ");
                int quantity = in.nextInt();
                
                double tax = priceOfBooks * PERCENT_TAX / 100;
                double shippingCost = CHARGE_PER_BOOK * quantity;
                double totalCostOfOrder = priceOfBooks + tax + shippingCost;
                
                System.out.printf("The total cost for %d book(s) ordered: %.2f\n", 
                        quantity, totalCostOfOrder);    
        }
}