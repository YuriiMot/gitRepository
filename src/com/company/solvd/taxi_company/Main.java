package com.company.solvd.taxi_company;

public class Main {
    public static void main(String[] args) {
        Car car = new Car("Vaz 2110", 4, 7.5f);
        Manager manager = new Manager("Bob", 23, "Manager");
        MainDirector mainDirector = new MainDirector("Bob", 35, "MainDirector");
        Accountant accountant = new Accountant("Georg",25, "Accountant");
        car.check_fuel();
        mainDirector.performTask();
        System.out.println("");
    }
}
