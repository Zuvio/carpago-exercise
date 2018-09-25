package nl.acme.carcase;

import nl.acme.carcase.domain.Car;

import java.util.ArrayList;

public class CarApp {
    public static void main(String[] args) {
        Car car1 = new Car("AA-BB-CC");
        Car car2 = new Car("AA-BB-CC",37000.00);
        System.out.println("Car 1 object: "+car1);
        System.out.println("Car 2 object: "+car2);

        car1.setPrice(25000.00);
        car1.setLicencePlate("AA-BB-CC");
        System.out.println("Car 1 toString: "+car1.toString());
        System.out.println("Car 1 Licenseplate = \"AA-BB-CC\"? -> "+"AA-BB-CC".equals(car1.getLicencePlate()));
        System.out.println("Car 1 Price = 25000.00? -> "+(25000.00 == car1.getPrice()));

        car1.fill();
        car1.fill();
        car1.fill();
        car1.fill(5);
        car1.drive();
        car1.drive();
        car1.drive(4);
        car1.drive(7);
        car1.drive();
        car1.fill(5);
        car1.drive();



    }











    void exampleCode() {
        System.out.println("Welcome to my very first car application! Yahoo!");

        int speed = 22;
        System.out.println(speed);

        int age = 11 ;
        int yearOfRegistration = 33;
        int[] intArray = {age,yearOfRegistration};
        for (int s : intArray) {
            System.out.println(s);
        }

        ArrayList list = new ArrayList();
        for (int s : intArray) {
            list.add(s);
        }
        System.out.println(list);
    }
}
