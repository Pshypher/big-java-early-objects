import java.util.Scanner;

/**
        This program awards coupons depending on how much
        a customer spends on groceries
*/
public class Coupon
{
        public static void main(String[] args)
        {
                // Constants
                final double COUPON_PERCENTAGE1 = 8;
                final double COUPON_PERCENTAGE2 = 10;
                final double COUPON_PERCENTAGE3 = 12;
                final double COUPON_PERCENTAGE4 = 14;
                final double PERCENT = 100;
                
                final double NET_SPEND_LIMIT1 = 10;
                final double NET_SPEND_LIMIT2 = 60;
                final double NET_SPEND_LIMIT3 = 150;
                final double NET_SPEND_LIMIT4 = 210;
                
                Scanner in = new Scanner(System.in);
                
                System.out.print("Please enter the cost of your groceries: ");
                double amount = in.nextDouble();
                
                double rate;
                if (amount > NET_SPEND_LIMIT4)
                {
                        rate = COUPON_PERCENTAGE4 / PERCENT; 
                }
                else if (amount > NET_SPEND_LIMIT3)
                {
                        rate = COUPON_PERCENTAGE3 / PERCENT;
                }
                else if (amount > NET_SPEND_LIMIT2)
                {
                        rate = COUPON_PERCENTAGE2 / PERCENT;
                }
                else if (amount >= NET_SPEND_LIMIT1)
                {
                        rate = COUPON_PERCENTAGE1 / PERCENT;
                }
                else
                {
                        rate = 0;
                }
                double discount = amount  * rate;
                int percent = (int) (rate * PERCENT);
                
                System.out.printf("You win a discount coupon of $%.2f.", discount);
                System.out.println(" (" + percent + "% of your purchase)");
        }
}