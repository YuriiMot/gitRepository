package com.company.solvd.taxi_company;

import com.company.solvd.taxi_company.enums.Profession;

public abstract class Employee extends Person {

    Profession profession;

    public Employee(String name, int age, Profession profession) {
        super(name, age);
        this.profession = profession;
    }
}
