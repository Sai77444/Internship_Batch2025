import java.io.*;

public class Excep3{
    public static void main(String[] args) {
        try {
            FileReader file = new FileReader("SAI.txt");
            System.out.println("File opened successfully.");
        } catch (IOException e) {
            System.out.println("File not found or error reading the file.");
        }
    }
}
