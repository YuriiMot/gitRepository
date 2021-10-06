package com.company.solvd.taxi_company;

public class Taxi_Driver extends Person{
    public Taxi_Driver(String name, int age, String profession) {
        super(name, age, profession);
    }

    public void carry(){
        System.out.println("I'm taxi driver. I carry passengers.");
    }
}
