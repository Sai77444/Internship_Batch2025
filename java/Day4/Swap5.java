package Demo.java;

public class Swap5 {

	public static void main(String[] args) {
		int a,b,c;
		a=23;
		b=32;
		System.out.print("Before swapping:");
		System.out.println("A="+a);
		System.out.println("B="+b);
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("After Swapping");
		System.out.println("A="+a);
		System.out.println("B="+b);

	}

}
