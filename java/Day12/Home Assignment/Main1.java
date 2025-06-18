class Calculator {
    
    int add(int a, int b) {
        return a + b;
    }

    
    double add(double a, double b) {
        return a + b;
    }

    
    int add(int a, int b, int c) {
        return a + b + c;
    }

    
    double add(int a, double b) {
        return a + b;
    }

    
    double add(double a, int b) {
        return a + b;
    }
}


public class Main1 {
    public static void main(String[] args) {
        Calculator calc = new Calculator();

         System.out.println("Add int: " + calc.add(5, 10));
        System.out.println("Add double: " + calc.add(2.5, 4.3));
        System.out.println("Add 3 ints: " + calc.add(1, 2, 3));
       

    
}
}
