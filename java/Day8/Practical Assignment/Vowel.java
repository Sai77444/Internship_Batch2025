package Demo.java;
import java.util.Scanner;
public class Vowel {
	

	
		public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
		System.out.print("Enter Alphabet");
		String  a=s.nextLine();
		switch(a) {
			case "a":
				System.out.print("Vowel");
				break;
			case "e":
				System.out.print("Vowel");
				break;
			case "i":
				System.out.print("Vowel");
				break;
			case "o":
				System.out.print("Vowel");
				break;
			case "u":
				System.out.print("Vowel");
				break;
			
				default:
					System.out.print("Consonant");
					break;
		}
		}

}
