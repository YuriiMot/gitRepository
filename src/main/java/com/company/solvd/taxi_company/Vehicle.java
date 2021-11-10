package com.company.solvd.taxi_company;

import com.company.solvd.taxi_company.enums.BrandAuto;
import org.apache.log4j.Logger;

public abstract class Vehicle implements IInform {

    protected static final Logger LOGGER = Logger.getLogger(Vehicle.class);

    private BrandAuto brand;
    private int max_speed = 100;
    private int passenger_capacity = 4;
    private int averageSpeed = 50;
    private float fuelConsumption;

    public Vehicle(BrandAuto brand, float fuelConsumption) {
        this.brand = brand;
        this.fuelConsumption = fuelConsumption;
    }

    public Vehicle(BrandAuto brand, float fuelConsumption, int averageSpeed) {
        this.brand = brand;
        this.fuelConsumption = fuelConsumption;
        this.averageSpeed = averageSpeed;
    }

    @Override
    public void showInfo() {
        LOGGER.info("Brand machine: " + brand.getBrandAuto());
        LOGGER.info("Max speed: " + max_speed);
        LOGGER.info("Max passenger capacity: " + passenger_capacity);
        LOGGER.info("Fuel consumption per 100 km: " + fuelConsumption);
    }

    public void start_engine(){
        LOGGER.info("Vehicle engine running");
    }
    public void stop_engine(){
        LOGGER.info("Vehicle engine stopped");
    }

    public String getBrand() {
        return brand.getBrandAuto();
    }

    public int getMax_speed() {
        return max_speed;
    }

    public int getPassenger_capacity() {
        return passenger_capacity;
    }

    public void setBrand(BrandAuto brand) {
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

