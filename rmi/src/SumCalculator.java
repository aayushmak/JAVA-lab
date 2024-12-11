import java.rmi.Remote;
import java.rmi.RemoteException;

// Remote interface
public interface SumCalculator extends Remote {
    int add(int a, int b) throws RemoteException;
}
