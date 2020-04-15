import java.util.Scanner;

public class PetStoreDemo
{
    public static void main(String[] args)
    {
        Invoice invoice = new Invoice();
        
        Scanner in = new Scanner(System.in);
        String prompt = "Price and quantity for an item, -1 to quit: ";
        System.out.print(prompt);
        double price = in.nextDouble();
        while (price > -1)
        {
            int quantity = in.nextInt();
            System.out.print("Is the item a pet (Y or N): ");
            String input = in.next();
            
            boolean isPet;
            if (input.equalsIgnoreCase("Y"))
            {
                isPet = true;
            }
            else
            {
                isPet = false;
            }
            
            Item anItem = new Item(price, isPet, quantity);
            invoice.add(anItem);
            
            System.out.print(prompt);
            price = in.nextDouble();
        }
        System.out.println();
        
        double discount = invoice.getDiscount();
        System.out.printf("Total discount $%.2f\n", discount);
    } 
}