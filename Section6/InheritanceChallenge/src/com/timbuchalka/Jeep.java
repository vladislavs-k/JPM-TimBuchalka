package com.timbuchalka;

public class Jeep extends Car{
    private int roadServiceMonth;

    public Jeep(int roadServiceMonth) {
        super("Jeep", 2500, 4, 5, 6, false);
        this.roadServiceMonth = roadServiceMonth;
    }

    public void acceleerate(int rate){

        int newVlocity = getSpeed() + rate;
        if (newVlocity == 0){
            stop();
            changeGear(1);
        } else if (newVlocity > 0 && newVlocity <= 10){
            changeGear(1);
        } else if (newVlocity > 10 && newVlocity <= 20){
            changeGear(2);
        } else if (newVlocity > 20 && newVlocity <= 30){
            changeGear(3);
        } else {
            changeGear(4);
        }

        if (newVlocity > 0){
            changeVelocity(newVlocity, getDirection());
        }
    }

}
