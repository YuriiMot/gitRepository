package com.company.solvd.taxi_company;

public class Mechanic extends Person{
    public Mechanic(String name, int age, String profession) {
        super(name, age, profession);
    }

    public void repair(){
        System.out.println("I'm repairing the car.");
    }
}
