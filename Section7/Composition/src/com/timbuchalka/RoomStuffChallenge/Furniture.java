package com.timbuchalka.RoomStuffChallenge;

public class Furniture {
    private Chair chair;
    private Sofa sofa;

    public Furniture(Chair chair, Sofa sofa) {
        this.chair = chair;
        this.sofa = sofa;
    }

    public Chair getChair() {
        return chair;
    }

    public Sofa getSofa() {
        return sofa;
    }
}
