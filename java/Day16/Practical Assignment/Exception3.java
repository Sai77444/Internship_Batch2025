import java.util.*;
public class Exception3 {
    public static void main(String args[]){
Scanner s=new Scanner(System.in);
 System.out.println("Enter1 no");
 int a=s.nextInt();
  System.out.println("Enter2  no");
 int b=s.nextInt();
 int c;
 try {
     c=a/b;
 } catch (Exception e) {
     System.out.println("Cannot divide by zero");

 }
 finally{
     System.out.println("Operation perform Successfully");
 
 }
    }
}
