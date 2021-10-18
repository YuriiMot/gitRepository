package com.company.solvd.taxi_company.enums;

public enum BrandAuto {

    CHROME("chrome"),
    FIREFOX("firefox"),
    EDGE("MicrosoftEdge");

    private final String brand;

    BrandAuto(String value) {
        this.brand = value;
    }

    public String getBrand() {
        return brand;
    }

}
