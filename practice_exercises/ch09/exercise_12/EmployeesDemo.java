public class EmployeesDemo
{
    public static void main(String[] args)
    {
        Employee employee = new Employee();
        employee.setName("Doe, John");
        employee.setSalary(17575.99);
        Manager manager = new Manager("Doe, Jane", 23549.99);
        manager.setDepartment("Research & Development");
        Executive executive = new Executive("Liz, Sanders", 37689.69, "Logistics");
        
        System.out.println(employee);
        System.out.println(manager);
        System.out.println(executive);
    }
}