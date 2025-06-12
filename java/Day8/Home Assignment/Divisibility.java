package Demo.java;


	import java.util.Scanner;

	public class Divisibility {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter a number: ");
	        int num = sc.nextInt();
        if (num%5==0) {
        	System.out.println("No is divisible by 5");
        } else {
        	System.out.println("Non is not divisible by 5");
        }
	    }
	}