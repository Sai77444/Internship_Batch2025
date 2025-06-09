package Demo.java;
import java.util.Scanner;

public class Toggle {

	public static void main(String[] args) {
		
		        Scanner sc = new Scanner(System.in);
		        System.out.print("Enter an integer: ");
		        int number = sc.nextInt();

		        int toggledNumber = number ^ 1;  
		        System.out.println("Number after toggling last bit: " + toggledNumber);
		    


	}

}
