package com.company.solvd.taxi_company;

import com.company.solvd.taxi_company.enums.Profession;
import org.apache.log4j.Logger;

public final class MainDirector extends DeputyDirector {

    protected static final Logger LOGGER = Logger.getLogger(MainDirector.class);

    public MainDirector(String name, int age, Profession profession) {
        super(name, age, profession);
    }

    public void performTask() {
        LOGGER.info("I`m main director. I perform the task of the founder.");
    }

    public void assignTask() {
        LOGGER.info("I assign a task to the deputy director.");
    }
}
