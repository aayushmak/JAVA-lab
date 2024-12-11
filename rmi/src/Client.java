import java.rmi.Naming;

public class Client {
    public static void main(String[] args) {
        try {
            // Lookup the remote object
            SumCalculator calculator = (SumCalculator) Naming.lookup("rmi://localhost/SumCalculator");

            // Invoke the remote method
            int result = calculator.add(10, 20);
            System.out.println("The sum is: " + result);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
