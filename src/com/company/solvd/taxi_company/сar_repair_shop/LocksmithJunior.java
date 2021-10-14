package com.company.solvd.taxi_company.сar_repair_shop;

import com.company.solvd.taxi_company.Person;

public class LocksmithJunior extends Person {

    public LocksmithJunior(String name, int age, String profession) {
        super(name, age, profession);
    }

    public void makePartsEasyLevel() {
        System.out.println("I make easy level spare parts .");
    }
}
