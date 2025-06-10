package Demo.java;

import java.util.Scanner;

public class zero {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
	        System.out.print("Enter an integer: ");
	        int number = sc.nextInt();

	        if (number == 0) {
	            System.out.println("The number is zero.");
	        } else if (number%2==0) {
	            System.out.println("The number is even.");
	        } else {
	            System.out.println("The number is odd.");
	        }
	    }

	}


