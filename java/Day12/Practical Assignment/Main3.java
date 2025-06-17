
abstract class Vehicle {
   
    abstract void start();
}


class Car extends Vehicle {
    @Override
    void start() {
        System.out.println("Car starts with a key ignition ");
    }
}


class Bike extends Vehicle {
    @Override
    void start() {
        System.out.println("Bike starts with a kick or self-start ");
    }
}





public class Main3 {
    public static void main(String[] args) {
        Vehicle myCar = new Car();
        Vehicle myBike = new Bike();

        myCar.start();   
        myBike.start();  
    }
}
