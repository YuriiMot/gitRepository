package com.company.solvd.taxi_company;

public class Admin_Manager extends Employee {

    public Admin_Manager(String name, int age, String profession) {
        super(name, age, profession);
    }

    public void information_analysis() {
        System.out.println("I'm admin manager. I am analyzing information.");
    }

    public void checkNetwork() {
        System.out.println("I'm checking the network status.");
    }
}
