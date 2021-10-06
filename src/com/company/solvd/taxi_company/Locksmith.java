package com.company.solvd.taxi_company;

public class Locksmith extends Mechanic {

    public Locksmith(String name, int age, String profession) {
        super(name, age, profession);
    }
    public void makeParts() {
        System.out.println("I make spare parts.");
    }
}
