package Demo.java;
import java.util.*;
public class Avg {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double num1 = input.nextDouble();

        System.out.print("Enter second number: ");
        double num2 = input.nextDouble();

        System.out.print("Enter third number: ");
        double num3 = input.nextDouble();

        double average = (num1 + num2 + num3) / 3;

        System.out.println("Average of the three numbers is: " + average);
	}

}
