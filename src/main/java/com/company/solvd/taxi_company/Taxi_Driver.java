package com.company.solvd.taxi_company;

import com.company.solvd.taxi_company.enums.ClassAuto;
import com.company.solvd.taxi_company.enums.Profession;
import org.apache.log4j.Logger;

import java.util.LinkedList;

public class Taxi_Driver extends Employee {

    protected static final Logger LOGGER = Logger.getLogger(Taxi_Driver.class);

    private ClassAuto driveClassAuto;
    LinkedList<String> linkedList = new LinkedList<>();
    public String x = "2";
    public int i = 1;
    public Taxi_Driver(String name, int age, Profession profession) {
        super(name, age, profession);
    }

    public Taxi_Driver(String name, int age, Profession profession, ClassAuto driveClassAuto) {
        super(name, age, profession);
        this.driveClassAuto = driveClassAuto;
    }

    public void setDriveClassAuto(ClassAuto driveClassAuto) {
        this.driveClassAuto = driveClassAuto;
    }

    public ClassAuto getDriveClassAuto() {
        return driveClassAuto;
    }

    public void completeOrder() {
        if(!linkedList.isEmpty()) {
            LOGGER.info("I complete the order № 1\n" + linkedList.stream().findFirst());
            linkedList.removeFirst();
        } else {
            try {
                throw new ArrayIndexOutOfBoundsException("Array is Empty!");
            } catch (ArrayIndexOutOfBoundsException e) {
                LOGGER.info("Taxi driver has no orders!");
            }
        }
    }

    public void showOrders() {
        if(linkedList.size() > 0){

            linkedList.stream().forEach(e -> LOGGER.info("Order № " + i++ + ":\n" + e));
            i = 1;
        
        } else {
            try {
                throw new ArrayIndexOutOfBoundsException("Array is empty");
            } catch (ArrayIndexOutOfBoundsException e) {
                LOGGER.info("Taxi driver has no orders!");
            }
        }
    }
}
