import java.util.ArrayList;
import java.util.Scanner;

public class PaycheckPrinter
{
    public static void main(String[] args)
    {
        ArrayList<Paycheck> paychecks = new ArrayList<Paycheck>();
        
        Scanner in = new Scanner(System.in);
        String name;
        System.out.print("Enter name of student, Q to quit: ");
        while (!(name = in.next()).equalsIgnoreCase("Q"))
        {
            System.out.print("Hourly wage: ");
            double wage = in.nextDouble();
            System.out.print("Hours worked per year: ");
            int hours = in.nextInt();
            
            System.out.print("Is married (y-yes, n-no)? ");
            String aStatus = in.next();
            Student asst;
            if (aStatus.equalsIgnoreCase("y"))
            {
                asst = new Student(name, Student.MARRIED);  
            }
            else
            {
                asst = new Student(name, Student.SINGLE);
            }
            
            System.out.println();
            
            Paycheck p = new Paycheck(asst, wage, hours);
            paychecks.add(p);
            System.out.print("Enter name of student, Q to quit: ");
        }
        
        System.out.println();
        for (Paycheck p : paychecks)
        {
            System.out.println(p);
            System.out.println();
        }
    }
}