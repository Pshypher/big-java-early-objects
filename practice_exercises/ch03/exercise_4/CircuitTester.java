/**
        A unit-test for a Circuit class
*/
public class CircuitTester
{
        public static void main(String[] args)
        {
                // Construct a Circuit object
                Circuit circuit = new Circuit();
                
                System.out.print("actual lamp state: ");
                System.out.println(circuit.getLampState());
                System.out.println("expected lamp state: 0");
                
                System.out.print("actual state of the first switch: ");
                System.out.println(circuit.getFirstSwitchState());
                System.out.println("expected state of the first switch: 0");
                
                System.out.print("actual state of the second switch: ");
                System.out.println(circuit.getSecondSwitchState());
                System.out.println("expected state of the second switch: 0");
                
                // Toggle the states of the first and second switch
                circuit.toggleFirstSwitch();
                
                System.out.print("actual lamp state: ");
                System.out.println(circuit.getLampState());
                System.out.println("expected lamp state: 1");
                
                System.out.print("actual state of the first switch: ");
                System.out.println(circuit.getFirstSwitchState());
                System.out.println("expected state of the first switch: 1");
                
                circuit.toggleSecondSwitch();
                
                System.out.print("actual lamp state: ");
                System.out.println(circuit.getLampState());
                System.out.println("expected lamp state: 0"); 

                System.out.print("actual state of the second switch: ");
                System.out.println(circuit.getSecondSwitchState());
                System.out.println("expected state of the second switch: 1");  
         }
}