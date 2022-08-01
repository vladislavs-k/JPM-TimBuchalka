package com.timbuchalka.RoomStuffChallenge;

public class Chair {
    private String formFactor;
    private String material;

    public Chair(String formFactor, String material) {
        this.formFactor = formFactor;
        this.material = material;
    }

    public void sitDown(){
        System.out.println("You've sat down on the chair.");
    }

    public String getFormFactor() {
        return formFactor;
    }

    public String getMaterial() {
        return material;
    }
}
