package Demo.java;
import java.util.*;
public class Age {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = input.nextInt();

        if (age >= 18 && age <= 120) {
            System.out.println("You are eligible to vote.");
        } else if (age < 18 && age > 0) {
            System.out.println("You are not eligible to vote.");
        } else {
            System.out.println("Invalid age entered.");

	}

}
}
