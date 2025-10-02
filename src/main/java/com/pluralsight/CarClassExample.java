package com.pluralsight;

public class CarClassExample {

    public static void main(String[] args) {
//        Car car1 = new Car();
//        car1.setMake("Nissan");
//        car1.setModel("Altima");
        Car car1 = new Car("Nissan", "Altima");
        car1.display();


        Car car2 = new Car();
        car2.setMake("Kia");
        car2.setModel("Sorento");
        car2.display();



    }




}
