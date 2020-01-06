import java.util.Scanner;

/**
        This program uses an algorithm invented by Carl Friedrich Gauss compute
        the date on which Easter Sunday falls 
*/
public class EasterSunday
{
        public static void main(String[] args)
        {
                int a, b, c, d, e, g, h, j, k, m, n, p, r;
                // Construct an object of the Scanner class
                Scanner in = new Scanner(System.in);
                
                System.out.print("Please enter a year (e.g. 1800 or 2001): ");
                int year = in.nextInt();
                
                a = year % 19;
                b = year / 100;
                c = year % 100;
                d = b / 4;
                e = b % 4;
                g = (8 * b + 13) / 25;
                h = (19 * a + b - d - g + 15) % 30;
                j = c / 4;
                k = c % 4;
                m = (a + 11 * h) / 319;
                r = (2 * e + 2 * j - k - h + m + 32) % 7;
                n = (h - m + r + 90) / 25;
                p = (h - m + r + n + 19) % 32;
                
                // Display the result
                System.out.printf("Easter Sunday falls on %02d-%02d-%4d\n", p, n, year);
        }
}