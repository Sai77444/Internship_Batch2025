package Demo.java;


	import java.util.Scanner;

	public class Month{
		public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
		System.out.print("Enter no");
		int a=s.nextInt();
		switch(a) {
			case 1:
				System.out.print("January");
				break;
			case 2:
				System.out.print("February");
				break;
			case 3:
				System.out.print("MArch");
				break;
			case 4:
				System.out.print("April");
				break;
			case 5:
				System.out.print("MAy");
				break;
			case 6 :
				System.out.print("June");
				break;
		
			case 7:
				System.out.print("July");
				break;
			case 8:
				System.out.print("August");
				break;
			case 9:
				System.out.print("September");
				break;
			case 10:
				System.out.print("Octomber");
				break;
			case 11 :
				System.out.print("November");
				break;
			case 12:
				System.out.print("December");
				break;
				default:
					System.out.print("Invalid Month No");
					break;
		}
		}
}
