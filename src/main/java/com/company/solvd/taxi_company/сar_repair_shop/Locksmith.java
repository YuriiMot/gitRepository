package com.company.solvd.taxi_company.сar_repair_shop;

import com.company.solvd.taxi_company.enums.Profession;

public class Locksmith extends LocksmithJunior {

    public Locksmith(String name, int age, Profession profession) {
        super(name, age, profession);
    }

    public void makePartsMidLevel() {
        LOGGER.info("I make mid-level spare parts.");
    }
}
