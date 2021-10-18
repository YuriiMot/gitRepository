package com.company.solvd.taxi_company.сar_repair_shop;

public class Mechanic extends MechanicJunior {

    public Mechanic(String name, int age, String profession) {
        super(name, age, profession);
    }

    public void repairCarMedium() {
        System.out.println("I`m repairing a car of medium complexity.");
    }
}
