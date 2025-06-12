package Demo.java;

public class Split4 {
public static void main(String args[]) {
	   String input = "Hello? How are you? Good!";
       String[] parts = input.split(" ");
       
       for (String part : parts) {
           System.out.println(part);
       }

}
}
