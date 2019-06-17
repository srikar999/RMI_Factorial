import java.rmi.Naming;
public class FactorialServer{
FactorialServer(){
try{
Factorial f=new FactorialImplement();
Naming.rebind("ff",f);
}
catch(Exception e){
e.printStackTrace();
}
}
public static void main(String args[]){
new FactorialServer();
}
}