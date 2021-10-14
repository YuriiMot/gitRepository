package com.company.solvd.taxi_company;

public class Car extends Vehicle {

    private int max_fuel;
    private int fuel;
    private String classAuto = "Basic";   // "Economy", "Basic", "Premium"

    public Car(String brand, float fuelConsumption, float consumption) {
        super(brand, fuelConsumption);
    }

    public Car(String brand, float fuelConsumption, int averageSpeed, String classAuto) {
        super(brand, fuelConsumption, averageSpeed);
        this.classAuto = classAuto;
    }

    public void setClassAuto(String classAuto) {
        this.classAuto = classAuto;
    }

    public String getClassAuto() {
        return classAuto;
    }

    public int getMax_fuel() {
        return max_fuel;
    }

    public void setMax_fuel(int max_fuel) {
        this.max_fuel = max_fuel;
    }

    public int getFuel() {
        return fuel;
    }

    public void setFuel(int fuel) {
        this.fuel = fuel;
    }

    public void check_fuel() {
        System.out.println("I have " + fuel + " liter of fuel");
    }
}
