package com.pluralsight;

public class Car {
    private String make;
    private String model;
    private int price;

    //default constructor
    //constructor is a method
    //it is parameterless constructor
    public Car(){
        this.make = "";
        this.model = "";
    }

    public Car(String make, String model){
        this.make = make;
        this.model = model;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void display() {
        System.out.println(this.getMake() + " " + this.getModel());
    }




}
