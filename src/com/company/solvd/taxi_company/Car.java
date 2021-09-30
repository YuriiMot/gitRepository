package com.company.solvd.taxi_company;

public class Car extends Machine{
    int max_fuel;
    int fuel;

    public void check_fuel(){
        System.out.println("I have "+fuel+" liter of fuel");
    }
}
