/**
        A unit-test for the Employee class
*/
public class EmployeeTester
{
        public static void main(String[] args)
        {
                Employee harry = new Employee("Hacker, Harry", 50000);
                harry.raiseSalary(10);    // Harry gets a 10 percent raise
                
                System.out.print("name: ");
                System.out.println(harry.getName());
                System.out.print("salary after raise: ");
                System.out.println(harry.getSalary());
                System.out.println("expected: 55000");
        }
}