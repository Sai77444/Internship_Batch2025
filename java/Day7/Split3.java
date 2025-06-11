package Demo.java;

public class Split3 {
	
	    public static void main(String[] args) {
	        String input = "Hello? How are you? Good!";
	        String[] parts = input.split("\\?\\s*");
	        
	        for (String part : parts) {
	            System.out.println(part);
	        }
	    }
	}


