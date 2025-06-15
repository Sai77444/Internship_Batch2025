
    class Animal {
    void sound() {
        System.out.println("Animals make different sounds.");
    }
}

class Dog extends Animal {
    void bark() {
        // Calling parent class method using super
        super.sound();
        System.out.println("Dog barks: Woof Woof!");
    }
}
 
public class Main {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.bark();  // This will call both the parent method and child method
    }
}
 

    

