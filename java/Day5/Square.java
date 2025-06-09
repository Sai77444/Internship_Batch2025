package Demo.java;

import java.util.Scanner;

public class Square {

	public static void main(String[] args) {
		 Scanner input = new Scanner(System.in);
	        System.out.print("Enter a number: ");
	        int number = input.nextInt();

	        int square = number * number;
	        int cube = number * number * number;

	        System.out.println("Square of " + number + " is: " + square);
	        System.out.println("Cube of " + number + " is: " + cube);
	}

}
