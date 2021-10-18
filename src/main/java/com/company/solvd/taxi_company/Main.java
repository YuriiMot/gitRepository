package com.company.solvd.taxi_company;

import java.util.Scanner;

import org.apache.log4j.Logger;

public class Main {

    // protected static final Logger LOGGER = Logger.getLogger(Main.class);

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Car car = new Car("Vaz 2110", 7.5f, 50, "Economy");
        Car car1 = new Car("Renault", 8, 60, "Basic");
        Car car2 = new Car("BMW", 10.0f , 70, "Premium");
        Taxi_Driver driver = new Taxi_Driver("Roma", 25, "taxi driver", "Economy");
        Taxi_Driver driver1 = new Taxi_Driver("Vasil", 32, "taxi driver", "Basic");
        Taxi_Driver driver2 = new Taxi_Driver("Mykola", 23, "taxi driver", "Premium");
        Client client = new Client("Oleg", 30);
        Manager manager = new Manager("Bob", 23, "Manager");
        MainDirector mainDirector = new MainDirector("Bob", 35, "MainDirector");
        Accountant accountant = new Accountant("Georg",25, "Accountant");
        Logistician logistician = new Logistician("Vika", 21, "Logistician");
        logistician.take_orders(car, car1, car2, driver, driver1, driver2, client);
        // LOGGER.info("This is my logger " + car.getBrand());
        driver.showOrders();
        driver1.showOrders();
        driver2.showOrders();
    }
}
