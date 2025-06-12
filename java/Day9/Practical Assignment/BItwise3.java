package Demo.java;
import java.util.*;
public class BItwise3 {
public static void main(String args[]) {
	  Scanner sc = new Scanner(System.in);

      System.out.print("Enter age: ");
      int age = sc.nextInt();

     
      if ((age == 60) | (age>60)) {
          System.out.println("The person is  a senior citizen.");
      } else if(age ==12 | (age<12)){
          System.out.println("The person is a child.");
      }else {
    	  System.out.println("The person is a adult.");
      }
	}
}
