import java.util.Scanner;

/**
        Sorts the three names entered by a user lexicographically
*/
public class NameSorter
{
        public static void main(String[] args)
        {
                Scanner in = new Scanner(System.in);
                
                System.out.print("Enter three strings: ");
                String names = in.nextLine();
                
                int whitespace = names.indexOf(" ");
                String a = names.substring(0, whitespace);
                names = names.substring(whitespace + 1);
                whitespace = names.indexOf(" ");
                String b = names.substring(0, whitespace);
                names = names.substring(whitespace + 1);
                String c = names;
                
                String temp;
                if (a.compareTo(b) > 0 && b.compareTo(c) > 0)
                {
                        temp = a;
                        a = c;
                        c = temp;
                        
                }
                else if (b.compareTo(a) > 0 && a.compareTo(c) > 0)
                {
                        temp = c;
                        c = b;
                        b = a;
                        a = temp;                               
                }
                else if (b.compareTo(a) < 0 && a.compareTo(c) < 0)
                {
                        temp = a;
                        a = b;
                        b = temp;
                }
                else if (c.compareTo(a) > 0 && a.compareTo(b) > 0)
                {
                        temp = a;
                        a = b;
                        b = temp;
                }
                else if (a.compareTo(b) == 0 && b.compareTo(c) > 0)
                {
                        a = c;
                        c = b;
                }
                else if (a.compareTo(c) == 0 && b.compareTo(c) > 0)
                {
                        c = b;
                        b = a;
                }
                else if (a.compareTo(c) == 0 && b.compareTo(c) < 0)
                {
                        a = b;
                        b = c;
                }
                else    // a.compareTo(b) > 0 && b.compareTo(c) == 0 
                {
                        c = a;
                        a = b;
                }
                System.out.println(a);
                System.out.println(b);
                System.out.println(c);
        }
}