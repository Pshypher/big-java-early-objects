import java.util.Scanner;

/**
      This program determines which if either an hybrid vehicle or a non-hybrid
      car is cheaper after a five year duration at 15000 miles per annum
*/ 

public class Expenditure
{
   public static void main(String[] args)
   {
      // Prices are in U.S dollars
      final double GAS_COST = 2.05;
      final double MILES_PER_ANNUM = 15000;
      final int YEARS = 5;
      
      // Construct new object of the Scanner class
      Scanner in = new Scanner(System.in);
                    
      // User is prompted for details of a normal non-hybrid car
      System.out.print("Enter the cost of car: ");
      double carCost = in.nextDouble();
      System.out.print("Enter the fuel economy of the car: ");
      double carFuelEconomy = in.nextDouble();
      System.out.print("Enter resale value for the car after 5 years: ");
      double carResaleValue = in.nextDouble();
      
      double gallonsPerAnnum = MILES_PER_ANNUM / carFuelEconomy;
      double gasConsumedBeforeSale = gallonsPerAnnum * YEARS;
      double carExpensesBeforeSale = carCost + gasConsumedBeforeSale * GAS_COST;
      double carExpensesAfterSale = carExpensesBeforeSale - carResaleValue;
      
      System.out.printf("Total cost accrued for a period of %d years: %8.2f\n", 
         YEARS, carExpensesAfterSale); 
   }
}