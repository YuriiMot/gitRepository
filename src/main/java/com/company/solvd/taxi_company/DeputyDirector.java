package com.company.solvd.taxi_company;

public class DeputyDirector extends Employee {

    public DeputyDirector(String name, int age, String profession) {
        super(name, age, profession);
    }

    public void performTask() {
        System.out.println("I`m deputy director. I perform the task of the main director.");
    }
}
