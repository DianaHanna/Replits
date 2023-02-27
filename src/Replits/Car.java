package Replits;

public class Car {

    String make;
    String model;
    int numberOfDoors;
    int topSpeed;
    double price;

    public void displayMethod() {
        System.out.println(make + " " + model + " " + numberOfDoors + " " + topSpeed + " " + price);
    }

    public Car(String make, String model, int numberOfDoors, int topSpeed, double price) {
        this.make = make;
        this.model = model;
        this.numberOfDoors = numberOfDoors;
        this.topSpeed = topSpeed;
        this.price = price;
    }

    public Car(String make, String model, int topSpeed, double price) {
        this(make, model, 4, topSpeed, price);
    }

    public Car(int numberOfDoors, int topSpeed, double price) {
        this("unknown", "unknown", numberOfDoors, topSpeed, price);
    }

    public Car(String make, String model, int numberOfDoors) {
        this(make, model, numberOfDoors, 90, 0.0);
    }

    public static void main(String[] args) {

        Car car1= new Car("Toyota", "Prius", 4, 120, 30000.0);
        Car car2= new Car("Toyota", "Prius", 120, 30000.0);
        Car car3= new Car(4, 120, 30000.0);
        Car car4= new Car("Toyota", "Prius",4);
        car1.displayMethod();
        car2.displayMethod();
        car3.displayMethod();
        car4.displayMethod();

    }
}
