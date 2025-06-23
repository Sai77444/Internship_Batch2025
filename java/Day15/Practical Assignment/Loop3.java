public class Loop3 {
    public static void main(String args[]) {
        int sum = 0;
        int i = 1; 
        while (i <= 10) {
            System.out.println(i);
            sum += i;
            i++; 
        }

        System.out.println("Sum = " + sum);
    }
}
