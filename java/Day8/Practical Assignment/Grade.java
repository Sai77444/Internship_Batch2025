package Demo.java;

import java.util.Scanner;

public class Grade {

	
	public static void main(String args[]) {
	Scanner s=new Scanner(System.in);
	System.out.print("Enter Grade");
	String  a=s.nextLine();
	switch(a) {
		case "a":
			System.out.print("Excellent");
			break;
		case "b":
			System.out.print("Good");
			break;
		case "c":
			System.out.print("average");
			break;
		case "d":
			System.out.print("poor");
			break;
		case "e":
			System.out.print("FAil");
			break;
		
			default:
				System.out.print("Invalid Grade");
				break;
	}
	}

}

