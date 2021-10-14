package com.company.solvd.taxi_company.enums;

public enum ClassAuto {

    ECONOMY("Economy"),
    BASIC("Basic"),
    PREMIUM("Premium");

    private final String classAuto;

    ClassAuto(String value) {
        this.classAuto = value;
    }

    public String getClassAuto() {
        return classAuto;
    }

}
