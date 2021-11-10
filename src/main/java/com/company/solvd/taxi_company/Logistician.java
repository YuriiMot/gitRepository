package com.company.solvd.taxi_company;

import java.io.IOException;
import java.util.Scanner;

import com.company.solvd.taxi_company.enums.Profession;
import org.apache.commons.lang3.RandomUtils;

import com.company.solvd.taxi_company.enums.City;
import com.company.solvd.taxi_company.enums.ClassAuto;
import org.apache.log4j.Logger;

public class Logistician extends Employee {

    public Logistician(String name, int age, Profession profession) {
        super(name, age, profession);
    }

    protected static final Logger LOGGER = Logger.getLogger(Logistician.class);

    public void take_orders(Car economyClass, Car basicClass, Car premiumClass,
                            Taxi_Driver driver, Taxi_Driver driver1, Taxi_Driver driver2, Client client) {
        Scanner in = new Scanner(System.in);
        ClassAuto classAuto = ClassAuto.BASIC;
        City departure = City.CHERNIVTSI;
        City destination = City.LVIV;
        int distance = 1;
        int priceTrip = 30;
        double durationTrip;
        int askNumb = 1;
        String ask = "";
        String addList = "";
        int indexClassAuto = RandomUtils.nextInt(0, ClassAuto.values().length);
        int indexCity = RandomUtils.nextInt(0,City.values().length);

        while (!ask.equals("Yes") && !ask.equals("No")) {
            LOGGER.info("Enter random? Yes/No: ");
            ask = in.next();
            if (!ask.equals("Yes") && !ask.equals("No")) {
                try {
                    throw new IOException();
                } catch (IOException e) {
                    LOGGER.info("You have entered an incorrect value.");
                }
            }
        }

        if (ask.equals("Yes")) {
            classAuto = ClassAuto.values()[indexClassAuto];
            destination = City.values()[indexCity];
        } else {
            LOGGER.info("Enter the class auto:\n1.Economy \n2.Basic \n3.Premium ");
            askNumb = in.nextInt();

            if (askNumb < 4 && askNumb > 0) {
                classAuto = ClassAuto.values()[askNumb - 1];
            } else {
                    throw new ArrayIndexOutOfBoundsException("You have entered an incorrect value.");
            }

            LOGGER.info("Enter the destination: \n1.Chernivtsi \n2.Lviv \n3.Kyiv \n4.Sumy \n" +
                    "5.Iv-Frankivsk \n6.Odessa ");
            askNumb = in.nextInt();

            if (askNumb < 7 && askNumb > 0) {
                destination = City.values()[askNumb - 1];
            } else {
                    throw new ArrayIndexOutOfBoundsException("You have entered an incorrect value.");
            }
        }

        if (departure.equals(destination) && ask.equals("Yes")) {
            distance = RandomUtils.nextInt(0, 100);
        } else if (departure.equals(destination) && ask.equals("No")) {
            LOGGER.info("Enter the distance to the destination (km): ");
            distance = in.nextInt();
            if (distance <= 0) {
                throw new NullPointerException("The number must be greater than zero.");
            }
        } else {
            switch (destination) {
                case LVIV:
                    distance = 278;
                    break;
                case KYIV:
                    distance = 538;
                    break;
                case SUMY:
                    distance = 883;
                case IV_FRANKIVSK:
                    distance = 143;
                    break;
                case ODESSA:
                    distance = 515;
                    break;
                default:
                    try {
                        throw new IOException();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
            }
        }
        switch (classAuto) {
            case ECONOMY:
                priceTrip = distance * 10;
                addList += PrintInformation.printInfoDriver(driver);
                addList += PrintInformation.printInfoCar(economyClass);
                addList += PrintInformation.printInfoClient(client);
                durationTrip = ((double) economyClass.getAverageSpeed() / 60) * distance;
                break;
            case BASIC:
                priceTrip = distance * 15;
                addList += PrintInformation.printInfoDriver(driver1);
                addList += PrintInformation.printInfoCar(basicClass);
                addList += PrintInformation.printInfoClient(client);
                durationTrip = ((double) basicClass.getAverageSpeed() / 60) * distance;
                break;
            case PREMIUM:
                priceTrip = distance * 20;
                addList += PrintInformation.printInfoDriver(driver2);
                addList += PrintInformation.printInfoCar(premiumClass);
                addList += PrintInformation.printInfoClient(client);
                durationTrip = ((double) premiumClass.getAverageSpeed() / 60) * distance;
                break;
            default:
                classAuto = ClassAuto.BASIC;
                priceTrip = distance * 15;
                addList += PrintInformation.printInfoDriver(driver1);
                addList += PrintInformation.printInfoCar(basicClass);  // logger.INFO(String)
                addList += PrintInformation.printInfoClient(client);
                durationTrip = ((double) basicClass.getAverageSpeed() / 60) * distance;
                break;
        }

        ICalculatePriceTrip calculatePrice = (priceTrip1, distance1) -> {
            if (distance1 > 20) {
                priceTrip1 *= 0.75;
            } else if (distance1 < 3) {
                priceTrip1 = 30;
            }
            return priceTrip1;
        };

        priceTrip = calculatePrice.calculatePrice(priceTrip, distance);

        LOGGER.info("The departure point: " + departure);
        LOGGER.info("The destination: " + destination);
        LOGGER.info("Distance " + distance + "km");

        addList += "The departure point: " + departure + "\n";
        addList += "The destination: " + destination + "\n";
        addList += "Distance " + distance + "km\n";

        if (durationTrip > 59) {
            int i = 0;
            for (i = 0; durationTrip > 59; i++) {
                durationTrip -= 60;
            }
            LOGGER.info("Duration of the trip: " + i + " hour " + (int) durationTrip + " minute");
            addList += "Duration of the trip: " + i + " hour " + (int) durationTrip + " minute\n";
        } else {
            LOGGER.info("Duration of the trip: " + (int) durationTrip + " minute");
            addList += "Duration of the trip: " + (int) durationTrip + " minute\n";
        }
        LOGGER.info("The price of the trip: " + priceTrip + "\n");
        addList += "The price of the trip: " + priceTrip + "\n";

        switch (classAuto) {
            case ECONOMY:
                driver.linkedList.add(addList);
            case BASIC:
                driver1.linkedList.add(addList);
                break;
            case PREMIUM:
                driver2.linkedList.add(addList);
                break;
        }
    }
}

