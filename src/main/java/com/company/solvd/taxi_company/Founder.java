package com.company.solvd.taxi_company;

import com.company.solvd.taxi_company.enums.Profession;

public class Founder extends Employee {

    public Founder(String name, int age, Profession profession) {
        super(name, age, profession);
    }

     public void distributeSalary() {
        LOGGER.info("I`m founder. I distribute salary");
    }

    private void manageCompany() {
        LOGGER.info("I give instructions to the main director.");
    }
}
