import java.util.*;
import java.rmi.*;
import java.rmi.server.UnicastRemoteObject;
public class FactorialImplement extends UnicastRemoteObject implements Factorial{
protected FactorialImplement()throws RemoteException{
super();
}
public int fact(int n)throws RemoteException{
int f=1,i;
for (i=1;i<=n;i++)
f=f*i;
return f;
}

}