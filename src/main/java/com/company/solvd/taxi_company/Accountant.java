package com.company.solvd.taxi_company;

public class Accountant extends Employee {

    public Accountant(String name, int age, String profession) {
        super(name, age, profession);
    }

    private void paySalary() {
        System.out.println("I`m accountant. I pay the salary.");
    }
}
