package Demo.java;
import java.util.Scanner;

public class Bitwise4 {
	public static void main(String args[]) {
	
		        Scanner sc = new Scanner(System.in);

		        System.out.print("Enter first number (a): ");
		        int a = sc.nextInt();

		        System.out.print("Enter second number (b): ");
		        int b = sc.nextInt();

		        System.out.println("Before swapping: a = " + a + ", b = " + b);
		        a = a ^ b;
		        b = a ^ b;
		        a = a ^ b;

		        System.out.println("After swapping: a = " + a + ", b = " + b);
		    }
		

	}


