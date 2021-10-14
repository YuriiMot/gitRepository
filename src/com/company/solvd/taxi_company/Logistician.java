package com.company.solvd.taxi_company;

import java.util.Scanner;

public class Logistician extends Employee {

    public Logistician(String name, int age, String profession) {
        super(name, age, profession);
    }

    public static void take_orders(Car economyClass, Car basicClass, Car premiumClass,
                                   Taxi_Driver driver, Taxi_Driver driver1, Taxi_Driver driver2, Client client) {
        Scanner in = new Scanner(System.in);
        String classAuto;
        String departure;
        String destination;
        int distance = 1;
        int priceTrip = 30;
        double durationTrip;

        System.out.print("Enter the class auto: Economy, Basic or Premium: ");
        classAuto = in.next();
        System.out.print("Enter the departure point: ");
        departure = in.next();
        System.out.print("Enter the destination: ");
        destination = in.next();

        if (departure.equals(destination)) {
            System.out.print("Enter the distance to the destination (km): ");
            distance = in.nextInt();
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
                    System.out.println("You enter incorrect value.");
            }
        }

        switch (classAuto) {
            case "Economy":
                priceTrip = distance * 10;
                PrintInformation.printInfoDriver(driver);
                PrintInformation.printInfoCar(economyClass);
                PrintInformation.printInfoClient(client);
                durationTrip = ((double) economyClass.getAverageSpeed() / 60) * distance;
                break;
            case "Basic":
                priceTrip = distance * 15;
                PrintInformation.printInfoDriver(driver1);
                PrintInformation.printInfoCar(basicClass);
                PrintInformation.printInfoClient(client);
                durationTrip = ((double) basicClass.getAverageSpeed() / 60) * distance;
                break;
            case "Premium":
                priceTrip = distance * 20;
                PrintInformation.printInfoDriver(driver2);
                PrintInformation.printInfoCar(premiumClass);
                PrintInformation.printInfoClient(client);
                durationTrip = ((double) premiumClass.getAverageSpeed() / 60) * distance;
                break;
            default:
                classAuto = "Basic";
                priceTrip = distance * 15;
                PrintInformation.printInfoDriver(driver1);
                PrintInformation.printInfoCar(basicClass);  // logger.INFO(String)
                PrintInformation.printInfoClient(client);
                durationTrip = ((double) basicClass.getAverageSpeed() / 60) * distance;
                break;
        }

        if (distance > 20) {
            priceTrip *= 0.75;
        } else if (distance < 3) {
            priceTrip = 30;
        }
        if (durationTrip > 59) {
            int i = 0;
            for (i = 0; durationTrip > 59; i++) {
                durationTrip -= 60;
            }
            System.out.println("Duration of the trip: " + i + " hour " + (int) durationTrip + " minute");
        } else {
            System.out.println("Duration of the trip: " + (int) durationTrip + " minute");
        }
        System.out.println("The price of the trip: " + priceTrip);
    }
}

