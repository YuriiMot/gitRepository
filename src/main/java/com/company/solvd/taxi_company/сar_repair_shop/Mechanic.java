package com.company.solvd.taxi_company.сar_repair_shop;

import com.company.solvd.taxi_company.enums.Profession;

public class Mechanic extends MechanicJunior {

    public Mechanic(String name, int age, Profession profession) {
        super(name, age, profession);
    }

    public void repairCarMedium() {
        LOGGER.info("I`m repairing a car of medium complexity.");
    }
}
