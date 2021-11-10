package com.company.solvd.taxi_company;

import com.company.solvd.taxi_company.enums.Profession;

public class DeputyDirector extends Employee {

    public DeputyDirector(String name, int age, Profession profession) {
        super(name, age, profession);
    }

    public void performTask() {
        LOGGER.info("I`m deputy director. I perform the task of the main director.");
    }
}
