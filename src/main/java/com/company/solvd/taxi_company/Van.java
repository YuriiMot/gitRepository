package com.company.solvd.taxi_company;

public class Van extends Car {
    private int sizeTrunk = 1000;

    public Van(String brand, int passenger_capacity, float fuelConsumption, int sizeTrunk) {
        super(brand, passenger_capacity, fuelConsumption);
        this.sizeTrunk = sizeTrunk;
    }

    public void setSizeTrunk(int sizeTrunk) {
        this.sizeTrunk = sizeTrunk;
    }

    public int getSizeTrunk() {
        return sizeTrunk;
    }
}
