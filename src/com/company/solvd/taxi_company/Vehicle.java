package com.company.solvd.taxi_company;

public abstract class Vehicle implements IInform {
    private String brand;
    private int max_speed = 100;
    private int passenger_capacity = 4;
    private int averageSpeed = 50;
    private float fuelConsumption;

    public Vehicle(String brand, float fuelConsumption) {
        this.brand = brand;
        this.fuelConsumption = fuelConsumption;
    }

    public Vehicle(String brand, float fuelConsumption, int averageSpeed) {
        this.brand = brand;
        this.fuelConsumption = fuelConsumption;
        this.averageSpeed = averageSpeed;
    }

    @Override
    public void showInfo() {
        System.out.println("Brand machine: " + brand);
        System.out.println("Max speed: " + max_speed);
        System.out.println("Max passenger capacity: " + passenger_capacity);
        System.out.println("Fuel consumption per 100 km: " + fuelConsumption);
    }

    public void start_engine(){
        System.out.println("Vehicle engine running");
    }
    public void stop_engine(){
        System.out.println("Vehicle engine stopped");
    }

    public String getBrand() {
        return brand;
    }

    public int getMax_speed() {
        return max_speed;
    }

    public int getPassenger_capacity() {
        return passenger_capacity;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setMax_speed(int max_speed) {
        this.max_speed = max_speed;
    }

    public void setPassenger_capacity(int passenger_capacity) {
        this.passenger_capacity = passenger_capacity;
    }

    public void setAverageSpeed(int averageSpeed) {
        this.averageSpeed = averageSpeed;
    }

    public int getAverageSpeed() {
        return averageSpeed;
    }
}

