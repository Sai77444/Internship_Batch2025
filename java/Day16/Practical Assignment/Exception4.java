public class Exception4 {
    public static void main(String[] args) {
        try {
            int[] numbers = {1, 2, 3};
            int result = 10 / 0;
            System.out.println(numbers[5]);
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException occurred: " + e.getMessage());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException occurred: " + e.getMessage());
        } finally {
            System.out.println("Closing the program.");
        }
    }
}
