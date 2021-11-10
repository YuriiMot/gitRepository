package com.company.solvd.taxi_company.сar_repair_shop;

import com.company.solvd.taxi_company.Employee;
import com.company.solvd.taxi_company.enums.Profession;

public class LocksmithJunior extends Employee {

    public LocksmithJunior(String name, int age, Profession profession) {
        super(name, age, profession);
    }

    public void makePartsEasyLevel() {
        LOGGER.info("I make easy level spare parts .");
    }
}
