package ch10.exercise_1;

/**
    This program demonstrates the measurable BankAccount and Country classes.
*/
public class MeasurableTester
{
    public static void main(String[] args)
    {
        // Calling the average method with an array of BankAccount objects
        Measurable[] accounts = new Measurable[3];
        accounts[0] = new BankAccount(0);
        accounts[1] = new BankAccount(10000);
        accounts[2] = new BankAccount(2000);

        double averageBalance = Data.average(accounts);
        System.out.println("Average balance: " + averageBalance);
        System.out.println("Expected: 4000");
        
        Measurable meas = Data.max(accounts);
        BankAccount account = (BankAccount) meas;
        double balance = account.getBalance();
        System.out.println("Largest balance: " + balance);
        System.out.println("Expected: 10000");

        // Calling the average method with an array of Country objects
        Measurable[] countries = new Measurable[3];
        countries[0] = new Country("Uruguay", 176220);
        countries[1] = new Country("Thailand", 513120);
        countries[2] = new Country("Belgium", 30510);

        double averageArea = Data.average(countries);
        System.out.println("Average area: " + averageArea);
        System.out.println("Expected: 239950");
        
        meas = Data.max(countries);
        Country country = (Country) meas;
        double area = country.getArea();
        System.out.println("Largest area: " + area);
        System.out.println("Expected: 513120");
    }
}
