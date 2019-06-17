import java.rmi.Remote;
import java.rmi.RemoteException;
public interface Factorial extends Remote{
public int fact(int n)throws RemoteException;

}