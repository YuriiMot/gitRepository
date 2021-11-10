package com.company.solvd.taxi_company;

import com.company.solvd.taxi_company.enums.Profession;

public class Accountant extends Employee {

    public Accountant(String name, int age, Profession profession) {
        super(name, age, profession);
    }

    private void paySalary() {
        LOGGER.info("I`m accountant. I pay the salary.");
    }
}
