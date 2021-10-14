package com.company.solvd.taxi_company;

public class Taxi_Driver extends Employee {
    private String driveClassAuto;

    public Taxi_Driver(String name, int age, String profession) {
        super(name, age, profession);
    }

    public Taxi_Driver(String name, int age, String profession, String driveClassAuto) {
        super(name, age, profession);
        this.driveClassAuto = driveClassAuto;
    }

    public void setDriveClassAuto(String driveClassAuto) {
        this.driveClassAuto = driveClassAuto;
    }

    public String getDriveClassAuto() {
        return driveClassAuto;
    }

    public void carry(){
        System.out.println("I'm taxi driver. I carry passengers.");
    }
}
