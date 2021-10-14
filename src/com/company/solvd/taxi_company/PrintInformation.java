package com.company.solvd.taxi_company;

public final class PrintInformation {

    public static void printInfoDriver(Taxi_Driver driver) {
        System.out.println("Taxi driver: " + driver.getName() + ", " + driver.getAge() + " age, taxi driver "
                + driver.getDriveClassAuto() + " class");
    }

    public static void printInfoCar(Car car) {
        System.out.println("Car: " + car.getBrand() + ", Class auto: " + car.getClassAuto());
    }

    public static void printInfoClient(Client client) {
        System.out.println("Client: " + client.getName() + ", " + client.getAge() + " age");
    }

}
