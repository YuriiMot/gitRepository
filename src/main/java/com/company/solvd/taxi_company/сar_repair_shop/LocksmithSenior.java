package com.company.solvd.taxi_company.сar_repair_shop;

import com.company.solvd.taxi_company.enums.Profession;

public class LocksmithSenior extends Locksmith {

    public LocksmithSenior(String name, int age, Profession profession) {
        super(name, age, profession);
    }

    public void makePartsComplexLevel() {
        LOGGER.info("I make spare parts complex level.");
    }
}
