package Demo.java;
import java.util.*;
public class Rel {

	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("Enter 1 no");
	int a=s.nextInt();
	System.out.println("Enter 2 no");
	int b=s.nextInt();
	if(a>b) {
		System.out.print("A is greater");
	}else if(a==b) {
		System.out.print(" Both are equal");
	}else {
		System.out.print("B is greater");
	}
        
	}

}
