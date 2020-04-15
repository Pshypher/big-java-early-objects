/**
        A unit-test for the Car class
*/
public class CarTester
{
        public static void main(String[] args)
        {
                // Constructs a Car object, adds some gas and drives a certain distance 
                Car myHybrid = new Car(0.047);    // 0.047 liters per km
                myHybrid.addGas(75.8);     // Tank 75.8 liters
                myHybrid.drive(161);    // Drive 161 kilometers
                
                System.out.print("Actual: ");
                System.out.println(myHybrid.getGasInTank());
                System.out.println("Expected: 68.233");    // 68.233 liters of gas left in the tank
                
                // Add some more gas and drive 805 km further
                myHybrid.addGas(11.37);
                myHybrid.drive(805);
                
                System.out.print("Gas Left: ");
                System.out.println(myHybrid.getGasInTank());
                System.out.println("Expected:  41.768");    // 41.768 liters of gas left in the tank
        }
}