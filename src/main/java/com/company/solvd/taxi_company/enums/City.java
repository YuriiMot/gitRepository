package com.company.solvd.taxi_company.enums;

public enum City {

    CHERNIVTSI("Chernivtsi"),
    LVIV("Lviv"),
    KYIV("Kyiv"),
    SUMY("Sumy"),
    IV_FRANKIVSK("Iv-Frankivsk"),
    ODESSA("Odessa");

    private final String city;

    City(String value) {
        this.city = value;
    }

    public String getCity() {
        return city;
    }

}
