package com.company.solvd.taxi_company.сar_repair_shop;

import com.company.solvd.taxi_company.Logistician;
import com.company.solvd.taxi_company.enums.Profession;
import org.apache.log4j.Logger;

public class MechanicJunior extends LocksmithSenior {

    public MechanicJunior(String name, int age, Profession profession) {
        super(name, age, profession);
    }

    protected static final Logger LOGGER = Logger.getLogger(MechanicJunior.class);

    public void repairCarEasy() {
        LOGGER.info("I`m repairing a car of easy complexity.");
    }
}
