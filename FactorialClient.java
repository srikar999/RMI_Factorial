import java.util.*;
import java.io.*;
import java.rmi.Naming;
public class FactorialClient{
public static void main(String[] args){
DataInputStream in=new DataInputStream(System.in);
try{
Factorial f=(Factorial)Naming.lookup("ff");
System.out.println("FACTORIAL CALCULATION");
System.out.println("Enter n:");
int n=Integer.parseInt(in.readLine());

int nF=f.fact(n);
System.out.println("Factorial value of given number:"+nF);

}
catch(Exception e){
System.out.println("error:"+e);
}
}
}
