package Demo.java;
import java.util.*;
public class Bitwise2 {

	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	
	System.out.println("Enter 1 no");
	int a=s.nextInt();

	System.out.println( "Logical SHift Left =  " +(a<<2));
	System.out.println( "Logical Shift Right =  " +(a>>2));
	System.out.println("Unsigned Right  =  " +(a>>>2));
	}

}
