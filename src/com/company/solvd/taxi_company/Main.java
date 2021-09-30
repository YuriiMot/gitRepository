package com.company.solvd.taxi_company;

public class Main {
    public static void main(String[] args){
    Admin_Manager admin = new Admin_Manager();
    Manager manager = new Manager();
    Logistician logistician = new Logistician();
    Taxi_Driver driver = new Taxi_Driver();
    Taxi_Driver driver1 = new Taxi_Driver();
    Taxi_Driver driver2 = new Taxi_Driver();
    Mechanic mechanic = new Mechanic();

    Car car = new Car();
    Car car1 = new Car();
    Motorcycle motorcycle = new Motorcycle();

        System.out.println("Equals driver to driver1: "+driver.equals(driver1));
    }

}
