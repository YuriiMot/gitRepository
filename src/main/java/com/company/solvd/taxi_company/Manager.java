package com.company.solvd.taxi_company;

import com.company.solvd.taxi_company.enums.Profession;

public class Manager extends Employee {

    public Manager(String name, int age, Profession profession) {
        super(name, age, profession);
    }

    public void hire(){
        LOGGER.info("I'm manager. I am hiring new employees.");
    }
}
