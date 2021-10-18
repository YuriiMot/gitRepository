package com.company.solvd.taxi_company;

import java.util.LinkedList;

public class Taxi_Driver extends Employee {
    private String driveClassAuto;
    LinkedList<String> linkedList = new LinkedList<>();

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

    public void completeOrder() {
        if(!linkedList.isEmpty()) {
            System.out.println("I complete the order № 1:");
            System.out.println(linkedList.getFirst());
            linkedList.removeFirst();
        } else {
            try {
                throw new ArrayIndexOutOfBoundsException("Array is Empty!");
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Taxi driver has no orders!");
            }
        }
    }

    public void showOrders() {
        if(linkedList.size() > 0){
            for(int i = 0; i < linkedList.size(); i++) {
                System.out.println("Order № " + i + ":");
                System.out.println(linkedList.get(i) + "\n");
            }
        } else {
            try {
                throw new ArrayIndexOutOfBoundsException("Array is empty");
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Taxi driver has no orders!");
            }
        }
    }
}
