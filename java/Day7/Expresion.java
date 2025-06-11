package Demo.java;
import java.util.*;
public class Expresion {

	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("Enter a,b,c,d and e");
	int a=s.nextInt();
	int b=s.nextInt();
	int c=s.nextInt();
	int d=s.nextInt();
	int e=s.nextInt();
    int result=(a + b) * (c - d) / e;
    System.out.println("Result"+result);
	}

}
