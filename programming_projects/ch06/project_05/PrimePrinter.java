import java.util.Scanner;

/**
    This program reads an integer and displays all the
    primes up to and including integer
*/
public class PrimePrinter
{
    public static void main(String[] args)
    {
        PrimeGenerator generator = new PrimeGenerator();
    
        Scanner in = new Scanner(System.in);    
        System.out.print("Primes up until (an int): ");
        int threshold = in.nextInt();
        
        int prime = generator.nextPrime();
        while (prime <= threshold)
        {
            System.out.println(prime);
            prime = generator.nextPrime();
        }
    }
}