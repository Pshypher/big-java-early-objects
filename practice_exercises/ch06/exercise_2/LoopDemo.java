import java.util.Scanner;

/**
    This program demonstrates several repeated tasks 
    with loops.
*/
public class LoopDemo
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int total = 0;
        
        // sum of even numbers between 2 and 100
        for (int i = 2; i <= 100; i = i + 2)
        {
            total = total + i;
        }
        System.out.println(total);
        
        // sum of squares between 1 and 100
        total = 0;
        for (int i = 1; i * i <= 100; i++)
        {
            total = total + i * i;
        }
        System.out.println(total);
        
        // sum of powers of 2 from 2^0 to 2^20
        total = 0;
        for (int i = 0; i < 20; i++)
        {
            total = (int) (total + Math.pow(2, i));
        }
        System.out.println(total);
        
        // sum of all odd numbers from a and b
        total = 0;
        
        System.out.print("From: ");
        int a = in.nextInt();
        System.out.print("To: ");
        int b = in.nextInt();
        
        for (int i = a; i <= b; i++)
        {
            if (i % 2 == 0) { continue; }
            total = total + i; 
        }
        System.out.println(total);
        
        // sum of odd digits of an input
        total = 0;
        System.out.print("Enter a number: ");
        int input = in.nextInt();
        
        while (input > 0)
        {
            int digit = input % 10;
            input = input / 10;
            if (digit % 2 == 1) { total = total + digit; }
        }
        System.out.println(total);
    }
}