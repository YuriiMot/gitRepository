package com.company.solvd.taxi_company;

public class MainDirector extends Founder {

    public MainDirector(String name, int age, String profession) {
        super(name, age, profession);
    }

    public void performTask() {
        System.out.println("I`m main director. I perform the task of the founder.");
    }
}
