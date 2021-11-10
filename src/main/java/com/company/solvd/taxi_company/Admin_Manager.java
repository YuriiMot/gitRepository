package com.company.solvd.taxi_company;

import com.company.solvd.taxi_company.enums.Profession;

public class Admin_Manager extends Employee {

    public Admin_Manager(String name, int age, Profession profession) {
        super(name, age, profession);
    }

    public void information_analysis() {
        LOGGER.info("I'm admin manager. I am analyzing information.");
    }

    public void checkNetwork() {
        LOGGER.info("I'm checking the network status.");
    }
}
