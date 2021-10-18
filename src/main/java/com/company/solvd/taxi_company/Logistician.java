package com.company.solvd.taxi_company;

import java.io.IOException;
import java.util.Scanner;

import org.apache.commons.lang3.RandomUtils;

public class Logistician extends Employee {

    public Logistician(String name, int age, String profession) {
        super(name, age, profession);
    }

    public static void take_orders(Car economyClass, Car basicClass, Car premiumClass,
                                   Taxi_Driver driver, Taxi_Driver driver1, Taxi_Driver driver2, Client client) {
        Scanner in = new Scanner(System.in);
        String classAuto;
        String departure = "Chernivtsi";
        String destination;
        int distance = 1;
        int priceTrip = 30;
        double durationTrip;
        String ask = "";
        String addList = "";

        while (ask.equals("Yes") == false && ask.equals("No") == false) {
            System.out.println("Enter random? Yes/No: ");
            ask = in.next();
            if (ask.equals("Yes") == false && ask.equals("No") == false) {
                try {
                    throw new IOException();
                } catch (IOException e) {
                    System.out.println("You have entered an incorrect value.");
                }
            }
        }

        if (ask.equals("Yes")) {
            String[] randClassAuto = {"Economy", "Basic", "Premium"};
            String[] randDestination = {"Chernivtsi", "Lviv", "Kyiv", "Sumy", "Iv-Frankivsk", "Odessa"};
            classAuto = randClassAuto[RandomUtils.nextInt(0, 3)];
            destination = randDestination[RandomUtils.nextInt(0, 5)];
        } else {
            System.out.print("Enter the class auto: Economy, Basic or Premium: ");
            classAuto = in.next();
            System.out.print("Enter the departure point: ");
            departure = in.next();
            System.out.print("Enter the destination: ");
            destination = in.next();
        }

        if (departure.equals(destination) && ask.equals("Yes")) {
            distance = RandomUtils.nextInt(0, 100);
        } else if (departure.equals(destination) && ask.equals("No")) {
            System.out.print("Enter the distance to the destination (km): ");
            distance = in.nextInt();
            if (distance <= 0) {
                throw new NullPointerException("The number must be greater than zero.");
            }
        } else {
            switch (destination) {
                case "Lviv":
                    distance = 278;
                    break;
                case "Kyiv":
                    distance = 538;
                    break;
                case "Sumy":
                    distance = 883;
                case "Iv-Frankivsk":
                    distance = 143;
                    break;
                case "Odessa":
                    distance = 515;
                    break;
                default:
                    System.out.println("You have entered an incorrect value.");
            }
        }
        switch (classAuto) {
            case "Economy":
                priceTrip = distance * 10;
                addList += PrintInformation.printInfoDriver(driver);
                addList += PrintInformation.printInfoCar(economyClass);
                addList += PrintInformation.printInfoClient(client);
                durationTrip = ((double) economyClass.getAverageSpeed() / 60) * distance;
                break;
            case "Basic":
                priceTrip = distance * 15;
                addList += PrintInformation.printInfoDriver(driver1);
                addList += PrintInformation.printInfoCar(basicClass);
                addList += PrintInformation.printInfoClient(client);
                durationTrip = ((double) basicClass.getAverageSpeed() / 60) * distance;
                break;
            case "Premium":
                priceTrip = distance * 20;
                addList += PrintInformation.printInfoDriver(driver2);
                addList += PrintInformation.printInfoCar(premiumClass);
                addList += PrintInformation.printInfoClient(client);
                durationTrip = ((double) premiumClass.getAverageSpeed() / 60) * distance;
                break;
            default:
                classAuto = "Basic";
                priceTrip = distance * 15;
                addList += PrintInformation.printInfoDriver(driver1);
                addList += PrintInformation.printInfoCar(basicClass);  // logger.INFO(String)
                addList += PrintInformation.printInfoClient(client);
                durationTrip = ((double) basicClass.getAverageSpeed() / 60) * distance;
                break;
        }

        if (distance > 20) {
            priceTrip *= 0.75;
        } else if (distance < 3) {
            priceTrip = 30;
        }

        System.out.println("The departure point: " + departure);
        System.out.println("The destination: " + destination);
        System.out.println("Distance " + distance + "km");

        addList += "The departure point: " + departure + "\n";
        addList += "The destination: " + destination + "\n";
        addList += "Distance " + distance + "km\n";

        if (durationTrip > 59) {
            int i = 0;
            for (i = 0; durationTrip > 59; i++) {
                durationTrip -= 60;
            }
            System.out.println("Duration of the trip: " + i + " hour " + (int) durationTrip + " minute");
            addList += "Duration of the trip: " + i + " hour " + (int) durationTrip + " minute\n";
        } else {
            System.out.println("Duration of the trip: " + (int) durationTrip + " minute");
            addList += "Duration of the trip: " + (int) durationTrip + " minute\n";
        }
        System.out.println("The price of the trip: " + priceTrip);
        addList += "The price of the trip: " + priceTrip + "\n\n";

        switch (classAuto) {
            case "Economy":
                driver.linkedList.add(addList);
            case "Basic":
                driver1.linkedList.add(addList);
                break;
            case "Premium":
                driver2.linkedList.add(addList);
                break;
        }
    }
}

