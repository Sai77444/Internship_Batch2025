package Demo.java;

import java.util.Scanner;

public class Traffic{
	public static void main(String args[]) {
	Scanner s=new Scanner(System.in);
	System.out.print("Enter color");
	String a=s.nextLine();
	switch(a) {
		case "Red":
			System.out.print("Stop");
			break;
		case "Green":
			System.out.print("GO");
			break;
		case "Yellow":
			System.out.print("Ready");
			break;
			default:
				System.out.println("Invalid Color");
				break;
				
	}
}
}