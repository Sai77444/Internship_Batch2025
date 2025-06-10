package Demo.java;
import java.util.*;
public class Split2 {

	public static void main(String[] args) {
Scanner s=new Scanner(System.in);
                  System.out.println("Enter Senetence");
                  String sc =s.nextLine(); 
		
		String[] details = sc.split(",");
		for(String detail:details) {
			System.out.println(detail);
		}

	}

}
