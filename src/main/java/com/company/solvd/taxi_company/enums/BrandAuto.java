package com.company.solvd.taxi_company.enums;

public enum BrandAuto {

    VAZ_2110("VAZ 2110"),
    MAZDA("Mazda"),
    RENAULT("Renault"),
    FORD("Ford"),
    BMW("BMW");

    private final String brandAuto;

    BrandAuto(String value) {
        this.brandAuto = value;
    }

    public String getBrandAuto() {
        return brandAuto;
    }
}
