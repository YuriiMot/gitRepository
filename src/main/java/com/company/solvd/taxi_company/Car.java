package com.company.solvd.taxi_company;

import com.company.solvd.taxi_company.enums.BrandAuto;
import com.company.solvd.taxi_company.enums.ClassAuto;
import org.apache.log4j.Logger;

public class Car extends Vehicle {

    protected static final Logger LOGGER = Logger.getLogger(Car.class);

    private int max_fuel;
    private int fuel;
    private ClassAuto classAuto;   // "Economy", "Basic", "Premium"

    public Car(BrandAuto brand, float fuelConsumption, float consumption) {
        super(brand, fuelConsumption);
    }

    public Car(BrandAuto brand, float fuelConsumption, int averageSpeed, ClassAuto classAuto) {
        super(brand, fuelConsumption, averageSpeed);
        this.classAuto = classAuto;
    }

    public void setClassAuto(ClassAuto classAuto) {
        this.classAuto = classAuto;
    }

    public String getClassAuto() {
        return classAuto.getClassAuto();
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
        LOGGER.info("I have " + fuel + " liter of fuel");
    }
}
