package com.company.solvd.taxi_company;

public final class PrintInformation {

    public static String printInfoDriver(Taxi_Driver driver) {
        System.out.println("Taxi driver: " + driver.getName() + ", " + driver.getAge() + " age, taxi driver "
                + driver.getDriveClassAuto() + " class");
        return "Taxi driver: " + driver.getName() + ", " + driver.getAge() + " age, taxi driver "
                + driver.getDriveClassAuto() + " class" + "\n";
    }

    public static String printInfoCar(Car car) {
        System.out.println("Car: " + car.getBrand() + ", Class auto: " + car.getClassAuto());
        return "Car: " + car.getBrand() + ", Class auto: " + car.getClassAuto() + "\n";
    }

    public static String printInfoClient(Client client) {
        System.out.println("Client: " + client.getName() + ", " + client.getAge() + " age");
        return "Client: " + client.getName() + ", " + client.getAge() + " age\n";
    }

}
