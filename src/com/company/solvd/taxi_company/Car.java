package com.company.solvd.taxi_company;

public class Car extends Machine {
    private int max_fuel;
    private int fuel;
    private String classAuto = "Basic";   // "Economy", "Basic", "Premium"

    public Car(String brand, int passenger_capacity, float fuelConsumption) {
        super(brand, passenger_capacity, fuelConsumption);
    }

    public Car(String brand, int passenger_capacity, float fuelConsumption, String classAuto) {
        super(brand, passenger_capacity, fuelConsumption);
        this.classAuto = classAuto;
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
