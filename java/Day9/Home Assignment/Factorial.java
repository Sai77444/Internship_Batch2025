package Demo.java;

public class Factorial {
	
	    public static void main(String[] args) {
	        for (int i = 1; i <= 5; i++) {
	            int fact = 1; 
	            for (int j = 1; j <= i; j++) {
	                fact *= j;
	            }
	            System.out.println("Factorial of " + i + " is " + fact);
	        }
	    }
	}

