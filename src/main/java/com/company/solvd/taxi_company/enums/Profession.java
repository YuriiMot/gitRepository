package com.company.solvd.taxi_company.enums;

public enum Profession {

    TAXI_DRIVER("taxi driver"),
    MANAGER("Manager"),
    MAIN_DIRECTOR("MainDirector"),
    ACCOUNTANT("Accountant"),
    LOGISTICIAN("Logistician");

    private final String profession;

     Profession(String value) {
        this.profession = value;
    }

    public String getProfession() {
        return profession;
    }
}
