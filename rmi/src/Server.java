import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;

public class Server {
    public static void main(String[] args) {
        try {
            // Create and export the remote object
            SumCalculatorImpl obj = new SumCalculatorImpl();

            // Create and bind the registry
            LocateRegistry.createRegistry(1099);
            Naming.rebind("SumCalculator", obj);

            System.out.println("Server is ready.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
