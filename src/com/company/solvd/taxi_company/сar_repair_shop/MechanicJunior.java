package com.company.solvd.taxi_company.сar_repair_shop;

public class MechanicJunior extends LocksmithSenior {

    public MechanicJunior(String name, int age, String profession) {
        super(name, age, profession);
    }

    public void repairCarEasy() {
        System.out.println("I`m repairing a car of easy complexity.");
    }
}
