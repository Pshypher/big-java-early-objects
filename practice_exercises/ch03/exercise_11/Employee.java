/**
        A class used to represent an employee 
*/
public class Employee
{
        private String name;
        private double salary;
        /**
                Construct an object of the Employee class
                @param employeeName the name of an employee
                @param currentSalary the amount an employee earns presently
        */
        public Employee(String employeeName, double currentSalary)
        {
                name = employeeName;
                salary = currentSalary;
        }
        
        /**
                Get the name of an employee
                @return the name of an employee        
        */
        public String getName()
        {
                return name;
        }
        
        /**
                Get the current salary an employee earns
                @return the salary of the employee
        */
        public double getSalary()
        {
                return salary;
        }
        
        
        /**
                Raise the current salary of the employee by a certain percentage
                @param byPercent the percentage by which the current salary of the employee is increased
        */
        public void raiseSalary(double byPercent)
        {
                salary = (1 + byPercent / 100) * salary;
        }
}