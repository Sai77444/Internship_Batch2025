package Demo.java;

class sai{
    String name;
    int age;

    public sai(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

class Employee11 extends sai {
    double salary;

    public Employee11(String name, int age, double salary) {
        super(name, age); 
        this.salary = salary;
    }

    void Display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Salary: " + salary);
    }
}
    public class Inheritance1 {
    public static void main(String args[]) {
        Employee11 e = new Employee11("Sai", 18, 40000);
        e.Display();
    }
}
