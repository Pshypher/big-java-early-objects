import java.util.Scanner;

/**
   This program simulates the operations on a vending machine
*/
public class VendingMachineSimulator
{
   public static void main(String[] args)
   {
      final double EPSILON = 1E-14;
      Scanner console = new Scanner(System.in);
       
      VendingMachine vm = new VendingMachine();
      
      Product product = null;
      while (true)
      {
         if (vm.getState() == VendingMachine.START)
         {
            System.out.print("A=Buyer, B=Operator: ");
            String command = console.next();
            if (command.equalsIgnoreCase("A"))
            {
               vm.setUser(VendingMachine.BUYER);
            }
            else if (command.equalsIgnoreCase("B"))
            {
               vm.setUser(VendingMachine.OPERATOR);
            }
            else
            {
               System.out.println("Illegal command!");
            }
         }
         else if (vm.getState() == VendingMachine.PURCHASE)
         {
            String list = vm.getProductSummary();
            if (list == null)
            {
               System.out.println("No product has been added yet");
               vm.back();
               continue;
            }
            else
            {
               System.out.println("Select a product");
               System.out.print(list + "   Q)uit: ");
            }
            
            String command = console.next();
            try
            {
               int choice = Integer.parseInt(command);
               product = vm.selectProduct(choice);
               if (product != null && product.getQuantity() <= 0)
               {
                  System.out.println(product.getDescription() 
                     + " is sold out");
               }
            }
            catch (IllegalArgumentException exception)
            {
               if (command.equalsIgnoreCase("Q"))
               {
                  vm.reset();
               }
               else
               {
                  System.out.println("Illegal command!");
               }
            }
            
         }
         else if (vm.getState() == VendingMachine.PAYMENT)
         {
            double delta = product.getPrice() - vm.getTotalPayment();
            delta = (delta > 0) ? delta : 0;
            
            System.out.println("\nReceived $" + vm.getTotalPayment() + ", $"
                + String.format("%.2f", delta) + " remaining");
                
            System.out.println("Currency denomination\n   A=Dollar,"
               + " B=Quarter, C=Dime, D=Nickel, E=Penny");
            System.out.print("   P)roceed to payment, Q)uit: ");
            
            String command = console.next();
            if (!command.equalsIgnoreCase("P") && 
               !command.equalsIgnoreCase("Q"))
            {
               System.out.print("Enter coin quantity: ");
               int qty = console.nextInt();
               if (command.equalsIgnoreCase("A"))
               {
                  vm.addCoins(VendingMachine.DOLLAR, qty);
               }
               else if (command.equalsIgnoreCase("B"))
               {
                  vm.addCoins(VendingMachine.QUARTER, qty);
               }
               else if (command.equalsIgnoreCase("C"))
               {
                  vm.addCoins(VendingMachine.DIME, qty);
               }
               else if (command.equalsIgnoreCase("D"))
               {
                  vm.addCoins(VendingMachine.NICKEL, qty);
               }
               else if (command.equalsIgnoreCase("E"))
               {
                  vm.addCoins(VendingMachine.PENNY, qty);
               }
               else
               {
                  System.out.println("Illegal command");
               } 
            }
            else if (command.equalsIgnoreCase("P"))
            {
               if (product != null && !vm.removeProduct(product))
               {
                  System.out.println("Insufficient amount.");
               }
               else { vm.back(); }
            }
            else if (command.equalsIgnoreCase("Q"))
            {
               vm.reset();
            }
         }
         else if (vm.getState() == VendingMachine.OPERATE)
         {
            System.out.print("A=Restock, B=Collect, C=Quit: ");
            String command = console.next();
            
            if (command.equalsIgnoreCase("A"))
            {
               console.nextLine();
               System.out.print("Enter product description: ");
               String description = console.nextLine();
               System.out.print("Product price: ");
               double price = console.nextDouble();
               System.out.print("Quantity: ");
               int qty = console.nextInt();
               vm.restock(new Product(description, price, qty));
            }
            else if (command.equalsIgnoreCase("B"))
            {
               vm.removeMoney();
            }
            else if (command.equalsIgnoreCase("C"))
            {
               vm.reset();
            }
            else
            {
               System.out.println("Illegal command!");
            }
         }
      } 
   }
}