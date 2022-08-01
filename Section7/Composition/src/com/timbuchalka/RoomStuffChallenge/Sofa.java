package com.timbuchalka.RoomStuffChallenge;

public class Sofa {
    private String material;
    private String color;

    public Sofa(String material, String color) {
        this.material = material;
        this.color = color;
    }

    public void layDown(){
        System.out.println("You've laid down on the sofa.");
    }

    public String getMaterial() {
        return material;
    }

    public String getColor() {
        return color;
    }
}
