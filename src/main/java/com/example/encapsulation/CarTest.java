package com.example.encapsulation;

import com.example.encapsulation.Car;

public class CarTest {

    public static void main(String[] args) {
        Car car = new Car();

        // setting values of the variables
        car.setName("TATA");
        car.setColor("RED");
        car.setNumberOfDoors(4);

        // Displaying values of the variables
        System.out.println(car.getName());
        System.out.println(car.getColor());
        System.out.println(car.getNumberOfDoors());
    }
}
