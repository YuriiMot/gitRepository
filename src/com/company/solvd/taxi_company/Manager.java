package com.company.solvd.taxi_company;

public class Manager extends Employee {

    public Manager(String name, int age, String profession) {
        super(name, age, profession);
    }

    public void hire(){
        System.out.println("I'm manager. I am hiring new employees.");
    }
}
