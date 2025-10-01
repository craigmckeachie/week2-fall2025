package com.pluralsight;

public class ClassExample {

    public static void main(String[] args) {
        Car car1 = new Car();
        car1.setMake("Nissan");
        car1.setModel("Altima");

        System.out.println(car1.getMake() + " " + car1.getModel());

    }
}
