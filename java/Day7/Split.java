package Demo.java;

public class Split {

	public static void main(String[] args) {
	String s="My, name, is ,Sai";
	String[] details = s.split(",");
	for(String detail:details) {
		System.out.println(detail);
	}


	}

}
