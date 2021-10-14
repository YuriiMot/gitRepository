package com.company.solvd.taxi_company.сar_repair_shop;

public class Locksmith extends LocksmithJunior {

    public Locksmith(String name, int age, String profession) {
        super(name, age, profession);
    }

    public void makePartsMidLevel() {
        System.out.println("I make mid-level spare parts.");
    }
}
