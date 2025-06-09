package Demo.java;
import java.util.*;
public class Bitwise1{

	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("Enter 1 no");
	int a=s.nextInt();
	System.out.println("Enter 2 no");
	int b=s.nextInt();
	System.out.println("And   "+(a&b));
	System.out.println("OR   "+(a|b));
	System.out.println("XOR  "+(a^b));
	}

}
