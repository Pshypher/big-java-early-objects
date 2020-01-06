/**
        ProductPrinter tests the Product class
*/
public class ProductPrinter
{
        public static void main(String[] args)
        {
                // Construct a Product and display the name and the price
                Product toaster = new Product("Toaster", 29.95);
                toaster.getName();
                toaster.getPrice();
                
                // Reduce the price of the product
                toaster.reducePrice(5.00);
                System.out.println(toaster.getPrice());
                System.out.println("Expected: 24.95");
        }
}