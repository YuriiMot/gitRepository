package com.company.solvd.taxi_company;

public final class MainDirector extends DeputyDirector {

    public MainDirector(String name, int age, String profession) {
        super(name, age, profession);
    }

    public void performTask() {
        System.out.println("I`m main director. I perform the task of the founder.");
    }

    public void assignTask() {
        System.out.println("I assign a task to the deputy director.");
    }
}
