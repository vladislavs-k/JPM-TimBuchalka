package com.timbuchalka;

public class Jeep extends Car{
    private int roadServiceMonth;

    public Jeep(int roadServiceMonth) {
        super("Jeep", 2500, 4, 5, 6, false);
        this.roadServiceMonth = roadServiceMonth;
    }
}
