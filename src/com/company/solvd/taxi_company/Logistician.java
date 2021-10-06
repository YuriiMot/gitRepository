package com.company.solvd.taxi_company;

public final class Logistician extends Person {

    public Logistician(String name, int age, String profession) {
        super(name, age, profession);
    }

    public void take_orders() {
        System.out.println("I'm logistician. I accept orders and give it a taxi drivers.");
    }
}
