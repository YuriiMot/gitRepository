package com.company.solvd.taxi_company;

import java.util.Scanner;

import com.company.solvd.taxi_company.enums.BrandAuto;
import com.company.solvd.taxi_company.enums.Profession;
import org.apache.log4j.Logger;

import com.company.solvd.taxi_company.enums.ClassAuto;

public class Main {

     protected static final Logger LOGGER = Logger.getLogger(Main.class);

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        Car car = new Car(BrandAuto.VAZ_2110, 7.5f, 50, ClassAuto.ECONOMY);
        Car car1 = new Car(BrandAuto.RENAULT, 8, 60, ClassAuto.BASIC);
        Car car2 = new Car(BrandAuto.BMW, 10.0f , 70, ClassAuto.PREMIUM);
        Taxi_Driver taxiDriver = new Taxi_Driver("Roma", 25, Profession.TAXI_DRIVER, ClassAuto.ECONOMY);
        Taxi_Driver taxiDriver1 = new Taxi_Driver("Vasil", 32, Profession.TAXI_DRIVER, ClassAuto.BASIC);
        Taxi_Driver taxiDriver2 = new Taxi_Driver("Mykola", 23, Profession.TAXI_DRIVER, ClassAuto.PREMIUM);
        Client client = new Client("Oleg", 30);
        Manager manager = new Manager("Bob", 23, Profession.MANAGER);
        MainDirector mainDirector = new MainDirector("Bob", 35, Profession.MAIN_DIRECTOR);
        Accountant accountant = new Accountant("Georg",25, Profession.ACCOUNTANT);
        Logistician logistician = new Logistician("Vika", 21, Profession.LOGISTICIAN);
        logistician.take_orders(car, car1, car2, taxiDriver, taxiDriver1, taxiDriver2, client);
        logistician.take_orders(car, car1, car2, taxiDriver, taxiDriver1, taxiDriver2, client);
        logistician.take_orders(car, car1, car2, taxiDriver, taxiDriver1, taxiDriver2, client);
        taxiDriver.showOrders();
        taxiDriver.completeOrder();
        taxiDriver.showOrders();

        LOGGER.info("This is my logger " + car.getBrand());

    }
}
