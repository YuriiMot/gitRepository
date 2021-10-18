package com.company.solvd.taxi_company.сar_repair_shop;

public final class MainMechanic extends Mechanic {

    public MainMechanic(String name, int age, String profession) {
        super(name, age, profession);
    }

    public void repairCarDifficult() {
        System.out.println("I`m repairing a car of difficult complexity.");
    }

    public void leads() {
        System.out.println("I`m in charge of the work process");
    }
}
