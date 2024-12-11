import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

// Implementation of the remote interface
public class SumCalculatorImpl extends UnicastRemoteObject implements SumCalculator {
    protected SumCalculatorImpl() throws RemoteException {
        super();
    }

    @Override
    public int add(int a, int b) throws RemoteException {
        return a + b;
    }
}
