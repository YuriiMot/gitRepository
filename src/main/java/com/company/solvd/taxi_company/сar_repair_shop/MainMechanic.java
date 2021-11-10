package com.company.solvd.taxi_company.сar_repair_shop;

import com.company.solvd.taxi_company.enums.Profession;

public final class MainMechanic extends Mechanic {

    public MainMechanic(String name, int age, Profession profession) {
        super(name, age, profession);
    }

    public void repairCarDifficult() {
        LOGGER.info("I`m repairing a car of difficult complexity.");
    }

    public void leads() {
        LOGGER.info("I`m in charge of the work process");
    }
}
