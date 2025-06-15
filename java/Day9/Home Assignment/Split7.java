package Demo.java;

public class Split7 {


    public static void main(String[] args) {
        String email = "example123@gmail.com";
        String[] parts = email.split("@");
        
        System.out.println("Username: " + parts[0]);
        System.out.println("Domain: " + parts[1]);
    }
}

