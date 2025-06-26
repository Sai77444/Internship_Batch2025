import java.util.Scanner;

public class Excep1 {
    public static void main(String[] args) {
        int[] numbers = {5, 10, 15, 20, 25};
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter an index (0 to 4): ");
            int index = scanner.nextInt();
            System.out.println("Value at index " + index + " is: " + numbers[index]);
        } catch (Exception e) {
            System.out.println("Invalid input or index. Please try again.");
        } finally {
            System.out.println("Program ended.");
            scanner.close();
        }
    }
}
