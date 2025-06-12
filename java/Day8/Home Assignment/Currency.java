package Demo.java;


	import java.util.Scanner;

	public class Currency{
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	   	        System.out.print("Enter currency code (INR, USD, EUR, GBP): ");
	        String code = sc.nextLine();
       switch(code) {
       case "INR":
    	   System.out.println("Currency Symbol  ₹");
    	   break;
       case "USD":
    	   System.out.println("Currency Symbol   $");
    	   break;

       case "EUR":
    	   System.out.println(" Currency Symbol €");
    	   break;

       case "GDP":
    	   System.out.println(" Currency Symbol £");
    	   break;

       default :
    	   System.out.println("Invalid Currency Symbol");
    	   break;

       }
	    }
	}
