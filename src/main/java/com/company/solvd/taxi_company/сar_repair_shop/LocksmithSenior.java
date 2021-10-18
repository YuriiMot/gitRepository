package com.company.solvd.taxi_company.сar_repair_shop;

public class LocksmithSenior extends Locksmith {

    public LocksmithSenior(String name, int age, String profession) {
        super(name, age, profession);
    }

    public void makePartsComplexLevel() {
        System.out.println("I make spare parts complex level.");
    }
}
