package com.company.solvd.taxi_company;

public class Founder extends Employee {

    public Founder(String name, int age, String profession) {
        super(name, age, profession);
    }

     public void distributeSalary() {
        System.out.println("I`m founder. I distribute salary");
    }

    private void manageCompany() {
        System.out.println("I give instructions to the main director.");
    }
}
