public class Paycheck
{
    private Student student;
    private double wage;
    private int hours;

    
    /**
        Constructor for the paycheck of a student assistant. 
        @param aStudent student assistant assigned to this paycheck
        @param hourlyWage amount earned per hour.
        @param hoursWorked number of hours worked for.
    */
    public Paycheck(Student aStudent, double hourlyWage, int hoursWorked)
    {
        student = aStudent;
        wage = hourlyWage;
        hours = hoursWorked;
    }
    
     /**
        Compute the total amount earned by this student before tax.
        @return total amount earned before tax.
    */
    public double getTotalIncome()
    {
        return wage * hours;
    }
    
    /**
        Calculate the amount earned, deducting the federal and social
        security tax.
        @return amount earned after deducting tax. 
    */
    public double getNetIncome(double tax)
    {
        return getTotalIncome() - tax;
    }
    
    /**
        Get the details of this paycheck put together for a student 
        assistant.
    */
    public String toString()
    {
        double fedTax = TaxReturn.getFederalTax(
            getTotalIncome(), student.getStatus());
        double ssTax = TaxReturn.getSocialSecurityTax(getTotalIncome());                       

        String output = "Gross Income [%s]: $%.2f\nFederal tax: $%.2f";
        output = output + "\nSocial security tax: $%.2f\nNet pay: $%.2f";
        output = String.format(output, student.getName(), getTotalIncome(), 
            fedTax, ssTax, getNetIncome(fedTax + ssTax));
        
        return output;     
    }
}