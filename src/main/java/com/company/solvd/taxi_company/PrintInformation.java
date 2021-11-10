package com.company.solvd.taxi_company;

import org.apache.log4j.Logger;

public final class PrintInformation {

    protected static final Logger LOGGER = Logger.getLogger(PrintInformation.class);

    public static String printInfoDriver(Taxi_Driver driver) {
        LOGGER.info("Taxi driver: " + driver.getName() + ", " + driver.getAge() + " age, taxi driver "
                + driver.getDriveClassAuto() + " class");
        return "Taxi driver: " + driver.getName() + ", " + driver.getAge() + " age, taxi driver "
                + driver.getDriveClassAuto() + " class" + "\n";
    }

    public static String printInfoCar(Car car) {
        LOGGER.info("Car: " + car.getBrand() + ", Class auto: " + car.getClassAuto());
        return "Car: " + car.getBrand() + ", Class auto: " + car.getClassAuto() + "\n";
    }

    public static String printInfoClient(Client client) {
        LOGGER.info("Client: " + client.getName() + ", " + client.getAge() + " age");
        return "Client: " + client.getName() + ", " + client.getAge() + " age\n";
    }

}
