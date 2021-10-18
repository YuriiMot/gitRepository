package com.company.solvd.taxi_company;

public abstract class Employee extends Person {
    String profession;
    public Employee(String name, int age, String profession) {
        super(name, age);
        this.profession = profession;
    }
}
