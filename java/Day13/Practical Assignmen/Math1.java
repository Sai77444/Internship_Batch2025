// File: SqrtAndPowDemo.java

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class Math1 {
    public static void main(String[] args) {
        double number = 25.0;
        double base = 2.0;
        double exponent = 5.0;


        double root = sqrt(number);

       
        double power = pow(base, exponent);

        System.out.println("Square root of " + number + " is: " + root);
        System.out.println(base + " raised to the power of " + exponent + " is: " + power);
    }
}
