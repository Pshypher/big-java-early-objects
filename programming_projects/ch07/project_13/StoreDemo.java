import java.util.Scanner;

public class StoreDemo
{
    public static void main(String[] args)
    {
        Store store = new Store();
        
        Scanner in = new Scanner(System.in);
        System.out.print("Enter customer names preceeded by purchase");
        System.out.println(" made by each customer, 0 to quit:");
        
        double price = in.nextDouble();
        while (price != 0)
        {
            String name = in.next();
            store.addSale(name, price);
            price = in.nextDouble();
        }
         
        System.out.printf("Best customer: %s", store.nameOfBestCustomer());
        System.out.println();
        System.out.println("Top 3 customers: " 
            + store.nameOfBestCustomers(3));
    }
}