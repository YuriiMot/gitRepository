package com.company.solvd.taxi_company;

public abstract class Machine implements IInform {
    private String brand;
    private int max_speed = 100;
    private int passenger_capacity;
    private float fuelConsumption;

    public Machine(String brand, int passenger_capacity, float fuelConsumption) {
        this.brand = brand;
        this.passenger_capacity = passenger_capacity;
        this.fuelConsumption = fuelConsumption;
    }
    @Override
    public void showInfo() {
        System.out.println("Brand machine: "+brand);
        System.out.println("Max speed: "+max_speed);
        System.out.println("Max passenger capacity: "+passenger_capacity);
    }

    public void start_engine(){
        System.out.println("Machine engine running");
    }
    public void stop_engine(){
        System.out.println("Machine engine stopped");
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

}

